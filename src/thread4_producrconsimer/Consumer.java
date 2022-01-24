package thread4_producrconsimer;

import java.util.List;

public class Consumer implements Runnable{

    List<Integer> questionList = null;

    public Consumer(List<Integer> questionList){
        this.questionList = questionList;
    }

    public void answerQuestion() throws InterruptedException {
        synchronized (questionList){
            while (questionList.isEmpty()) {
                System.out.println("No question to answer...waiting for Producer");
                questionList.wait();
            }
        }

        synchronized (questionList){
            Thread.sleep(5000);
            System.out.println("ANSWERED question "+ questionList.remove(0));
            questionList.notify();
        }
    }

    @Override
    public void run() {

        while (true) {
            try {
                answerQuestion();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
