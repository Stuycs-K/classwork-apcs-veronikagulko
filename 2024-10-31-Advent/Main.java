import java.util.Scanner;
class Main {
    public static void main(String[] args){
        String text = "This is a sample \n Of how to read \n text";
        Scanner sci = new Scanner("This is a bunch of words");
        while(sci.hasNext()){
            System.out.println(sci.next());
        }
    }
}