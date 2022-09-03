package ui;

import java.awt.*;

public class CCPUI extends Canvas {
    private final static int WIDTH = 1000;
    private final static int HEIGHT = WIDTH * 9 / 16;

    public CCPUI() {
        canvasSetup();

        initializeGraphics();

        this.setFocusable(true);
    }

    public void run() {
        /*FizzBuzzNumber fizz = new FizzBuzzNumber(3, "Fizz");
        FizzBuzzNumber buzz = new FizzBuzzNumber(5, "Buzz");
        FizzBuzzNumber whiz = new FizzBuzzNumber(7, "Whiz");

        ArrayList<FizzBuzzNumber> fbNumbers = new ArrayList<>();
        fbNumbers.add(fizz);
        fbNumbers.add(buzz);
        fbNumbers.add(whiz);

        FizzBuzz fbGame = new FizzBuzz(fbNumbers, 300);
        FizzBuzzV1 fbV1Game = new FizzBuzzV1();
        fbGame.play();
        //fbV1Game.play();
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.checkPalindromeV1("apa"));
        System.out.println(palindrome.checkPalindromeV2("apa"));*/

    }

    private void initializeGraphics() {
    }

    private void canvasSetup() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
    }
}
