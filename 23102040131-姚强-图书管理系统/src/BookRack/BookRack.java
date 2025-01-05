package BookRack;

//书架
public class BookRack {
    private Book[] books;//存放的所有的书
    private int uesdSize;//书架上已经放的书的数量

    public BookRack() {
        this.books = new Book[10];//默认书架可以放10本书
        this.books[0] = new Book("三国演义","罗贯中",20,"小说");
        this.books[1] = new Book("西游记","吴承恩",9,"小说");
        this.books[2] = new Book("红楼梦","曹雪芹",19,"小说");
        this.uesdSize = 3;//默认书架上有3本书
    }
    //拿到某个位置的书籍
    public Book getBooks(int pos) {
        return books[pos];
    }
    //设置某个位置的书籍
    public void setBooks(Book book,int pos) {
        books[pos] = book;
    }

    public int getUesdSize() {
        return uesdSize;
    }

    public void setUesdSize(int uesdSize) {
        this.uesdSize = uesdSize;
    }
}