interface interf{
    void m1();
}

public class MethodRef {
    public static void m2(){
        System.out.println("Hello, World!");
    }
    public static void main(String[] args) throws Exception {
       interf i=MethodRef::m2;
       i.m1();
    }
}
