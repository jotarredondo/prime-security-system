package com.duoc.model;


public class PrimeGenerator implements Runnable {

    final private PrimeList primes;

    public PrimeGenerator(PrimeList primes) {
        this.primes = primes;
    }

    @Override
    public void run() {
        for (int i = 2; i <= 100; i++) {
                if (primes.isPrime(i) && !primes.contains(i)) {
                    primes.add(i);
                }
        }
        System.out.println("Numeros primos agregados exitosamente ");
    }
}
