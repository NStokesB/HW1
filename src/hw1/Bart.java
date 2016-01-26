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
public class Bart extends Cartoon{
     @Override
    public void speak() {
        System.out.println("Eat My Shorts!");
    }    
    
    public void introduceSelf() {
        System.out.println("I'm Bart Simpson, Who the Hell are You?");
    }

    @Override
    public void rideSkateBoard() {
        System.out.println("Bart Simpson rides into the sun!!");
    }
}
