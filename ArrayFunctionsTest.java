package com.softwareTesting.ArrayFunctions;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for Array Functions Library.
 */
public class ArrayFunctionsTest 
{	
	ArrayFunctions obj = new ArrayFunctions();
	
    @Test
    public void TestbubbleSort()
    {
    	int arr[] = { 12, 1234, 45, 67, 1 };
    	int arr1[] = {1, 2, 3, 4, 5};
    	int arr2[] = { 68666, 95646, 58864, 65730, 85867, 43955, 92396, 39843, 81476, 68421, 91097, 48249, 21582, 95025, 92012, 14766, 88106};
    	int sorted_arr2[] = { 14766, 21582, 39843, 43955, 48249, 58864, 65730, 68421, 68666, 81476, 85867, 88106, 91097, 92012, 92396, 95025, 95646};
    	assertArrayEquals(new int[]{1,12, 45, 67, 1234}, obj.bubbleSort(arr));
    	assertArrayEquals(new int[]{1,2, 3, 4, 5}, obj.bubbleSort(arr1));
    	assertArrayEquals(sorted_arr2, obj.bubbleSort(arr2));
    }
    
    @Test
    public void TestinsertionSort()
    {
    	int arr[] = { 40118, 31565, 43400, 23099, 38574, 53284, 15472, 55539, 1457, 38021};
    	int arr1[] = { 1457, 15472, 23099, 31565, 38021, 38574, 40118, 43400, 53284, 55539};
    	int arr2[] = { 70529, 23256, 59711, 788, 81910, 47304};
    	int sorted_arr2[] = { 788, 23256, 47304, 59711, 70529, 81910}; 
    	assertArrayEquals(arr1, obj.insertionSort(arr));
    	assertArrayEquals(sorted_arr2, obj.insertionSort(arr2));
    }
    
    @Test
    public void TestheapSort()
    {
    	int arr[] = { 80189, 67781, 15287, 3289, 6356, 68572, 18761, 61895, 70030, 56783, 112, 570, 30523, 26157, 65536, 85755, 18116, 34135, 66734, 87900, 65330, 31322, 88501, 18626, 15713, 50346, 82895, 67565, 90417, 19111, 39452, 70606, 86892, 54739, 73895};
    	int sorted_arr[] = { 112, 570, 3289, 6356, 15287, 15713, 18116, 18626, 18761, 19111, 26157, 30523, 31322, 34135, 39452, 50346, 54739, 56783, 61895, 65330, 65536, 66734, 67565, 67781, 68572, 70030, 70606, 73895, 80189, 82895, 85755, 86892, 87900, 88501, 90417};
    	int arr1[] = {1, 2, 3, 4, 5};
    	assertArrayEquals(sorted_arr, obj.heapSort(arr));
    	assertArrayEquals(new int[]{1,2, 3, 4, 5}, obj.heapSort(arr1));
    }
    
    @Test
    public void TestmergeSort()
    {
    	int arr[] = { 12, 1234, 45, 67, 1 };
    	int arr1[] = {1, 2, 3, 4, 5};
    	int arr2[] = { 18769, 24716, 36016, 91739, 62787, 36711, 61549, 51739};
    	int sorted_arr2[] = { 18769, 24716, 36016, 36711, 51739, 61549, 62787, 91739};
    	assertArrayEquals(new int[]{1,12, 45, 67, 1234}, obj.mergeSort(arr));
    	assertArrayEquals(new int[]{1,2, 3, 4, 5}, obj.mergeSort(arr1));
    	assertArrayEquals(sorted_arr2, obj.mergeSort(arr2));
    }
    
    @Test
    public void TestselectionSort()
    {
    	int arr[] = { 56837, 5541, 3430, 77465, 79231, 3651, 53958, 32934, 42961, 2070, 41373, 56316, 94870, 87309, 25490, 71751, 39992, 65022, 70699};
    	int arr1[] = { 2070, 3430, 3651, 5541, 25490, 32934, 39992, 41373, 42961, 53958, 56316, 56837, 65022, 70699, 71751, 77465, 79231, 87309, 94870};
    	assertArrayEquals(arr1, obj.selectionSort(arr));
    }
    
