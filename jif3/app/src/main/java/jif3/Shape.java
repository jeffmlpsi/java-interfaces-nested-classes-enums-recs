package jif3;

// Sealed interface example in Java
// A sealed interface restricts which classes can implement it
public sealed interface Shape permits Circle, Rectangle, Triangle {
    double area();
}

// Permitted implementations
// Any class or interface that implements or extends a sealed interface must itself be 
// declared as one of the following:
// final: 
//      This prevents further subclassing or extension.
// non-sealed: 
//      This allows further subclassing or extension without restriction.
// sealed: 
//      This allows further subclassing or extension but with its own permits clause, 
//      continuing the controlled hierarchy.
final class Circle implements Shape {
    private final double radius;
    public Circle(double radius) { this.radius = radius; }
    public double area() { return Math.PI * radius * radius; }
}

non-sealed class Rectangle implements Shape {
    private final double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area() { return width * height; }
}

sealed class Triangle implements Shape permits SuperTriangle {
    private final double base, height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double area() { return 0.5 * base * height; }
}

final class SuperTriangle extends Triangle {
    public SuperTriangle(double base, double height) {
        super(2*base, 2*height);
    }
}