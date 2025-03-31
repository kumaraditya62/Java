 import java.util.Scanner;
 class vowel 
 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
System.out.println("Enter any character=");
char ch=s.next().charAt(0);
switch(ch)
{
    case'a':
    case'e':
    case'i':
    case'o':
    case'u':
    case'A':
    case'E':
    case'I':
    case'O':
    case'U':
    System.out.println(ch+" is a vowel.");
    break;
    default:
    System.out.println(ch+" is not a vlowel.");
    break;
}
s.close();
    }
    
}
