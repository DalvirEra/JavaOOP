import java.util.ArrayList;
// ЗАДАНИЕ

//+ Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
//+ Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true. 
//+ Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//+ Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
//+ Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
//  Достаточно выполнить первые 2 подпункта задачи.

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Cat cat1 = new Cat("123", 20);
        Cat cat2 = new Cat("432", 15);
        Cat cat3 = new Cat("Bars",35);
        Cat cat4 = new Cat("Baik", 15);
        Cat cat5 = new Cat("ik", 100);
        Plate plate = new Plate(100);
        ArrayList<Cat> HomeCats = new ArrayList<Cat>();
        HomeCats.add(cat);
        HomeCats.add(cat1);
        HomeCats.add(cat2);
        HomeCats.add(cat3);
        HomeCats.add(cat4);
        HomeCats.add(cat5);
        plate.info();
        for (Cat caty : HomeCats) {
            caty.eat(plate);
            System.out.println(caty.displayInfo());
        }
        plate.info();
        plate.addedFood(100);
        plate.info();
    }
}