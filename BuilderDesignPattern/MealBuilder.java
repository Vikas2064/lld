public interface MealBuilder {
    MealBuilder buildStarter(String starter);
    MealBuilder buildMainCourse(String mainCourse);
    MealBuilder buildDesert(String desert);
    MealBuilder buildDrink(String drink);
    Meal getMeal();
}

