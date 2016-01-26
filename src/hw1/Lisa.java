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
public class Lisa implements Simpsons{
    private int age; 
    
    @Override
    public void speak() {
        System.out.println("Quit it, Bart!");
    }

    @Override
    public int getAge() {
        return age;
    }
    @Override
    public void setAge(int age){
        
    }
}
