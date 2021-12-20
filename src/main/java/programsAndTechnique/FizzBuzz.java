package programsAndTechnique;

public class FizzBuzz {

    public static void main(String[] args) {

        int n = 25;

        for (int i = 1; i <= 25; i++) {

            if (i % (3 * 5) == 0) {
                System.out.println("FizzBuzz");
            } else if ((i % 3 == 0) & (i % 5 != 0)) {
                System.out.println("Fizz");
            } else if ((i % 5 == 0) & (i % 3 != 0)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    }
