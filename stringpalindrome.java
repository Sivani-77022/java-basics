class Main{
public static void main(String[]args){
String hello = new String("racecar");
String rev="";
for(int i=0;i<hello.length();i++){
rev=hello.charAt(i)+rev;
}
System.out.println(rev);
}
}