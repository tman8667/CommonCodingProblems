import java.util.ArrayList;

public class FizzBuzz {
    private ArrayList<FizzBuzzNumber> numbersList;
    private int maxNumber;

    public FizzBuzz(ArrayList<FizzBuzzNumber> numbers, int max) {
        this.numbersList = numbers;
        this.maxNumber = max;
    }

    // EFFECTS: plays FizzBuzz with numbers up to maxNumber using this class's
    //          multiples and words
    public void play() {
        String output = "";

        for(int i = 1; i <= maxNumber; i++) {
            for(FizzBuzzNumber x: numbersList) {
                if(i % x.getNumber() == 0) {
                    output += x.getWord();
                }
            }

            if(output.length() == 0) {
                System.out.println(i);
            }
            else {
                System.out.println(output);
            }

            output = "";
        }
    }
}
