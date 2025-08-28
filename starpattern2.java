public class StarPatternRepeat {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // repeat "* " i times then remove trailing space
            System.out.println( ("* ".repeat(i)).trim() );
        }
    }
}