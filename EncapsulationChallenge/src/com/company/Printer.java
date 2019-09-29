package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    Printer(int tonerLevel, boolean isDuplexPrinter) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.pagesPrinted = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int addToner(int toner) {
        if (toner < 0 || toner > 100) return -1;
        if (this.tonerLevel + toner > 100) return -1;

        return this.tonerLevel += toner;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (isDuplexPrinter) {
            System.out.println("Printing in duplex mode...");
            pagesToPrint = (pages / 2) + (pages % 2);
        } else {
            System.out.println("Printing...");
        }

        pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
