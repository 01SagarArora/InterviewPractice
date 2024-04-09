package otherInterview;

/**
 * Created by sagararora on 07/04/24.
 */
import java.util.HashSet;
import java.util.Set;

public class StringPermutations {

    public static void main(String[] args) {
        String str = "abc";
        Set<String> result = permute(str);
        System.out.println("Permutations: " + result);
    }

    public static Set<String> permute(String str) {
        Set<String> result = new HashSet<>();
        permute("", str, result);
        return result;
    }

    private static void permute(String prefix, String suffix, Set<String> result) {
        int n = suffix.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permute(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i + 1, n), result);
            }
        }
    }
}
