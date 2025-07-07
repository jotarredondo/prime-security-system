package com.duoc.service;

import com.duoc.model.PrimeList;

import java.util.List;
import java.util.Scanner;

public interface PrimeService {

    void addManually(PrimeList lista, Scanner number);
    void mostrarPrimes(List<Integer> lista);
    void mostrarMessageCount(int count);
}
