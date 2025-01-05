package Person;

import Operation.*;

import java.util.Scanner;

public class Administrator extends User {
    public Administrator(String name) {
        super(name);
        iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DeleteOperation(),
                new ShowOperation()
        };
    }

    public int menu() {
        System.out.println("********管理员菜单********");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("************************");
        System.out.println("请输入你的操作：");
        //通过输入来调用对用的功能
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
