package behavior.memento.document;

public class Client {
    public static void main(String[] args) {
        Document document = new Document();
        Caretaker caretaker = new Caretaker();


        document.write("✏\uFE0F Hello, ");
        caretaker.push(document.save()); // 📸
        System.out.println(document.getContent());

        document.write("this is Memento pattern");
        System.out.println(document.getContent());

        Memento memento = caretaker.pop();
        if (memento != null){
            document.restore(memento); // ♻️
        }
        System.out.println(document.getContent());

        document.write("This is an example implemented in Java.");
        System.out.println(document.getContent());
    }
}
