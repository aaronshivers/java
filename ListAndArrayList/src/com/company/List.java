package com.company;

import java.util.ArrayList;

public class List {
    private ArrayList<String> list = new ArrayList<String>();

    public void addItem(String item) {
        list.add(item);
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void printList() {
        int listSize = list.size();

        System.out.println("You have " + listSize + " items in your list.");

        for (int i = 0; i < listSize; i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public void modifyItem(String existingItem, String newItem) {
        int index = findItem(existingItem);
        if (index >= 0) modifyItem(index, newItem);
    }

    private void modifyItem(int index, String item) {
        list.set(index, item);
        System.out.println("Item " + (index + 1) + " has been modified.");
    }

    public void removeItem(String item) {
        int index = findItem(item);
        if (index >= 0) removeItem(index);
    }

    private void removeItem(int index) {
        list.remove(index);
    }

    private int findItem(String item) {
        return list.indexOf(item);
    }

    public boolean onFile(String item) {
        return findItem(item) >= 0;
    }
}
