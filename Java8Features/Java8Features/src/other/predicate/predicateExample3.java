package predicate;
import java.util.ArrayList;
import java.util.function.*;
public class predicateExample3 {

    public static void main(String[] args){
        String[] string={"vinay","vinny",null,"kakka","",null};
        Predicate<String> p=s->s!=null && s.length()>0;
        ArrayList<String> list=new ArrayList<>();
        for(String s:string){
            if(p.test(s)){
                list.add(s);
            }
        }
        System.out.println(list);

    }

}
