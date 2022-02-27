package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        REGION region = REGION.OSH;
//        System.out.println(region.getOzgocholor());
//        System.out.println(region.BATKEN.getOzgocholor());
//        System.out.println(region.CHUY.getOzgocholor());
//        System.out.println(region.ISSYKKUL.getOzgocholor());
//        System.out.println(region.NARYN.getOzgocholor());
//        System.out.println(region.TALAS.getOzgocholor());
//        System.out.println(region.DJALALABAD.getOzgocholor());

        Scanner scanner = new Scanner(System.in);
        Days days = Days.valueOf(scanner.next());
        switch (days) {
                case DUISHOMBU -> System.out.println("duishombu java sabagyn okuim");
                case SHEISHEMBI -> System.out.println("anglis sabagy");
                case SHARSHEMBI -> System.out.println("duishombu java sabagyn okuim");
                case BEISHEMBI -> System.out.println("anglis sabagy");
                case JUMA -> System.out.println("duishombu java sabagyn okuim");
                case ISHEMBI -> System.out.println("Dem alysh");

        }
    }
}
