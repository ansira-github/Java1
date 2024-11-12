public class StaticExample {
    static int count=0;
    public StaticExample(){
        count++;
    }
    public static void displayCount(){
        System.out.println("Total objects created:"+count);}
    public static void main(String[] args){
        StaticExample obj1=new StaticExample();
        StaticExample obj2=new StaticExample();
        StaticExample obj3=new StaticExample();
        StaticExample.displayCount();
    }
}
