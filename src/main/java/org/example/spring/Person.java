package org.example.spring;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Person bean is createtd");
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my lovely Pet!");
        pet.say();
    }

}
