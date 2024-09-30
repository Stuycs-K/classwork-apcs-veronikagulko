//Hangqi, hangqih@nycstudents.net; Veronika, vgulko60@stuy.edu
public class ArrayMethods{
  public static void main(String[] args){
    int[] 1dArray = new int[] {1, 2, 3, 4, 5};
    System.out.println(aryToString(1dArray));
    int[][] 2dArray = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
    System.out.println(aryToString(2dArray));
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
}
