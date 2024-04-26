package predicate;
import java.util.function.*;;
public class predicateEx{
    public static void main(String[] args){
        Predicate<Integer> t=I->I>10;
        System.out.println(t.test(10));
      //results in error  System.out.println(t.test("vinay"));

      Predicate<String> p=S->S.length()>10;
      System.out.println(p.test("vinay"));
    }
} 