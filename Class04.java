public class Class04 {
    public static void main(String[] args) {
        //zadanie 1
        System.out.println("--- Zadanie 1 ---");
        double first = .2;
        double second = 16.3;
        int third = 178;
        long fourth = 4L;
        double fifth = 567d;
        float sixth = 15.87F;
        boolean seventh = false;
        String eigth = "PPJ";
        char nine = 'A';
        byte ten = 0b1_0101;
        byte eleven = 0b10101;
        int twelve = 0120;
        byte thirteen = 0x2F;
        char fourteen = '\u0041';
        double fifteen = 0.031415e2;
        System.out.println(" --- --- ");

        //zadanie 2
        System.out.println("--- Zadanie 2 ---");
        //short a = 5, b = 6;
        //int c = a + b;
        //System.out.println(c);
        /*aby program zadziałał zmienna c nie może być typu short, tylko int ponieważ na poziomie kompilowania
        short musi zostać zamieniony na int, obliczenia na int wykonują się szybciej,
         co więcej przechowują więcej informacji bitowych.*/
        System.out.println(" --- --- ");

        //zadanie 3
        System.out.println("--- Zadanie 3 ---");
        int x = 5;
        System.out.println( (x = 4) * x);
        //wynikiem zadania 3 będzie liczba 16, ponieważ zmienna x w momencie printowania jest nadpisywana.
        System.out.println(" --- --- ");

        //zadanie 4
        System.out.println("--- Zadanie 4 ---");
        System.out.println(Math.sqrt((2)^2) - 2);
        System.out.println(" --- --- ");

        //zadanie 5
        System.out.println("--- Zadanie 5 ---");
        if (3 < 5 * 2.0)
            System.out.println("Hello");
        System.out.println("World");
        System.out.println(" --- --- ");

        //zadanie 6
        System.out.println("--- Zadanie 6 ---");
        int a = 3;
        if (a < 0){
            System.out.println("Negative");
            a = a * -1;
            System.out.println("Absolute value: " + a);
        } else {
            System.out.println("Positive");
            System.out.println("Absolute value: " + a);
        }
        System.out.println(" --- --- ");

        //zadanie 7
        System.out.println("--- Zadanie 7 ---");
        System.out.println(" --- --- ");

        //zadanie 8
        System.out.println("--- Zadanie 8 ---");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 > 0 && num2 > 0)
            System.out.println(num1 - num2);
        else if (num1 < 0 && num2 < 0)
            System.out.println(num1 + num2);
        System.out.println(" --- --- ");

        //zadanie 9
        System.out.println("--- Zadanie 9 ---");
        System.out.println(" --- --- ");

        //zadanie 10
        System.out.println("--- Zadanie 10 ---");
        System.out.println(" --- --- ");
    }
}
