package TD6.component;

public class DarkRoast extends Beverage {

    public DarkRoast(String description, double prix)
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
