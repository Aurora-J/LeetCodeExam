import java.util.HashMap;
import java.util.Map;

public class SingleNum2 {
	public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
        	Integer temp = nums[i];
            if(map.get(temp) == null)
            {
            	map.put(temp, 1);
            }else{
            	map.put(temp, map.get(temp) + 1);
            }
            
            if(map.get(temp) == 3)
            	map.remove(temp);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  
        	return entry.getKey();
        } 
        return 0;
    }
	
//	public static void main(String[] args)
//	{
//		int[] nums = {1, 1, 1, 2, 3, 3, 3, 4, 4, 5, 4, 5, 5};
//		System.out.println(SingleNum2.singleNumber(nums));
//	}
	
}
