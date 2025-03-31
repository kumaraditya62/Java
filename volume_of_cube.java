import java.util.Scanner;

class Cube {
    double s;

    Cube(double side) {
        s = side;
    }

    double volume() {
        return s * s * s;
    }
}

class Main {
    public static void main(String[] args){  
        Scanner a = new Scanner(System.in); 
        System.out.println("Enter the side of the cube:");
        double side = a.nextDouble(); 
        Cube cube = new Cube(side);  
        System.out.println("Volume of the cube: " + cube.volume());
        a.close();
    }
}