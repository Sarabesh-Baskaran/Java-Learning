//Open/Closed Principle - It opens for Extension but it closed for modification.
//We achieve this principle by using Interfaces or abstract classes using polymorphism.
interface Payment{
    void pay();
}

class UpiPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment through UPI");
    }
}

class CardPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment through Card");
    }
}

//Now creating Service
class PaymentService{
    public void ProcessPayment(Payment payment){
        payment.pay();
    }
}

public class Solid2{
    public static void main(String[] args){
        PaymentService service = new PaymentService();

        Payment upi = new UpiPayment();
        service.ProcessPayment(upi);

        Payment card = new CardPayment();
        service.ProcessPayment(card);
    }
}