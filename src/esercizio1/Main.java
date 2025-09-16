package esercizio1;

import java.util.*;

public class Main {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Inserisci un numero n: ");
            try {
                n = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un NUMERO!");
            }
        }

        System.out.println("Inserisci n parole: ");

        Set<String> setParole = new HashSet<>();
        List<String> listDuplicati = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                System.out.print("Parola n°" + (i + 1) + " : ");
                String parola = scanner.nextLine();

                if(!setParole.contains(parola)) {
                    setParole.add(parola);
                } else {
                    listDuplicati.add(parola);
                    System.out.print("Parola duplicata \n");
                    i--;
                };
            }

        System.out.println("Numero parole distinte: " + setParole.size());
        System.out.println("Elenco parole distinte: ");
        for(String parola : setParole){
            System.out.println(parola);
        }

        if(listDuplicati.isEmpty()){
            System.out.println("Non ci sono duplicati");
        } else {
            System.out.println("Elenco parole dupicate: ");
            Collections.sort(listDuplicati);
            listDuplicati.forEach(System.out::println);
        }
    }
}
