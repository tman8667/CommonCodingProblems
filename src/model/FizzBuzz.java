package model;

import java.util.ArrayList;

public class FizzBuzz {
    private ArrayList<FizzBuzzNumber> numbersList;
    private int maxNumber;

    public FizzBuzz(ArrayList<FizzBuzzNumber> numbers, int max) {
        this.numbersList = numbers;
        this.maxNumber = max;
    }

    // EFFECTS: plays model.FizzBuzz with numbers up to maxNumber using this class's
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

    /*
    C++ Version
#include <iostream>
#include <string>
#include <vector>

using namespace std;

class model.FizzBuzzNumber {
    public:
        model.FizzBuzzNumber(int num, string wrd) {
            number = num;
            word = wrd;
        }

        int getNumber() {
            return number;
        }

        string getWord() {
            return word;
        }
    private:
        int number;
        string word;
};

class model.FizzBuzz {
    public:
        model.FizzBuzz(vector<model.FizzBuzzNumber*> nums, int max) {
            numbersList = nums;
            maxNumber = max;
        }

        void play() {
            string output = "";

            for(int i = 1; i <= maxNumber; i++) {
                for(model.FizzBuzzNumber* x: numbersList) {
                    if(i % x->getNumber() == 0) {
                        output += x->getWord();
                    }
                }

                if(output.length() == 0) {
                    cout << i << endl;
                }
                else {
                    cout << output << endl;
                }

                output = "";
            }
        }

    private:
        vector<model.FizzBuzzNumber*> numbersList;
        int maxNumber;
};

int main()
{
    model.FizzBuzzNumber* fizz = new model.FizzBuzzNumber(3, "Fizz");
    model.FizzBuzzNumber* buzz = new model.FizzBuzzNumber(5, "Buzz");
    model.FizzBuzzNumber* whiz = new model.FizzBuzzNumber(7, "Whiz");

    vector<model.FizzBuzzNumber*> fbNumbers;
    fbNumbers.push_back(fizz);
    fbNumbers.push_back(buzz);
    fbNumbers.push_back(whiz);

    model.FizzBuzz* fbGame = new model.FizzBuzz(fbNumbers, 300);
    fbGame->play();

    delete fizz;
    delete buzz;
    delete whiz;
    delete fbGame;

    return 0;
}
     */
}
