import java.util.Scanner;
class Triangle {
    private int base;
    private int height;
    void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter base: ");
        base = s.nextInt();
        System.out.print("Enter height: ");
        height = s.nextInt();
    }
    int calculateArea()
    {
        return (base * height) / 2;
    }


    void displayArea()
    {
        int area = calculateArea();
        System.out.println("Area of the triangle = " + area);
    }
}


class Test {
    public static void main(String[] args)
    {
        Triangle triangle = new Triangle();
        triangle.input();
        triangle.displayArea();
        
    }
    
}