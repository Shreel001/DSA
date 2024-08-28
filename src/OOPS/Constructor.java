package OOPS;

public class Constructor {
    public static class StudentClass {
        String name;
        int rollNumber;
        double percent;

        // Constructor for class StudentClass so that we can create the objects using this constructor
        public StudentClass(String name, int rollNumber, double percent){
            this.name = name;
            this.rollNumber = rollNumber;
            this.percent = percent;
        }
    }

    public static void main(String[] args) {
        // Using Constructor to create object in one line of code
        StudentClass x = new StudentClass("Shreel", 25, 91.23);
        System.out.println(x.percent);
    }
}
