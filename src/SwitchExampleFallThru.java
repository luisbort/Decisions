/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Decision Constructs
Sub-Topic: Switch Statement
*/

public class SwitchExampleFallThru {
    public static void main(String[] args) {
        String[] strs = {"A", "B", "C", "D"};
        // This example of the switch statement demonstrates fall through
        // and the default label in a spot other than the last spot
        int iteration = 0;
        for (String s : strs) {
            System.out.println("-----------iteration " + (++iteration) + ", s=" + s + " --------------");
            switch (s) {
                case "A":
                    System.out.println("DO A");
                default:
                    System.out.println("DOING THIS");
                case "B":
                    System.out.println("DO B");
                case "C":
                    System.out.println("DO C");
            }

        }
    }
}