package LambdaExpression;

//@FunctionalInterface
public interface FIwrtInheritance {

    public void m();

}
/**
   
 */
//@FunctionalInterface
 interface B extends FIwrtInheritance  {

//if the parent interface is functional and child does not contain any new abstract methods .. the code will compile
//in the child interface the same abstrac method as per the parent is also fine
public void m();

//in the child interface the diff abstrac method as per the parent --resutls in error
public void m1();

}
