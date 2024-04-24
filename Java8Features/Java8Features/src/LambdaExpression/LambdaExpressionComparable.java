package LambdaExpression;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionComparable {
    public static void main(String[] args) {
        List<Product> list=new ArrayList<>();
        list.add(new Product(1,"HP Lapto",20000f));
        list.add(new Product(2,"Dell Lapto",10000f));
        list.add(new Product(3,"Acer Lapto",40000f));

       Collections.sort(list,(p1,p2) ->{
        return p1.name.compareTo(p2.name);
       });
       for (Product product : list) {
        System.out.println(product.id + product.name+product.price);
       }
    }

}
