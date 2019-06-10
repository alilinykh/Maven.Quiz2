package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer inputInt;
    public WuTangConcatenator(Integer input) {
        this.inputInt = input;
    }

    public Boolean isWu() {
        if ((inputInt % 3) == 0) {
            return true;
        }
        else {
            return false;}
    }

    public Boolean isTang() {

        if ((inputInt % 5) == 0) {
            return true;
        }
        else {
            return false;}
    }

    public Boolean isWuTang() {

        if (((inputInt % 3) == 0) && ((inputInt % 5) == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
