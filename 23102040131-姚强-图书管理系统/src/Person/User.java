package Person;

import BookRack.BookRack;
import Operation.IOperation;

public abstract class User {
    protected String name;//姓名
    protected IOperation[] iOperations;//操作接口数组
    public abstract int menu();//菜单

    public User(String name) {
        this.name = name;
    }
    //供用户来选择操作，调用操作接口
    public void doOperation(int choice, BookRack bookRack) {
        IOperation ioperation = iOperations[choice];
        ioperation.work(bookRack);
    }
}
