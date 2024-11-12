class Animal1{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog1 extends Animal1{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog{
    void sound(){
        System.out.println("Puppy whines");
    }
}
public class Main2 {
    public static void main(String[] args){
        Animal animal=new Animal();
        Dog dog=new Dog();
        Puppy puppy=new Puppy();
        animal.sound();
        dog.sound();
        puppy.sound();
    }
}
