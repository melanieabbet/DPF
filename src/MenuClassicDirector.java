public class MenuClassicDirector implements MenuDirector{
    private final MenuBuilder menuBuilder;

    public MenuClassicDirector(MenuBuilder menuBuilder) {
        this.menuBuilder = menuBuilder;
    }

    public Menu constructMenu(){
        menuBuilder.setStarter();
        menuBuilder.setMain();
        menuBuilder.setDessert();
        menuBuilder.setDrink();
        return menuBuilder.getResult();
    }
}
