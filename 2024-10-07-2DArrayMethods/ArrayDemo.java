public class ArrayDemo {
  public static void main(String[]args){
    System.out.println("HI");
  }
// array to string 1d array
  public static String arrToString(int[] ary){
    if (ary.length == 0) {
        return "{}";
    }
    String result = "{";
    for (int i = 0; i < ary.length - 1; i++) {
        result += ary[i] + ", ";
    }
    result += ary[ary.length - 1] + "}";
    return result;
  }
// array to string 2d array
  public static String arrToString(int[][] ary){
    if (ary.length == 0) {
        return "{}";
    }
    String result = "{";
    for (int i = 0; i < ary.length; i++) {
        result += arrToString(ary[i]) + ", ";
    }
    result = result.substring(0, result.length() - 2);
    result += "}";
    return result;
  }
  public static int countZeroes2D(int[][] nums){
    // count how many zeroes are in array
    return 0;
  }
  public static int arr2DSum(int[][] nums){
    // calculate sum, use nested loop
    return 0;
  }
  public static void replaceNegative(int[][] vals){
    // same as hw
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
    }
    return result;
  }
  public static String tdTags(int[] nums){
    String result = "<tr><td>";
    for(int i = 0; i < nums.length - 1; i++){
      result += nums[i] + "</td><td>"; 
    }
    result += nums[-1] + "</td></tr>";
    return(result);
  }
  public static String htmlTable(int[][] nums){
    // place tr tags around each row, place td tags aound each value (make helper func)
    // place table tag around entirety
    String result = "<table";
    for (int i = 0; i < nums.length; i++){
      result += tdTags(nums[i]);
    }
    result += "</table>";
    return(result); 
  }
}