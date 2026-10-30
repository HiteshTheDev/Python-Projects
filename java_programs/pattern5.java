public class pattern5 {
    public static void main() {
        int col_start = 11;
        for (int i = 1; i <= 5; i++) {
            int col_values = col_start;
            for (int j = 1; j <= i; j++) {
                System.out.print(col_values + " ");
                col_values += 10;
            }
            col_start++;
            System.out.println(" ");
        }
    }
}
/* 
11  
12 22  
13 23 33  
14 24 34 44  
15 25 35 45 55  
*/