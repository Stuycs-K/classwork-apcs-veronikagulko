public class Text{
//MODIFIERS
public static final int BRIGHT = 1;
public static final int DARK = 2;
public static final int ITALICS = 3;
//COLORS
public static final int BLACK = 30;
public static final int RED = 31;
public static final int GREEN = 32;
public static final int YELLOW = 33;
public static final int BLUE = 34;
public static final int MAGENTA = 35;
public static final int CYAN = 36;
public static final int WHITE = 37;
//CONTROLS
public static final String CLEAR_SCREEN =  "\033[2J";
public static final String HIDE_CURSOR =  "\033[?25l";
public static final String SHOW_CURSOR =  "\033[?25h";

//use this to go back to normal terminal before exiting.
public static final String RESET = "\033[0m"+SHOW_CURSOR;

//use this to convert from color to background (30 to 37 becomes 40 to 47)
public static int  background(int color){
  return color + 10;
}

//terminal specific character to move the cursor to a location
//top left is 1,1
//row is y (higher numbers go down)
//column is x
public static void go(int row,int col){
    System.out.print("\033[" + row + ";" + col + "H");
}

//Overloarded color commands (give 1 or more colors/modifiers)
public static void color(int m){
  System.out.print ("\033[;" + m + "m");
}
public static void color(int m1, int m2){
  System.out.print ("\033["+ m1 + ";" + m2 + "m");
}
public static void color(int m1, int m2, int m3){
  System.out.print ("\033["+ m1 + ";" + m2 + ";" + m3 + "m");
}
public static void color(int m1, int m2, int m3, int m4){
  System.out.print ("\033["+ m1 + ";" + m2 + ";" + m3 + ";"+m4+"m");
}

//And don't forget you can easily delay the printing if needed:
public static void wait(int millis){
  try {
    Thread.sleep(millis);
  }
    catch (InterruptedException e) {
  }
}

//erase (black bakground)
public static void erase(int r, int c, int size){
  go(r,c);
  System.out.print("\033[0m");
  for(int i = 0; i < size;i++){
    System.out.print(" ");
  }
}

public static void main(String[]args){
  System.out.print(CLEAR_SCREEN);
  System.out.print(HIDE_CURSOR);

  //SHOW A LOT OF COLORS!
  for(int i = 0; i < 8; i++){
    for(int j = 0; j < 8; j++){
      go(i+1,j+1);
      color(30+i,background(30+j));
      System.out.print("H");
                  go(i+1,j+10);
      color(30+i,background(30+j),BRIGHT);
      System.out.print("H");
                  go(i+1,j+19);
      color(30+i,background(30+j),DARK,ITALICS);
      System.out.print("H");
    }
  }

  //HOW TO USE:
  go(14,20);
  color(YELLOW,background(BLUE),ITALICS);
  System.out.print("ITALICS FISH!~~~~");
  go(12,10);
  color(GREEN,background(YELLOW),BRIGHT);
  System.out.print("_#o.o#_");
  wait(500);
  erase(14,20,2);
  wait(500);
  erase(14,22,2);
  wait(500);
  erase(14,24,2);
  wait(500);
  erase(14,26,2);
  go(15,0);//so the prompt is printed BELOW the other text.
  System.out.println(RESET);
}

}