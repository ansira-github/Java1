class MultithreadingFour extends Thread{
    int threadNumber;
    MultithreadingFour(int tNo){
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
public class M4 {
    public static void main(String[] args){
        for(int i=1;i<8;i++){
            MultithreadingFour mt1=new MultithreadingFour(i);
            mt1.start();
        }
    }
}
