/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Decision Constructs
Sub-Topic: Switch Statement
*/

public class SwitchExampleCaseExpression {

    public static void main(String[] args) {
        // Example of a switch statement with expression based on
        // compile time constants in the case label
        String str = "";
        String test = "12";
        switch (test) {
            case ("1"):
                System.out.println("Output is 1");
                break;
            case ("1" + "2"):  // concatenation operator in expression.
                //La concatenacion solo debe suceder en tiempo de compilacion
                System.out.println("Output is 12");
                break;
            case ("2"):
                System.out.println("Output is 2");
                break;
            default:
                System.out.println("Output is default");
        }
    }
}