/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Decision Constructs
Sub-Topic: Switch Statement
*/

public class SwitchExampleSwitchExpression {
    public static void main(String[] args) {
        // Example of a Switch statement with an expression in
        // the switch evaluation
        for (int i = 0; i < 4; i++) {
            System.out.println("-----------iteration " + ((i + 1)) + " ----------------");
            switch (i * 10) {  // expression allowed here
                case 10:
                    System.out.println("result is 10");
                    break;
                case 20:
                    System.out.println("result is 20");
                    break;
                case (30):
                    System.out.println("result is 30");
                    break;
                default:
                    System.out.println("result for default, i =" + i);
            }

        }
    }
}