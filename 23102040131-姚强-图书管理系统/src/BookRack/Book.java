package BookRack;

//书籍
public class Book {
    private String name;//书名
    private String author;//作者名
    private int price;//价格
    private String type;//书的类型
    private boolean isBorrowed;//是否已经被借出

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    //构造方法初始化
    public Book(String name, String author, int price, String type) {
        //图书默认没有借出，所以isBorrowed默认false，不需要初始化
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    //方便我们打印整个书籍的全部信息
    @Override
    public String toString() {
        return "Book.Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}

