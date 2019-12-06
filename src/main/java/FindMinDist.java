public class FindMinDist {
    /*
    Find the minimum distance between two numbers
Given an unsorted array arr[] and two numbers x and y, find the minimum distance between x and y in arr[]. The array might also contain duplicates. You may assume that both x and y are different and present in arr[].

Examples:
Input: arr[] = {1, 2}, x = 1, y = 2
Output: Minimum distance between 1 and 2 is 1.

Input: arr[] = {3, 4, 5}, x = 3, y = 5
Output: Minimum distance between 3 and 5 is 2.

Input: arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3}, x = 3, y = 6
Output: Minimum distance between 3 and 6 is 4.

Input: arr[] = {2, 5, 3, 5, 4, 4, 2, 3}, x = 3, y = 2
Output: Minimum distance between 3 and 2 is 1.
     */

    private static int findMinimumDistance(int x,int y,int[] arr){
        int i;
        int prev = 0;
        int min = Integer.MAX_VALUE;
        for(i=0;i<arr.length;i++){
            if(arr[i]==x||arr[i]==y){
               prev=i;
               break;
            }
        }

        for(;i<arr.length;i++){
            if(arr[i]==x||arr[i]==y){
                if(arr[i] != arr[prev] && Math.abs(i-prev)<min){
                    min = Math.abs(i-prev);
                }

                prev = i;
            }
        }

        return min;
    }

    public static void main(String[] args){
        int arr[] = {2, 5, 3, 5, 4, 4, 2, 5,6,5,6,7,3}, x = 3, y = 2;
        System.out.println(findMinimumDistance(x,y,arr));
    }
}
