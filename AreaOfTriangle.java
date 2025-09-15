/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmeticoperators;
import java.lang.*;
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String args[]){
        //Area of a triangle when the three sides are given
     Scanner sc=new Scanner(System.in);
     int a,b,c;
     System.out.println("Enter the value of a,b and c");
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     float s=(a*b*c)/2;
     float area=(float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
     System.out.println("Area of the triangle"+area);
     sc.close();
    }
    
}
