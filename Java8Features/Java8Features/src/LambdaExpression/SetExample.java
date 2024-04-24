package LambdaExpression;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        TreeSet<Integer> tree=new TreeSet<>();
        TreeSet<Integer> treese=new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
        tree.add(10);
        tree.add(14);
        tree.add(0);
        tree.add(5);
        treese.add(10);
        treese.add(14);
        treese.add(0);
        treese.add(5);
        System.out.println(tree);
        System.out.println(treese);

    }
    //tree set follows default sorting order

}
