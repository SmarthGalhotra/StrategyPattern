public class MainCart {
    public static void main(String [] args){
        ShoppingCart sc = new SmarthsShoppingCart();

        sc.addItem(new Item("Item 1",1),1);
        sc.addItem(new Item("Item 2", 2),2);
        sc.addItem(new Item("Item 3", 3),3);

        sc.displayCartItems();
        sc.displayCartTotal();
        sc.paymentMethod.pay();


    }
}
