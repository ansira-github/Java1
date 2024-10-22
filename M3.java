class MultithreadingThree extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
           catch(InterruptedException e){
           } 
        }
    }
}
public class M3 {
    public static void main(String[] args){
        MultithreadingThree mt1=new MultithreadingThree();
            mt1.start();
    }
    
}
