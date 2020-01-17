package a;

import a.d.StaticImportTest1;

import static a.d.StaticImportTest1.*;

import a.e.StaticImportTest2;

import static a.e.StaticImportTest2.APP_NAME;

public class TestStatic {
    public static void main(String[] args) {
        System.out.println("APP_NAME = " + APP_NAME);

        log("This is StaticImportTest");

        new StaticImportTest1().printUniqueStatement();

        System.out.println("APP_NAME = " + StaticImportTest2.APP_NAME);

        StaticImportTest2.log("This is StaticImportTest");

        new StaticImportTest2().printUniqueStatement();
    }
}
