import java.util.Scanner;
class temp
 {
    public static void main(String arg[])
    {
Scanner s=new Scanner(System.in);
System.out.println("Enter value in fahrenite=");
int f=s.nextInt();
int c=((f-32)*5)/9;
System.out.println("Celsius="+c);
s.close();
    }
    
}
