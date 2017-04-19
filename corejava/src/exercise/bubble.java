package exercise;

import java.util.Arrays;

/*
 * BubbleSort exercise
 * 2017.3.28
 * Ye
 * */


public class bubble {
	
	public static void main(String args[]){
		
		int [] bubble = {31,22,5,68,18,34,78,200,24};

		Arrays.sort(bubble);

		for (int i =0; i<bubble.length;i++){
			
		System.out.println("bubble+ " + bubble[i]);	
			
		}
		for (int i =0; i<bubble.length;i++){
			
			for(int j =0; j < bubble.length-1; j++){ 
				
				if(bubble[j+1]<bubble[j]){
					int tmp=bubble[j];
					bubble[j]=bubble[j+1];
					bubble[j+1]=tmp;

				}
//				System.out.println("bubble- " +j +"---"+ bubble[j]+","+bubble[j+1]);	

			}
									
		}
				
		
		for (int i =0; i<bubble.length;i++){
	
		System.out.println("bubble+1 " + bubble[i]);	
			
		}
		
	}

}
