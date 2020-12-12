import java.util.ArrayList;
import java.util.List;

public abstract class ShoppingCart {
    List<Item> items = new ArrayList<>();
    Payment paymentMethod;

    List<Integer> itemQuantity = new ArrayList<>();

    void addItem(Item item, int quantity){
            items.add(item);
            itemQuantity.add(quantity);
    }

    public void displayCartTotal(){
        System.out.println("Cart Total is " + calculateCartTotal());
    }

    public  void displayCartItems(){
        System.out.println("Item Description | Item Price");
        for(Item item: items){
            System.out.println(""+item.itemDescription + " | " + item.itemPrice);
        }
        System.out.println(" ------- Cart items end ------");
    }

    public double calculateCartTotal(){
        double total =0;
        int counter = 0;
        for(Item item: items){
            total += (item.itemPrice * itemQuantity.get(counter));
            counter++;
        }
        return total;
    }

    public void payCartTotal(){

    }

    public void setPaymentMethod(Payment p){
        paymentMethod = p;
    }
}
