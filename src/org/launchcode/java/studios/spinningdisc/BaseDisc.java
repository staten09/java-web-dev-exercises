package org.launchcode.java.studios.spinningdisc;

import java.lang.constant.Constable;

public abstract class BaseDisc {
    private String name;
    private Integer capacity;
    private String contents;
    private String discType;

    public BaseDisc(String name, Integer capacity, String contents, String discType){
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }

    public String writeData(){
        return "Data is written";
    }

    public String readData(){
        return "Returning data";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}
