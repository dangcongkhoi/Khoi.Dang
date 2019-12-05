package VTC_Introduce_Programming.lab_8;

public class Bai3 {
    public static class Chuoi_palidrome {
        // To check sentence is palindrome or not
        static boolean sentencePalindrome(String Chuoi) {
            int l = 0;
            int h = Chuoi.length() - 1;

            // Lowercase string
            Chuoi = Chuoi.toLowerCase();

            // Compares character until they are equal
            while (l <= h) {

                char getAtl = Chuoi.charAt(l);
                char getAth = Chuoi.charAt(h);

                // If there is another symbol in left
                // of sentence
                if (!(getAtl >= 'a' && getAtl <= 'z'))
                    l++;

                    // If there is another symbol in right
                    // of sentence
                else if (!(getAth >= 'a' && getAth <= 'z'))
                    h--;

                    // If characters are equal
                else if (getAtl == getAth) {
                    l++;
                    h--;
                }

                // If characters are not equal then
                // sentence is not palindrome
                else
                    return false;
            }

            // Returns true if sentence is palindrome
            return true;
        }

        // Driver program to test sentencePallindrome()
        public static void main(String[] args) {
            String Chuoi = "Step on no pets";
            if (sentencePalindrome(Chuoi))
                System.out.println("Sentence is palindrome");
            else
                System.out.println("Sentence is not" + " " +
                        "palindrome");
        }
    }
}
