package day_3;

public class Pet {
    private String name;
    private PetType type;
    private int age;
    private Person owner;

    // Constructor parametrizado sin propietario
    public Pet(String name, PetType type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public PetType getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public Person getOwner() {
        return owner;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    // Método para imprimir detalles de la mascota
    public void printPetDetails() {
        System.out.println("Pet Name: " + name);
        System.out.println("Pet Type: " + type);
        System.out.println("Pet Age: " + age);
        if (owner != null) {
            System.out.println("Owner: " + owner.getFirstName() + " " + owner.getLastName());
        } else {
            System.out.println("Owner: Not assigned");
        }
    }
}
