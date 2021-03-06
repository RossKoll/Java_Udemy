package thread2;

public class Application {
    public static void main(String[] args) {

        Sequence sequence = new Sequence();

        Worker worker = new Worker(sequence);
        Worker worker2 = new Worker(sequence);
        worker.start();
        worker2.start();


    }
}

class Worker extends Thread{

    Sequence sequence = null;
    public Worker(Sequence sequence){
        this.sequence = sequence;
    }

    public void run(){
        for (int i = 0; i < 100; i++ ){
            System.out.println(Thread.currentThread().getName() + " got value: "+sequence.getNext());
        }
    }
}
