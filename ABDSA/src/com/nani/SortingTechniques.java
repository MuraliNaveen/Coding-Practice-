package com.nani;
import java.util.*;
public class SortingTechniques {
   public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in );
	   int n=scan.nextInt();
	   int[]arr=new int[n];
	   for(int i=0;i<n;i++) {
		   arr[i]=scan.nextInt();	
				   
	   }
	   
	// int [] res= merger(arr);
	// System.out.println(Arrays.toString(res));
	 mergeInPlace(arr,0,arr.length);
	 System.out.print(Arrays.toString(arr));
}
   
   public static void mergeInPlace(int[]arr,int s,int e) {
	   
	   if(e-s==1) {
		   return;
	   }
	  int  mid=(s+e)/2;
	   mergeInPlace(arr,s,mid);
	   mergeInPlace(arr,mid,e);
	   
	   mergingwitindex(arr,s,mid,e);
	   
	   
   }
    public static void   mergingwitindex(int []arr,int s,int mid,int e) {
    	int[]m=new int[e-s];
    	int i=s;
    	int j=mid;
    	int k=0;
    	while(i<mid && j<e) {
    		if(arr[i]<arr[j]) {
    			m[k++]=arr[i++];
    		}
    		else {
    			m[k++]=arr[j++];
    		}
    	}
    	while(i<mid) {
    		m[k++]=arr[i++];
    	}
    	while(j<e) {
    		
    			m[k++]=arr[j++];
    		
    	}
    	for(int is=0;is<m.length;is++) {
    		arr[s+is]=m[is];
    	}
    }
   
   public static int[] merger(int []arr){
	   
	   if(arr.length==1) {
		   return arr;
	   }
	   int mid=arr.length/2;
	   int[]left=merger(Arrays.copyOfRange(arr, 0, mid));
	   int[]right=merger(Arrays.copyOfRange(arr, mid, arr.length));
	   
	   return merge(left,right);
   }
   public static int [] merge(int []left ,int[]right) {
	 int []arr=new int[left.length+right.length];
	 int i = 0, k = 0, j = 0;

	 while(i<left.length && j<right.length) {
		 if(left[i]<right[j]) {
			 arr[k++]=left[i++];
		 }
		 else {
			 arr[k++]=right[j++];
		 }
	 }
	 while(i<left.length) {
		 arr[k++]=left[i++];
	 }
	 while(j<right.length) {
		 arr[k++]=right[j++];
	 }
	 return arr;
   }
}
