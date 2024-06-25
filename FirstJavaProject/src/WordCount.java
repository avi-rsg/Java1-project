public class WordCount {

    public static void main(String[] args) {
        String input = "hello java";
        int wordCount = countWords(input);
        System.out.println("Number of words in the string: " + wordCount);
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        String[] words = str.split("\\s+");
        return words.length;
    }
}

