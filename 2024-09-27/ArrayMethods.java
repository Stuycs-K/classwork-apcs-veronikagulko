public class ArrayMethods{
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6};
        int[] test2 = returnCopy(test1);
        boolean test3 = tester(test1, test2);
        result(test3);
    }
    public static String aryToString(int[] nums){
        String result = "{";
        for (int i = 0; i < nums.length - 1; i++) {
            result += nums[i] + ", ";
        }
        result += nums[nums.length - 1] + "}"; 
        return result;
    }
    public static int[] returnCopy(int[]ary){
         int[] result = new int[ary.length];
        for (int i = 0; i < ary.length; i++) {
            result[i] = ary[i]; 
        }
        return result;
    }
    public static int[] tester(int[]a, int[]b){  
        boolean test1 = true;
        boolean test2 = false;
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                test1 = false;
            }
        }
        a[0] = 0;
        if(a[0] == b[0]){
            test2 = true;
        }
        boolean result = test1 && test2;
        return(result);
    }
}
