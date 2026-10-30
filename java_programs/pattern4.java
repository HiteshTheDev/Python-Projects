public class pattern4 {
    public static void main() {
        int val = 1;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val++;
            }
            System.out.println(" ");
        }
    }
}
