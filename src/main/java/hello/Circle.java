package main.java.hello;

/**
 * Circle class.
 */
public class Circle {
    private static final double PT = 3.14;
    private double              radius;

    /**
     * constructor
     * pre: none
     * post: A Circle object created. Radius initialized to 1.
     */

    public Circle() {
        radius = 1; // default radius

    }


    /**
     * Changes the radius of the circle.
     * pre: none
     * post: Radius has been changed.
     */
    public void setRadius(double newRadius) {
        radius = newRadius;

    }

    /**
     * Calculate the area of the circle.
     * pre: none
     * post: The area of the circle has been returned.
     */
    public double area() {
        double circleArea;

        circleArea = PT * radius * radius;
        return (circleArea);
    }

    /**
     * Returns the radius of the circle.
     * pre: none
     * post: The radius of the circle has been returned.
     */
    public double getRadius() {
        return (radius);
    }



}