package ru.geekbrains;

import java.util.ArrayList;

/**
 Домашняя работа, задача:
 ========================

 a.+ Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 b.+ Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 c.+ Для хранения фруктов внутри коробки можно использовать ArrayList;
 d.+ Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
 вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 e.+ Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
 подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
 Можно сравнивать коробки с яблоками и апельсинами;
 f.+ Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
 Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
 g.+ Не забываем про метод добавления фрукта в коробку.
 */
public class Homework {

    public static void main(String[] args) {
        Box<Apple> apples = new Box<>();
        Box<Orange> oranges = new Box<>();
        Box<Orange> oranges2 = new Box<>();
        System.out.println("");
        Apple Ap1 = new Apple();
        Orange or1 = new Orange();
        Orange or2 = new Orange();
        Orange or3 = new Orange();
        Orange or4 = new Orange();
        apples.addFruit(Ap1);
        oranges.addFruit(or1);
        oranges.addFruit(or2);
        oranges.addFruit(or3);
        oranges2.addFruit(or4);
        System.out.println("Коробка апельсинов 1 равна коробке 2?");
        System.out.println(oranges.compare(oranges2));
        oranges.moveFruits(oranges2);
        System.out.println("кол-во фруктов в первой апельсиновой коробке: ");
        System.out.println(oranges.fruitAmount());
        System.out.println("кол-во фруктов во второй апельсиновой коробке: ");
        System.out.println(oranges2.fruitAmount());
        
    }

}

abstract class Fruit{

    private final float weight;

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }

    
}

class Apple extends Fruit {

    public Apple() {
        super(1.0f);
    }
}

class Orange extends Fruit{

    public Orange(){
        super(1.5f);
    }
}

class Box<T extends Fruit>{

    ArrayList<T> fruits = new ArrayList<>();

    public void addFruit (T fruit){
        fruits.add(fruit);
    }

    public float getWeight(){
        if (fruits.size() > 0){
            return fruits.size() * fruits.get(0).getWeight();
        }
        return 0;
    }

    public int fruitAmount(){
        return fruits.size();
    }

    public void moveFruits(Box<T> o){
        for (T t : fruits) {
            o.addFruit(t);
        }
        fruits.clear();
    }

    public boolean compare(Box<T> o) {
        if (getWeight() == o.getWeight()){
            return true;
        }
        return false;
    }

}
