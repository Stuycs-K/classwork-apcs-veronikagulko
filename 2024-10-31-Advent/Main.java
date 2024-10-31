import java.util.Scanner;
class Main {
    public static void main(String[] args){
        String text = "This is a sample \n Of how to read \n text";
        Scanner sci = new Scanner("This is a bunch of words");
        /*
        while(sci.hasNext()){
            System.out.println(sci.next());
        }
        */
        Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
        while(sc2.hasNextDouble()){
            System.out.println(sc2.nextDouble());
        }
    }
}