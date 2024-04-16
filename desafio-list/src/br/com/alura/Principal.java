package br.com.alura;

import br.com.alura.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {

    public static void main(String[] args){

        List<Integer> numeros = new ArrayList<>();
        numeros.add(8);
        numeros.add(25);
        numeros.add(54);
        numeros.add(0);
        Collections.sort(numeros);
        System.out.println("Números ordenados: " + numeros);

        Titulo titulo = new Titulo();
        titulo.setTitulo("Hereditário");

        Titulo titulo2 = new Titulo();
        titulo2.setTitulo("Barbie");

        Titulo titulo3 = new Titulo();
        titulo3.setTitulo("Carros");

        List<Titulo> tituloList = new ArrayList<>();
        tituloList.add(titulo);
        tituloList.add(titulo2);
        tituloList.add(titulo3);

        Collections.sort(tituloList);
        System.out.println("Ordenação de títulos: " + tituloList);

//        List<String> stringList = new ArrayList<>();
        List<String> stringList = new LinkedList<>();
        stringList.add("Alice");
        stringList.add("Roger");
        stringList.add("Laura");
        System.out.println(stringList);

        List<String> listaPolimorfismo = new ArrayList<>();

        listaPolimorfismo = new ArrayList<>();
        listaPolimorfismo.add("Teste 1");
        listaPolimorfismo.add("Teste 2");
        System.out.println("ArrayList: " + listaPolimorfismo);

        listaPolimorfismo = new LinkedList<>();
        listaPolimorfismo.add("Teste 1");
        listaPolimorfismo.add("Teste 2");
        System.out.println("LinkedList: " + listaPolimorfismo);

    }
}
