package Operation;
import BookRack.Book;
import BookRack.BookRack;

public class ShowOperation implements IOperation{
    @Override
    public void work(BookRack bookRack) {
        System.out.println("图书列表如下：");
        for (int i = 0; i < bookRack.getUesdSize(); i++) {
            Book tempbook = bookRack.getBooks(i);
            System.out.println(tempbook);
        }
    }
}
