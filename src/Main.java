// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static final String GROUP_NAME = "Won13";

    public static void main(String[] args) {

        String sessionNr = args[0];
        String nextSession = args[1];
        System.out.println("This is the " + sessionNr + "st class number");
        System.out.println("The next session is "+ nextSession);

        //
            int theoryResult = 11;
            int practiceResult =3;
            int finalResult = (theoryResult *2 + practiceResult)/3;
            System.out.println("Final result is" + finalResult);

            // Adding two numbers
        int anotherResult = theoryResult + practiceResult;
        System.out.println("Adding result" + anotherResult);


        // Subtracting two number
        int yetAnotherResult = theoryResult - practiceResult;
        System.out.println("Subtracting Result is " + yetAnotherResult);

        //Multiplying two number
        int yetSomeResult = theoryResult * practiceResult;
        System.out.println("Multiplying result is " + yetSomeResult);

        //Diving two numbers
        int result = theoryResult / practiceResult;
        int modulus = theoryResult % practiceResult;
        System.out.println("Division result is " + result + " Remaining " + modulus);

    }
}