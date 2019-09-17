import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        String binNum = in.nextLine();
        System.out.println(ConvertToDecimal(binNum));
    }

    public static int ConvertToDecimal (String binString) {
        int convertedNum = 0;
        int binlength = binString.length() - 1;
        for (int i = 0; i <= binlength; i++) {
            convertedNum += Character.getNumericValue(binString.charAt(i)) * (int) Math.pow(2, (binlength - i));
        }
        return(convertedNum);
    }
}
