package assignment3;

public class CharAt {
	public static void main(String[] args){
		String a = "abcdefg";
		int i = 3;
		System.out.println(findChar(a,i));
	}
	
	public static char findChar(String str, int position){
		char c;
		char[] charArray = str.toCharArray();
		c = charArray[position-1];
		return c;
	}

}
