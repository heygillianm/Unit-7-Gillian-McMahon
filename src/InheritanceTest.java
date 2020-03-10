public class InheritanceTest {
    //instantiate an object from each of the three classes
    //use at least four of the methods
    //demonstrate polymorphism

    public static void main (String [] args){
        Animal bear = new Animal();
        bear.eat();
        System.out.println(bear.toString());

        System.out.println("~~~~~~~~~~~~");

        Feline lion = new Feline();
        lion.setAge(1);
        System.out.println(lion.getAge());
        lion.makeKing();
        System.out.println(lion.toString());

        System.out.println("~~~~~~~~~~~~~~");

        Cat bella = new Cat();
        bella.setBreed("Flat Face Cat");
        bella.isKitten();
        System.out.println(bella.getBreed());
        bella.hasFluff();
        System.out.println(bella.toString());

        System.out.println("~~~~~~~~~~~~~~~~");

        Animal tiger = new Feline();
        System.out.println(tiger.equals(lion));
        System.out.println(tiger.toString());
    }
}
