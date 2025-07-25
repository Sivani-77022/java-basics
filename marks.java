 
 public class Marks{
	public static void main(String[] args) {
		int s1 = 90, s2 = 88, s3 = 92, s4 = 85, s5 = 95;
        if (s1 >= 35 && s2 >= 35 && s3 >= 35 && s4 >= 35 && s5 >= 35) {
            int avg = (s1 + s2 + s3 + s4 + s5) / 5;
            if (avg >= 90) {
                System.out.println("Outstanding");
            } else if (avg >= 75) {
                System.out.println("Distinction");
            } else if (avg >= 60) {
                System.out.println("First Class");
            } else {
                System.out.println("Pass");
            }
        } 
	}

}