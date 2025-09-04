public class StarTrianglePattern {
    public static void main(String[] args) {
        int n = 5; 

       
        for (int i = 0; i < n; i++) {
            String row = "";

            
            for (int j = 0; j < n - i - 1; j++) {
                row += "- ";
            }

            
            for (int j = 0; j < (2 * i + 2); j++) {
                row += "* ";
            }

           
            for (int j = 0; j < n - i - 1; j++) {
                row += "- ";
            }

            System.out.println(row.trim());
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            String row = "";

            for (int j = 0; j < n - i - 1; j++) {
                row += "- ";
            }
            for (int j = 0; j < (2 * i + 2); j++) {
                row += "* ";
            }
            for (int j = 0; j < (n - i - 1) * 2; j++) {
                row += "- ";
            }

            for (int j = 0; j < (2 * i + 2); j++) {
                row += "* ";
            }

            for (int j = 0; j < n - i - 1; j++) {
                row += "- ";
            }

            System.out.println(row.trim());
        }
    }
}