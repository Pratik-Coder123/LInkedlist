import java.util.Arrays;

public class anagramString {
    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Carex";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {

            char arr[] = str1.toCharArray();
            char arr1[] = str2.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(arr1);
            if (Arrays.equals(arr1, arr)) {
                System.out.println("Anagram");
            return;
            }
                    
        }
         System.out.println("Not anaggram"); 
    }
}
