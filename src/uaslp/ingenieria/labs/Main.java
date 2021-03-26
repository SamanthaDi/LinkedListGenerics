package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.*;

public class Main {

    // Inner classes
    // Outer classes

    public static void main(String[] args) {

        int cuenta =  LinkedList.getListsCount();
        // Wrapper classes -> Integer, Float, Character, Boolean
        //Las wrapper classes son "Inmutables"

        List<Integer> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        List<Double> lista3 = new ArrayList<>();

        lista1.add(1);
        lista1.add(7);
        lista1.add(3);
        lista1.add(13);

        lista2.add("hola");
        lista2.add(" soy");
        lista2.add(" un  ");
        lista2.add(" main");

        lista3.add(3.1416);
        lista3.add(54.3858);
        lista3.add(4.851);
        lista3.add(85.675);
        lista3.add(6.278);


        lista1.delete(2);

        System.out.println("---------------------");

        System.out.println("El tamaño es:" + lista1.getSize());

        Iterator<Integer>it = lista1.getIterator();

        while(it.hasNext()){
            int element = it.next();

            System.out.println("Dato: " + element);
        }
        System.out.println("---------------------");
        it = lista1.getReverseIterator();

        while(it.hasNext()){
            int element = it.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        Iterator<String> itStrings = lista2.getIterator();

        while(itStrings.hasNext()){
            System.out.println(itStrings.next());
        }

        System.out.println("---------------------");

        Iterator<Double> it3 = lista3.getIterator();

        it3 = lista3.getIterator();

        while(it3.hasNext()){
            double element = it3.next();

            System.out.println("Dato: " + element);
        }



    }
}