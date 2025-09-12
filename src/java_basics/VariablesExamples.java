package java_basics;
import java.lang.*;
public class VariablesExamples {
    // Examples for different types of variables
    int instanceVar=10;
    static int staticVar=20;
    void method()
    {
    int localVar=30;
    System.out.println("Local Variables:"+localVar);
    }
    public static void main(String args[])
    {
        VariablesExamples obj=new VariablesExamples();
        System.out.println("Instance Variables:"+obj.instanceVar);
        System.out.println("Static Variables:"+obj.staticVar);
        obj.method();  
    }
    
}
