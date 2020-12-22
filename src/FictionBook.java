public class FictionBook extends Book implements Discount {

    private String category;
    private double promotionalPrice;

    public FictionBook(){

    }

    public FictionBook(String bookCode, String name, double price, String author, String category, double promotionalPrice) {
        super(bookCode, name, price, author);
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPromotionalPrice() {
        return promotionalPrice;
    }

    public void setPromotionalPrice(double promotionalPrice) {
        this.promotionalPrice = promotionalPrice;
    }

    @Override
    public double setDiscount(double percent) {
        return promotionalPrice = getPrice()*(1-percent);
    }
}
