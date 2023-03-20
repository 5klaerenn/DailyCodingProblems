/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dcp01;

/**
 *
 * @author Sklaerenn
 */
public class DCP01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /**
     * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
     * 
     * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
     * 
     * Bonus: Can you do this in one pass?
     */    
    
        int list[] = new int[8];
        boolean rep = false;
        int i, j, k;
        
        k = (int) (Math.random()*75); //assigning k with a random number between 0 and 75
        
        for(i=0; i<list.length; i++){ //loop to assign random values to the list
            list[i] = (int) (Math.random()*50);
        }
        
        for(i=0; i<list.length; i++){
            for(j=0; j<list.length; j++){  
                if(list[i]+list[j] == k){ //loop to check if numbers add up to k
                    rep = true;
                }
            }
        } System.out.println(rep); //print answer
        
        /*
        * Validation :
        System.out.println("k = "+k);
        for(int el : list){
            System.out.print(el+" ");
        }
        */
        
        
    }
    
}
