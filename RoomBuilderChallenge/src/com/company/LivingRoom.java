package com.company;

public class LivingRoom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Floor floor;
    private Couch couch;
    private Television television;

    public LivingRoom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Floor floor, Couch couch, Television television) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.floor = floor;
        this.couch = couch;
        this.television = television;
    }

    public Couch getCouch() {
        return couch;
    }

    public void activate() {
        System.out.println("LivingRoom -> Television");
        television.activate();
    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Floor getFloor() {
        return floor;
    }

    public Television getTelevision() {
        return television;
    }
}
