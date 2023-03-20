/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dcp02;

/**
 *
 * @author Sklaerenn
 */
public class DCP02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    /**
     * Given an array of integers, return a new array such that each element at 
     * index i of the new array is the product of all the numbers in the 
     * original array except the one at i.
     * 
     * For example, if our input was [1, 2, 3, 4, 5], the expected output would 
     * be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output 
     * would be [2, 3, 6].
     * 
     * Follow-up: what if you can't use division?
     */    
    
    int myArray[] = {1, 2, 3, 4, 5};
    int newArray[] = new int[5];
    int i,product; 
    product = 1;
    
    for(i=0; i < myArray.length; i++){
        product *= myArray[i];
    }
    
    for(i=0; i < newArray.length; i++){
        newArray[i] = product/myArray[i];
    }
    
    for(int el : newArray){
        System.out.println(el);
    }
    
    }
}
