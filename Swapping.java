/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bitwiseopearator;
public class Swapping {
    public static void main(String args[]){
        int a=9;
        int b=4;
        System.out.println("Before Swapping");
         System.out.println("a = " +a);
        System.out.println("b = " +b);
        a=a^b;
        b=a^b;
        a=a^b;
         System.out.println("After Swapping");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
}
