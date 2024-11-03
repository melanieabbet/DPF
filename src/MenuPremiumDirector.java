import static Enum.TypeDish.DIET;

public class MenuPremiumDirector {
    private final MenuBuilder menuBuilder;

    public MenuPremiumDirector(MenuBuilder menuBuilder) {
        this.menuBuilder = menuBuilder;
    }

    public Menu constructPremiumMenu(){
        menuBuilder.setStarter();
        menuBuilder.setMain();
        menuBuilder.setDessert();
        menuBuilder.setDessert();
        menuBuilder.setDrink();
        menuBuilder.setDrink();
        return menuBuilder.getResult();
    }
}
