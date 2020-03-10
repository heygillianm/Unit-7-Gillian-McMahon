public class Feline extends Animal implements Comparable{
    //one or more of it's OWN properties
    //default constructor
    //appropriate getter and setter methods
    //override at least one method of it's parent class
    //one (not inherited) method
    //implement Comparable interface
    //overriden toString and equals methods

    private boolean hunger;
    private boolean simba;
    private int age;

    public Feline(){
        hunger = true;
        simba = false;
        age = 0;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void makeKing(){
        simba = true;
        System.out.println("Feline is now king.");
    }

    public void eat(){
        hunger = false;
        System.out.println("Feline has had food.");
    }

    public int compareTo(Object o) {
        Feline obj = (Feline) o;
        System.out.println("Difference in cat ages.");
        return this.getAge() - obj.getAge();
    }

    public boolean equals(Feline thisCat){
        if (thisCat == this){
            return true;
        }
        return false;
    }

    public String toString(){
        String result = "";
        result += "Age of feline: " + age + "\nFeline roars.";
        return result;
    }
}
