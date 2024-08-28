package OOPS;

public class GetterSetter {
    String name;
    private int rollNumber;
    double percent;

    // Getter function to allow user to read the private attribute
    public int getrollNumber(){
        return rollNumber;
    }

    // Setter function to update the value of private attribute
    public void setrollNumber(int rNo){
        int rollNumber = rNo;
    }
}
