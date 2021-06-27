
public class gridTravellerArray {

	public static void main(String[] args) {
		System.out.println("No of ways = "+travel(3,3));
	}
	
	public static int travel(int a, int b)
	{
		if(a==1 && b==1)
			return 1;
		else if(a==0 || b==0)
			return 0;
		else
			return travel(a-1,b)+travel(a,b-1);		
	}

}
