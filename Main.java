public class Main {
    public static void main(String[] args) {
//        int input = 2137;
        int input = Integer.MAX_VALUE;
        int output = 0;
        while (input != 0) {
            int digit = input % 10;
            output = output * 10 + digit;
            input = input / 10;
        }
        if (output > 2147483647) {
            System.out.println("Za duza liczba");
        }
        else
            System.out.println("Odwrócona liczba :" + output);
    }
}
