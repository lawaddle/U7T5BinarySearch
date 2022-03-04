import java.util.Arrays;

public class BinarySearchRunner
{
  public static void main(String[] args)
  {
//    // --- PART A: RUN AND STUDY ME! ---
//    // Look at the code for binarySearch to see how it works!
//
//    //    index #: 0   1  2  3   4   5   6   7   8   9  10  11  12  13   14
//    int[] arr = {-10, -6, 0, 2, 12, 14, 17, 23, 35, 45, 49, 55, 81, 100, 108};
//
//    // test when the target is in the middle (found on the first try!)
//    int idx = BinarySearch.binarySearch(arr, 23);
//    System.out.println("the number 23 was found! it is located at index: " + idx);
//
//    // test when the target is found after TWO iterations
//    idx = BinarySearch.binarySearch(arr, 55);
//    System.out.println("the number 55 was found! it is located at index: " + idx);
//
//    // test when the target is found after THREE iterations
//    idx = BinarySearch.binarySearch(arr, 14);
//    System.out.println("the number 14 was found! it is located at index: " + idx);
//
//    // test when the target is found after FOUR iterations (max for array size)
//    idx = BinarySearch.binarySearch(arr, 81);
//    System.out.println("the number 81 was found! it is located at index: " + idx);
//
//    // test when the target is found after FOUR iterations (max for array size)
//    idx = BinarySearch.binarySearch(arr, 17);
//    System.out.println("the number 17 was found! it is located at index: " + idx);
//
//    // test when the target is the first item in the array (takes 4 iterations)
//    idx = BinarySearch.binarySearch(arr, -10);
//    System.out.println("the number -10 was found! it is located at index: " + idx);
//
//    // test when the target is the last item in the array (takes 4 iterations)
//    idx = BinarySearch.binarySearch(arr, 108);
//    System.out.println("the number 108 was found! it is located at index: " + idx);
//
//    // test when the target is NOT in the array
//    idx = BinarySearch.binarySearch(arr, 13);
//    System.out.println("the number 13 was NOT found! " + idx);
//
//    // --- PART B: DETAILS! ---
//    // When you are ready, uncomment each of these tests and run to see printed commentary
//    // alongside every search; this prints out what is being checked and what is happening
//
//    int[] arr1 = {-10, -6, 0, 2, 12, 14, 17, 23, 35, 45, 49, 55, 81, 100, 108};
//
//    // test when the target is in the middle (found on the first try!)
//    int index = BinarySearch.binarySearchPrintedCommentary(arr1, 23);
//    System.out.println(index);
//    System.out.println("----------------------------------------------------");
//
//
//    // test when the target is found after TWO iterations
//    index = BinarySearch.binarySearchPrintedCommentary(arr1, 55);
//    System.out.println(index);
//    System.out.println("----------------------------------------------------");
//
//
//    // test when the target is found after THREE iterations
//    index = BinarySearch.binarySearchPrintedCommentary(arr1, 14);
//    System.out.println(index);
//    System.out.println("----------------------------------------------------");
//
//
//    // test when the target is found after FOUR iterations (max for array size)
//    index = BinarySearch.binarySearchPrintedCommentary(arr1, 81);
//    System.out.println(index);
//    System.out.println("----------------------------------------------------");
//
//
//    // test when the target is found after FOUR iterations (max for array size)
//    index = BinarySearch.binarySearchPrintedCommentary(arr1, 17);
//    System.out.println(index);
//    System.out.println("----------------------------------------------------");
//
//
//    // test when the target is the first item in the array (takes 4 iterations)
//    index = BinarySearch.binarySearchPrintedCommentary(arr1, -10);
//    System.out.println(index);
//    System.out.println("----------------------------------------------------");
//
//
//    // test when the target is the last item in the array (takes 4 iterations)
//    index = BinarySearch.binarySearchPrintedCommentary(arr1, 108);
//    System.out.println(index);
//    System.out.println("----------------------------------------------------");
//
//
//    // test when the target is NOT in the array
//    index = BinarySearch.binarySearchPrintedCommentary(arr1, 13);
//    System.out.println(index);
//    System.out.println("----------------------------------------------------");
//
//    int[] arrrrr= {1,2,2,4,6,3,7,7,9};
//    index = BinarySearch.binarySearch(arrrrr, 3);
//    System.out.println(index);

    int[] arr1 = {-24, -17, -9, 0, 3, 9, 11, 16, 21, 32, 46, 47, 55, 79, 96, 101, 206};
    System.out.println(Arrays.binarySearch(arr1, 21));

    int[] arr2 = {-24, -24, -9, 0, 0, 11, 15, 21, 21, 32, 46, 47, 55, 96, 96, 101, 206};
    System.out.println(Arrays.binarySearch(arr2, 21));

    int[] arr3 = {11, 11, 11, 11, 11, 11, 11, 11, 21, 101, 101, 101, 101, 101, 101, 101, 101};
    System.out.println(Arrays.binarySearch(arr2, 21));

    String[] strings = {"arr", "ary", "bee", "dreary", "ear", "find", " green", "hear", "here", "i", "joke", "lawer", "nope", "nyako", "pee", "pee", "poo", "reeee", "string", "string", "strings", "tree", "wacky"};
    System.out.println(Arrays.binarySearch(strings, "find"));
    System.out.println(Arrays.binarySearch(strings, "i"));
    System.out.println(Arrays.binarySearch(strings, "nope"));


  }
}