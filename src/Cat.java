public class Cat extends Feline implements Comparable{
    //override one or more methods in parent class
    //have a constructor
    //one or more "other" constructors (use this or super)
    //implement Comparable interface
    //override toString and equals methods

    private boolean kitten;
    private String name;
    private boolean fluff;

    public Cat(){
        super();
        name = "Calico";
        kitten = true;
        fluff = false;
    }

    public void setBreed(String name){
        this.name = name;
    }

    public String getBreed(){
        return name;
    }

    public boolean isKitten(){
        if (kitten == true){
            kitten = false;
        }
        return kitten;
    }

    public boolean hasFluff(){
        if (fluff == false){
            fluff = true;
        }
        return fluff;
    }

    public int compareTo(Object o) {
       Cat obj = (Cat) o;
       return this.getAge() - obj.getAge();
    }

    public boolean equals(Cat other){
        if (this == other){
            return true;
        }
        return false;
    }

    public String toString(){
        String result = "";
        result += "Cat breed: " + name + "\nIs a kitten?: " + kitten;
        result += "\nIs fluffy?: " + fluff + "\n";
        return result;
    }
}
