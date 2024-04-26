import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("vinay");
        for (String string : list) {
            System.out.println(string);
        }
    }
}
