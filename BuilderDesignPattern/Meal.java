public class Meal {
    private String starter;
    private String mainCourse;
    private String desert;
    private String drink;

    public void setStarter(String starter) {
        this.starter = starter;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
    @Override
    public String toString() {
        return "Meal {" +
                "\n  Starter: " + starter +
                "\n  Main Course: " + mainCourse +
                "\n  Desert: " + desert +
                "\n  Drink: " + drink +
                "\n}";
    }

}
