class test {
    double width, height, depth;

    // No-argument constructor
    test() {
        System.out.println("Constructor without parameter");
        width = 10;
        height = 10;
        depth = 10;
    }

    // Parameterized constructor
    test(int a, int b, int c) {
        System.out.println("Constructor with parameter");
        width = a;
        height = b;
        depth = c;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
}

class check {
    public static void main(String[] args) {
        // Using no-argument constructor
        test t1 = new test();
        System.out.println("Volume using default constructor: " + t1.volume());

        // Using parameterized constructor
        test t2 = new test(5, 6, 7);
        System.out.println("Volume using parameterized constructor: " + t2.volume());
    }
}
