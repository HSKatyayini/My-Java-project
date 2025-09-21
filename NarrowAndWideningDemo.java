/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bitwiseopearator;
public class NarrowAndWideningDemo {
    public static void main(String args[]){
        byte b=10;
        short s=15;
        int i=20;
        float f=25;
        s=b;//Widening
      //  System.out.println(s);
        b=(byte) s;//Narrowing
         System.out.println(b);
       // i=s;//Widening
        
         System.out.println(i);
        s=(short) i;//Widening
         System.out.println(s);
        b=(byte)i;
         System.out.println(b);
      //  f=i;
         System.out.println(f);
        i=(int)f;
         System.out.println(f);
         
         
         
    }
    
}
