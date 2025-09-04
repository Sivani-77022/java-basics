public class Demo2 {

	public static void main(String[] args) {
		
	
		StringBuffer sb = new StringBuffer();
		String name = "lingaswamy";
		int length = name.length();
		sb.append("Hi this is and doing coding");
		sb.insert(27, name);
		System.out.println(sb);
		
		for(int i=0; i<sb.length() ;i++) {
			if(sb.charAt(i) == name.charAt(0) && i<=sb.length()-length){
				
				String word = sb.substring(i,i+length);
				if(word.equals(name)) {
					StringBuilder sb1 = new StringBuilder(word);
					sb1.reverse();
					sb.replace(i, length+i, sb1.toString());
				}
			}
		}
		System.out.println(sb);
	}
}