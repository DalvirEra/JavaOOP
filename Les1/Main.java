import java.util.ArrayList;
import java.util.List;

//Создать новый продукт на основе Product, сделать ему хотя одно свойства (например, шоколад и каллории) и включить в список продуктов в вендинг машину.
//Продемонстрировать работу класса по продаже товаров (как мы это делали на уроке).


public class Main {
    public static void main(String[] args) {

        // Product product1 = new Product();
        // //product1.brand = "ООО Источник";
        // //product1.name = "Бутылка с водой";
        // //product1.price = 100.15;

        // System.out.println(product1.displayInfo());

        // Product product2 = new Product("Бутылка с молоком", 120.25);
        // product2.param2 = "..";
        // System.out.println(product2.displayInfo());

        // //product2.price = -60;
        // //product2.name = "______";
        // System.out.println(product2.displayInfo());

        // Product product3 = new Product("ss", "__", 100);
        // System.out.println(product3.displayInfo());
        // product3.setPrice(10);

        
        Product bottleOfWater1 = new BottleOfWater("Бутылка1", 100, 2);
        Product bottleOfMilk1 = new BottleOfMilk("Молоко", 200, 1, 10);
        Product bottleOfWater2 = new BottleOfWater("Бутылка2", 100, 1);
        Product bottleOfWater3 = new BottleOfWater("Бутылка3", 100, 2);
        Product bottleOfWater4 = new BottleOfWater("Бутылка3", 100, 2);
        Product Choco = new Chocolate("Weeee", 100, 999);
        Product Choco2 = new Chocolate("Nestle", 900, 100);
        Product Choco3 = new Chocolate("Huh", 10, 9999);


        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(Choco);
        products.add(Choco2);
        products.add(Choco3);

        VendingMachine vendingMachine = new VendingMachine(products);

        Chocolate ChockChosen = vendingMachine.getChocolate("Huh", 9999);
        if (ChockChosen != null){
            System.out.println("Вы купили: ");
            System.out.println(ChockChosen.displayInfo());
        }
        else {
            System.out.println("Такой шоколадки нет в автомате.");
        }
    


        // BottleOfWater bottleOfWaterRes = vendingMachine.getBottleOfWater("Бутылка2", 1);
        // if (bottleOfWaterRes != null){
        //     System.out.println("Вы купили: ");
        //     System.out.println(bottleOfWaterRes.displayInfo());
        // }
        // else {
        //     System.out.println("Такой бутылки с водой нет в автомате.");
        // }

    }
}