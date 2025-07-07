package com.duoc.main;

public class PrimeGenerator implements Runnable {
    private PrimesList primes;

    public PrimeGenerator(PrimesList primes) {
        this.primes = primes;
    }

    @Override
    public void run() {
        for (int i = 2; i <= 100; i++) {
            try {
                primes.add(i);
            } catch (IllegalArgumentException e) {

            }
        }
    }
}
