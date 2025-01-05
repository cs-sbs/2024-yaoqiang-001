package Operation;

import BookRack.BookRack;
import BookRack.Book;
import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookRack bookRack) {
        System.out.println("新增图书操作进行中......");
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入您要添加的图书的书名：");
        String name = scanner.nextLine();
        System.out.println("请输入您要添加的图书的作者名：");
        String author = scanner.nextLine();
        System.out.println("请输入您要添加的图书的价格：");
        int price = scanner.nextInt();
        System.out.println("请输入您要添加的图书的类型：");
        String type = scanner.nextLine();

        //因为我们的每一个书都是一个对象，书架是一个对象数组，我们新加图书的时候就应该新实例化一个对象
        Book book = new Book(name,author,price,type);

        //合法性判断
        int usedSize = bookRack.getUesdSize();//拿到当前书架内放了书的数量
        for (int i = 0; i < usedSize; i++) {
            //遍历书架中的图书挨个对比名字是否相同
            Book tempbook = bookRack.getBooks(i);
            if (tempbook.getName().equals(name)) {
                System.out.println("不能重复添加同一本书，请重试！");
                return;
            }
        }

        //可以添加新的图书
        bookRack.setBooks(book,usedSize);
        bookRack.setUesdSize(usedSize+1);
    }
}
