import java.util.function.Function;

public class test{

    public static int square(int n){
      return n*n;
    }
public static void main(String[] args) {
    Function<Integer,Integer> f=i->i*i;
    System.out.println("The square of 4 is :"+f.apply(4));
    System.out.println("The square of 4 is :"+square(5));
}
}