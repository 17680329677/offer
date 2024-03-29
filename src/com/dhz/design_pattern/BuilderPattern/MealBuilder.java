package com.dhz.design_pattern.BuilderPattern;

/**
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 22:01
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
