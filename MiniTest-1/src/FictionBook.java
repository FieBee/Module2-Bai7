public class FictionBook extends Book{

    private String category;

    FictionBook(){
    }

    FictionBook(int bookCode, String name, int price, String author, String category){
        super(bookCode, name, price,author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
