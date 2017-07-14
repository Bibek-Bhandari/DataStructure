
import java.util.Scanner;

public class Test{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int[] arr={1,2,4,5,3,9,6,8,7};
		QuickSort(0,arr.length-1,arr);
		for(int x:arr){
			System.out.print(x);
		}


	}

	public static void QuickSort(int p,int r,int[] arr){
	
		if(p<r){
			int q=partion(p,r,arr);
			QuickSort(p,q-1,arr);
			QuickSort(q+1,r,arr);
		}

	}

	public static int partion(int p,int r,int[] arr){

		int x=arr[r];
		int i=p-1;

		for(int j=p;j<=r-1;j++){
             
             if(arr[j]<=x){
             	i=i+1;
                swap(i,j,arr);
             }
	    }
	   swap(i+1,r,arr);
	    return i+1;
    }

    public static void swap(int i,int j,int[] arr){
    	int temp=arr[j];
    	arr[j]=arr[i];
    	arr[i]=temp;
    }
}