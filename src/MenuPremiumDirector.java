import static Enum.TypeDish.DIET;

public class MenuPremiumDirector implements MenuDirector {
    private final MenuBuilder menuBuilder;

    public MenuPremiumDirector(MenuBuilder menuBuilder) {
        this.menuBuilder = menuBuilder;
    }

    public Menu constructMenu(){
        menuBuilder.setStarter();
        menuBuilder.setMain();
        menuBuilder.setDessert();
        menuBuilder.setDessert();
        menuBuilder.setDrink();
        menuBuilder.setDrink();
        return menuBuilder.getResult();
    }
}
