import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, int volume){
        for (Product product: products) {
            if (product instanceof BottleOfWater){
                BottleOfWater bottle = ((BottleOfWater)product);
                if (bottle.name.equals(name) && bottle.getVolume() == volume)
                    return bottle;
            }
        }
        return null;
    }

    public Chocolate getChocolate(String name, int calories){
        for (Product product: products) {
            if (product instanceof Chocolate){
                Chocolate chock = ((Chocolate)product);
                 if (chock.name.equals(name) && chock.getCalories() == calories)
                     return chock;
            }
        }
        return null;
    }


}
