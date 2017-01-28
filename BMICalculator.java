import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);
    double height, inches, m, pounds, kg, bmi;
    int feet;
    final double INCH_TO_METER = 0.0254;
    final double POUND_TO_KG = 0.453592;

    System.out.print( "Your height (feet only): " );
    feet = keyboard.nextInt();

    System.out.print( "Your height (inches): " );
    inches = keyboard.nextInt();
    height = feet * 12 + inches;
    m = height * INCH_TO_METER;

    System.out.print( "Your weight in pounds: " );
    pounds = keyboard.nextDouble();
    kg = pounds * POUND_TO_KG;

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
