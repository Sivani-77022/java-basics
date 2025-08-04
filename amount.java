class Main {
public static void main(String[] args) {
int amount = 3700;
int thousands = amount / 1000;
amount = amount % 1000;
int fiveHundreds = amount / 500;
amount = amount % 500;
int remaining = amount;
System.out.println("1000s: " + thousands);
System.out.println("500s: " + fiveHundreds);
System.out.println("Remaining: " + remaining);
}
}