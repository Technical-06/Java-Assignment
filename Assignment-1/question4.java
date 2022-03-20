class message{

    private String text;
    private boolean isEmpty = true;

    public synchronized String read(){
        while(this.isEmpty){
            try{
                wait();
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
        this.isEmpty = true;
        notifyAll();
        return this.text;
    }

    public synchronized void write(String res){
        while(!this.isEmpty){
            try{
                wait();
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
        this.isEmpty=false;
        this.text = res;
        notifyAll();
    }
    
}


class Writer extends Thread{

    private message msgObj;

    Writer(message msg){
		this.msgObj = msg;
	}

    public void run(){
        try{
            msgObj.write("Hello Guys!");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}

class Reader extends Thread{

    private message msgObj;

    Reader(message msg){
		this.msgObj = msg;
	}

    public void run(){
        try{
            String msg = msgObj.read();
            System.out.println(msg);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}


class question4{

    public static void main(String args[]){

        message msgObj = new message();
        new Thread(new Reader(msgObj)).start();
        new Thread(new Writer(msgObj)).start();

    }

}