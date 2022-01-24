package thread4_producrconsimer;

import java.util.List;

public class Producer implements Runnable{

    List<Integer> questionList = null;
    final int LIMIT = 5;
    private int questionNumber;

    public Producer(List<Integer> questionList){
        this.questionList = questionList;
    }

    public void readQuestion(int questionNumber) throws InterruptedException {
        synchronized (questionList){
        while (questionList.size() == LIMIT) {
            System.out.println("Question have piled up... wait for answer");
            questionList.wait();
            }
        }

        synchronized (questionList){
            System.out.println("new question "+ questionNumber);
            questionList.add(questionNumber);
            Thread.sleep(100);
            questionList.notify();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                readQuestion(questionNumber++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
