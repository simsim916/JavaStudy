public class SynapSoft_Quiz08 {
    // 알파벳은 하나의 숫자를 나타내고
    // 각 알파벳에 하나의 숫자를 배정하고
    // 계산식의 조건과 일치하는 숫자의 배정을 찾기
    public static int result = 0; // 좌변의 합을 구하기 위한 변수

    public static void main(String[] args) {
        char[] synapoftwu = {'S', 'Y', 'N', 'A', 'P', 'O', 'F', 'T', 'W', 'U'};
        int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // 알파벳에 배정가능 한 숫자

        int[] code = new int[synapoftwu.length]; // 알파벳과 대응대는 숫자 배열

        setCode(number, code, 0);

        System.out.println("\n"+result);
    }

    // code에 알파벳과 대응되는 숫자들을 저장하고 조건에 해당되는지 확인하는 메서드
    public static void setCode(int[] number, int[] code, int index) {
        // code배열이 완성됬을 때 조건이 부합하는지 확인
        if (index == code.length) {
            checkSolution(code);
            return;
        }

        // 순환하며 code배열에 중복 숫자가 없게끔 대응되는 숫자 저장
        for (int i = 0; i < number.length; i++) {
            if (isUsed(code, number[i], index)) {
                continue;
            }
            code[index] = number[i];
            // 재귀함수를 통해 0번 인덱스부터 숫자를 채우고 가득 찰 경우 조건 합당한지 확인
            setCode(number, code, index + 1);
        }
    }

    // code 배정 시 중복 숫자가 있는지 확인
    public static boolean isUsed(int[] code, int num, int index) {
        for (int i = 0; i < index; i++) {
            if (code[i] == num) {
                return true;
            }
        }
        return false;
    }

    // 주어진 조건과 일치하는지 확인하는 메서드
    public static void checkSolution(int[] code) {
        int s = code[0], y = code[1], n = code[2], a = code[3] , p = code[4];
        int o = code[5], f = code[6], t = code[7], w = code[8], u = code[9];

        if (s == 0 || o == 0) {
            return;
        }

        int synap = s * 10000 + y * 1000 + n * 100 + a * 10 + p;
        int soft = s * 1000 + o * 100 + f * 10 + t;
        int wants = w * 10000 + a * 1000 + n * 100 + t * 10 + s;
        int you = y * 100 + o * 10 + u;

        if (synap + soft == wants + you) {
            result += synap + soft;
            System.out.println("\nSYNAP + SOFT = WANTS + YOU");
            System.out.print("SYNAP = " + synap);
            System.out.print("  SOFT = " + soft);
            System.out.print("  WANTS = " + wants);
            System.out.print("  YOU = " + you);
        }
    }
}