public class Outerclass {
    static class StaticNestedClass{
        void display(){
            System.out.println("Inside static nested class");
        }
    }
    class Innerclass{
        void display(){
            System.out.println("Inside inner  class");
        }
    }
    public static void main(String[] args){
        Outerclass.StaticNestedClass 
                staticNested=new
        Outerclass.StaticNestedClass();
        staticNested.display();
        Outerclass outer=new
        Outerclass();
        Outerclass.Innerclass inner=outer.new Innerclass();
        inner.display();
    }
}
