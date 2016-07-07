import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
	
	static int num = 0;
	
	public static String getPermutation(int n, int k) {
		num = 0;
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++)
		{
			list.add(i, i+1);
		}
        return permutate(list, 0, k);
    }
	
    
    public static String permutate(List<Integer> list, int scaler, int order)
    {
    	String str = "";
        if(scaler >= (list.size() - 1))
        {
        	++num;
        	if(num == order)
        	{
        		StringBuffer buf = new StringBuffer();
        		for(int i = 0; i < list.size(); i++)
        		{
        			buf.append(list.get(i));
        		}
        		return buf.toString();
        	}
        }else{
        	for(int i = scaler; i < list.size(); i++)
        	{
        		list.add(scaler, list.remove(i));
        		String tstr = permutate(list, scaler + 1, order);
        		if(!tstr.equals(""))
        			str = tstr;
        		list.add(i, list.remove(scaler));
        	}
        }
		return str;
        
    }
    
//	public static void main(String[] args)
//	{
//		System.out.println(getPermutation(3, 6));
//		
//	}
}
