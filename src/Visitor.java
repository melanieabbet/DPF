public interface Visitor {
    void visitDish(Dish dish);
    void visitDrink(Drink drink);
    void visitMenu(Menu menu);
}
