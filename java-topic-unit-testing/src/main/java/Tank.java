import java.util.ArrayList;

public class Tank {
    private int numShells;
    private ArrayList<Shell> shellsInTank = new ArrayList<>();

    public void addShell(Shell currentShell){
        shellsInTank.add(Shell);
        this.numShells = shellsInTank.size();
    }

    public Shell pickShell(int number){
        //check if number is valid
        if( (number >= 0) && (number <  shellsInTank.size())) {
            Shell pickedShell = shellsInTank.get(number);
            shellsInTank.remove(number);

            this.numShells--;
            return pickedShell;
        }
        else {
            return null;
        }
    }
}
