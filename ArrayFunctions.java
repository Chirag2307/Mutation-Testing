package com.softwareTesting.ArrayFunctions;
import java.util.*;


import java.util.*;


public class ArrayFunctions { 

    // BUBBLE SORTING OF ARRAY
    int[] bubbleSort(int myarr[]) 
    {
        int len = myarr.length, tmp;
        boolean flag;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }
        for (int i = 0; i < len; i++) 
        {
            flag = false;
            for (int j = 0; j < len - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
        return arr;
    }
    // BUBBLE SORTING OF ARRAY


    // INSERTION SORTING OF ARRAY
    int[] insertionSort(int myarr[]) 
    {
        int len = myarr.length, tmp, j;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }
        for (int i = 1; i < len; i++) 
        {
            tmp = arr[i];
            for (j = i; j > 0; j--) 
            {
                if (arr[j - 1] > tmp)
                {
                    arr[j] = arr[j - 1];
                }   
                else
                    break;
            }
            arr[j] = tmp;
        }
        return arr;
    }
    // INSERTION SORTING OF ARRAY


    //Heap  Sort
    int[] heapSort(int myarr[]) 
    {
        int len = myarr.length;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }
        makeMaxHeap(arr);
        int tmp;
        for (int i = arr.length - 1; i > 0; i--) 
        {
            tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            heapAdjust(arr, 0, i);
        }
        return arr;
    }

    private static void makeMaxHeap(int arr[]) 
    {
        int len = arr.length;
        for (int i = len / 2 - 1; i >= 0; --i) 
        {
            heapAdjust(arr, i, len);
        }
    }

    private static void heapAdjust(int arr[], int i, int n) 
    {
        int j = 2 * i + 1;
        int tmp = arr[i];
        while (j < n) 
        {
            if (j < n - 1 && arr[j] < arr[j + 1])
            {
                j++;
            }
            if (tmp > arr[j])
            {
                break;
            } 
            arr[(j - 1) / 2] = arr[j];
            j = 2 * j + 1;
        }
        arr[(j - 1) / 2] = tmp;
    }
    //HEAP SORT


    // Merge Sort
    int[] mergeSort(int myarr[])
    {
        int len = myarr.length;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }
        __mergeSort(arr,0,len-1);
        return arr;
    }

    private static void __mergeSort(int arr[], int lower, int upper) 
    {
        if (lower >= upper)
        {
            return;
        }
        int m = (lower + upper) / 2;
        __mergeSort(arr, lower, m);
        __mergeSort(arr, m + 1, upper);
        merge(arr, lower, upper);
    }

    private static void merge(int arr[], int lower, int upper) 
    {
        int m = (lower + upper) / 2;
        int a[] = new int[m - lower + 1];
        int b[] = new int[upper - m];
        int i, k = 0, k1 = 0, k2 = 0;
        for (i = lower; i <= m; i++, k++)
        {
            a[k] = arr[i];
        }
        k = 0;
        for (; i <= upper; i++, k++)
        {
            b[k] = arr[i];
        }
        for (i = lower; i <= upper && k1 < m - lower + 1 && k2 < upper - m; i++) 
        {
            if (a[k1] < b[k2]) 
            {
                arr[i] = a[k1];
                k1++;
            } 
            else 
            {
                arr[i] = b[k2];
                k2++;
            }
        }
        for (; k1 < m - lower + 1; k1++)
        {
            arr[i++] = a[k1];
        }
        for (; k2 < upper - m; k2++)
        {
            arr[i++] = b[k2];
        }       
    }
    // Merge Sort Ends


    // Selection Sort
    int[] selectionSort(int myarr[]) 
    {
        int len = myarr.length;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }
        int pos, tmp;
        for (int i = 0; i < len; i++) 
        {
            pos = i;
            for (int j = i + 1; j < len; j++) 
            {
                if (arr[j] < arr[pos])
                {
                    pos = j;
                } 
            }
            tmp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = tmp;
        }
        return arr;

    }
    // Selection Sort Ends


    // Quick Sort starts
    int[] quickSort(int myarr[])
    {
        int len = myarr.length;
        int arr[] = new int[len];

        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }
        
        __quickSort(arr,0,len-1);
        return arr;
    }

    private void __quickSort(int arr[], int lower, int upper) 
    {
        if (lower >= upper)
        {
            return;
        }
        int p = partition(arr, lower, upper);
        __quickSort(arr, lower, p - 1);
        __quickSort(arr, p + 1, upper);
    }

    private static int partition(int arr[], int lower, int upper) 
    {
        int pivot = arr[upper];
        int j = lower;
        int tmp;
        for (int i = lower; i <= upper; i++) 
        {
            if (arr[i] < pivot)
            {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
            }
        }
        tmp = arr[upper];
        arr[upper] = arr[j];
        arr[j] = tmp;

        return j;
    }
    //Quick Sort Ends


    //Counting Sort Starts
    int[] countSort(int[] myarr)
    {   
        int len = myarr.length;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[len];
        for (int i = 0; i < arr.length; i++)
        {
            count[arr[i] - min]++;
        }
 
        for (int i = 1; i < count.length; i++)
        {
            count[i] += count[i - 1];
        }
 
        for (int i = arr.length - 1; i >= 0; i--) 
        {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
 
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = output[i];
        }

        return arr;
    }
    //Counting Sort Ends


    //Odd-Even Sort Starts
    int[] oddEvenSort(int myarr[])
    {
        int len = myarr.length;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }
        boolean sorted = false;
        while (!sorted) 
        {
            sorted = true;
            for (int i = 1; i < arr.length - 1; i += 2) 
            {
                if (arr[ i ] > arr[ i + 1 ]) 
                {
                    swap( arr , i , i + 1 );
                    sorted = false;
                }
            }
  
            for (int i = 0; i < arr.length - 1; i += 2) 
            {
                if (arr[ i ] > arr[ i + 1 ]) 
                {
                    swap( arr , i , i + 1 );
                    sorted = false;
                }
            }
       }
       return arr;
    }

    private static void swap(int[] array, int i, int j) 
    {
        int temp;
        temp = array[ i ];
        array[ i ] = array[ j ];
        array[ j ] = temp;
    }
    //Odd Even Sort Ends


    //Bucket Sort Starts
    int[] bucketSort(int[] sequence) 
    {
        int maxValue = getMax(sequence);
        // Bucket Sort
        int[] Bucket = new int[maxValue + 1];
        int[] sortedSequence = new int[sequence.length];
 
        for (int i = 0; i < sequence.length; i++)
            Bucket[sequence[i]]++;
 
        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++)
            for (int j = 0; j < Bucket[i]; j++)
                sortedSequence[outPos++] = i;
 
        return sortedSequence;
    }
    //Bucket Sort ends


    //Comb Sort Starts
    int[] combSort(int[] myarr) {
        int n = myarr.length;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = myarr[i];
        }
        // initialize gap
        int gap = n;

        // Initialize swapped as true to make sure that
        // loop runs
        boolean swapped = true;

        // Keep running while gap is more than 1 and last
        // iteration caused a swap
        while (gap != 1 || swapped == true)
        {
            // Find next gap
            gap = getNextGap(gap);

            // Initialize swapped as false so that we can
            // check if swap happened or not
            swapped = false;

            // Compare all elements with current gap
            for (int i=0; i<n-gap; i++)
            {
                if (arr[i] > arr[i+gap])
                {
                    // Swap arr[i] and arr[i+gap]
                    int temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = temp;

                    // Set swapped
                    swapped = true;
                }
            }
        }
        return arr;
    }

    // To find gap between elements
    static int getNextGap(int gap)
    {
        // Shrink gap by Shrink factor
        gap = (gap*10)/13;
        if (gap < 1)
            return 1;
        return gap;
    }
    //Comb Sort Ends

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    //Koustubh starts
    //get Minimum of Elements of an Array
    int getMin(int arr[])
    {   
        int n = arr.length;
        int res = arr[0];
        for (int i = 1; i < n; i++)
        {
            if(res>arr[i])
            {
                res=arr[i];
            }
        }  
        return res;
    }


    //get Maximum of Elements of an Array
    static int getMax(int arr[])
    {   
        int n = arr.length;
        int res = arr[0];
        for (int i = 1; i < n; i++)
        {
            if(res<arr[i])
            {
                res=arr[i];
            }
        }
        return res;
    }


    //Search for given element x in given array
    int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
            {
                return i;
            }
        }
        return -1;
    }


    //Sum of Elements of array
    int sum(int arr[])
    {
        int n = arr.length;
        int ans=0;
        for (int i = 0; i < n; i++)
        {
            ans+=arr[i];
        }
        return ans;
    }


    //Searching for element x in given array in O(logN)
    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) 
        {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
            {
                return m;
            }
            // If x greater, ignore left half
            else if (arr[m] < x)
            {
                l = m + 1;
            }
            // If x is smaller, ignore right half
            else
            {
                r = m - 1;
            }    
        }
        // if we reach here, then element was not present
        return -1;
    }


    //Left rotate the Array by 1  
    int[] leftRotatebyOne(int myarr[])
    {   
        int len = myarr.length;
        int arr[] = new int[len];

        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }

        int temp = arr[0], i;
        for (i = 0; i < len - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
        arr[len-1] = temp;
        return arr;
    }


    //helper function reverse a sub array of the subarray
    private int [] reverseSubArray(int myarr[], int start, int end)
    {   
        int len = myarr.length;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }
        
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    
    //reverse the array
    int [] reverseArray(int myarr[])
    {
        int len = myarr.length;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }
        arr = reverseSubArray(arr,0,len-1);
        return arr;
    }

    int gcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        else
        {
            return gcd(b, a % b);
        }
    }


    //Left rotate a array by k units
    int[] leftRotatebyK(int myarr[], int d)
    {   
        int n = myarr.length;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = myarr[i];
        }
        
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) 
        {
            temp = arr[i];
            j = i;
            while (true) 
            {
                k = j + d;
                if (k >= n)
                {
                    k = k - n;
                } 
                if (k == i)
                {
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        return arr;
    }


    //Count the occurences of x in arr[]
    int countOccurrences(int arr[], int x)
    {
        int n = arr.length;
        int res = 0;
        for (int i=0; i<n; i++)
        {
            if (x == arr[i])
            {
                res++;
            }
        } 
        return res;
    }


    //check if there exists a pair of elements in A[] such that its sum is x.
    boolean chkPair(int A[], int x) 
    {   
        int size = A.length;
        for (int i = 0; i < (size - 1); i++) 
        {
            for (int j = (i + 1); j < size; j++) 
            {
                if (A[i] + A[j] == x) 
                {
                    return true;
                }
            }
        }
        return false;
    }


    // Returns median of a[]
    public double findMean(int a[])
    {
        int sum = 0;
        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            sum += a[i];
        }
        double mean = (double)sum / (double)n;
        return mean;
    }


    // Function for calculating median
    public double findMedian(int a[])
    {
        double median;
        int n = a.length;
        // First we sort the array
        Arrays.sort(a);
        // check for even case
        if (n % 2 != 0)
        {
            median = (double)a[n / 2];
            return median;
        }
 
        median = (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
        return median;
    }


    //Returns element wise sum of a[] and b[]
    // If input is invalid then [-1] is returned
    int [] sumArrays(int a[],int b[])
    {
        int n = a.length;
        int m = b.length;
        
        if(m==n)
        {   
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = a[i] + b[i];
            }
            return arr;
        }
        else 
        {
            int arr[] = { -1 };
            return arr;
        }
    }


    //Returns element wise difference of a[] and b[]
    // If input is invalid then [-1] is returned
    int [] diffArrays(int a[],int b[])
    {
        int n = a.length;
        int m = b.length;
        
        if(m==n)
        {   
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = a[i] - b[i];
            }
            return arr;
        }
        else 
        {
            int arr[] = { -1 };
            return arr;
        }
    }


    //Returns element wise product of a[] and b[]
    // If input is invalid then [-1] is returned
    int [] mulArrays(int a[],int b[])
    {
        int n = a.length;
        int m = b.length;
        
        if(m==n)
        {   
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = a[i]*b[i];
            }
            return arr;
        }
        else 
        {
            int arr[] = { -1 };
            return arr;
        }
    }
    

    //Append 2 arrays to get a new array
    int[] concatArrays(int a[],int b[])
    {
        int len = a.length + b.length;
        int[] result = new int[len];
        int pos = 0;
        for (int element : a) 
        {
            result[pos] = element;
            pos++;
        }
        for (int element : b) 
        {
            result[pos] = element;
            pos++;
        }
        return result;
    }

 // Find the element with max occurences in the array. In case of multiple such elements return the largest element
    int findMaxCount(int myarr[])
    {   
        int len = myarr.length;
        int[] arr = new int[len];
        arr = mergeSort(myarr);
        if(len == 0)
            return -1;
        
        int maxcount = 1, element = arr[0];
        int curcnt = 1, curelement = arr[0];
        for(int i = 1; i < len; i++)
        {
            if(arr[i] == arr[i-1])
            {
                curcnt++;
            }
            else
            {   
                if(maxcount<=curcnt)
                {
                    maxcount = curcnt;
                    element = curelement;
                }
                curcnt = 1;
                curelement = arr[i];
            }
        }
        if(maxcount<=curcnt)
        {
            maxcount = curcnt;
            element = curelement;
        }
        return element;
    }

    // Find the element with min occurences in the array. In case of multiple such elements return the largest element.
    int findMinCount(int myarr[])
    {   
        int len = myarr.length;
        int[] arr = new int[len];
        arr = mergeSort(myarr);
        if(len == 0)
            return -1;
        
        int mincount = len, element = arr[0];
        int curcnt = 1, curelement = arr[0];
        for(int i = 1; i < len; i++)
        {
            if(arr[i] == arr[i-1])
            {
                curcnt++;
            }
            else
            {   
                if(mincount>=curcnt)
                {
                    mincount = curcnt;
                    element = curelement;
                }
                curcnt = 1;
                curelement = arr[i];
            }
        }
        if(mincount>=curcnt)
        {
            mincount = curcnt;
            element = curelement;
        }
        return element;
    }

    int findKthlargest(int arr[], int k)
    {
        int len = arr.length;
        int[] myarr = new int[len];
        myarr = mergeSort(arr);
        int res = myarr[len - k];
        return res;
    }

    int findKthsmallest(int arr[], int k)
    {
        int len = arr.length;
        int[] myarr = new int[len];
        myarr = mergeSort(arr);
        int res = myarr[k-1];
        return res;
    }

   //Elements of a[] and b[] should be distinct and then union of a[] and b[] is returned.
    int[] getUnion(int a[], int b[])
    {
        int n = a.length;
        int m = b.length;
        HashSet<Integer> s = new HashSet<>();

        for(int i = 0;i<n;i++)
        {
            s.add(a[i]);
        }

        for(int i = 0; i < m; i++)
        {
            s.add(b[i]);
        }

        int sz = s.size();
        int[] arr = new int[sz];
        Iterator itr = s.iterator();
        int i = 0;
        while(itr.hasNext())
        {
            arr[i] = (Integer)itr.next();
            i++;
        }
        return arr;
    }

    //Elements of a[] and b[] should be distinct and then intersection of a[] and b[] is returned.
    int[] getIntersection(int a[],int b[])
    {
        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;
        HashSet<Integer> s = new HashSet<>();
        while(i < n && j < m && i>=0 && j>=0)
        {
            if(a[i] > b[j])
            {
                j++;
            }
            else if(b[j] > a[i])
            {
                i++;
            }
            else
            {
                s.add(a[i]);
                i++;
                j++;
            }
        }
        int sz = s.size();
        int[] arr = new int[sz];
        Iterator itr = s.iterator();
        i = 0;
        while(itr.hasNext())
        {
            arr[i] = (Integer)itr.next();
            i++;
        }
        return arr;
    }
   // Driver code to test above
   public static void main(String args[])
   {
       ArrayFunctions obj = new ArrayFunctions();
       int arr[] = { 12, 1234, 45, 67, 1 };
       System.out.println("Bubble Sorting");
       int ret1[] = obj.bubbleSort(arr);
       obj.printArray(ret1);

       System.out.println("Insertion Sorting");
       int ret2[] = obj.insertionSort(arr);
       obj.printArray(ret2);

       int ret3[] = obj.heapSort(arr);
       System.out.println("Heap Sorting");
       obj.printArray(ret3);

       int ret4[] = obj.mergeSort(arr);
       System.out.println("Merge Sorting");
       obj.printArray(ret4);

       int ret5[] = obj.selectionSort(arr);
       System.out.println("Selection Sorting");
       obj.printArray(ret5);

       int ret6[] = obj.quickSort(arr);
       System.out.println("Quick Sorting");
       obj.printArray(ret6);

       int ret7[] = obj.countSort(arr);
       System.out.println("Count Sorting");
       obj.printArray(ret7);

       int ret8[] = obj.oddEvenSort(arr);
       System.out.println("Odd Even Sorting");
       obj.printArray(ret8);

       int ret9[] = obj.bucketSort(arr);
       System.out.println("Bucket Sorting");
       obj.printArray(ret9);

       int ret10[] = obj.combSort(arr);
       System.out.println("Comb Sorting");
       obj.printArray(ret10);

       System.out.println( "Minimum element" + " of array: " + obj.getMin(arr));

       System.out.println( "Maximum element" + " of array: " + getMax(arr));

       int result1 = obj.search(arr, 12);
       System.out.println( "Search for 12: " + result1);

       int result2 = obj.sum(arr);
       System.out.println( "Sum of array: " + result2);

       int result3 = obj.binarySearch(arr, 12);
       System.out.println( "Binary Search for 12: " + result3);

       int x = 2;
       System.out.println("Count occurences:"+obj.countOccurrences(arr, x));

       System.out.println("Check pair with given sum: 2 "+obj.chkPair(arr, x));   

       int ar[] = {2, 3, 5, 4, 5, 3, 4};

       System.out.println("Mean = " + obj.findMean(arr));

       System.out.println("Median = " + obj.findMedian(arr));

       int ar1[] = {1,-10,50,200,-569};
       int ar2[] = {-12,120,89,69,-545454};
       int ar3[] = {0,0,-1,-3,7,9,4,3943084,1204,-4343,-3,9,6,-3};
       int ret11[] = obj.sumArrays(ar1,ar2);
       System.out.println("Sum of ar1 and a2 = ");
       obj.printArray(ret11);

       int ret12[] = obj.diffArrays(ar1,ar2);
       System.out.println("Difference of ar1 and a2 = ");
       obj.printArray(ret12);

       int ret13[] = obj.mulArrays(ar1,ar2);
       System.out.println("Multiplication of ar1 and a2 = ");
       obj.printArray(ret13);

       int ret14[] = obj.concatArrays(ar1,ar2);
       System.out.println("Concatenation of ar1 and a2 = ");
       obj.printArray(ret14);

       int ret15 = obj.findMaxCount(ar3);
       System.out.println("Element with max number of occurrences in ar3 is : " + ret15);

       int ret16 = obj.findMinCount(ar3);
       System.out.println("Element with min number of occurrences in ar3 is : " + ret16);

       int ar4[] = {8,88,987,1351,-45,54,-99,456};
       int ar5[] = {8,88,44,21,30,-45,789,0};
       int ret17 = obj.findKthlargest(ar4,2);
       System.out.println("kth(2nd) largest number in ar3 : " + ret17);
       
       int ret18 = obj.findKthsmallest(ar4,2);
       System.out.println("kth(2nd) largest number in ar3 : " + ret18);       

       int ret19[] = obj.getUnion(ar4,ar5);
       System.out.println("Union of ar4 and ar5 is ");
       obj.printArray(ret19);

       int ret20[] = obj.getIntersection(ar4,ar5);
       System.out.println("Intersection of ar4 and ar5 is ");
       obj.printArray(ret20);
   }
}
