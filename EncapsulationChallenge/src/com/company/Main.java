package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(25, true);
        System.out.println("Toner Level: " + printer.getTonerLevel());
        System.out.println("Pages Printed: " + printer.getPagesPrinted());

        printer.addToner(50);
        System.out.println("Toner Level: " + printer.getTonerLevel());

        int pagesPrinted = printer.printPages(5);
        System.out.println("Pages Printed: " + pagesPrinted);
        System.out.println("Toner Level: " + printer.getTonerLevel());
    }
}
