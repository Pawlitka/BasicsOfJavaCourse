public class Lecture01 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            boolean isDivisibleBy3 = i % 3 == 0;
            boolean isDivisibleBy5 = i % 5 == 0;

            if ( isDivisibleBy3 && isDivisibleBy5 ) {
                System.out.println("FizzBuzz");
            }
            else if( isDivisibleBy3 ) {
                System.out.println("Fizz");

            }
            else if ( isDivisibleBy5 ) {
                System.out.println("Buzz");
            }
            else
                System.out.println(i);
        }

    }
}
