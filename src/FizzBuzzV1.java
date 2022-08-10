public class FizzBuzzV1 {

    public FizzBuzzV1() {

    }

    public void play() {
        for (int i = 1; i <= 100; i++) {
            String output = "";
            if (i % 3 == 0) {
                output += "Fizz";
            }
            if (i % 5 == 0) {
                output += "Buzz";
            }

            if (output.length() > 0) {
                System.out.println(output);
            }
            else {
                System.out.println(i);
            }
        }
    }
}
