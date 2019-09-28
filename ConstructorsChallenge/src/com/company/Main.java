package com.company;

public class Main {

    public static void main(String[] args) {
//        Account franksAccount = new Account("1234", 50.00, "Frank", "frank@email.com", "123456789");
//        franksAccount.depositFunds(10.50);
//        System.out.println(franksAccount.getBalance());
//        franksAccount.withdrawalFunds(5.25);
//        System.out.println(franksAccount.getBalance());
//        System.out.println(franksAccount.getNumber());
//        System.out.println(franksAccount.getEmailAddress());
//        System.out.println(franksAccount.getPhoneNumber());
//        System.out.println(franksAccount.getCustomerName());
//        franksAccount.withdrawalFunds(700);
//
//        Account jerrysAccount = new Account("Jerry", "jerry@email.com", "12341234");
//        System.out.println(jerrysAccount.getNumber() + " name " + jerrysAccount.getCustomerName());

        VIPCustomer vip = new VIPCustomer();
        System.out.println("name: " + vip.getName() + " email: " + vip.getEmailAddress() + " credit limit: " + vip.getCreditLimit());

        VIPCustomer bob = new VIPCustomer("Bob", 75);
        System.out.println("name: " + bob.getName() + " email: " + bob.getEmailAddress() + " credit limit: " + bob.getCreditLimit());

        VIPCustomer harry = new VIPCustomer("Harry", 50, "harry@email.com");
        System.out.println("name: " + harry.getName() + " email: " + harry.getEmailAddress() + " credit limit: " + harry.getCreditLimit());
    }
}
