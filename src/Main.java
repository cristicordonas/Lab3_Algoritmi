import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //EXERCITIU 1
        File file = new File("muchii.txt");
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        int[][] matriceAdiacenta = new int[7][7];
        int noduri = 6;
        for (String s : list) {
            String[] muchii = s.split(" ");
            matriceAdiacenta[Integer.parseInt(muchii[0])][Integer.parseInt(muchii[1])] = 1;
        }
        System.out.println("Matricea de adiacenta este: ");
        for(int i=1;i<=noduri;i++) {
            for(int j =1;j<=noduri;j++){
                System.out.print(matriceAdiacenta[i][j] + " ");
            }
            System.out.print('\n');
        }
        System.out.println();
        ArrayList<LinkedList<Integer>> listaAdiacenta = new ArrayList<>();
        for(int i=0;i<=noduri;i++){
            listaAdiacenta.add(new LinkedList<>());
        }
        for (String s : list) {
            String[] muchii = s.split(" ");
            listaAdiacenta.get(Integer.parseInt(muchii[0])).add(Integer.parseInt(muchii[1]));
        }
        System.out.println("Lista de adiacenta este: ");
        for(int i=1;i<=noduri;i++){
            System.out.println("Nodul " + i + " are muchii cu: " + listaAdiacenta.get(i));
        }
        System.out.println();
        //EXERCITIU 2
        Map<Integer,Integer> arbore = new LinkedHashMap<>();
        file = new File("arbore.txt");
        ArrayList<String> listArbore = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                listArbore.add(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        for (String s : listArbore) {
            String[] valori = s.split(" ");
            arbore.put(Integer.parseInt(valori[1]),Integer.parseInt(valori[0]));
        }
        int nod = 1;
        for(Map.Entry<Integer,Integer> entry : arbore.entrySet()){
            System.out.println("Nodul " + nod + " are tatal: " + entry.getValue() + " si valoarea: " + entry.getKey());
            nod++;
        }
        System.out.println();
        //EXERCITIU 3 
        Tree tree = new Tree();
        for (String s : listArbore) {
            String[] valori = s.split(" ");
            tree.INSERT_NEW(Integer.parseInt(valori[1]),Integer.parseInt(valori[0]));
        }
        System.out.println(tree);
        tree.afisareFii();
    }
}
