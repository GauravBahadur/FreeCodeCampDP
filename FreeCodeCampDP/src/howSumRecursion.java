import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class howSumRecursion {

	public static void main(String[] args) {
		int numbers[]= {2,3,5};
		int targetSum=8;
		int arr[]=howSum(targetSum,numbers);
		if(arr!=null) {
		for(int n:arr)
			System.out.print(n+" ");
		}
		else
			System.out.println("Number cannot be formed!");
	}
	public static int[] howSum(int targetSum, int[] numbers)
	{
		if(targetSum==0) {
			int ar[]= {};
			return ar;
		}
		if(targetSum<0) {
			return null;
		}
		for(int n:numbers)
		{
			int remainder=targetSum-n;
			int[] remainderResult=howSum(remainder, numbers);
			
			if(remainderResult!=null)
			{
				List<Integer> list=Arrays.stream(remainderResult).boxed().collect(Collectors.toList());
				list.add(n);
				int[] array = list.stream().mapToInt(i->i).toArray();
				return array;
			}
		}
		return null;
	}

}
