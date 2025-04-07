import java.util.Scanner;

 class circle {
    double radius;
    double PI = 3.14;

    double Area() {
        return PI * radius * radius;
    }

    double Perimeter() {
        return 2 * PI * radius;
    }
}

class circleTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = s.nextDouble();

        circle c = new circle();
        c.radius = radius;

        System.out.println("Area: " + c.Area());
        System.out.println("Perimeter: " + c.Perimeter());
    }
}
