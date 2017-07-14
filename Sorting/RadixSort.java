import java.util.Scanner;

public class RadixSort{

	public static void main(String[] args){
		int arr[]={329,457,657,839,436,720,355};

		for(int i=1;findmax(arr)/i>0;i*=10){
			 arr= countingSort(i,arr);
		}

		for(int x:arr){
			System.out.println(x);
		}
      
       

	}


	public static int[] countingSort(int exp,int[] arr){
         int brr[]=new int[arr.length];

         int count[]=new int[10];


         for(int i=0;i<arr.length;i++){
         	count[(arr[i]/exp)%10]++;
         }

         for(int i=1;i<count.length;i++){
         	count[i]+=count[i-1];
         }

         for(int i=arr.length-1;i>=0;i--){

         	brr[count[(arr[i]/exp)%10]-1]=arr[i];
         	count[(arr[i]/exp)%10]--;

         }

         return brr;

       


	}

	public static int findmax(int[] arr){

		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
            	max=arr[i];
            }
		}

		return max;
	}
} 