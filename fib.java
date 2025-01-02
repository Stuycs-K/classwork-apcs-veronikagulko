// 46 is max under 10 sec
// 47 is overflow error
public class fib{
    public static void main(String args[]){
        System.out.println(fibonacci(50));
    }
    public static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        else{
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }
}