package com.kenzie.app;

import com.kenzie.app.Shell;

import java.util.ArrayList;

public class Tank {
    private int numShells;
    private ArrayList<Shell> shellsInTank = new ArrayList<>();

    public void addShell(Shell currentShell){
        shellsInTank.add(currentShell);
        this.numShells = shellsInTank.size();
    }

    public Shell pickShell(int number){
        //check if number is valid
        Shell pickedShell;

        if( (number >= 0) && (number <  shellsInTank.size())) {
            pickedShell = shellsInTank.get(number);
            shellsInTank.remove(number);
            this.numShells--;
        }
        else {
            pickedShell = null;
        }

        return pickedShell;
    }
}
