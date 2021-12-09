import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        FizzBuzzNumber fizz = new FizzBuzzNumber(3, "Fizz");
        FizzBuzzNumber buzz = new FizzBuzzNumber(5, "Buzz");
        FizzBuzzNumber whiz = new FizzBuzzNumber(7, "Whiz");

        ArrayList<FizzBuzzNumber> fbNumbers = new ArrayList<>();
        fbNumbers.add(fizz);
        fbNumbers.add(buzz);
        fbNumbers.add(whiz);

        FizzBuzz fbGame = new FizzBuzz(fbNumbers, 300);
        fbGame.play();
    }
}
