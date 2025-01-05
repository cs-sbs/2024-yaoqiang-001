package Operation;

import BookRack.BookRack;

//操作接口
public interface IOperation {
    //我们的任何增删查改的操作都是对于书架进行操作的，所以传入的参数是书架类
    void work(BookRack bookRack);
}
