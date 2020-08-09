public class Calculator {
  public Calculator(){

  }
  public int add(int one, int two){
    int sum = one + two;
    return sum;
  }
   public int subtract(int one, int two){
    int sum = one - two;
    return sum;
  }
  public int multiply(int one, int two){
    int sum = one * two;
    return sum;
  }
  public int divide(int one, int two){
    int sum = one / two;
    return sum;
  }
  public int modulo(int one, int two){
    int sum = one % two;
    return sum;
  }
  public static void main(String[] args){
Calculator myCalculator = new Calculator();
System.out.println(myCalculator.add(5, 7));
System.out.println(myCalculator.subtract(45, 11));
}
}