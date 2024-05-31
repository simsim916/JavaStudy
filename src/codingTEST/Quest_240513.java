package codingTEST;

import java.util.*;

class Solution {

    public Map<Integer, Integer> days = new HashMap<>() {{
        put(1, 31);
        put(2, 28);
        put(3, 31);
        put(4, 30);
        put(5, 31);
        put(6, 30);
        put(7, 31);
        put(8, 31);
        put(9, 30);
        put(10, 31);
        put(11, 30);
        put(12, 31);
    }};

    public int solution(int X, int[][] H) {
        int answer = 0;
        int startSAT = 7 - X;
        int idx = 1;
        List<int[]> holidays = new ArrayList<>();

        while (idx <= 12) {
            while (startSAT <= days.get(idx)) {
                int[] holiday = new int[2];
                int[] holiday2 = new int[2];
                holiday[0] = idx;
                holiday[1] = startSAT;
                if (startSAT > 0)
                    holidays.add(holiday);
                if (startSAT + 1 <= days.get(idx)) {
                    holiday2[0] = idx;
                    holiday2[1] = startSAT + 1;
                    holidays.add(holiday2);
                    startSAT += 7;
                } else {
                    idx++;
                    holiday2[0] = idx;
                    holiday2[1] = 1;
                    holidays.add(holiday2);
                    startSAT = 7;
                }
            }
            startSAT = startSAT - days.get(idx);
            idx++;
        }

        List<int[]> holidays3 = new ArrayList<>();

        for (int[] holiday : holidays) {
            for(int[] day : H){
                if(holiday[0]==day[0] && holiday[1]==day[1]){
                    holidays3.add(day);
                }
            }
        }

        for(int[] day : holidays3){
            int allday = 0;
            System.out.println("before : " + day[0]+" "+day[1]);
            for(int i=1 ; i<day[0] ; i++){
                allday+=days.get(i);
            }
            allday+=day[1];
            int date = (allday+6)%7;

            if(date==0){
                System.out.println("after : " + day[0]+" "+ ++day[1]);
                if (day[1]>days.get(day[0])){
                    day[0] = ++day[0];
                    day[1] = 1;
                } else {
                day[1]++;
                }
            }
            if(date==6){
                System.out.println("after : " + day[0]+" "+ --day[1]);
                if(day[1]==1){
                    day[0] = --day[0];
                    day[1] = days.get(day[0]);
                } else {
                    --day[0];
                }
            }
        }

        return holidays.size()+H.length;
    }
}

public class Quest_240513 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] H = {
                {1, 1},
                {1, 21},
                {1, 22},
                {1, 23},
                {3, 1},
                {5, 5},
                {5, 27},
                {6, 6},
                {8, 15},
                {9, 28},
                {9, 29},
                {9, 30},
                {10, 3},
                {10, 9},
                {12, 25},
        };
        System.out.println(solution.solution(7, H));
    }
}
