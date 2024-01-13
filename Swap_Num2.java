//4. Write a Java program to swap two numbers without using the third variable

class Swap_Num2 {
    public static void main(String args[]) {
        int a = 15;
        int b = 50;

        // Swap without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}