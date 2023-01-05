package com.lavakumar.practice;

import java.util.*;

public class EvenDigits {
    public static void main(String[] args) {
//        new Solution().getEvenDigitNumbers(new int[]{2,
//                11, 42, 564, 5775, 34, 123, 454 ,1, 5 ,45, 3556 ,23442,
//                3 ,11, 4 ,200});
//      int largest =  new Solution2().largestContiguousSum(new int[]{-1,-2,-3});
//        System.out.println(largest);

//        int waterTrap = new waterTrap().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
//        System.out.println(waterTrap);

//        new KSubArray().kSubarraySum(new int[]{3, 5, 6, 2, 4, 7, 8},3);
//        new triplets().threeSum(new int[]{1 ,-1, 9 ,-8, 0});

//      int kdif=  new Kdif().kDiffPairs(new int[]{1 ,3 ,5, 7, 10},2);
//        System.out.println(kdif);

//        new kSubstringVowel().kSubstringVowels("workattech",3);
//        System.out.println( new nextGreatestElement().getNextGreaterElement(new int[]{4,4,4,5,7,7,7},4));
        System.out.println(new PerfectSquare().isPerfectSquare(100));
    }
}
class Solution {
    List<Integer> getEvenDigitNumbers (int[] arr) {
        // add your logic here
        List<Integer>  finalArray = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int count=0;
            while(num!=0){
                num=num/10;
                count++;
            }
            if(count%2==0){
                finalArray.add(arr[i]);
            }
        }
        System.out.println(finalArray);
        return finalArray;
    }
}

class Solution2 {
    int largestContiguousSum(int[] arr) {
        int maximumSum = 0, currentSum = 0;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxValue = Math.max(maxValue, arr[i]);
            minValue = Math.min(minValue, arr[i]);
        }
        if (maxValue < 0) {
            return minValue;
        }
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            maximumSum = Math.max(maximumSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maximumSum;
    }
}

class waterTrap {
    public int trap(int[] height) {
        if(height.length==0){
            return 0;
        }
        int max=height[0],pos=0;
        for(int i=1;i<height.length;i++){
            if(height[i]>max){
                max=height[i];
                pos=i;
            }
        }
        int maxLeater =0;
        int maxHightLeft=height[0];
        for(int i=0;i<pos;i++){
            if(maxHightLeft>height[i]){
                maxLeater=maxLeater + maxHightLeft-height[i];
            }else{
                maxHightLeft=height[i];
            }
        }
        int maxHightRight=height[height.length-1];
        for(int i=height.length-1;i>pos;i--){
            if(maxHightRight>height[i]){
                maxLeater=maxLeater + maxHightRight-height[i];
            }else{
                maxHightRight=height[i];
            }
        }
        return maxLeater;
    }
}

