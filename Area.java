/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmeticoperators;
import java.util.Scanner;
import java.lang.*;
public class Area {
    public static void main(String args[]){
        //To find the area of a right angle triangle
    float base,height;
    float area;
    System.out.println("Enter the value of base and height");
    Scanner sc=new Scanner(System.in);
    base=sc.nextFloat();
    height=sc.nextFloat();
    area=(base*height)/2;
    System.out.println("Area of the right angle triangle is "+area);
    
    }
}
