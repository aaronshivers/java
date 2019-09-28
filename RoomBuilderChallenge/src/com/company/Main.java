package com.company;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("drywall", "blue");
        Wall wall2 = new Wall("drywall", "blue");
        Wall wall3 = new Wall("drywall", "blue");
        Wall wall4 = new Wall("drywall", "blue");

        Floor floor = new Floor("carpet", "green");

        Couch couch = new Couch("leather", "brown", 8);

        Television television = new Television("Sony", "X1234", 50, 35);

        LivingRoom livingRoom = new LivingRoom("Aaron's Living Room", wall1, wall2, wall3, wall4, floor, couch, television);

        livingRoom.getTelevision().activate();
    }
}
