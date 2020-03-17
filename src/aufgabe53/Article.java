package aufgabe53;

public class Article {
    private int artNumber;
    private String designation;
    private int price;

    public Article(int artNumber, String designation, int price) {
        this.artNumber = artNumber;
        this.designation = designation;
        this.price = price;
    }

    public int getArtNumber() {
        return artNumber;
    }

    public void setArtNumber(int artNumber) {
        this.artNumber = artNumber;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Article{" +
                "artNumber=" + artNumber +
                ", designation='" + designation + '\'' +
                ", price=" + price +
                '}';
    }
}
