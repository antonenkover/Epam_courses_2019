import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your binary number: ");
        String binNum = in.nextLine();

        int binNumInt = Integer.parseInt(binNum, 2);

        System.out.println("Enter the position to which you want to apply changes: ");
        int pos = in.nextInt();

        System.out.println(Integer.toBinaryString(changeCharacterValue(binNum, binNumInt, pos)));

    }

    public static int changeCharacterValue (String binNum, int binNumInt, int pos) {
        int val = 1;
        int changedNum;
        val <<= (binNum.length() - pos);

        if (binNum.charAt(pos - 1) == '1') {
            changedNum = binNumInt ^ val;
        }
        else
            changedNum = binNumInt | val;

        return changedNum;
    }
}
