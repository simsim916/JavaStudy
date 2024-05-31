package GreenAcademy.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.function.BinaryOperator;


/* stream 의 병렬처리 메서드
=> stream
	- stream은 직렬처리를 하지만, 처리결과가 순서에 의존하지 않고, 병렬로 처리되어도 상관없는 경우에는
	  parallelStream() 메서드를 통해 병렬처리가 가능함.
 	 
=> parallel()
	- 기존 스트림을 병렬처리하도록 바꿔줌.
=> parallelStream()은 병렬처리가 가능한 스트림을 새로 만들어 리턴함. 
 
** 병렬 처리가 필요한 예시
=> 대용량 데이터 처리
	컬렉션에 대량의 데이터가 있고, 이를 빠르게 처리해야 하는 경우.
=> 동시성 작업이 가능한 작업
	독립적으로 실행 가능한 작업들이 있고, 이를 병렬로 처리하면 성능이 향상되는 경우.
=> 다수의 코어를 활용해야 하는 경우
	시스템이 다수의 코어를 지원하고 있으며, 이를 최대한 활용해야 하는 경우.
=> 결론
	대용량의 데이터를 필터링하거나 변환해야 할때 'parallelStream()' 을 사용하면 병렬로 처리하여
	성능을 향상시킬 수 있지만 모든 상황에서 병렬처리가 항상 더 효율적인 것은 아니므로, 
	실제 상황에 맞게 선택하는 것이 중요함.
  
*/


class S04_02ReduceParallelStream {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
        
        BinaryOperator<String> lc = 
            (s1, s2) -> { 
               if(s1.length() > s2.length())
                   return s1;
               else 
                   return s2;                   
            };
        
        String str = ls.parallelStream()
                      .reduce("", lc);
      
        System.out.println(str);
    }
}