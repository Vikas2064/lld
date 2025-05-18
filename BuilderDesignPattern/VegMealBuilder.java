public class VegMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    public MealBuilder buildStarter(String starter) {
       meal.setStarter(starter);
        return this;
    }

    public MealBuilder buildMainCourse(String mainCourse) {
        meal.setMainCourse(mainCourse);
        return this;
    }

    public MealBuilder buildDesert(String desert) {
        meal.setDesert(desert);
        return this;
    }

    public MealBuilder buildDrink(String drink) {
        meal.setDrink(drink);
        return this;
    }

    public Meal getMeal() {
        return meal;
    }
}

