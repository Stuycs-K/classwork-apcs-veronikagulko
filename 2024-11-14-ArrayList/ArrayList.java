import java.util.ArrayList;
import java.lang.Math;

public class ArrayListPractice{
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> result = new ArrayList<String>();
    for(int i = 0; i < size; i++){
      int number = (int) (Math.random() * 11);
      if (number != 0){
        result.add(i, "" + number);
      }
      else{
        result.add(i, "");
      }
    }
    return result;
  }
  public static void replaceEmpty( ArrayList<String> original){
    for(int i = 0; i < original.size(); i++){
      if(original.get(i).equals("")){
        original.set(i, "Empty");
      }
    }
  }
}




import java.util.ArrayList;

public class Driver{
  public static void main(String[] args){
    ArrayList<String> test1 = ArrayListPractice.createRandomArray(200001);
    System.out.println(test1);
    ArrayListPractice.replaceEmpty(test1);
    System.out.println(test1);
  }
}


