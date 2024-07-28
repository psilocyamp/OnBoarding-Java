package day_2;

public class Person {

    private String firstName;
    private String lastName;
    private String identityCard;
    private int age;
    private double height;
    private boolean married;
    private String[] petsNames;

    // Constructor
    public Person(String firstName, String lastName, String identityCard, int age, double height, boolean married, String[] petsNames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
        this.petsNames = petsNames;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarried() {
        return married;
    }

    public String[] getPetsNames() {
        return petsNames;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public void setPetsNames(String[] petsNames) {
        this.petsNames = petsNames;
    }

    // Method to introduce yourself
    public void introduceYourself() {
        System.out.println("Hey! My name is " + firstName + " " + lastName + ".");
        System.out.println("I'm " + age + " years old and my height is " + height + " meters.");
        System.out.println("I'm " + (married ? "married" : "single") + ".");
        System.out.print("My pets are: ");

        if (petsNames != null && petsNames.length > 0) {
            for (String pet : petsNames) {
                System.out.print(pet + " ");
            }
            System.out.println();  // Move to a new line after printing all pets
        } else {
            System.out.println("no pets :( ");
        }
    }

    public static void main(String[] args) {
        // Create instances of Person
        String[] myPets = {"Mini", "Blas", "Huayra", "Aria"};
        Person me = new Person("Ampie", "Perez", "123456789", 23, 1.65, false, myPets);

        String[] friendPets = {"Bartola", "Leon", "Milka", "Eva"};
        Person friend = new Person("Maite", "Lalal", "123456789", 23, 1.65, false, friendPets);

        // Introduce each person
        System.out.println("Introducing me:");
        me.introduceYourself();

        System.out.println("\nIntroducing my friend:");
        friend.introduceYourself();
    }
}