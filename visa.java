 
 class Visa {
    public static void main(String[] args) {
        int age = 20;
        boolean hasPassport = true;
        if (age >= 18 && hasPassport) {
            System.out.println("Visa application is accepted.");
        }
        else if (age >= 18 && !hasPassport) {
            System.out.println("Visa application is rejected due to missing passport.");
        } 
        else {
            System.out.println("Visa not allowed for applicants under 18.");
        }
    }
}