package com.epum.primisen.chef2.service.ingredient.comparator;

import com.epum.primisen.chef2.service.ingredient.Ingredient;

import java.util.Comparator;

public class CarbohydratesSaladComparator implements Comparator<Ingredient> {

    @Override
    public int compare(Ingredient ingredient1, Ingredient ingredient2){
        return (int) (ingredient1.getCarbohydrates() - ingredient2.getCarbohydrates());
    }
}
