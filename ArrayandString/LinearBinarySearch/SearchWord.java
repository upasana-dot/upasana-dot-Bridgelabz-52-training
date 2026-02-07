package ArrayandString.LinearBinarySearch;

public class SearchWord {
    public static void main(String[] args) {
        String[] sentences = {
            "Java is powerful",
            "Python is easy",
            "I love coding"
        };
        String word = "coding";

        for (String s : sentences) {
            if (s.contains(word)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Not Found");
    }

    
}
