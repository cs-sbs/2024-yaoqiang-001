package Operation;

import BookRack.BookRack;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookRack bookRack) {
        System.out.println("退出系统...");
        System.exit(0);
    }
}
