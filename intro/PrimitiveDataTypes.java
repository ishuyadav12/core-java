public class PrimitiveDataTypes {
    public static void main(String[] args) {

      /*
		  Primitive data types are the built-in data types provided by Java that are
		  used to store simple and basic values such as integers, decimal numbers,
		  characters, and boolean values. They store the actual value directly in
		  memory and have a fixed size.
		  
		  # There are 8 primitive data types in Java. 
		  # They are predefined by the Java language. 
		  # They store actual values, not object references. 
		  # They have a fixed memory size. 
		  # They are faster than non-primitive (reference) data types.
		  
		  The 8 Primitive Data Types
          byte, short, int, long, float, double, char, boolean
		 */

        // ---------------------------------------------------------
        // 1. byte
        // Size  : 8 bits (1 byte)
        // Range : -128 to 127 (-2^7 to 2^7-1)
        // ---------------------------------------------------------
        byte byteVar = 100;
        System.out.println("byte    -> Value: " + byteVar
                + " | Size: 1 byte (8 bits)"
                + " | Min: " + Byte.MIN_VALUE
                + " | Max: " + Byte.MAX_VALUE);

        // ---------------------------------------------------------
        // 2. short
        // Size  : 16 bits (2 bytes)
        // Range : -32,768 to 32,767 (-2^15 to 2^15-1)
        // ---------------------------------------------------------
        short shortVar = 10000;
        System.out.println("short   -> Value: " + shortVar
                + " | Size: 2 bytes (16 bits)"
                + " | Min: " + Short.MIN_VALUE
                + " | Max: " + Short.MAX_VALUE);

        // ---------------------------------------------------------
        // 3. int
        // Size  : 32 bits (4 bytes)
        // Range : -2,147,483,648 to 2,147,483,647 (-2^31 to 2^31-1)
        // ---------------------------------------------------------
        int intVar = 100000;
        System.out.println("int     -> Value: " + intVar
                + " | Size: 4 bytes (32 bits)"
                + " | Min: " + Integer.MIN_VALUE
                + " | Max: " + Integer.MAX_VALUE);

        // ---------------------------------------------------------
        // 4. long
        // Size  : 64 bits (8 bytes)
        // Range : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (-2^63 to 2^63-1)
        // Note  : literal needs 'L' suffix, else treated as int
        // ---------------------------------------------------------
        long longVar = 10000000000L;
        System.out.println("long    -> Value: " + longVar
                + " | Size: 8 bytes (64 bits)"
                + " | Min: " + Long.MIN_VALUE
                + " | Max: " + Long.MAX_VALUE);

        // ---------------------------------------------------------
        // 5. float
        // Size  : 32 bits (4 bytes)
        // Range : ~1.4E-45 to ~3.4028235E38 (IEEE 754 single precision)
        // Note  : literal needs 'f' suffix, else treated as double
        // ---------------------------------------------------------
        float floatVar = 3.14f;
        System.out.println("float   -> Value: " + floatVar
                + " | Size: 4 bytes (32 bits)"
                + " | Min (positive): " + Float.MIN_VALUE
                + " | Max: " + Float.MAX_VALUE);

        // ---------------------------------------------------------
        // 6. double
        // Size  : 64 bits (8 bytes)
        // Range : ~4.9E-324 to ~1.7976931348623157E308 (IEEE 754 double precision)
        // ---------------------------------------------------------
        double doubleVar = 3.14159265358979;
        System.out.println("double  -> Value: " + doubleVar
                + " | Size: 8 bytes (64 bits)"
                + " | Min (positive): " + Double.MIN_VALUE
                + " | Max: " + Double.MAX_VALUE);

        // ---------------------------------------------------------
        // 7. char
        // Size  : 16 bits (2 bytes)
        // Range : 0 to 65,535 (unsigned, Unicode code points)
        // Note  : cast to int to display numeric min/max
        // ---------------------------------------------------------
        char charVar = 'A';
        System.out.println("char    -> Value: " + charVar
                + " | Size: 2 bytes (16 bits)"
                + " | Min: " + (int) Character.MIN_VALUE
                + " | Max: " + (int) Character.MAX_VALUE);

        // ---------------------------------------------------------
        // 8. boolean
        // Size  : Not precisely defined by JVM spec (conceptually 1 bit)
        // Range : true or false only
        // ---------------------------------------------------------
        boolean booleanVar = true;
        System.out.println("boolean -> Value: " + booleanVar
                + " | Size: JVM-dependent (~1 bit conceptually)"
                + " | Possible values: true, false");
    }
}
