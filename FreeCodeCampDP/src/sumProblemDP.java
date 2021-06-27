import java.util.HashMap;
import java.util.Map;

public class sumProblemDP {

	public static void main(String[] args) {
		Map<Integer, Boolean> map=new HashMap<Integer, Boolean>();
		int arr[]= {7,14};
		System.out.println(canSum(300,arr,map));
	}
	public static boolean canSum(int targetSum, int[] arr,Map<Integer, Boolean> map )
	{
		if(targetSum==0) return true;
		if(targetSum<0) return false;
		if(map.containsKey(targetSum))
			return map.get(targetSum);
		else 
		{
			for(int n: arr)
			{
				int remainder=targetSum-n;
						if(canSum(remainder, arr, map)) {
							map.put(remainder, true);
							return true;
						}
						
			}
		}
		map.put(targetSum,false);
		return false;

	}
	
	
}
