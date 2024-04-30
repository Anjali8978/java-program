// Wait() and Notify() for Thread synchronization
// ***********************************************

class SharedThread{
private int data;
private boolean writable=true;

public synchronized void produce(int x){
if(writable==false)
{
	try{wait();}//produce thread will wait
catch(InterruptedException ie){ System.out.println("produce exception");}
}
data=x;
System.out.println("produced:"+data);
writable=false;
notify();
}
public synchronized void consume(){
if(writable==true){
try{
	wait();// consume Thread will wait
	}
catch(InterruptedException ie){}
}

System.out.println("consumed:"+data);

writable=true;
notify();
}
}
class Producer extends Thread{

SharedThread t;
public Producer(SharedThread t){
this.t=t;

}
public void run(){
 for(int i=0;i<=10;i++){
 t.produce(i);


 try{Thread.sleep(1000);}
catch(InterruptedException ie){ ie.printStackTrace();	}
 
 }
}
}
class Consumer extends Thread{
SharedThread t;
public Consumer(SharedThread t){
   this.t=t;

}
public void run(){
  for(int i=0;i<=10;i++){
	  t.consume();
     
	 try{Thread.sleep(1000);}
catch(InterruptedException ie){ ie.printStackTrace();	}
 
 }

}
}

class ThreadSynchronized
{
 public static void main(String[] args){
 SharedThread t1=new SharedThread();
 Producer p1=new Producer(t1);
 Consumer c1=new Consumer(t1);
 p1.start();
 c1.start();
 
 }


}