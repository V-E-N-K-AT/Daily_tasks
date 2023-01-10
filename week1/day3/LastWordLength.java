package week1.day3;

public class LastWordLength {
	public static void main(String[] args)
	{
		String s ="  fly me to the moon    ";
		String[] arr = s.split(" ");
		int ind = arr.length - 1;
		String lastword = arr[ind];
		System.out.println(lastword.length());
		
		
	}

}
