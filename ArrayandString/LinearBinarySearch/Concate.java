package ArrayandString.LinearBinarySearch;

public class Concate {
    public static void main(String[] args) {
        String[] arr = {"Java", " ", "is", " ", "fast"};
        StringBuffer sb = new StringBuffer();

        for (String s : arr) {
            sb.append(s);
        }
        System.out.println(sb.toString());
    }

    
}
