package com.dhz.design_pattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 22:00
 */
public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
