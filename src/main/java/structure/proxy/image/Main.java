package structure.proxy.image;

// Client code
public class Main {
    public static void main(String[] args) {
        ProxyImage image = new ProxyImage("test_image.jpg");

        System.out.println("File name: " + image.getFileName());
        System.out.println("File extension: " + image.getFileExtension());

        image.display();
        image.display();
    }
}