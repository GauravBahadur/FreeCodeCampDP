import java.util.HashMap;
import java.util.Map;

public class gridTravellerDP {

	public static void main(String[] args) {

		Map<String, Long> map=new HashMap<String, Long>();
		System.out.println("No of ways to travel is "+traveller(18,18,map));
	}
	public static long traveller(int a, int b, Map<String, Long>  map)
	{
		if(map.containsKey(a+","+b))
		{
			return (long)map.get(a+","+b);
		}
//		else if(map.containsKey(b+","+a))
//		{
//			return (long)map.get(b+","+a);
//		}
		else if(a==0 || b==0)
			return 0;
		else if(a==1 && b==1)
			return 1;
		else 
		{
			map.put((a+","+b),(traveller(a,b-1,map)+traveller(a-1,b,map)));
			return (long)map.get(a+","+b);
		}
	}

}
