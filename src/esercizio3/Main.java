package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static  void main(String[] args) {

        Contatto meMedesima = new Contatto("Me", 32206666L);
        Contatto zioFranco = new Contatto("Frank", 32556666L);
        Contatto ammorMi = new Contatto("Faustino", 34555666L);

        Map<String, Long> rubrica = new HashMap<>();
        rubrica.put(meMedesima.getNome(), meMedesima.getNumero());
        rubrica.put(ammorMi.getNome(), ammorMi.getNumero());
        aggiungereContatto(rubrica, zioFranco);

        deletareContatto(rubrica, "Me");

        System.out.println(cercareNome(rubrica, 34555666L));
        System.out.println(cercareNumero(rubrica, "Frank"));


    }
    public static void aggiungereContatto(Map<String, Long> r, Contatto x){
        r.put(x.getNome(), x.getNumero());
    }
    public  static  void  deletareContatto(Map<String, Long> r, String nome){
        if(r.containsKey(nome)){
            r.remove(nome);
            System.out.println("Contatto rimosso: " +nome);
        } else {
            System.out.println("Non esiste nessun contatto " +nome);
        }
    }
    public static String cercareNome(Map<String, Long> r, long numero) {
        for (String nome : r.keySet()) {
            if (r.get(nome) == numero) {
                return nome;
            }
        }
        return "Nessun contatto trovato";
    } 
    public static Long cercareNumero(Map<String, Long> r, String nome) {
        if (r.containsKey(nome)) {
            return r.get(nome);
        } else {
            System.out.println("Nessun contatto trovato");
            return null ;
        }
    }
    }
