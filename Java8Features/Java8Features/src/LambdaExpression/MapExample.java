package LambdaExpression;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(10, "vinay");
        map.put(21, "sunny");
        map.put(3, "bunny");
        System.out.println(map);
        TreeMap<Integer,String> map1=new TreeMap<Integer,String>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
        map.put(10, "vinay");
        map.put(21, "sunny");
        map.put(3, "bunny");
    }
}
