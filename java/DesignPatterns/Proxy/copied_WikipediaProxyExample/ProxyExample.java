interface Image {
    public void displayImage();
}

//on System A 
class RealImage implements Image {

    private String filename = null;

    public RealImage(final String filename) { 
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    public void displayImage() { 
        System.out.println("Displaying " + filename); 
    }
}

//on System B 
class ProxyImage implements Image {

    private RealImage image = null;
    private String filename = null;

    public ProxyImage(final String filename) { 
        this.filename = filename; 
    }

    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        } 
        image.displayImage();
    }
}
 
class ProxyExample {
   public static void main(String[] args) {
        final Image IMAGE1 = new ProxyImage("HiRes_10MB_Photo1");
        final Image IMAGE2 = new ProxyImage("HiRes_10MB_Photo2");
        
        IMAGE1.displayImage(); // loading necessary
        IMAGE1.displayImage(); // loading unnecessary
        IMAGE2.displayImage(); // loading necessary
        IMAGE2.displayImage(); // loading unnecessary
        IMAGE1.displayImage(); // loading unnecessary
    }

}

/*

    Source: https://en.wikipedia.org/wiki/Proxy_pattern#Java

    Notes:

    A proxy may hide information about the real object to the client.
    A proxy may perform optimization like on demand loading.
    A proxy may do additional house-keeping job like audit tasks.
    Proxy design pattern is also known as surrogate design pattern.

*/