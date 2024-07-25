package day_2;

public class Person {

    private String firstName;
    private String lastName;
    private String identityCard;
    private int age;
    private double height;
    private boolean married;
    private String [] petsNames;



    //constructor
    public Person(String firstName, String lastName, String identityCard, int age, double height, boolean married, String[] petsNames){

        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
        this.petsNames = petsNames;
    }


    //metodos
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


    //setters

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


    public void introduceYourself(){
//        System.out.println("First Name: " + firstName);
//        System.out.println("Last Name: " + lastName);
//        System.out.println("Age: " + age);
//        System.out.println("Height: " + height + " meters");
//        System.out.println("Marital Status: " + (married ? "Married" : "Single"));
//        System.out.println("Pets: ");

        if (petsNames != null && petsNames.length > 0){
            for (String pet : petsNames){
                System.out.println(" - " + pet);
            }
            }else {
            System.out.println("no pets :( ");
        }
    }

    public static void main (String [] args){
        //creo instancias de person

        String [] myPets={"mini", "blas", "huayra", "aria"};
        Person me= new Person("Ampie", "Perez", "123456789", 23, 1.65, false, myPets);

        String[] friendPets={"bartola", "leon", "milka", "eva"};
        Person friend= new Person ("maite", "lalal", "123456789", 23, 1.65, false, friendPets);


        //introduzco a cada una

        System.out.println("introducing me: " +"\n"+"heyyy! my name is " + me.getFirstName() + " " + me.getLastName() + "."+ "\n" + "I´ve " + me.getAge() + " years old and my height is " + me.getHeight() + " meters." + "\n" + "I'm " + (me.isMarried() ? "married" : "single") + "." + "\n" + "My pets are: ");
        me.introduceYourself();

        System.out.println("introducing my friend: " +"\n"+"heyyy! my name is " + friend.getFirstName() + " " + friend.getLastName() + "."+ "\n" + "I´ve " + friend.getAge() + " years old and my height is " + friend.getHeight() + " meters." + "\n" + "I'm " + (friend.isMarried() ? "married" : "single") + "." + "\n" + "My pets are: ");
        friend.introduceYourself();

    }


}
