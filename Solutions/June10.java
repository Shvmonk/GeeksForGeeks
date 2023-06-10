//ARRAYING THE ARRAY - 10 JUNE 
class Solution {
    public void Rearrange(int a[], int n)
    {
        RearrangePosNeg(a, 0, n - 1); 
    }
    public void RearrangePosNeg(int arr[], int l, int r)
    { 
        if (l < r) { 
            int m = l + (r - l) / 2; 
            RearrangePosNeg(arr, l, m); 
            RearrangePosNeg(arr, m + 1, r); 
            merge(arr, l, m, r); 
        } 
    }
    public void merge(int arr[], int l, int m, int r) 
    { 
        int i = l;
        int j = m + 1; 
        while (i <= m && arr[i] < 0) 
            i++; 
        while (j <= r && arr[j] < 0) 
            j++; 
        reverse(arr, i, m); 
        reverse(arr, m + 1, j - 1); 
        reverse(arr, i, j - 1); 
    }
    public void reverse(int arr[], int l, int r) 
    { 
        if (l < r) { 
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            reverse(arr, ++l, --r); 
        } 
    }
}
