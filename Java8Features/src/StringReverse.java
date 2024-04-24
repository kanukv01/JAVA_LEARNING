public class StringReverse {
    public static void main(String[] args) {
        String s1="vinay";
        char[] s2=s1.toCharArray();

        StringBuilder s=new StringBuilder();
for(int i=s2.length-1;i>=0;i--){
  System.out.println(s2[i]);
  
  s.append(s2[i]);

}
System.out.println(s);
    }

    
}