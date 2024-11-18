import java.util.ArrayList;

public class Driver{
  public static void main(String[] args){
    ArrayList<String> test1 = ArrayListPractice.createRandomArray(200001);
    System.out.println(test1);
    ArrayListPractice.replaceEmpty(test1);
    System.out.println(test1);
  }
}


