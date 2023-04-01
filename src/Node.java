import java.util.LinkedList;
public class Node {
    private int valoare;
    private Node parinte;
    private LinkedList<Node> fii = new LinkedList<>();
    public int getValoare() {
        return valoare;
    }
    public void setValoare(int valoare) {
        this.valoare = valoare;
    }
    public void setParinte(Node parinte) {
        this.parinte = parinte;
    }

    public LinkedList<Node> getFii() {
        return fii;
    }

    public void addFiu(Node fiu){
        fii.add(fiu);
    }
}
