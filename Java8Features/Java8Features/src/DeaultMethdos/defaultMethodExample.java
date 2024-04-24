package DeaultMethdos;

/**
 * InnerdefaultMethodExample
 */
 interface InnerdefaultMethodExample {
public default void m(){
System.out.println("This is default method");
}
    
}

public class defaultMethodExample implements InnerdefaultMethodExample{

    public void m(){
        System.out.println("My own implementation");
    }
    public static void main(String[] args) {
        defaultMethodExample df=new defaultMethodExample();
        df.m();
        
    }


}
