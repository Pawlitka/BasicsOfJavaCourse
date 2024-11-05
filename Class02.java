public class Class02 {
    //zadanie 1

    public static void main(String[] args) {
        System.out.println("Hello, World");

        //zadanie 2

        System.out.println(true);
        System.out.println(false);
        System.out.println("byte");
        System.out.println("short");
        System.out.println("int");
        System.out.println("long");
        System.out.println("double");
        System.out.println('A');
        System.out.println('\u4332');

        //zadanie 3

        System.out.println('A'+0);
        //System pokazuje wartość numeryczną przypisaną do litery A według tablicy ASCII.

        //zadanie 4
        long sNum1 = 12L;
        double sNum2 = 151.51D;
        float sNum3 = 106.123F;

        System.out.println(sNum1);
        System.out.println(sNum2);
        System.out.println(sNum3);


        //zadanie 5
        System.out.println('!'+'!');
        System.out.println((char)('!'+'!'));
			/* wartość '!'+'!' dodaje do siebie wartości numeryczne znaku wykrzyknika i daje wynik 66.
			W przypadku wyrażenia (char)('!'+'!') wynik dodawania obu wartości zostaje zamieniony
			na literę odpowiadającą liczbie 66.*/

        //zadanie 6
        int milion = 1000000;
        long milion2 = 1_000_000L;
        System.out.println(milion);
        System.out.println(milion2);

        //zadanie 7
        //long tooBigNum = 10,000,000,000,000,000,000,000L;
        //	System.out.println(tooBigNum);
        // Sufiks L nic nie zmienia.

        //zadanie 8
        double isItTrue1 = 1234.567F;
        double isItTrue2 = 12.34567E2;
        double isItTrue3 = 1.234567E06;
        double isItTrue4 = 1234567E-3;
        System.out.println(isItTrue1);
        System.out.println(isItTrue2);
        System.out.println(isItTrue3);
        System.out.println(isItTrue4);
        // 12.34567E2 opisuje ten sam literał co 1234.567

        //zadanie 9
        System.out.println(4/3D);
        //Aby uzyskać oczekiwany wynik trzeba dodać w wyrażeniu Sufiks D, aby pokazało pełne wyrażenie dzielenia, po przecinku.

        //zadanie 10
        int z014 = 1;
        //int 1als = 2;
        //int !akag = 3;
        //int class = 4;
        //int null = 5;
        System.out.println(z014);
        //System.out.println(1als);
        //System.out.println(!akag);
        //System.out.println(class);
        //System.out.println(null);
		/*W literałach pierwszy znak powinien zaczynać się tylko i wyłącznie od małych liter co znaczy że zmienne są case sensitive.
		Nie mogą również nazywać się jak typ zmiennej ponieważ niektóre słowa mają przypisane znaczenie.*/

        //zadanie 11
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(a ^ b);
			/*Wyrażenie && oznacza "oraz", czyli oba wyrażenia muszą się zgadzań,
			w przypadku || oznacza "lub" czyli jedno z wyrażeń musi być prawdziwe, ^ oznacza XOR czyli oba argumenty muszą być różne. */
    }
}
