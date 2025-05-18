public class Main {
    public static void main(String[] args){
        Meal vegMeal=new VegMealBuilder().
                buildDesert("Muffin").
                buildDrink("rum").
                buildMainCourse("chicken wings").
                buildStarter("Roasted chicken").getMeal();
        System.out.println("this is the : "+vegMeal.toString());
    }
}
