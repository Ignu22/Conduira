import java.util.*;
public class FindFirstAndLast
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[b];
		for(int i=0;i<b;i++){
		    arr[i]=sc.nextInt();
		}
	   
		int[] res = new int[2];
		res=searchRange(arr,a);
		System.out.println(Arrays.toString(res));
		
	}
	public static int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
     
        while(l<r){
            int m=l+(r-l)/2;
            if(nums[m]<target){
                l=m+1;
            }else{
                r=m;
            }
        }
     
        int first=l;
        if(l<nums.length&&nums[l]==target){
            l=0;
            r=nums.length-1;
            while(l<r){
                int m=l+(r-l+1)/2;
                if(nums[m]>target){
                    r=m-1;
                }else{
                    l=m;
                }
            }
     
            return new int[] {first,r};
        }
     
        return new int[] {-1,-1};
    }
}