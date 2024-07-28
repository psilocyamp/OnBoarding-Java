package day_3;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String firstName;
    private String lastName;
    private String identityCard;
    private int age;
    private double height;
    private boolean married;
    private final List<Pet> pets;   //porq el final????

    // Constructor
    public Person(String firstName, String lastName, String identityCard, int age, double height, boolean married) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
        this.pets = new ArrayList<>();
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

    public List<Pet> getPets() {
        return pets;
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

    // Método para agregar una mascota
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    // Method to introduce yourself
    public void introduceYourself() {
        System.out.println("Hey! My name is " + getFirstName() + " " + getLastName() + ".");
        System.out.println("My ID is " + getIdentityCard() + ".");
        System.out.println("I'm " + getAge() + " years old and my height is " + getHeight() + " meters.");
        System.out.println("I'm " + (isMarried() ? "married" : "single") + ".");
        System.out.print("My pets are: ");

        if (!pets.isEmpty()) {
            for (Pet pet : pets) {
                pet.printPetDetails();
            }
        } else {
            System.out.println("no pets :( ");
        }
    }


}