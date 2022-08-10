public class Palindrome {

    public boolean checkPalindromeV1(String input) {
        int size = input.length();
        int j = size - 1;
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
            j--;
        }

        return true;
    }

    public boolean checkPalindromeV2(String input) {
        int size = input.length();
        String reversed = "";

        for (int i = size - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return reversed.equals(input);
    }
}
