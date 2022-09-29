import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        if (arr.length == 0) {
            System.out.println(" ");
            return;
        }
        if (arr.length == 1) {
            System.out.println(arr[0]);
            return;
        }
        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length - 1];
        String result = "";
        for (int i = 0; i < first.length(); i++) {

            if (first.charAt(i) == last.charAt(i)) {
                result = result + first.charAt(i);
            } else {
                break;
            }
        }
System.out.println(result);
    }
}
