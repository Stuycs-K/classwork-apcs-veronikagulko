// you can't access the private instance of name from the parent class, so you have to use super.getName(). This means it will use the animal get name originally
// an animal is a bird, so you could create an instance of an animal by giving it bird parameters, it will simply take the ones it needs
// a bird is an animal 
// a bird requires more variables than an animal, so an instance can not be created with only the parameters from animals
public class Driver{
    public static void main(String[] args) {
        Animal test1 = new Animal("fatty", 4, "bobby");
        test1.speak();
        Bird testBird1 = new Bird("I am fatter", 5, "bob", 3.4, "neon");
        testBird1.speak();
       // Bird testBirdasAni = new Animal("animal disguised as bird", 1, "camo");
        Animal testAniasBird = new Bird("bird camo as animal", 4, "kamila", 4.5, "indigo");
    }
}