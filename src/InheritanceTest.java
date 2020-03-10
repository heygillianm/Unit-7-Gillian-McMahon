public class InheritanceTest {
    //instantiate an object from each of the three classes
    //use at least four of the methods
    //demonstrate polymorphism

    public static void main (String [] args){
        Animal bear = new Animal();
        bear.eat();
        bear.toString();

        Feline lion = new Feline();
        lion.setAge(1);
        lion.getAge();
        lion.makeKing();
        lion.toString();

        Cat bella = new Cat();
        bella.setBreed("Flat Face Cat");
        bella.getBreed();
        bella.hasFluff();
        bella.toString();

        Animal tiger = new Feline();
        tiger.equals(lion);
        tiger.toString();
    }
}
