package exercise;

import java.util.Arrays;

/*
 * Binary Search
 * 2017.3.28
 * Ye
 * */

public class BinarySearch {
	
	public static void main(String args[]){
		
		int [] array = {5,6,32,678,33,1,57,9,0,11};
		
		int value= 57;
		
		search(value,array);
		
	}
	
	
	public static int search(int value, int arr[]){
		int result=-1;
		Arrays.sort(arr);//must sort
		
		for(int i=0;i<arr.length;i++){
			
			System.out.println("arr"+i+"---"+arr[i]);
			
		}
		
		int loop=0;
		
		loop=arr.length/2;
		
		for(int i=0;i<loop;i++){
			
			if(value>arr[arr.length/2]){
				
				
			}
		}
		
		
		return result;
	}

}
