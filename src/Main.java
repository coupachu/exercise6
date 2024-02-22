import java.util.Scanner;

class UserInput {
    Scanner myScanner = new Scanner(System.in);

    public int promptInt(String message) {
        System.out.println(message);
        String userInput = myScanner.nextLine();
        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = myScanner.nextLine();
            }
        }
        return userInt;
    }
    public String promptString(String message){
        System.out.println(message);
        String userInput = myScanner.nextLine();
        String userString = "";
        boolean isString = false;
        while (!isString) {
            try {
                userString = userInput.toString();
                isString = true;
            }catch(Exception e){
                System.out.println("something went wrong. Try again.");
                userInput = myScanner.nextLine();
            }
        }
        return userString;
    }
    public double promptDouble(String message){
        System.out.println(message);
        String userInput = myScanner.nextLine();
        double userDouble = 0;
        boolean isDouble = false;
        while(!isDouble){
            try{
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
            }catch(NumberFormatException e){
                System.out.println(userInput + " is not a valid double. " + message);
                userInput = myScanner.nextLine();
            }
        }
        return userDouble;
    }
}


public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        int aNumber = input.promptInt("Enter an integer.");
        System.out.println("Twice your number is " + aNumber * 2);
        String aString = input.promptString("input a string");
        System.out.println("your string is " + aString);
        double aDouble = input.promptDouble("input a double");
        System.out.println("twice your double is " + aDouble*2);
    }
}