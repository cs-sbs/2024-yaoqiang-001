package Operation;

import BookRack.BookRack;
import BookRack.Book;
import java.util.Scanner;

public class DeleteOperation implements IOperation{
    @Override
    public void work(BookRack bookRack) {
        System.out.println("删除图书操作进行中......");
        System.out.println("请输入您想删除的书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        //要删除的前提是先找到这本书
        int uesdSize = bookRack.getUesdSize();
        int flag = -1;
        int i = 0;
        for (; i < uesdSize; i++) {
            Book tempbook = bookRack.getBooks(i);
            if (tempbook.getName().equals(name)) {
                //找到这本书
                flag = i;
                break;
            }
        }
        if (i >= uesdSize) {
            System.out.println("查无此书，无法删除");
            return;
        }
        //存在这本书，进行删除，也就是将书架中的书从后向前依次覆盖
        for (int j = flag; j < uesdSize; j++) {
            Book tempbook = bookRack.getBooks(j+1);//拿到 j+1 位置的书
            bookRack.setBooks(tempbook,j);//和 j 位置的书交换
        }
        bookRack.setBooks(null,uesdSize-1);//将最后一个位置的图书置为空
        bookRack.setUesdSize(uesdSize-1);//图书数量减一
        System.out.println("删除成功！");
    }
}