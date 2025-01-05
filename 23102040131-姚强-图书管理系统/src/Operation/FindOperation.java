package Operation;

import BookRack.BookRack;
import BookRack.Book;
import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookRack bookRack) {
        System.out.println("查找图书操作进行中......");
        System.out.println("请输入您想查找的书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int usedSize = bookRack.getUesdSize();

        for (int i = 0; i < bookRack.getUesdSize(); i++) {
            Book temp = bookRack.getBooks(i);
            if (name.equals(temp.getName())) {
                System.out.println("存在这本书，信息如下：");
                System.out.println(temp);
                return;
            }
        }
        System.out.println("没有你要找的这本书，书名为："+ name);
    }
}
