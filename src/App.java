public class App {
    // 1.1: Understanding Scope
    int num1 = 0;           // class-level variable's scope example

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        int num2 = 0;               //method-level variable's scope example
        System.out.println(num2);

        {
            int num3 = 0;                   //block-level variable's scope example
            System.out.println(num3);       // will only be printed if called within this code block
        }
    }
    
}
