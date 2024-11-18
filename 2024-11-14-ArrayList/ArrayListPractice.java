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
  public static ArrayList<String> makeReversedList(ArrayList<String> original){
    ArrayList<String> result = new ArrayList<String>(original.size());
    for(int i = original.size() - 1; i > 0; i--){
        for(int j = 0; j < original.size(); i++){
            result.set(j, original.get(i));
        }
    }
    return result;
  }
}

