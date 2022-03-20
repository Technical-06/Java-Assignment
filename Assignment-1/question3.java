class DataFetch extends Thread{

    @Override
    public void run(){
        try{
        Thread.sleep(4000);
        System.out.println("Thread 1 is there");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}

class ProcessData implements Runnable{

    @Override
    public void run(){
        try{
            Thread.sleep(10000);
            System.out.println("Thread 2 is there");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}

class question3 {
    public static void main(String args[]) throws InterruptedException{
        DataFetch f = new DataFetch();
        ProcessData p = new ProcessData();
        Thread thread = new Thread(p);  
        f.start();
        f.join();
        thread.start();     
    }
}