public class Chocolate extends Product {
    int calories;

    public Chocolate(String name, double price, int calories){
        super(name, price);
        this.calories = calories;
    }

    public int getCalories(){
        return calories;
    }


    @Override
    public String displayInfo() {
        return String.format("%s - %s - %f - калории: %d", brand, name, price, calories);
    }

}
