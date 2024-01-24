public enum Encoding {
    UTF8("UTF-8"), UTF16("UTF-16"), UTF32("UTF-32");

    private final String encoding;

    Encoding(String encoding) {
        this.encoding = encoding;
    }

    @Override
    public String toString() {
        return encoding;
    }
}