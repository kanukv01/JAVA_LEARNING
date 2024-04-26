import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class odd {
 public static void main(String[] args) {
    List<Integer> list=new ArrayList<>();
    list.add(10);
    list.add(13);
    for (Integer integer : list) {
        if(integer % 2==0){
            System.out.println("not odd");
        }else{
            System.out.println(" odd");
        }
    }

    String s=" vinay";
    s.strip();

    int[] arr={1,2,5,4};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    
 }
}
