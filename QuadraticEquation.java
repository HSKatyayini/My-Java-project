/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmeticoperators;
import java.lang.*;
import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter the value of a,b and c");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        double discriminat=b*b-4*a*c;
        //If the roots are real and distinct
        if(discriminat>0)
            {
            double root1=(-b+Math.sqrt(discriminat))/(2*a);
            double root2=(-b-Math.sqrt(discriminat))/(2*a);
            System.out.println("The roots are distinct and real:");
            System.out.println("Root1:"+root1);
            System.out.println("Root2:"+root2);
           }
        else if(discriminat==0)
              {
                  double root=-b/(2*a);
                  System.out.println("The roots are real and equal");
                  System.out.println("Root1 and Root2:"+root);  
              }
        else
            {
            double realpart=-b/(2*a);
            double imaginarypart=Math.sqrt(-discriminat)/(2*a);
            System.out.println("The roots are imaginary and complex");
            System.out.println("Root1:"+realpart+ "+"+imaginarypart+"i");
            System.out.println("Root2:"+realpart+ "+"+imaginarypart+"i");
            sc.close();
            
            }
           
        
            
        
        
    }
    
}
