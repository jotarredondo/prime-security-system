package com.duoc.main;


import com.duoc.model.PrimeList;
import com.duoc.model.PrimeGenerator;
import com.duoc.service.PrimeService;
import com.duoc.service.impl.PrimeServiceImpl;

import java.util.Scanner;

import static com.duoc.util.Util.mostrarMenu;

public class Main {
    public static void main(String[] args) {

        PrimeList primes = new PrimeList();

        PrimeGenerator primeGenerator = new PrimeGenerator(primes);

        Thread threadPrime = new Thread(primeGenerator);

        PrimeService primeService = new PrimeServiceImpl();


        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> primeService.addManually(primes, sc);
                case 2 -> threadPrime.start();
                case 3 -> primeService.mostrarPrimes(primes);
                case 4 -> primeService.mostrarMessageCount(primes.getPrimesCount());
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida");
            }
        } while (opcion != 5);
        sc.close();
    }
}