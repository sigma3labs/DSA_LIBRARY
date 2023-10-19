public class ReverseWordsInString {
    public static String reverseWords(String input) {
        
        String[] words = input.split("\\s+");

        // Create a StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();

        // Iterate through the words in reverse order and append them to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add a space between words
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World Java";
        String reversedString = reverseWords(input);
        System.out.println(reversedString);
    }
}
