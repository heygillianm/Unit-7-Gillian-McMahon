public class Animal {
    //must have one or more properties
    //two or more methods
    //constructor
    //appropriate getter and setter methods
    //overriden toString method

    private int age;
    private boolean hunger;

    public Animal(){
        age = 5;
        hunger = true;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void eat(){
        hunger = false;
    }

    public String toString(){
        String result = "";
        result += "Age of animal: " + age + " Is hungry?: " + hunger + "\n";
        return result;
    }
}
