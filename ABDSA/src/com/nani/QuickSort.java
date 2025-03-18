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
	  // quickSort(arr,0,arr.length-1);
	   quickmawa(arr,0,arr.length);
	  System.out.println(Arrays.toString(arr));
	  
	   
}
 
 
 public static void quickmawa(int []arr,int low ,int high) {
	
	 if(low<high) {
		 int indexmawa=partionIndexmawa(arr,low,high);
	 quickmawa(arr,low,indexmawa-1);
	 quickmawa(arr,indexmawa+1,high);
	 }
 }
 public static int partionIndexmawa(int []arr,int low ,int high) {
	 
	 int i=low;
	 int j=high;
	 int pivot=arr[low];
	 while(i<j) {
		 while(i<=high-1 && arr[i]<=pivot) {
			 i++;
		 }
		 while(j>=low+1 && arr[j]>pivot) {
			 j--;
		 }
		 if(i<j) {
			 int temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
		 }
	 }
	 
	int temp=arr[low];
	 arr[low]=arr[j];
	 arr[j]=arr[low];
	 return j;
	 
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
