//Hangqi, hangqih@nycstudents.net; Veronika, vgulko60@stuy.edu
public class ArrayMethods{
  public static void main(String[] args){
    int[] 1dArray = new int[]{1, 2, 3, 4, 5};
    System.out.println("1DArray to String test: " + aryToString(1dArray));
    int[][] 2dArray = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("2DArray to String test 1: " + aryToString(2dArray));
    int[][] 2dArray2 = new int[][]{{1, 2, 3}, {4, 6}, {7, 8}};
    System.out.println("2DArray to String test 2: " + aryToString(aryToString(2dArray2)));
    System.out.println("Sum of all elements in 2D array test 1: " + aryToString(arr2DSum(2dArray)));
    System.out.println("Sum of all elements in 2D array test 2: " + aryToString(arr2DSum(2dArray2)));
    System.out.println("Transpose test " + aryToString(swapRC(2dArray)));
  }

  public static String aryToString(int[] nums){
    String result = "{";
    for (int i = 0; i < nums.length - 1; i++) {
        result += nums[i] + ", ";
    }
    result += nums[nums.length - 1] + "}";
    return result;
    }
    //using helper func
  public static String aryToString(int[][] nums){
    String result = "{";
    for(int i = 0; i < nums.length; i++){
      result += aryToString(nums[i]) + ", ";
    }
    result = result.substring(0,-2);
    result += "}";
    return(result);
  }
  public static String aryToString(int[][] nums){
    String total = "{";
    String result = "{";
    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums[i].length; j++){
        result += nums[i][j] + ", ";
      }
      result += nums[nums.length - 1][nums.length - 1] + "}";
      return result;
    }
    total = total.substring(0,-2);
    total += "}";
    return(total);
  }
public static int arr2DSum(int[][]nums) {
  int sum = 0;
  for(int i = 0; i < nums.length; i++){
    for(int j = 0; j < nums[i].length; j++){
      sum += nums[i][j];
    }
  }
  return(sum);
}

public static int[][] swapRC(int[][] nums){
        int[][] result = new int[nums[0].length][nums.length];
        if (nums[0].length == 0) {
            return nums;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j  < nums[0].length; j++) {
                result[j][i] = nums[i][j];
            }
        }
        return result;
    } 
}

