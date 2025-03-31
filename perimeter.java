import java.util.Scanner;

class Perimeter {
    int l, r, b, s1, s2, s3;
    double pi = 3.14, peri;
    Scanner s = new Scanner(System.in);

    void circle() {
        System.out.println("Enter radius of circle=");
        r = s.nextInt();
        peri = 2 * pi * r;
        System.out.println("Perimeter of circle=" + peri);
    }

    void rectangle() {
        System.out.println("Enter length and breadth of rectangle=");
        l = s.nextInt();
        b = s.nextInt();
        peri = 2 * (l + b);
        System.out.println("Perimeter of rectangle=" + peri);
    }

    void triangle() {
        System.out.println("Enter the first, second, and third sides of the triangle=");
        s1 = s.nextInt();
        s2 = s.nextInt();
        s3 = s.nextInt();
        peri = s1 + s2 + s3;
        System.out.println("Perimeter of triangle=" + peri);
    }
}

class Check {
    public static void main(String[] args) {
        Perimeter p = new Perimeter();
        p.circle();
        p.rectangle();
        p.triangle();
        p.s.close(); // Close the Scanner instance
    }
}
