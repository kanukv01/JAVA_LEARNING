package LambdaExpression;
/**
 * InnerLambdaExpressionExample1
 */
 interface InnerLambdaExpressionExample1 {

    public String print(String str1);
    
}

public class LambdaExpressionExample1 {
    public static void main(String[] args) {
        InnerLambdaExpressionExample1 lambda= (str1) -> {
           // String str1="I love VS code";
            String str2=str1+ "i love VS";
            return str2;
        };
        System.out.println(lambda.print("oh really?"));
    }

}
