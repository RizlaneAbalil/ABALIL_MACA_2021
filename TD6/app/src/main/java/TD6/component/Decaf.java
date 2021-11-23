package TD6.component;

public class Decaf extends Beverage{

    public Decaf(String description, double prix)
    {
        this.description = description;
        this.prix = prix;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void cost() {

    }
}
