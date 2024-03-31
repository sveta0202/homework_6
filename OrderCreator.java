// Сыоздание новых экземпляров.
public class OrderCreator {
    public Order orderCrator(){
        Prompt prompt = new Prompt();
        String clientName = prompt.prompt("Имя клиента: ");
        String product = prompt.prompt("Продукт: ");
        int qnt = Integer.parseInt(prompt.prompt("Колличество: "));
        int price = Integer.parseInt(prompt.prompt("Цена: "));
        return new Order(clientName, product, qnt, price);

    }
}