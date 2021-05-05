import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Aid", "2018");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        while (true){
            int choice = scanner.nextInt();

            if(choice == 0){
                System.out.println("To repeat a statement multiple times.");
                break;
            } else if(choice == 1){
                System.out.println("To decompose a program into several small subroutines.");
                break;
            } else if(choice == 2){
                System.out.println("To determine the execution time of a program.");
                break;
            } else if(choice == 3){
                System.out.println("To interrupt the execution of a program.");
                break;
            } else {
                System.out.println("Please try again.");
            }

        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
