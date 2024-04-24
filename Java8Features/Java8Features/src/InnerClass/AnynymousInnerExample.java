package InnerClass;
/**
 *  
 */
 interface interf  {

    public void m();
}

public class AnynymousInnerExample {
    int x=88;
   public void m2(){
    interf i=new interf() { // this keyword examle with inner class and lambda expression
        int x=999;
        public void m(){
            System.out.println(this.x);
        }

    };
    i.m();
   }

   public void m3(){
interf i=()->{
    int x=999;
    System.out.println(this.x);
};
i.m();
   }

   public static void main(String[] ars){
    AnynymousInnerExample t=new AnynymousInnerExample();
    t.m2();
    t.m3();
   }

}
