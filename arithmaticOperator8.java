import java.util.Scanner;

public class arithmaticOperator8 {
    public static void main(String[] args) {
        System.out.println("Perform oprtation on the ");
        Scanner input = new Scanner(System.in);
        System.out.println("Game Start");
        System.out.println("plese enter first number");
        int a = input.nextInt();
        System.out.println("plese enter Second number");
        int b = input.nextInt();
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int modulo = a%b;
        System.out.println("Additon of Two Numbers: ");
        System.out.println("a" + "+" + "b" + "=" + sum + "\n");
        System.out.println("Substration of Two Numbers: ");
        System.out.println("a" + "-" + "b" + "=" + sub + "\n");
        System.out.println("Multiplication of Two Numbers: ");
        System.out.println("a" + "*" + "b" + "=" + mul + "\n");
        System.out.println("Division of Two Numbers: ");
        System.out.println("a" + "/" + "b" + "=" + div + "\n");
        System.out.println("Modulo of Two Numbers: ");
        System.out.println("a" + "%" + "b" + "=" + modulo + "\n");
    }
}
