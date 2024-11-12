class Animal2{
    void eat(){
        System.out.println("Animal is eating");
    }
}
interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class Duck extends Animal implements Flyable,Swimmable{
    public void fly(){
        System.out.println("Duck is flying");
    }
    public void swim(){
        System.out.println("Duck is swimming");
    }
    void eat(){
        System.out.println("Duck is eating");
    }
}
public class Main3 {
    public static void main(String[] args){
        Duck duck=new Duck();
        duck.eat();
        duck.fly();
        duck.swim();
        
    }
}
