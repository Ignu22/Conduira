public class Message implements Runnable{
   
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(/*Thread.currentThread().getName()" Received Number "+*/i);
            //Thread.currentThread().getName() give details of current thread
        } 
    }
    //make thread sleep to simulate doing some work
   /* private void respondTime(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }*/
}