package Operation;

import BookRack.BookRack;
import BookRack.Book;
import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookRack bookRack) {
        System.out.println("借阅图书操作进行中......");
        System.out.println("请输入您想借阅的书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        //遍历整个书架
        for (int i = 0; i < bookRack.getUesdSize(); i++) {
            Book tempbook = bookRack.getBooks(i);
            if (name.equals(tempbook.getName())) {
                tempbook.setBorrowed(false);
                System.out.println("归还成功!");
                return;
            }
        }
        System.out.println("没有你要归还的图书："+name);
    }
}
