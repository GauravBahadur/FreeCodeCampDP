
public class sumProblem {

	public static void main(String[] args) {
		
		int[] arr = {7,14};
		System.out.println(canSum(300,arr));
		
	}
	public static boolean canSum(int targetSum, int arr[])
	{
		if(targetSum==0)
			return true;
		if(targetSum<0)
			return false;
		else
		{
			for(int n:arr)
			{
				int remainder=targetSum-n;
				if(canSum(remainder,arr))
					return true;
			}
			return false;
		}
	}

}
