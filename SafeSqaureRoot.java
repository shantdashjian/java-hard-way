import java.util.Scanner;

public class SafeSqaureRoot {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;

    System.out.print( "Give me a number, and I'll find it's square root. " );
    System.out.print( "(No negatives, please.) " );
    x = keyboard.nextDouble();

    while ( x < 0 ) {
      System.out.print( "I won't take the sqaure root of a negative." );
      System.out.print( "\nNew number: " );
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println( "The square root of " + x + " is " + y );
  }
}
