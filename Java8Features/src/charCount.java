import java.util.HashMap;
import java.util.Map;

public class charCount {
public static void main(String[] args) {
    String s="aaabbbc";
    int count=0;
    Map<Character,Integer> map=new HashMap();
    char[] ch=s.toCharArray();
for (char c : ch) {
    if(map.containsKey(c)){
        map.put(c,map.get(c)+1);
    }else{
        map.put(c, 1);
        //count++;
    }
}
System.out.println(map);
}
}
