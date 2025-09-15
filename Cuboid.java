/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmeticoperators;
import java.lang.*;
import java.util.Scanner;
public class Cuboid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Area of the Cuboid=2(lb+bh+hl)
        //vomune=lbh
        // l=length,b=breadth,h=height;
        float l,b,h;
        System.out.println("Enter the value of l,b and h");
        l=sc.nextFloat();
        b=sc.nextFloat();
        h=sc.nextFloat();
        float area=2*(l*b+b*h+l*h);
        float volume=l*b*h;
        System.out.println("The area of the Cuboid is " +area);
        System.out.println("The volume of the Cuboid is " +volume);       
    } 
}
              
        
        
    

