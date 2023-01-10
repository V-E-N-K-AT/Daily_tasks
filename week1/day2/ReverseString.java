package week1.day2;


public class ReverseString {
 public static void main(String[] args) {
	String word = "TestLeaf";
	
	String w2 = "selenium";
	char[] char_Arraychking2 = w2.toCharArray();
	for (int i = 0; i < char_Arraychking2.length; i++) {
		System.out.print(char_Arraychking2[i] + " ");
	}
	System.out.println();
	
	char[] charArray = word.toCharArray();
	 for (int i = charArray.length-1; i>=0 ; i--)
	 {
		System.out.print(charArray[i] + " ");
	}
	
}
}
