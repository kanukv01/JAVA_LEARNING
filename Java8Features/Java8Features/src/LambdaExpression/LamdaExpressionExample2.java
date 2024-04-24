package LambdaExpression;
interface intrf{
    public int getLenth(String s);
}

/**
 *  
 */
 interface  multiplier {
public int squareit(int j);
    
}
public class LamdaExpressionExample2 {
public static void main(String[] args) {
    intrf i=s->s.length();
    System.out.println(i.getLenth("helolo"));
    System.out.println(i.getLenth("with lambda"));
    multiplier k=j->j*j;
    System.out.println(k.squareit(2));
}
}
