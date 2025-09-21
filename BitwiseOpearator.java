/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitwiseopearator;
public class BitwiseOpearator {
    public static void main(String[] args) {
        // TODO code application logic here
        int x=10;
        int y=6;
        int z=x&y;//AND operation
        int a=x|y;//OR opearation
        int b=x^y;//XOR operation
        int c=~x;//NOT opearation
        int d=~y;
        System.out.println(z);
        System.out.println(a);
         System.out.println(b);
          System.out.println(c);
           System.out.println(d);
          y=y>>1;//right shift 
          x=x<<1;//left shift
          System.out.println(y);
           System.out.println(x);
    }
    
    
}
