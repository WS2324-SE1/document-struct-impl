public class GraphicDocument extends CoreDocument {
    private String URL;

    public GraphicDocument(String URL) {
        this.URL = URL;
    }

    public int getByteSize() {
        return 1200; // assuming a constant size
    }
}