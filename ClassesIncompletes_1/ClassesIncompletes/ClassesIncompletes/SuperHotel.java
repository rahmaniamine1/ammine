/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */


public class SuperHotel {
    static int x[];


    public void reserver(){
    try{
              x[0] = 1;     
    }catch(Exception e){
        System.out.println("Array index is out of bounds exception."); ;
    }
    }
    
    public static void main(String args[]) {
        
        SuperHotel s = new SuperHotel();
        s.reserver();
    }
}

