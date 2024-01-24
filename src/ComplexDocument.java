import java.util.ArrayList;
import java.util.List;

public class ComplexDocument implements Document {
    private final List<Document> children = new ArrayList<>();
    private String id;

    public void addDocument(Document doc) {
        children.add(doc);
    }

    public void removeDocument(Document doc) {
        children.remove(doc);
    }

    public int getByteSize() {
        int totalSize = 0;
        for (Document doc : children) {
            totalSize += doc.getByteSize();
        }
        return totalSize;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}