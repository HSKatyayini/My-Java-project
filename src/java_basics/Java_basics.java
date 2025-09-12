/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_basics;
import java.util.Scanner;
public class Java_basics {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
        String name=sc.nextLine();
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println("Enter your salary");
        double salary=sc.nextDouble();
        System.out.println("\nName:"+name);
        System.out.println("\nAge:"+age);
        System.out.println("\nSalary:"+salary);
        sc.close();
    }
    
}
