package jif3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {
    @Test void testCircleArea() {
        Shape c = new Circle(1.0);
        assertEquals(Math.PI, c.area(), 1e-6);
    }

    @Test void testRectangleArea() {
        Shape r = new Rectangle(2.0, 3.0);
        assertEquals(6.0, r.area(), 1e-6);
    }

    @Test void testTriangleArea() {
        Shape t = new Triangle(3.0, 4.0);
        assertEquals(6.0, t.area(), 1e-6);
    }

    @Test void testSuperTriangleArea() {
        Shape st = new SuperTriangle(3.0, 4.0);
        assertEquals(24.0, st.area(), 1e-6);
    }
}   
