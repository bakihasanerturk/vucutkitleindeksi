package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double kg,boy,kitleIndeksi;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = input.nextDouble();

        kitleIndeksi = kg/(boy*boy);

        System.out.print("Vücut kitle indeksiniz : " + kitleIndeksi);

    }
}
