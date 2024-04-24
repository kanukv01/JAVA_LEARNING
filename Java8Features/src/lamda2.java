public class lamda2 {
    public static void main(String[] args) {
        Sayable d=()->{
           return "hello";
        };
        System.out.println(d.say());
    }
}
