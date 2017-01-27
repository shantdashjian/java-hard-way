public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age;
    double seconds, e, checking;
    String firstName, lastName, title;

    int myAge;
    double weight;
    String city, state;

    myAge = 38;
    weight = 135.5;
    city = "Denver";
    state = "Colorado";

    System.out.println( "I'm " + myAge + " and I weigh " + weight  + " pounds. ");
    System.out.println( "I live in " + city + ", " + state + ". ");
    System.out.println();
    
    x = 10;
    y = 400;
    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";

    System.out.println( "The variable x contains " + x);
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + lastName );
  }
}
