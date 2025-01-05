package Operation;

import BookRack.BookRack;
import BookRack.Book;
import java.util.Scanner;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookRack bookRack) {
        System.out.println("借阅图书操作进行中......");
        System.out.println("请输入您想借阅的书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        //遍历整个书架
        for (int i = 0; i < bookRack.getUesdSize(); i++) {

            Book temp = bookRack.getBooks(i);
            if (name.equals(temp.getName())) {
                temp.setBorrowed(true);
                System.out.println("借阅成功!");
                return;
            }
        }
        System.out.println("没有查询到您想要借阅的图书，请重新尝试！");
    }
}
