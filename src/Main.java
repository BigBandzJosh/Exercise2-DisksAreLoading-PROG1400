public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());
        System.out.println("The area of " + circle1.getArea() + "\n");
        Circle circle2 = new Circle(5.0, "blue");
        System.out.println(circle2.toString());
        System.out.println("The area of " + circle2.getArea() + "\n");
        Circle circle3 = new Circle(3.0);
        System.out.println(circle3.toString());
        System.out.println("The area of " + circle3.getArea() + "\n");
    }
}