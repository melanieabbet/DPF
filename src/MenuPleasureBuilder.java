import Enum.TypeMenu;

public class MenuPleasureBuilder implements MenuBuilder {

    private final Menu menu;

    public MenuPleasureBuilder(String name){
        this.menu = new Menu(name, TypeMenu.PLEASURE);
    }
    @Override
    public void setStarter() {
        menu.addProduct(new RichDish("Fish", 18.0));
    }
    @Override
    public void setMain() {
        menu.addProduct(new RichDish("Beefsteak", 14.0));
    }
    @Override
    public void setDessert() {
        menu.addProduct(new RichDish("Cheese", 4.0));
    }
    @Override
    public void setDrink() {
        menu.addProduct(new AlcoolDrink("Beer", 3.0));
    }

    public Menu getResult(){
        return menu;
    }
}
