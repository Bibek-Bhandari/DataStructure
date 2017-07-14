
import java.util.*;

public class Test{
   
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		
		int[] arr={1,5,4,2,7,3,6,9,8,2};
		CountingSort(arr);
	}

	public static void CountingSort(int[] arr){
		int[] brr=new int[arr.length];
		
		int[] c=new int[findMax(arr)+1];

		for(int i=0;i<arr.length;i++){
			c[arr[i]]++;
		}

		for(int i=1;i<c.length;i++){
			c[i]=c[i]+c[i-1];
		}
		
		
        for(int j=arr.length-1;j>=0;j--){
        	
            brr[c[arr[j]]-1]=arr[j];
            c[arr[j]]--;
        }
        for(int x:brr){
        	System.out.print(x);
        }
	}

	public static int findMax(int[] arr){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}

		return  max;

	}
}