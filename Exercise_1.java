// Time Complexity: O(logn)
// Space Complexity: O(log n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :  no

public class BinarySearch { 
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
    	if (r>=l) {
    		//Write your code here
        	int mid = l+(r-l)/2;
        	if (arr[mid]==x) {
    			return mid;
    		}
        	if (arr[mid]>x) {
    			return binarySearch(arr, l, mid-1, x);
    		}
        	//else element can be present in the right subarry
        	return binarySearch(arr, mid+1, r, x);
		}
        // if nothing is found 
    	return -1;

    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
}
