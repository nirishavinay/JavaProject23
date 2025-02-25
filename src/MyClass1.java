package src;

public class MyClass1
{
    int iVariable = 100;  // non-static variable
    
    public static void staticMethod() //static method
	{
        // Create an object of  MyClass
		
        MyClass1 obj = new MyClass1();
        
        // print the variable value
		
        System.out.println(obj.iVariable);  
    }
	    public static void main(String[] args) {
        staticMethod();
    }
}


