package LambdaExpression;
public class LambdaExpressionforThread {

    public static void main(String[] args) {

        //without lambda
        Runnable r=new Runnable() {
            public void run(){
                System.out.println("Thread t1 running");
            }
        };
        Thread t1=new Thread(r);
        t1.start();

        //with lambda

        Runnable r1=() ->{
            System.out.println("Thread t2 running");
            
        };
        Thread t2=new Thread(r1);
            t2.start();
    }


}
