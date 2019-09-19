public class Task3 {

    public static void main(String[] args) {

        byte byteNum = 1;
        int intNum = 1;
        short shortNum = 1;
        long longNum = 1;

        System.out.println("The length of byte is " + countByteLength(byteNum));
        System.out.println("The length of int is " + countIntegerLength(intNum));
        System.out.println("The length of short is " + countShortLength(shortNum));
        System.out.println("The length of long is " + countLongLength(longNum));
    }

    public static int countByteLength (byte byteNum) {
        int counter = 0;
        while (byteNum != 0) {
            byteNum = (byte) ( byteNum << 1);
            counter++;
        }
        return counter;
    }

    public static int countIntegerLength (int intNum) {
        int counter = 0;
        while (intNum != 0) {
            intNum = intNum << 1;
            counter++;
        }
        return counter;
    }

    public static int countShortLength (short shortNum) {
        int counter = 0;
        while (shortNum != 0) {
            shortNum = (short) (shortNum << 1);
            counter++;
        }
        return counter;
    }

    public static int countLongLength (long longNum) {
        int counter = 0;
        while (longNum != 0) {
            longNum = longNum << 1;
            counter++;
        }
        return counter;
    }
}
