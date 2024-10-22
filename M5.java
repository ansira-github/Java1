class MultithreadingFive implements Runnable{
    int threadNumber;
    MultithreadingFive(int tNo){
        this.threadNumber=tNo;
    }
     public void run(){
        for(int i=1;i<6;i++){
            System.out.println("Task"+i+"by ThreadNumber"+threadNumber);
            try {
                Thread.sleep(1000);
            }
           catch(InterruptedException e){
           } 
        }
    }
}
public class M5 {
    public static void main(String[] args){
        for(int i=1;i<8;i++){
            MultithreadingFive mt1=new MultithreadingFive(i);
            Thread t1=new Thread(mt1);
            t1.start();
        }
    }
}
    
