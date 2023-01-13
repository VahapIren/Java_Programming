package day47_PolimorphismContinue;

public class EncapsulationReview {
    private String bookTitle;
    private final String publishData;

    public EncapsulationReview(String bookTitle, String publishData) {
        setBookTitle(bookTitle);
        this.publishData = publishData;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle==null||bookTitle.isEmpty())
            throw new RuntimeException("Invalid Data");
        this.bookTitle = bookTitle;
    }

    public String getPublishData() {
        return publishData;
    }
}
