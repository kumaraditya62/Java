import java.io.*;
public class palindrome {
    public static void main(String[] args) throws IOException
     {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter a string: ");
            String str=br.readLine();
            String temp=str;
            StringBuffer sb=new StringBuffer(str);
            sb.reverse();
            str=sb.toString();

            if(temp.equalsIgnoreCase(str))
            {
                System.out.println("The string is a palindrome.");
            }
            else
            {
                System.out.println("The string is not a palindrome.");
            }
    }
    
}
