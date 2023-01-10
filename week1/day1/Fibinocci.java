package week1.day1;

public class Fibinocci {

	public static void main(String[] args) {
		int first_num = 0;
		int sec_num=1;
		int sum=0;
		for (int i =1 ; i <=11; i++) {
			System.out.print(first_num + " ");
			sum=first_num + sec_num;
			first_num=sec_num;
			sec_num=sum;
		}
	}

	}


