package com.nani;

import java.util.*;

public class QuickSort {
 private void mian() {
	 Scanner scan=new Scanner(System.in );
	   int n=scan.nextInt();
	   int[]arr=new int[n];
	   for(int i=0;i<n;i++) {
		   arr[i]=scan.nextInt();	
				   
	   }
	   quickSort(arr,0,arr.length-1);
	   System.out.println(Arrays.toString(arr));
	   
}
 public static void quickSort(int []arr,int low ,int high) {
	 
	 if(low>=high) {
		 return;
	 }
	 int s=low;
	 int e=high;
	 int mid=e/2;
	 
	 int pivot=arr[mid]; //{8 4 1 6 3 7 5 2 } LENGTH=8  length-1=7 7/2 =3 mid=3 pivot =6 
	 while(s<=e) {
		 while(arr[s]<pivot) {
			 s++;
			 
		 }
		 while(arr[e]>pivot) {
			 e--;
		 }
		 if(s<=e) {
			 int temp=arr[s];
			 arr[s]=arr[e];
			 arr[e]=temp;
			 s++;
			 e--;
			 
		 }
		 quickSort(arr,low,e);
		 quickSort(arr,s,high);
	 }
	 
 }
}
