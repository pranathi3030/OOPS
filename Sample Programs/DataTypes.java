

public class DataTypes {
    public static void main(String[] args) {
        byte byteVar = 100;
        short shortVar = 20000;
        int intVar = 1000000;
        long longVar = 10000000000L;

        float floatVar = 12.34f;
        double doubleVar = 1234.5678;

        System.out.println("Byte value   : " + byteVar   + " | Size: " + Byte.BYTES + " bytes");
        System.out.println("Short value  : " + shortVar  + " | Size: " + Short.BYTES + " bytes");
        System.out.println("Int value    : " + intVar    + " | Size: " + Integer.BYTES + " bytes");
        System.out.println("Long value   : " + longVar   + " | Size: " + Long.BYTES + " bytes");
        System.out.println("Float value  : " + floatVar  + " | Size: " + Float.BYTES + " bytes");
        System.out.println("Double value : " + doubleVar + " | Size: " + Double.BYTES + " bytes");
    }
}
