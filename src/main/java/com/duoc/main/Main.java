package com.duoc.main;


public class Main {
    public static void main(String[] args) {
        PrimesList primes = new PrimesList();

        PrimeGenerator generator = new PrimeGenerator(primes);

        primes.add(2);
        primes.add(3);
        primes.add(4);
        primes.add(5);
        primes.add(6);

        System.out.println("Números primos guardados: " + ());
        }
    }
}