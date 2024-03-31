
public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        SaveToFile saveToFile = new SaveToFile();
        System.out.println("Введите заказ:");
        Order order = new OrderCreator().orderCrator();
        saveToFile.saveToJson(order);
    }

}



