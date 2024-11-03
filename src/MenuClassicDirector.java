public class MenuClassicDirector {
    private final MenuBuilder menuBuilder;

    public MenuClassicDirector(MenuBuilder menuBuilder) {
        this.menuBuilder = menuBuilder;
    }

    public Menu constructClassicMenu(){
        menuBuilder.setStarter();
        menuBuilder.setMain();
        menuBuilder.setDessert();
        menuBuilder.setDrink();
        return menuBuilder.getResult();
    }
}