import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int reverseNum = ~in.nextInt() + 1;

        System.out.println(reverseNum);
    }

}
