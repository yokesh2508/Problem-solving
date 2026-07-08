//Leetcode problem no-268
class Solution {
    public int missingNumber(int[] arr) {
        int n=arr.length;
        int expectedSum=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return expectedSum-sum ;
    }
}
