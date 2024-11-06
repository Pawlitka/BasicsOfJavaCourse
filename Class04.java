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
        /* Aby program zadziałał zmienna c nie może być typu short, tylko int ponieważ wiele procesorów nie może
        załadować mniej niż 4 bajty pamięci na raz - rozmiary zmiennych muszą być znane w czasie kompilacji,
        a inty są często szybsze w użyciu niż shorty.*/
        System.out.println(" --- --- ");

        //zadanie 3
        System.out.println("--- Zadanie 3 ---");
        int x = 5;
        System.out.println( (x = 4) * x);
        //wynikiem zadania 3 będzie liczba 16, ponieważ zmienna x w momencie printowania jest nadpisywana.
        System.out.println(" --- --- ");

       // zadanie 4
        System.out.println("--- Zadanie 4 ---");
        if(Math.pow(Math.sqrt(2), 2) - 2  == 0) {
            System.out.println("Sprawdziło się");
        } else {
            System.out.println("Nie sprawdziło się");
            System.out.println(Math.pow(Math.sqrt(2), 2) - 2);
        }
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

        if (a < 0) {
            System.out.println("Negative");
            a = a * -1;
            System.out.println("Absolute value: " + a);
        }
        if (a >= 0) {
            System.out.println("Positive");
            System.out.println("Absolute value: " + a);
        }
        System.out.println(" --- --- ");

        //zadanie 7
        System.out.println("--- Zadanie 7 ---");
        a = 1;
        int b = 1;
        boolean attempt1 = ( ! (a < b) && !( a > b ) );
        boolean attempt2 = (  (a >= b) && ( a <= b ) );
        boolean attempt3 = a == b;
        System.out.println("attempt1:" + attempt1);
        System.out.println("attempt2:" + attempt2);
        System.out.println("attempt3:" + attempt3);

        System.out.println(" --- --- ");

        //zadanie 8
        System.out.println("--- Zadanie 8 ---");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 > 0 && num2 > 0)
            System.out.println(num1 - num2);
        else
            System.out.println(num1 + num2);
        System.out.println(" --- --- ");

        //zadanie 9
        System.out.println("--- Zadanie 9 ---");
        int year = scanner.nextInt();
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        boolean isLeapYear = (isDivisibleBy4 && !isDivisibleBy100) || isDivisibleBy400;

        String answer = "Rok " + year;
        if(!isLeapYear) {
            answer += " nie";
        }
        answer += " jest rokiem przestępnym.";
        System.out.println(answer);


        System.out.println(" --- --- ");

        //zadanie 10
        System.out.println("--- Zadanie 10 ---");
        char ch = scanner.next().charAt(0);
        if (ch >= 65 && ch <= 90)
            System.out.println(ch + " jest dużą literą");
        else if (ch >= 97 && ch <= 122)
            System.out.println(ch + " jest małą literą");
        else if (ch >= 48 && ch <= 57)
            System.out.println(ch + " jest cyfrą");
        else
            System.out.println(ch + " jest innym znakiem");

        System.out.println(" --- --- ");
    }
}

