package week1.day2;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		int[] nums = {2,5,7,7,9,9,11,2};
		for (int i = 0; i < nums.length; i++)
		{
			for (int j =i+1; j < nums.length; j++) 
			{
				if(nums[i]==nums[j])
				{
					System.out.println(nums[i]);
					break;
				}
			}
		
		}

	}

}
