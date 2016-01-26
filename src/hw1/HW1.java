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
public class HW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simpsons[] simp = {new Bart(), new Lisa()};
        
        for(Simpsons s : simp) {
            s.speak();
        }
        
      Shape[] shapes = new Shape[2];
        
        shapes[0] = new Circle(5, "BLUE");
        shapes[1] = new Rectangle(10, 4, "RED");

           for (Shape shape : shapes)
        {
            drawIt(shape);
        }

        drawIt(null);
               
    }
    
    public static void drawIt(Shape shape)
    {
        if (shape != null)
        {
            shape.draw();
        }
    }
    
    
}



    

