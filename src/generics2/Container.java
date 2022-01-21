package generics2;

public class Container<it1, it2> {

    it1 item1;
    it2 item2;

    public Container(it1 item1, it2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public void pintItems(){
        System.out.println(item1);
        System.out.println(item2);
    }

    public it1 getItem1() {
        return item1;
    }

    public void setItem1(it1 item1) {
        this.item1 = item1;
    }

    public it2 getItem2() {
        return item2;
    }

    public void setItem2(it2 item2) {
        this.item2 = item2;
    }
}
