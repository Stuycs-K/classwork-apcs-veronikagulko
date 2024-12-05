import java.util.Random;

public class Driver {
    public static void Border() {
        Text.go(1, 1); 
        Text.color(Text.CYAN);
        for (int i = 0; i < 80; i++) {
            System.out.print("-");
        }

        Text.go(30, 1); 
        for (int i = 0; i < 80; i++) {
            System.out.print("-");
        }

        
        for (int i = 2; i < 30; i++) {
            Text.go(i, 1); 
            System.out.print("|");

            Text.go(i, 80); 
            System.out.print("|");
        }
    }

    public static void main(String[] args) {
        System.out.print(Text.CLEAR_SCREEN);
  System.out.print(Text.HIDE_CURSOR);
        Border();

        int[] array1 = new int[3];
        Random rand = new Random();
        array1[1] = rand.nextInt(99);
        array1[2] = rand.nextInt(99);
        array1[0] = rand.nextInt(99);

        for (int i = 0; i < 3; i++) {  
            Text.go(2, 20 * (i + 1)); 
            if (array1[i] < 25) {
                Text.color(Text.RED);
            } else if (array1[i] > 75) {
                Text.color(Text.GREEN);
            }
            else{
                Text.color(Text.WHITE);
            }
            System.out.print(array1[i]);
        }

        Text.go(3, 1);
        Text.color(Text.CYAN);
        for (int i = 0; i < 79; i++) {
            System.out.print("=");
        }
        Text.go(31, 0); 
    }
}
