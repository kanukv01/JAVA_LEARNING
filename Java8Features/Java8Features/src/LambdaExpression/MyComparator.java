package LambdaExpression;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

 class MyComparator implements Comparator<Integer>{

    public int compare(Integer o1, Integer o2) {
        // TODO Auto-generated method stub
        return (o1>o2)?-1:(o1<o2)?1:0;
    }

}

 class ComparatorExample {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(1);
        System.out.println("Before sortin"+list);
      //  Collections.sort(list,new MyComparator());

        Collections.sort(list,(I1,I2)->(I1<I2)?1:(I1>I2)?-1:0);
        System.out.println("After Sortin"+list);
    }

}
