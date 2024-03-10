public class StringOperations {
    public static void main(String[] args) {
        // Checking if command-line arguments are provided
        if (args.length < 1) {
            System.out.println("Usage: java StringOperations <string>");
            return;
        }

        // Extracting the input string from command-line argument
        String inputString = args[0];

        // Counting the number of vowels
        int vowelCount = countVowels(inputString);
        System.out.println("Number of vowels in the string: " + vowelCount);

        // Accepting another string from user
        String anotherString = "Concatenated";
        if (args.length >= 2) {
            anotherString = args[1];
        }

        // Concatenating both strings
        String concatenatedString = inputString.concat(anotherString);
        System.out.println("Concatenated string: " + concatenatedString);
    }

    // Method to count the number of vowels in a string
    private static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}