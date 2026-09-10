public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 1. Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // 3. Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("\n=== Logical Operators ===");
        System.out.println("x && y : " + (x && y)); // AND
        System.out.println("x || y : " + (x || y)); // OR
        System.out.println("!x     : " + (!x));     // NOT

        // 4. Assignment Operators
        int c = 10;

        System.out.println("\n=== compound assignment operators. ===");
        // +=
        a += 5;       // a = a + 5
        System.out.println("a += 5  : " + a);

        // -=
        a -= 3;       // a = a - 3
        System.out.println("a -= 3  : " + a);

        // *=
        a *= 2;       // a = a * 2
        System.out.println("a *= 2  : " + a);

        // /=
        a /= 4;       // a = a / 4
        System.out.println("a /= 4  : " + a);

        // %=
        a %= 3;       // a = a % 3
        System.out.println("a %= 3  : " + a);

        // 5. Unary Operators
        a = 5;

        // Unary plus
        System.out.println("+a = " + (+a));

        // Unary minus
        System.out.println("-a = " + (-a));

        // Increment
        System.out.println("++a = " + (++a));

        // Decrement
        System.out.println("--a = " + (--a));

        // Logical NOT
        boolean flag = true;
        System.out.println("!flag = " + (!flag));

        // Bitwise NOT
        b = 5;
        System.out.println("~b = " + (~b));

        System.out.println("\n=== Increment / Decrement ===");

        int i = 5;

        // Post-increment
        System.out.println("b++ : " + i++);

        // Pre-increment
        System.out.println("++b : " + (++i));

        // Post-decrement
        System.out.println("b-- : " + i--);

        // Pre-decrement
        System.out.println("--b : " + (--i));

        // 6. Bitwise Operators
        int m = 5; // 0101
        int k = 3; // 0011

        System.out.println("\n=== Bitwise Operators ===");

        int o = 5;   // Binary: 0101
        int p = 3;   // Binary: 0011

        // Bitwise AND
        System.out.println("o & o : " + (o & p));

        // Bitwise OR
        System.out.println("o | p : " + (o | p));

        // Bitwise XOR
        System.out.println("o ^ p : " + (o ^ p));

        // Bitwise NOT
        System.out.println("~o : " + (~p));

        // Left shift
        System.out.println("p << 1 : " + (p << 1));

        // Right shift
        System.out.println("p >> 1 : " + (p >> 1));

        // Unsigned right shift
        System.out.println("p >>> 1 : " + (p >>> 1));


        // 7. Ternary Operator
        System.out.println("\n=== Ternary Operator ===");
        int max = (o > p) ? o : p;
        System.out.println("Maximum = " + max);

        // 8. instanceof Operator
        String name = "Ishu";

        System.out.println("\n=== instanceof Operator ===");
        System.out.println("name instanceof String : "
                + (name instanceof String));
    }
}
