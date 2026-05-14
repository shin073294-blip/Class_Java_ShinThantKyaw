package batch11..homeworkAnimal;

public abstract class Animal {

   public String name;
   public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age= age;
    }

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("Name: " + this.name + " | Age: " + this.age);
    }

}
