package collection;

public class PracticeComparable implements Comparable<PracticeComparable>{

    String name;
    int aga;

    public PracticeComparable(String name, int aga) {
        this.name = name;
        this.aga = aga;
    }

    @Override
    public String toString() {
        return "PracticeComparable{" +
                "name='" + name + '\'' +
                ", aga=" + aga +
                '}';
    }

    @Override
    public int compareTo(PracticeComparable o) {

        if (this.aga > o.aga){
            return 1;
        }else if (this.aga < o.aga){
            return -1;
        }
        return 0;
    }
}
