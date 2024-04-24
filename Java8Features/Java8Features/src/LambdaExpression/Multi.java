package LambdaExpression;
import java.text.ParseException;

public class Multi{

public static void main(String[] args) throws ParseException { String a = "India";

String b = new String("India");

String c = new String("us");

System.out.println(a.hashCode() == b.hashCode());

System.out.println(a.hashCode() == c.hashCode());

System.out.println(b.hashCode() == c.hashCode());

}

}