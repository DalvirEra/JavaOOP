public class Cat {
    private String name;
    private int appetite;
    private boolean saturation;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.saturation = false;
    }

    public int getAppetite(){
        return this.appetite;
    }

    public void eat(Plate plate) { 
        if(plate.getFood() < this.appetite){
            System.out.printf("%s can't eat - not enough food\n", name);
        }
        else {
            plate.eatenFood(appetite);
            this.appetite = 0;
            this.saturation = true;
        }
    }

    public String displayInfo(){
        return String.format("cat %s - appetite: %d, saturation: %s", name, appetite, saturation);
    }

}
