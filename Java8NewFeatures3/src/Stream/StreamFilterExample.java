package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample { 
public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<Integer>();
    list.add(10);
    list.add(4);
    list.add(800);
    list.add(9);
    list.add(10);
    list.add(40);
    List<Integer> s1=list.stream().filter(i->i%2==0).collect(Collectors.toList());
    List<Integer> s2=list.stream()
                          .map(i->i+1)
                          .collect(Collectors.toList());
    List<Integer> s3=list.stream().sorted().collect(Collectors.toList());
    List<Integer> s4=list.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(list);
    System.out.println(s3);
    System.out.println(s4);

    Long c=list.stream().filter(i->i>8).count();
    System.out.println(c);
    Integer min=list.stream().min((i1,i2)->i1.compareTo(i2)).get();
    Integer max=list.stream().max((i1,i2)->i1.compareTo(i2)).get();
    System.out.println("min is:"+min+" Max is :"+max);

    list.stream().forEach(System.out::println);

    Integer[] array=list.stream().toArray(Integer[]::new);
    for (Integer integer : array) {
        System.out.println(integer);
    }
}
}
