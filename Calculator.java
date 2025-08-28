public class Calculator{
public class Calculator{
   public int add(int a,int b){return a+b;}
   public int subtract(int a,int b){return a-b;}
   public int multiply(int a,int b){return a*b;}
   public int divide(int a,int b){if(b==0)throw new Arithmetic Exception("Cannot divide by zero");return a/b;}
public static void main(String[]args){
   Calculator Calc=new Calculator();
   System.out.println("Addition:"+Calc.add(10,5));
   System.out.println("Subtraction:"+Calc.subtract(10,5));
   System.out.println("Multiplication:"+Calc.multiply(10,5));
   System.out.println("Division:"+Calc.divide(10,5));
}
}
 
   
   