    @Test
    public void TestquickSort()
    {
    	int arr[] = { 2457, 13811, 41766, 21226, 38528, 77782, 12966, 1316, 14494, 74515, 53055, 52374};
    	int arr1[] = { 1316, 2457, 12966, 13811, 14494, 21226, 38528, 41766, 52374, 53055, 74515, 77782};
    	assertArrayEquals(arr1, obj.quickSort(arr));
    }
    
    @Test
    public void TestcountSort()
    {
    	int arr[] = { 91302, 81969, 35909, 55248, 57942, 45257, 68738, 9964, 53080, 75729, 30429, 99222, 57697, 87761, 74780, 62890, 3542, 74780, 83323};
    	int arr1[] = { 3542, 9964, 30429, 35909, 45257, 53080, 55248, 57697, 57942, 62890, 68738, 74780, 74780, 75729, 81969, 83323, 87761, 91302, 99222};
    	assertArrayEquals(arr1, obj.countSort(arr));
    }
    
    @Test
    public void TestoddEvenSort()
    {
    	int arr[] = { 87827, 34425, 81490, 65914, 3632, 25746, 77825, 62596, 83610, 30815, 22100, 19802, 61244, 10973, 67460, 78226, 71946};
    	int arr1[] = { 3632, 10973, 19802, 22100, 25746, 30815, 34425, 61244, 62596, 65914, 67460, 71946, 77825, 78226, 81490, 83610, 87827};
    	assertArrayEquals(arr1, obj.oddEvenSort(arr));
    }
    
    @Test
    public void TestbucketSort()
    {
    	int arr[] = { 30540, 73740, 26044, 64965, 55231, 91959, 68598, 80978, 69784, 31195, 64588, 600, 53295, 84390, 61844, 64269, 51851, 40070, 36215};
    	int arr1[] = { 600, 26044, 30540, 31195, 36215, 40070, 51851, 53295, 55231, 61844, 64269, 64588, 64965, 68598, 69784, 73740, 80978, 84390, 91959};
    	int arr2[]= { 39438, 78309, 79844, 91164, 19755, 33522, 76822, 27777, 55396, 47739, 62887, 36478, 51340, 95222, 91619, 63571, 71729, 14160, 60696, 1630, 24288, 13723, 80417, 15667, 40094, 12979, 10880, 99892, 21825, 51293, 83911, 61263, 29603, 63755, 52428, 49358, 97277, 29251, 77135, 52674, 76991, 40022};
    	int sorted_arr2[] = { 1630, 10880, 12979, 13723, 14160, 15667, 19755, 21825, 24288, 27777, 29251, 29603, 33522, 36478, 39438, 40022, 40094, 47739, 49358, 51293, 51340, 52428, 52674, 55396, 60696, 61263, 62887, 63571, 63755, 71729, 76822, 76991, 77135, 78309, 79844, 80417, 83911, 91164, 91619, 95222, 97277, 99892};
    	assertArrayEquals(arr1, obj.bucketSort(arr));
    	assertArrayEquals(sorted_arr2, obj.combSort(arr2));
    }
    
