import java.util.Scanner;


public class Calculator
{
   private int input1; 
   private int input2; 

   Scanner scan = new Scanner(System.in); 
   public Calculator(int newInput1, int newInput2)
   {
        this.input1 = newInput1; 
        this.input2 = newInput2; 
   }
   public void setInputOne(int newinput1)
   {
        this.input1 = newinput1; 
   }
   public void setInputTwo(int newinput2)
   {
        this.input2 = newinput2; 
   }
   public int getInputOne()
   {
        return input1; 
   }
   public int getInputTwo()
   {
        return input2; 
   }
   public void inputOne()
   {    
        System.out.print("Please enter your first input: "); 
        input1 = scan.nextInt(); 
   }
   public void inputTwo()
   {
        System.out.println("Please enter your second input: "); 
        input2 = scan.nextInt(); 
   }
   public int addition()
   {
        return input1 + input2; 
   }
   public int subtraction()
   {
        return input1 - input2; 
   }
   public int multiplcation()
   {
        return input1 * input2; 
   }
   public int division()
   {
        return input1 / input2; 
   }
   public int remainder()
   {
        return input1 % input2; 
   }
   
   public static void main(String args[])
   {

        Calculator calc = new Calculator(0, 0); 
        calc.inputOne();
        calc.inputTwo();
        System.out.println("Addition: " + calc.addition());
        System.out.println("Subtraction: " + calc.subtraction()); 
        System.out.println("Multiplication: " + calc.multiplcation()); 
        System.out.println("Division: " + calc.division()); 
        System.out.println("Remainder: " + calc.remainder()); 
   }
}
