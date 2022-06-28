package com.kenzie.app;

import java.util.Objects;

public class Shell {
    public String type;
    public int numPearls;

    public Shell(){
        this.numPearls = 0;
        this.type = "";
    }

    public Shell(String type){
        this.type = type;
    }

    public void setNumPearls(int numPearls){
        this.numPearls = numPearls;
    }

    public int getNumPearls(){
        return this.numPearls;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    // override   =  overwrite


    @Override
    public boolean equals(Object o) {
        //additional required tests
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Shell shell = (Shell) o;


        //covert to lowercase before comparing
        String sourceType = this.type.toLowerCase();
        String targetType = shell.type.toLowerCase();

        return
                //pearls are equal
                numPearls == shell.numPearls &&

                //type is equal
                Objects.equals(sourceType, targetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, numPearls);
    }
}
