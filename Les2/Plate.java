public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return this.food;
    }

    public void eatenFood(int eaten){
        this.food -= eaten;
    }

    public void addedFood(int fod){
        this.food += fod;
    }

}