class Animal {
    void sound(){
        System.out.println("This is a generic animal sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark!");
     }
}
public class Main1{
    public static void main(String[] args){
        Animal animal=new Animal();
        Dog dog=new Dog();
        animal.sound();
        dog.sound();
    }
}
    