import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class SubmissionDetails {

	public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++){
            if(Arrays.binarySearch(nums2, nums1[i]) >= 0)
                set.add(nums1[i]);
        }
        int[] result = new int[set.size()];
        int i = 0;
        Iterator<Integer> it = set.iterator();  
        while (it.hasNext()) {
            result[i] = it.next();
            i++;
        }  
        return result;
    }
	
	public static void main(String[] args)
	{
		int[] num1 = new int[]{1, 2};
//		System.out.println(Arrays.binarySearch(num1, 0));
		System.out.println(Arrays.asList(intersection(new int[]{1, 2},new int[]{1, 1})).toString());
	}
}
