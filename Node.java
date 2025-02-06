public class Node {
    private CovidVaccine data;
    private Node next;

    public Node() {
        this.data = null;
        this.next = null;
    }
    public Node(CovidVaccine data) {
        this.data = data;
        this.next = null;
    }

    public void setData(CovidVaccine data){
        this.data = data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public CovidVaccine getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }
}
