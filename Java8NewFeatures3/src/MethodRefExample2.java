public class MethodRefExample2 {
    public void m1(){
        for(int i=0;i<5;i++){
            System.out.println("child thread");
        }
    }

    public static void main(String[] args) {

     MethodRefExample2 m=new MethodRefExample2();

        Runnable r=m::m1; // runnable interface run method refer to m1. method reference argument types must be

       // matched.
       Thread t1=new Thread(r);
       t1.start();
       for(int i=0;i<5;i++){
        System.out.println("Main thread");
    }
    }

}
