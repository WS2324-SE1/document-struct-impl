public class TestClient {
    public static void main(String[] args) {
        ComplexDocument root = new ComplexDocument();
        root.setId("doc0");

        TextDocument doc2 = new TextDocument("Die Klausur im Fach SE findet bald statt!", Encoding.UTF8);
        doc2.setId("doc2");
        root.addDocument(doc2);

        ComplexDocument doc3 = new ComplexDocument();
        doc3.setId("doc3");
        root.addDocument(doc3);

        TextDocument doc5 = new TextDocument("Software Engineering I ist eine Vorlesung in den Studiengängen BIS und BCS", Encoding.UTF32);
        doc5.setId("doc5");
        doc3.addDocument(doc5);

        GraphicDocument doc4 = new GraphicDocument("localhost:8080");
        doc4.setId("doc4");
        doc3.addDocument(doc4);

        int totalSize = root.getByteSize();
        System.out.println("Total size of the hierarchical document structure: " + totalSize + " bytes");
    }
}
