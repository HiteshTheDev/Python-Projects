public class pattern3 {
    public static void main() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (6-i); j++) {
                if (j % 2 != 0)
                    System.out.print("# ");
                else if (j % 2 == 0)
                    System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
/*
# * # * #  
# * # *  
# * #  
# *  
#  
*/