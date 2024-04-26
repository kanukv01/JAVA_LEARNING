public class lambda {
    public static void main(String[] args) {

   /*     drawable draw=new drawable() {

            public void draw() {
                // TODO Auto-generated method stub
                System.out.println("print this");
            }
            
        };
        draw.draw();
         */

         drawable d2 =() -> {
            System.out.println("Drawing");
         };
         d2.draw();
        
    }
}
