public class menuDietBuilder implements menuBuilder {
    private DietDish dish;
    private LightDrink drink;

    @Override
    public void setStarter(Dish dish) {
        this.dish = (DietDish) dish;
    }
    @Override
    public void setMain() {
    }
    @Override
    public void setDessert() {
    }
    @Override
    public void setDrink() {
    }

    public Menu getResult(){
        return new Menu("DietMenu");
    }
}
