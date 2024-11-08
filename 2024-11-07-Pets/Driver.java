// you can't access the private instance of name from the parent class
//
//
public class Driver{
    public static void main(String[] args) {
        Animal test1 = new Animal("fatty", 4, "bobby");
        test1.speak();
        Bird testBird1 = new Bird("I am fatter", 5, "bob", 3.4, "neon");
        testBird1.speak();
    }
}