    @Test
    public void TestcombSort()
    {	
    	int arr[] = { 66179, 69978, 32761, 88934, 64671, 34148, 5016, 76670, 80333, 69871};
    	int arr1[] = { 5016, 32761, 34148, 64671, 66179, 69871, 69978, 76670, 80333, 88934};
    	int arr2[]= { 39438, 78309, 79844, 91164, 19755, 33522, 76822, 27777, 55396, 47739, 62887, 36478, 51340, 95222, 91619, 63571, 71729, 14160, 60696, 1630, 24288, 13723, 80417, 15667, 40094, 12979, 10880, 99892, 21825, 51293, 83911, 61263, 29603, 63755, 52428, 49358, 97277, 29251, 77135, 52674, 76991, 40022};
    	int sorted_arr2[] = { 1630, 10880, 12979, 13723, 14160, 15667, 19755, 21825, 24288, 27777, 29251, 29603, 33522, 36478, 39438, 40022, 40094, 47739, 49358, 51293, 51340, 52428, 52674, 55396, 60696, 61263, 62887, 63571, 63755, 71729, 76822, 76991, 77135, 78309, 79844, 80417, 83911, 91164, 91619, 95222, 97277, 99892};
    	assertArrayEquals(arr1, obj.combSort(arr));
    	assertArrayEquals(sorted_arr2, obj.combSort(arr2));
    }
    
    @Test
    public void TestgetMin()
    {
    	int arr[] = { 12, 1234, 45, 67, 1 };
    	int arr1[] = {1, 2, 3, 4, 5};
    	assertEquals(1, obj.getMin(arr));
    	assertEquals(1, obj.getMin(arr1));
    }
    
    @Test
    public void TestgetMax()
    {
    	int arr[] = { 12, 1234, 45, 67, 1, 20 };
    	int arr1[] = {1, 2, 3, 4, 5};
    	assertEquals(1234, obj.getMax(arr));
    	assertEquals(5, obj.getMax(arr1));
    }
    
    @Test
    public void Testsearch()
    {
    	int arr[] = { 12, 1234, 45, 67, 1 };
    	int arr1[] = {1, 2, 3, 4, 5};
    	assertEquals(1, obj.search(arr,1234));
    	assertEquals(-1, obj.search(arr1,1234));
    }
    
    @Test
    public void Testsum()
    {
    	int arr[] = { 12, 1234, 45, 67, 1 };
    	int arr1[] = {1, 2, 3, 4, 5};
    	assertEquals(1359, obj.sum(arr));
    	assertEquals(15, obj.sum(arr1));
    }
    
    @Test
    public void TestbinarySearch()
    {
    	int arr[] = { 12, 45, 67};
    	int arr2[] = { 14766, 21582, 39843, 43955, 48249, 58864, 65730, 68421, 68666, 81476, 85867, 88106, 91097, 92012, 92396, 95025, 95646};
    	assertEquals(0, obj.binarySearch(arr,12));
    	assertEquals(-1, obj.binarySearch(arr,42));
    	assertEquals(5, obj.binarySearch(arr2,58864));
    	assertEquals(16, obj.binarySearch(arr2,95646));
    }
    
    @Test
    public void TestleftRotatebyOne()
    {
    	int arr[] = {16,178,22, 45,4,7,80,9};
    	assertArrayEquals(new int[] {178,22, 45,4,7,80,9,16}, obj.leftRotatebyOne(arr));
    }
    
  @Test
  public void TestreverseArray()
  {
  	int arr[] = { 12, 1234, 45, 67, 1 };
  	int arr1[] = {1, 2, 3, 4, 5};
  	assertArrayEquals(new int[]{1,67, 45, 1234, 12}, obj.reverseArray(arr));
  	assertArrayEquals(new int[]{5, 4, 3, 2, 1}, obj.reverseArray(arr1));
  }
  
  @Test
  public void Testgcd()
  {
  	int n1 = 12;
  	int n2 = 8;
  	assertEquals(4, obj.gcd(n1,n2));
  }
  
	@Test
	public void TestleftRotatebyK()
	{
		int arr[] = {1,2,3,4,5,6,7};
		assertArrayEquals(new int[] {3,4,5,6,7,1,2}, obj.leftRotatebyK(arr,2));
	}
  
  @Test
  public void TestcountOccurrences()
  {
  	int arr[] = { 1, 1, 2, 3, 5, 1, 5 };
  	assertEquals(3, obj.countOccurrences(arr, 1));
  	assertEquals(2, obj.countOccurrences(arr, 5));
  }
  
