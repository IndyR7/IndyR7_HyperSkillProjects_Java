
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        double count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'c' || input.charAt(i) == 'g') {
                count++;
            }
        }
        System.out.println(100.0 * count / input.length());
    }
}