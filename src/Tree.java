import java.util.LinkedList;

public class Tree {
    private LinkedList<Node> arbore = new LinkedList<>();
    private Node radacina = new Node();
    public Node SEARCHTREE_BYKEY(int indexParinte){
        if(indexParinte < 0)
            return null;
        int index = 0;
        while(index < indexParinte)
            index++;
        return arbore.get(index);
    }
    public void INSERT_NEW(int valoare, int parinte){
        Node nod = new Node();
        nod.setValoare(valoare);
        if(parinte == 0){
            radacina = nod;
        }
        else{
            Node parinteNod = SEARCHTREE_BYKEY(parinte-1);
            nod.setParinte(parinteNod);
            parinteNod.addFiu(nod);
        }
        arbore.add(nod);
    }
    @Override
    public String toString() {
        String sir = "Arborele are valorile: [ ";
        for(Node n : arbore){
            sir += n.getValoare() + " ";
        }
        sir += "], iar valoarea radacinii: " + radacina.getValoare();
        return sir;
    }
    public void afisareFii(){
        for(Node n : arbore){
            System.out.print("Nodul cu valoarea " + n.getValoare() + " are ca fii: ");
            for(Node fiu : n.getFii()){
                System.out.print(fiu.getValoare() + " ");
            }
            System.out.print('\n');
        }
    }

}
