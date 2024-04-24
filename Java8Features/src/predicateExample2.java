import java.util.function.*;

public class predicateExample2 {

    public static void main(String[] args){
        String[] string={"vinay","vinny","kakka"};
        //Predicate<String> p=S->S.length()>10;
        for(String value:string){
            Predicate<String> p=s->s.charAt(0)=='k';
           // System.out.println(p.test(string[i]));
            if(p.test(value)){
            System.out.println(value);
        }
        else{
          //  System.out.println(string[i]);
        }
        }
    }
} 
