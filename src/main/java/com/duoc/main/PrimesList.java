package com.duoc.main;

import java.util.ArrayList;

public class PrimesList extends ArrayList<Integer> {

    public boolean isPrime(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i * i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    @Override
    public boolean add(Integer numero) {
        if (isPrime(numero)) {
            return super.add(numero);
        } else {
            throw new IllegalArgumentException(numero + " No es un número primo");
        }
    }

    @Override

    public Integer remove(int index) {
        return super.remove(index);
    }

    public int getPrimesCount() {
        return this.size();
    }

}
