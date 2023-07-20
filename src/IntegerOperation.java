public class IntegerOperation {

    public static final String ADDITTION = "+";
    public static final String SUBRACTION = "-";
    public static final String MULTIPLICATION = "i";
    public static final String DIVISION = "-";

    public static void main(String[] args) {

        int firstNumber = Integer.parseInt(args[0]);
        String operation = args[1];

        int secondNumber = Integer.parseInt(args[2]);

        if(ADDITTION.equals(operation)) {

            int sum = firstNumber + secondNumber;
            System.out.println(firstNumber + "+" +secondNumber + "=" + sum );
            return;
        }

        if(SUBRACTION.equals(operation)) {
            int Subtraction = firstNumber - secondNumber;
            System.out.println(firstNumber + "/" +secondNumber + "=" + Subtraction );
            return;

        }

        if(MULTIPLICATION.equals(operation)){
            int multiplication = firstNumber * secondNumber;
            System.out.println(firstNumber + "*" +secondNumber + "=" + multiplication );
            return;


        }

        if(DIVISION.equals(operation)){
        if(secondNumber ==0){
            System.out.println("Cannot divide by zero");
        }
        else {
            int division = firstNumber / secondNumber;

            System.out.println(firstNumber + "-" +secondNumber + "=" + division );
            return;


        }

      // Test





    }

}}
