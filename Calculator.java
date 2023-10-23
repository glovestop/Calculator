import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String input = scanner.nextLine();

        try {
            String result = calc(input);
            System.out.println("Output:" + result);
        } catch (IllegalArgumentException e) {
            System.out.println("throws Exception" );
        }
    }

    public static String calc(String input) {
        String[] parts = input.split("[+\\-*/]");
        if (parts.length != 2) {
            throw new IllegalArgumentException("throws Exception");
        }
        int a = Integer.parseInt(parts[0].trim());
        int b = Integer.parseInt(parts[1].trim());

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new IllegalArgumentException("throws Exception");
        }

        char operator = input.charAt(parts[0].length());

        switch (operator) {
            case '+':
                return String.valueOf(a + b);
            case '-':
                return String.valueOf(a - b);
            case '*':
                return String.valueOf(a * b);
            case '/':
                return String.valueOf(a / b);
            default:
                throw new IllegalArgumentException("throws Exception");
        }
    }
}