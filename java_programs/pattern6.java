public class pattern6 {
    public static void main() {
        for (int i = 5; i >= 1; i--) {
            int value = 5;
            for (int c = 1; c <= i; c++) {
                System.out.print(value + " ");
                value--;
            }
            System.out.println(" ");
        }
    }
}
/*
5 4 3 2 1  
5 4 3 2  
5 4 3  
5 4  
5  
*/