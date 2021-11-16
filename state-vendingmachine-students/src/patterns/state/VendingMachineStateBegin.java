package patterns.state;

public class VendingMachineStateBegin extends VendingMachineState{

    private static VendingMachineState instance;

    public static VendingMachineState getInstance() {
        if (instance == null)
            instance = new VendingMachineStateBegin();
        return instance;
    }

    private VendingMachineStateBegin() {}

    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException {
        if(c.getCash() + money < 10)
        {
            //On reste dans le meme état
            c.setCash(c.getCash()+money);
            System.out.println("Pas assez d'argent");
        }
        else
        {
            //On passe a l'état suivant
            c.setCash(c.getCash()+money);
            c.setState(VendingMachineStateIntermediaire.getInstance());
        }
    }

    @Override
    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {

    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {

    }

    @Override
    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
        return 0;
    }
}
