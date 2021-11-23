package TD6.component;

public class HouseBlend extends Beverage{

    public HouseBlend(String description, double prix)
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
