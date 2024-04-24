package LambdaExpression;
interface Drawable{  
    public void draw();  
}  
interface Sayable{
  public void draw();
}

interface Sayable1{
  public String hello(String name);
}
interface Sayable2{
  public int add(int a,int b);
}



public class FunctionalInterface {
    public static void main(String[] args) {
     String s="vinay";
     //No parameters
     Sayable say= () ->{
      System.out.println("No paramters Lamda Expression");
    };
    say.draw();
    

   Drawable d=  () -> {
     System.out.println(s.length());
    };
    d.draw();

    //Sine paramter

    Sayable1 s1=(name) -> {
      return "Hello"+name;
    };

   System.out.println(s1.hello("Vinay"));

       //Multiple parameters
      //with return
       Sayable2 s2=(a,b) -> {
        return a+b;
      };
      System.out.println(s2.add(1,2));

      //without return
      Sayable2 s3=(a,b) -> a+b;
      System.out.println(s3.add(5,2));

      
    }
  



  /*  () -> {
        System.out.println("Hi from functional Interface");
    };

    (int a,int b) -> {
        System.out.println(a+b);
    };  */



}