  @Test
  public void TestchkPair()
  {
	  int arr[] = {0, -1, 2, -3, 1};
	  assertEquals(true, obj.chkPair(arr, -2));
	  assertEquals(false, obj.chkPair(arr, 5));
  }
  
   @Test
   public void TestfindMean()
   {
  	 int arr[] = { 1, 3, 4, 2, 7, 5, 8, 6 };
  	 assertEquals(4.5, obj.findMean(arr), 0.01);
   }
  
   @Test
   public void TestfindMedian()
   {
  	 int arr[] = { 1, 3, 4, 2, 7, 5, 8, 6 };
  	 int arr2[] = {89,12,65};
  	 assertEquals(4.5, obj.findMedian(arr), 0.01);
  	assertEquals(65.0, obj.findMedian(arr2), 0.01);
   }
  
   @Test
   public void TestsumArrays()
   {
	  int arr[] = {1, 2, 3, 4, 5};
	  int arr1[] = {5, 4, 3, 2, 1};
	  assertArrayEquals(new int[]{6,6,6,6,6}, obj.sumArrays(arr,arr1));
   }
  
	@Test
	public void TestdiffArrays()
	{
		int arr[] = { 7, 8, 10, 14, 15 };
		int arr1[] = {1, 2, 3, 4, 5};
		assertArrayEquals(new int[]{6,6,7, 10, 10}, obj.diffArrays(arr,arr1));
	}
  
	@Test
	public void TestmulArrays()
	{
		  int arr[] = {1, 2, 3, 4, 5};
		  int arr1[] = {1, 2, 3, 4, 5};
		  assertArrayEquals(new int[]{1,4, 9, 16, 25}, obj.mulArrays(arr,arr1));
	}
	
	@Test
	public void TestconcatArrays()
	{
		  int arr[] = { 1, 2};
		  int arr1[] = {3};
		  int arr2[] = {3,4};
		  assertArrayEquals(new int[]{1,2,3}, obj.concatArrays(arr,arr1));
		  assertArrayEquals(new int[]{1,2,3,4}, obj.concatArrays(arr,arr2));
	}
  
	@Test
	public void TestfindMaxCount()
	{
		int arr[] = {1, 5, 2, 1, 3, 2, 1};
		int arr1[] = {2,3,3,3}; 
		assertEquals(1, obj.findMaxCount(arr));
		assertEquals(3, obj.findMaxCount(arr1));
	}
	
	@Test 
	public void TestfindMinCount()
	{
		int arr[] = {1, 5, 2, 5, 3, 2, 1};
		int arr2[] = {1,2,11,0};
		assertEquals(3, obj.findMinCount(arr));
		assertEquals(11, obj.findMinCount(arr2));
	}
	
	@Test
	public void TestfindKthlargest()
	{
		int arr[] = {7, 10, 4, 3, 20, 15};
		assertEquals(10, obj.findKthlargest(arr,3));
	}
	
	@Test
	public void TestfindKthsmallest()
	{
		int arr[] = {7, 10, 4, 3, 20, 15};
		assertEquals(7, obj.findKthsmallest(arr,3));
	}
	
	@Test
	public void TestgetUnion()
	{
		  int arr[] = { 1, 2, 5, 6, 7, 3 };
		  int arr1[] = { 2, 4, 5, 6, 8, 9};
		  assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9}, obj.getUnion(arr,arr1));
	}
	
	@Test
	public void TestgetIntersection()
	{
		  int arr[] = { 1, 2, 5, 6, 7, 3 };
		  int arr1[] = { 2, 4, 5, 6, 8, 9};
		  int arr2[] = {1,2,3};
		  int arr3[] = {1,3};
		  int arr4[] = {4,6};
		  int arr5[] = {2,4,6};
		  assertArrayEquals(new int[]{2,5,6}, obj.getIntersection(arr,arr1));
		  assertArrayEquals(arr3, obj.getIntersection(arr2,arr3));
		  assertArrayEquals(arr4, obj.getIntersection(arr4,arr5));
	}
   
}
