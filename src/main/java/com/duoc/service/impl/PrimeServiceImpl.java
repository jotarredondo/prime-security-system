package com.duoc.service.impl;

import com.duoc.model.PrimeList;
import com.duoc.service.PrimeService;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeServiceImpl implements PrimeService {

    @Override
    public void addManually(PrimeList lista, Scanner sc) {
        System.out.println("Ingrese numero primo para agregar");
        int numero = sc.nextInt();
        try {
            if (!lista.contains(numero)) {
                lista.add(numero);
                System.out.println("Numero " + numero +  " agregado");
            } else {
                System.out.println("El numero " + numero + " ya existe en la lista.");
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    @Override
    public void mostrarPrimes(List<Integer> lista) {
        System.out.println("Lista de Numeros Primos ");
        Collections.sort(lista);
        for(Integer numero : lista) {
            System.out.println(numero);
        }
        System.out.println(" ");
    }

    @Override
    public void mostrarMessageCount(int count) {
        System.out.println("La cantidad de numeros primos en la lista es de : " + count);
    }
}
