import java.io.UnsupportedEncodingException;

public class TextDocument extends CoreDocument {
    private final String text;
    private final Encoding encoding;

    public TextDocument(String text, Encoding encoding) {
        this.text = text;
        this.encoding = encoding;
    }

    public int getByteSize() {
        try {
            return text.getBytes(encoding.toString()).length;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return 0;
        }
    }
}