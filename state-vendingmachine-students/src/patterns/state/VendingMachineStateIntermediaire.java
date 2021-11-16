package patterns.state;

public class VendingMachineStateIntermediaire extends VendingMachineState{
    private static VendingMachineState instance;

    public static VendingMachineState getInstance() {
        if (instance == null)
            instance = new VendingMachineStateIntermediaire();
        return instance;
    }

    private VendingMachineStateIntermediaire() {}

    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException {

    }

    @Override
    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {
        c.setCash(c.getCash() - 10);
        //On passe à l'état suivant
    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        c.setCash(c.getCash() - 10);
        //On passe à l'état suivant
    }

    @Override
    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
        return 0;
    }
}
