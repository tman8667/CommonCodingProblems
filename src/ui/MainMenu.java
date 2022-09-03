package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {
    private final static int WIDTH = 1000;
    private final static int HEIGHT = WIDTH * 9 / 16;
    private JPanel panelMain;
    private JButton fizzBuzzButton;
    private JButton palindromeButton;
    private static JFrame frame;

    public MainMenu() {
        fizzBuzzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("FizzBuzz pressed");
                frame.setContentPane(new FizzBuzzUI().panelMain);
            }
        });
        palindromeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Palindrome Pressed");
                frame.setContentPane(new PalindromeUI().panelMain);
            }
        });
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

    public static void main(String[] args) {
        frame = new JFrame("Common Coding Problems");
        frame.setContentPane(new MainMenu().panelMain);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
