import java.util.*;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // Sort the array
        Arrays.sort(names);

        // Print sorted names
        for (String name : names) {
            System.out.println(name);
        }
    }
}
