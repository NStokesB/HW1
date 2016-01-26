/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

/**
 *
 * @author nstokesbeamon
 */
public class Circle extends Shape{
    private double radius;

    public Circle(String color) {
        super(color);
        radius = 1;
    }
    
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void draw()
    {
        System.out.println("Drawing a " + getColor() + " circle with radius " + this.radius);
    }
}
