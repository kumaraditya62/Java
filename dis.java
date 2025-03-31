

import java.util.Scanner;
   class dis {
     public static void main(String  args [])
{
    Scanner m = new Scanner (System.in);
    System.out.println("input the km");
    int km = m.nextInt();
    int meter =km*1000;
    System.out.println("METER=" + meter);
    m.close();

}
}