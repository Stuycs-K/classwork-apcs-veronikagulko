//Hangqi, hangqih@nycstudents.net; Veronika, vgulko60@stuy.edu
public class ArrayMethods{
  public static void main(String[] args){
    int[] oneDArray = {1, 2, 3, 4, 5};
    System.out.println("oneDArray to String test " + aryToString(oneDArray));
    int[][] twodArray = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("twodArray to String test 1: " + aryToString(twodArray));
    int[][] twodArray2 = new int[][]{{1, 2, 3}, {4, 6}, {7, 8}};
    System.out.println("twodArray2 to String test 2: " + aryToString(twodArray2));
    System.out.println("Sum of all elements in 2D array test 1: " + (arr2DSum(twodArray)));
    System.out.println("Sum of all elements in 2D array test 2: " + (arr2DSum(twodArray2)));
    System.out.println("Transpose test " + aryToString(swapRC(twodArray)));

    int[][] nonNegativeArray1 =  replaceNegative(twoArray);
    System.out.println(aryToString(nonNegativeArray1)
  }

  public static String aryToString(int[] nums) {
    if (nums.length == 0) {
        return "{}";
    }
    String result = "{";
    for (int i = 0; i < nums.length - 1; i++) {
        result += nums[i] + ", ";
    }
    result += nums[nums.length - 1] + "}";
    return result;
}
    //using helper func
public static String aryToString(int[][] nums) {
    if (nums.length == 0) {
        return "{}";
    }
    String result = "{";
    for (int i = 0; i < nums.length; i++) {
        result += aryToString(nums[i]) + ", ";
    }
    result = result.substring(0, result.length() - 2);
    result += "}";
    return result;//-All other negatives replace with 0
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
        if (nums.length == 0 || nums[0].length == 0) {
        return new int[0][0];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j  < nums[0].length; j++) {
                result[j][i] = nums[i][j];
            }
        }//-All other negatives replace with 0
        return result;
    }
public static void replaceNegative(int[][] vals){
  for(int i = 0; i < int.length; i++){
    for(int j = 0; j < int[].length; j++){
      if(int[i][j] < 0){
        if(i == j){
          vals[i][j] = 1;
        }
        else{
        vals[i][j] = 0;
      }
    }
  }
}
}
public static int[] copy(int[] nums){
  int[] result = new int[nums.length];
  for(int i = 0; i < nums.length; i++){
    result[i] = nums[i];
  }
  return(result);
}
  public static int[][] copy(int[][] nums){
    int[][] Result = new int[nums.length][nums[].length];
    for(int i = 0; i < nums.length; i++){
      Result[i] = copy(nums[i]); 
    }
    return(Result);
  }
}
