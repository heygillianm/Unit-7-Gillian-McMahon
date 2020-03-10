public class Boat {
    private boolean hasMotor;
    private int topSpeed;
    private int length;

    public Boat(){
        this.hasMotor = false;
        this.topSpeed = 0;
        this.length = 0;
    }

    public Boat(boolean hasMotor, int topSpeed, int length){
        this.hasMotor = hasMotor;
        this.topSpeed = topSpeed;
        this.length = length;
    }

    public String move(int nautMiles){
        if (hasMotor) {
            return "The boat moved " + nautMiles + " nautical miles quickly.";
        }
        else {
            return "The boat took forever to move " + nautMiles;
        }
    }

    public String sink(){
        if (length > 10){
            return "Boat sank in " + (length*2 + 9)/1.4 + " minutes.";
        }
        else {
            return "Boat sank instantly";
        }
    }

    public String toString(){
        return "Boat - \n\t Motor: " + hasMotor + "\n\t " + "Top Speed: " + topSpeed + " knots" +
                "\n\t" + "Length: " + length + " ft.";
    }
}