class KSubArray {
    int[] kSubarraySum (int[] A, int k) {
        // add your logic here
//        int[] result = new int[A.length-k+1];
//        for(int i=0;i<=(A.length-k);i++){
//            for(int j=0;j<k;j++){
//                result[i]=result[i]+A[i+j];
//            }
//
//        }
//        System.out.println(Arrays.toString(result));
//        return result;
        int[] result = new int[A.length-k+1];
        int sum=0,iterator=0;
        for(int i=0;i<k;i++){
            sum += A[i];
        }
        result[iterator++]=sum;
        for(int i=k;i<A.length;i++){
            sum -= A[i-k];
            sum += A[i];
            result[iterator++]=sum;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}


class triplets {
    List<List<Integer>> threeSum(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        ArrayList<List<Integer>> answer = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            // if(i > 0 && A[i] == A[i - 1]) {
            //     continue;
            // }
            while (j < k) {
                // if(k < (n - 1) && A[k] == A[k + 1]) {
                //     k--;
                //     continue;
                // }
                if(A[i] + A[j] + A[k] > 0) {
                    k--;
                } else if(A[i] + A[j] + A[k] < 0) {
                    j++;
                } else {
                    ArrayList<Integer> triples = new ArrayList<Integer>();
                    triples.add(A[i]);
                    triples.add(A[j]);
                    triples.add(A[k]);
                    Collections.sort(triples);
                    j++;
                    k--;
                    answer.add(triples);
                }
            }
        }
        return answer;
    }

    class Solution {
        int kDiffPairs (int[] A, int k) {
            // add your logic here
            int count=0;
            // for(int i=0;i<A.length-1;i++){
            // 	for(int j=i+1;j<A.length;j++){
            // 		if((A[j]-A[i])==k){
            // 			count++;
            // 		}
            // 	}
            // }
            // return count;
            int j=1,i=0;
            while(j<A.length){
                if(A[j]-A[i]==k){
                    count++;
                    i++;j++;
                }else if(A[j]-A[i]<k){
                    j++;
                }else{
                    i++;
                }
            }
            return count;
        }
    }
}

class Kdif {
    int kDiffPairs (int[] A, int k) {
        // add your logic here
        int count=0;
        // for(int i=0;i<A.length-1;i++){
        // 	for(int j=i+1;j<A.length;j++){
        // 		if((A[j]-A[i])==k){
        // 			count++;
        // 		}
        // 	}
        // }
        // return count;
        int j=1,i=0;
        while(j<A.length){
            if(A[j]-A[i]==k){
                count++;
                i++;j++;
            }else if(A[j]-A[i]<k){
                j++;
            }else{
                i++;
            }
        }
        return count;
    }
}

class kSubstringVowel {
    int[] kSubstringVowels (String s, int k) {
        // add your logic here
        char[] charArray =s.toCharArray();
        Queue<Boolean> que= new LinkedList<>();
        int[] vowelsCount = new int[s.length()-2];
        int count=0,j=0;
        for(int i=0;i<k;i++){
            if(charArray[i]=='a' || charArray[i]=='e'
                    || charArray[i]=='i' || charArray[i]=='o' || charArray[i]=='u'){
                que.add(true);
                count ++;
            }else{
                que.add(false);
            }
        }
        vowelsCount[j++]=count;
        for(int i=k;i<s.length();i++){
            if(charArray[i]=='a' || charArray[i]=='e'
                    || charArray[i]=='i' || charArray[i]=='o' || charArray[i]=='u'){
               if(que.remove()){
                   count--;
               }
                que.add(true);
               count++;
            }else{
                que.remove();
                que.add(false);
            }
            vowelsCount[j++]=count;
        }
        System.out.println(Arrays.toString(vowelsCount));
        return  vowelsCount;
    }
}

class nextGreatestElement {
    int binarySearch (int[] arr, int low, int high, int key) {
        if(low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] <= key) {
                return binarySearch (arr, mid + 1, high, key);
            } else {
                return binarySearch (arr, low, mid-1, key);
            }
        }
        else {
            return arr[low];
        }
    }
    int getNextGreaterElement (int[] arr, int key) {
        int n = arr.length;
        if (arr[n - 1] <= key) {
            return key;
        }
        return binarySearch (arr, 0, n - 1, key);
    }
}

class PerfectSquare {
    boolean isPerfectSquare (int num) {
        // add your logic here

//        int i = (num/2)/2;
//        for(;i>0;i--){
//            if((i*i)==num){
//                return true;
//            }else if((i*i)<num){
//                return false;
//            }
//        }
//        return false;
        return searchRoot(1, num/2,num);
    }

    boolean searchRoot(int low, int high, int num) {
        if (high >= low) {
            int mid = (high + low) / 2;
            int square = mid * mid;
            if (square == num) {
                return true;
            } else if (square > num) {
                return searchRoot(low, mid - 1, num);
            } else {
                return searchRoot(mid + 1, high, num);
            }
        }
        return false;
    }
}