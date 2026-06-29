interface Image {
    void displayImage();
}

// Real Subject
class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromServer();
    }

    private void loadFromServer() {
        System.out.println("Loading " + fileName + " from remote server...");
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying " + fileName);
    }
}

// Proxyclass
class ProxyImage implements Image {

    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {

        // Lazy Initialization
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        // Cached object is reused
        realImage.displayImage();
    }
}

// Test Class
public class Main {

    public static void main(String[] args) {

        Image image = new ProxyImage("Nature.jpg");

        Image image1 = new ProxyImage("Nature.jpg");

        System.out.println("First Call:");
        image.displayImage();

        System.out.println();

        System.out.println("Second Call:");
        image.displayImage();
        image1.displayImage(); // dispaly's cached image
    }
}