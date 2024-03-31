// Сохранение введённых данных в файл. Выденно в отдельный класс, так как можно было бы сохранить данные 
// в разные форматы (не только Json).
import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {
        public void saveToJson(Order order) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("New Order\n");
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct() +"\",\n");
            writer.write("\"qnt\":"+ order.getQnt() +",\n");
            writer.write("\"price\":"+ order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }  
}