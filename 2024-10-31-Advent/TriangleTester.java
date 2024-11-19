import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
 
 
 public static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

   
    public static int countTrianglesA(String filename) {
        int validCount = 0;
        try {
            Scanner fileScanner = new Scanner(new File(filename));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(line);
                int a = lineScanner.nextInt();
                int b = lineScanner.nextInt();
                int c = lineScanner.nextInt();
                if (isValidTriangle(a, b, c)) {
                    validCount++;
                }
                lineScanner.close();
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
        return validCount;
    }


 public static void main(String[] args) {
        System.out.println("Valid triangles:" + countTrianglesA("data.txt"));
       
    }
}
