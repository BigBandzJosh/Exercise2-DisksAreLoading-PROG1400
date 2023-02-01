public class Circle {
    private double radius;
    private String color;
    public String getColor() {
        return color;

    }
    public double getRadius() {
        return radius;
    }


    public Circle() {
        radius = 2.0;
        color = "Green";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "Orange";
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public String toString() {
        return "radius= " + radius + " color= " + color;
    }
}