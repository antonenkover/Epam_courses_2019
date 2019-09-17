public class Task3 {

    public static void main(String[] args) {

        int counter = 0;
        byte byteNum = 1;
        int intNum = 1;
        short shortNum = 1;
        long longNum = 1;

        while (byteNum != 0) {
            byteNum = (byte) ( byteNum << 1);
            counter++;
        }
        System.out.println("The length of byte is " + counter);
        counter = 0;
        while (intNum != 0) {
            intNum = intNum << 1;
            counter++;
        }
        System.out.println("The length of int is " + counter);
        counter = 0;
        while (shortNum != 0) {
            shortNum = (short) (shortNum << 1);
            counter++;
        }
        System.out.println("The length of short is " + counter);
        counter = 0;
        while (longNum != 0) {
            longNum = longNum << 1;
            counter++;
        }
        System.out.println("The length of long is " + counter);
    }
}
