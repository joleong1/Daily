package Daily;

import java.util.Arrays;

public class MultiplyArray {
	public static void main(String[] args) {
		int[] arr = {2,2,3,4};
		
		System.out.println(Arrays.toString(multiplyOthers(arr)));
	}
	
	public static int[] multiplyOthers(int[] arr) {
		int[] newArr = new int[arr.length];
		
//		for(int i = 0;i<arr.length;i++) {
//			newArr[i] = 1;
//			for(int j = 0;j<arr.length;j++) {
//				if(j == i)
//					continue;
//				else {
//					newArr[i] = newArr[i]*arr[j];
//				}
//			}
//		}
		
		newArr[arr.length-1]=1;

	    for(int i=arr.length-2; i>=0; i--){
	    	newArr[i]=newArr[i+1]*arr[i+1];
	    }
	    
	    int left=1;
	    for(int i=0; i<arr.length; i++){
	    	newArr[i]=newArr[i]*left;
	        left = left*arr[i];
	    }
		return newArr;
	}
}
