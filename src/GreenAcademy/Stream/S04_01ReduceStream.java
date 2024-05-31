package GreenAcademy.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.function.BinaryOperator;

// ** BinaryOperator
// => FunctionalInterface 로 두 개의 매개변수를 비교하는 목적으로 사용함.
// => minBy() 메서드
//	매개변수로 전달된 비교자(Comparator)를 기반으로 
//	apply() 메서드로 전달된 두 매개변수를 비교후 작은값을 반환함.

// => maxBy() 메서드
//	minBy() 메서드와 반대로 두 매개변수를 비교후 큰값을 반환

/*
@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T,T,T> {

  public static <T> BinaryOperator<T> minBy(Comparator<? super T> comparator) {
    Objects.requireNonNull(comparator);
    return (a, b) -> comparator.compare(a, b) <= 0 ? a : b;
  }

  public static <T> BinaryOperator<T> maxBy(Comparator<? super T> comparator) {
    Objects.requireNonNull(comparator);
    return (a, b) -> comparator.compare(a, b) >= 0 ? a : b;
  }
}
------------------------------------ 
** BiFunction interface
=> 추상 메서드인 apply() 메서드
=> 디폴트 메서드인 andThen() 메서드

*/

class S04_01ReduceStream {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
        
        BinaryOperator<String> lc = 
            (s1, s2) -> { 
               if(s1.length() > s2.length())
                   return s1;
               else 
                   return s2;                   
            };
        
        String str = ls.stream()
                      .reduce("", lc);
      
        System.out.println(str);
    }
}