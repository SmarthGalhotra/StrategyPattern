public class PayWithDebitCard implements  Payment{
    @Override
    public void pay() {
        System.out.println("Paying with debit card");
    }
}
