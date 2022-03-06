package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testScalene() {
        Triangle t = new Triangle(3, 4, 5);
        assertEquals("Scalene", t.getTriangleType());

        t = new Triangle(4, 5, 3);
        assertEquals("Scalene", t.getTriangleType());

        t = new Triangle(5, 4, 3);
        assertEquals("Scalene", t.getTriangleType());
    }

    @Test
    public void testEquilateral() {
        Triangle t = new Triangle(3, 3, 3);
        assertEquals("Equilateral", t.getTriangleType());
    }

    @Test
    public void testIsosceles() {
        Triangle t = new Triangle(3, 3, 4);
        assertEquals("Isosceles", t.getTriangleType());

        t = new Triangle(2, 3, 2);
        assertEquals("Isosceles", t.getTriangleType());

        t = new Triangle(4, 7, 7);
        assertEquals("Isosceles", t.getTriangleType());
    }
    
    @Test
    public void testError() {
        Triangle t = new Triangle(-1, 4, 3);
        assertEquals("Error: The length should be positive", t.getTriangleType());
    
        t = new Triangle(2, -2, 7);
        assertEquals("Error: The length should be positive", t.getTriangleType());
    
        t = new Triangle(4, 7, -7);
        assertEquals("Error: The length should be positive", t.getTriangleType());
    
        t = new Triangle(-4, -7, 7);
        assertEquals("Error: The length should be positive", t.getTriangleType());
    
        t = new Triangle(-4, 7, -7);
        assertEquals("Error: The length should be positive", t.getTriangleType());
    
        t = new Triangle(4, -7, -7);
        assertEquals("Error: The length should be positive", t.getTriangleType());
    
        t = new Triangle(-4, -7, -5);
        assertEquals("Error: The length should be positive", t.getTriangleType());
    }
    
    @Test
    public void testNotTriangle() {
        Triangle t = new Triangle(1, 2, 9);
        assertEquals("Error: Not a triangle", t.getTriangleType());

        t = new Triangle(10, 4, 6);
        assertEquals("Error: Not a triangle", t.getTriangleType());

        t = new Triangle(5, 12, 6);
        assertEquals("Error: Not a triangle", t.getTriangleType());
    }
}