package threading;

public class Application {
    public static void main(String[] args) {

        System.out.println("Starting thread 1 : ");
        Task task = new Task("Thread #1");
        task.start();

        System.out.println("Starting thread 2 :");
        Tak2 tak2 = new Tak2("thread #2");
        tak2.start();

        System.out.println("Starting thread 1/2 : ");
        Task task12 = new Task("Thread #3");
        task12.start();


    }
}

class Task extends Thread{
    String name;
    public Task(String name){
        this.name = name;
    }
    public void run(){
        Thread.currentThread().setName(name);
        for (int i = 0; i < 100; i++){
            System.out.println("thread 1 : " + i + " -" + Thread.currentThread().getName());
        }
    }
}

class Tak2 extends Thread{

    String name;
    public Tak2(String name){
        this.name = name;
    }
    public void run(){
        Thread.currentThread().setName(name);
        for (int i = 0; i < 100; i++){
            System.out.println("thread 2 :" + i +" -"+ Thread.currentThread().getName());
        }
    }
}
