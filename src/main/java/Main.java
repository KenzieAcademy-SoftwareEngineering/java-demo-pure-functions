import com.kenzie.app.Shell;
import com.kenzie.app.Tank;

public class Main {

    public static void main(String[] args) {

        Shell oyster1  = new Shell();
        Shell oyster2  = new Shell();

        oyster1.numPearls = 1;
        oyster1.type = "fresh";

        oyster2.numPearls = 1;
        oyster2.type = "fresh";
        
        //Are the two equal? - YES after override .equals()
        System.out.println(oyster1.equals(oyster2));

    }


    //PURE or IMPURE
    public static void takePearls(Shell currentShell) {
        currentShell.numPearls = 0;

    }

    //PURE or IMPURE
    public static Shell stuffShellWithPearls(Shell currentShell, int addNumber){
        Shell tempShell = new Shell("freshwater");

        //get number of pearls in current shell
        int countPearls = currentShell.getNumPearls();

        tempShell.setNumPearls(countPearls + addNumber);

        //if less than zero - update to 0
        if(tempShell.getNumPearls() < 0) {
            tempShell.setNumPearls(0);
        }

        return tempShell;
    }

    //PURE or IMPURE
    public static void fillTank(Tank shopTank, Shell oyster1, Shell oyster2, Shell oyster3){

        shopTank.addShell(oyster1);
        shopTank.addShell(oyster2);
        shopTank.addShell(oyster3);

    }

    //PURE or IMPURE
    //pick a shell and return the number of pearls
    public static int pickAPearl(Tank shopTank, int luckyNumber) {
        int numPearls = 0;
        Shell myOyster = shopTank.pickShell(luckyNumber);

        if(myOyster != null){
            numPearls =  myOyster.getNumPearls();
        }
        else {
            numPearls = 0;
        }

        return numPearls;
    }
}
