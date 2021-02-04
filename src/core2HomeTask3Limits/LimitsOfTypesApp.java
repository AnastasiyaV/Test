package core2HomeTask3Limits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LimitsOfTypesApp {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter primitive type (int/byte/etc...)");
        String input = br.readLine();

        boolean minBoolean = Boolean.FALSE;
        boolean maxBoolean = Boolean.TRUE;
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        switch (input.toLowerCase()) {
            case "byte":
                System.out.println("Min byte value is " + minByte);
                System.out.println("Max byte value is " + maxByte);
                break;
            case "boolean":
                System.out.println("Min boolean value is " + minBoolean);
                System.out.println("Max boolean value is " + maxBoolean);
                break;
            case "short":
                System.out.println("Min short value is " + minShort);
                System.out.println("Max short value is " + maxShort);
                break;
            case "char":
                System.out.println("Min char value is " + minChar);
                System.out.println("Max char value is " + maxChar);
                break;
            case "int":
                System.out.println("Min int value is " + minInt);
                System.out.println("Max int value is " + maxInt);
                break;
            case "long":
                System.out.println("Min long value is " + minLong);
                System.out.println("Max long value is " + maxLong);
                break;
            case "float":
                System.out.println("Min float value is " + minFloat);
                System.out.println("Max float value is " + maxFloat);
                break;
            case "double":
                System.out.println("Min double value is " + minDouble);
                System.out.println("Max double value is " + maxDouble);
                break;

            default:
                System.out.println("Wrong!");
        }


    }
}
