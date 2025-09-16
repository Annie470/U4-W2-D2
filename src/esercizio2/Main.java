package esercizio2;

import java.util.*;

public class Main {
    public static  void main(String[] args) {

        ArrayList<Integer> lista = creareTotNumCasuali(5);
        Collections.sort(lista);
        ArrayList<Integer> lista2 = new ArrayList<>(lista);
        Collections.reverse(lista2);
        System.out.println(creareListeSpecchiate(lista, lista2));

    }
    public static ArrayList<Integer> creareTotNumCasuali( int n){
        Random rndm = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lista.add(rndm.nextInt(101));
        }
        return lista;
    }

    public static ArrayList<Integer> creareListeSpecchiate(ArrayList<Integer> lista, ArrayList<Integer> lista2){
        ArrayList<Integer> lista3 = new ArrayList<>();
        lista3.addAll(lista);
        lista3.addAll(lista2);
        return lista3;
    }

    }
