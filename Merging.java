/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bitwiseopearator;
public class Merging {
    public static void main(String srga[]){
        /*merging process-means make the required bit as 1 by taking another variable 
        using OR opearation*/
        byte a=0;//0000000
        byte b=8;//0001000
        a=(byte) (a|b);
        System.out.println(a);//0001000
    }
}
