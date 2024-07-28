package day_3;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Person
        Person me = new Person("Ampie", "Perez", "123456789", 23, 1.65, false);
        Person friend = new Person("Maite", "Lalal", "987654321", 25, 1.70, false);



        // Crear instancias de Pet
        Pet myPet1 = new Pet("Mini", PetType.DOG, 5);
        Pet myPet2 = new Pet("Blas", PetType.CAT, 3);
        Pet friendPet1 = new Pet("Bartola", PetType.CAT, 3);
        Pet friendPet2 = new Pet("Leon", PetType.DOG, 4);

       //ASIGNAR MASCOTAS A PERSONAS
        me.addPet(myPet1);
        me.addPet(myPet2);
        friend.addPet(friendPet1);
        friend.addPet(friendPet2);



        //PROPIETARIO DE CADA MASCOTA
        myPet1.setOwner(me);
        myPet2.setOwner(me);
        friendPet1.setOwner(friend);
        friendPet2.setOwner(friend);

        // Presentar a cada persona
        System.out.println("Introducing me:");
        me.introduceYourself();

        System.out.println("\nIntroducing my friend:");
        friend.introduceYourself();
    }
}
