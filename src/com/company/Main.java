package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class kalkulator {
    double a, b, wynik;
    String odp;

    public void wprowadzanie() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj pierwszą liczbę ");
        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj drugą liczbę ");
        b = Double.parseDouble(br.readLine());
    }

    public void obliczenia() {
        Scanner s = new Scanner(System.in);
        System.out.println("+------KALKULATOR------+");
        System.out.println("|(+) Dodaj             |");
        System.out.println("|(-) Odejmij           |");
        System.out.println("|(*) Pomnóż            |");
        System.out.println("|(/) Podziel           |");
        System.out.println("+----------------------+");
        odp = s.nextLine();
        switch (odp) {
            case "+" -> wynik = a + b;
            case "-" -> wynik = a - b;
            case "*" -> wynik = a * b;
            case "/" -> {
                if (b == 0) {
                    System.out.println("Nie dziel przez 0");
                    System.exit(1);
                } else {
                    wynik = a / b;
                }
            }
            default -> System.out.println("Niepoprawna odpowiedź!");
        }
    }

    public void wypisanie() {
        switch (odp) {
            case "+" -> System.out.printf(a + " + " + b + " = " + "%2.0f" ,wynik);
            case "-" -> System.out.println(a + " - " + b + " = " + wynik);
            case "*" -> System.out.println(a + " * " + b + " = " + wynik);
            case "/"  -> System.out.println(a + " / " + b + " = " + wynik);
        }
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        kalkulator kl = new kalkulator();
        kl.wprowadzanie();
        kl.obliczenia();
        kl.wypisanie();
    }
}
