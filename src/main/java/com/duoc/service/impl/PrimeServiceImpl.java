package com.duoc.service.impl;

import com.duoc.model.PrimeList;
import com.duoc.service.PrimeService;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static com.duoc.constants.AppConstants.*;

public class PrimeServiceImpl implements PrimeService {

    @Override
    public void addManually(PrimeList lista, Scanner sc) {
        System.out.println(MENSAJE1);
        int numero = sc.nextInt();
        try {
            if (!lista.contains(numero)) {
                lista.add(numero);
                System.out.println(MENSAJE2 + numero + MENSAJE3);
            } else {
                System.out.println(MENSAJE4 + numero + MENSAJE5 );
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    @Override
    public void mostrarPrimes(List<Integer> lista) {
        System.out.println(MENSAJE6);
        Collections.sort(lista);
        for(Integer numero : lista) {
            System.out.println(numero);
        }
        System.out.println(" ");
    }

    @Override
    public void mostrarMessageCount(int count) {
        System.out.println(MENSAJE_FINAL + count);
    }
}
