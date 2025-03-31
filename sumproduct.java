import java.util.Scanner;
class sumproduct
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first no=");
        int a=s.nextInt();
        System.out.println("enter second no=");
        int b=s.nextInt();
        System.out.println("enter third no");
        int c=s.nextInt();
        int d=a+b;
        int p=b*c;
        System.out.println("SUM ="+d);
        System.out.println("PRODUCT="+p);
s.close();



    }
}