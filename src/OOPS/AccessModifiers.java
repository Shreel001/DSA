package OOPS;

// Public - All packages
// Private - same class
// Default - same package

public class AccessModifiers {
    public class cars {
        public String name;
        public String company;
        String majorDefect;
        private int referenceNumber;
    }
}

// Here I can access name and company attributes across all packages as they are public. So I can also change them
// Here I can access majorDefect attribute within same package only as it is set to default. So I can change its value within same package
// Here I can access referenceNumber attribute within same class only as it is set to private. So I can change its value within same class.