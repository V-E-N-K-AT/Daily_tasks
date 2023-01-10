package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n=131;
		int count=0;
		for (int i = 2; i <= n; i++) {
			if(n%i==0) {
				count++;
			}
		
		}
		
		if(count==1) {
			System.out.println(" is prime");
		}
		else {
			System.out.println("composite");
    	}
	}
	}


