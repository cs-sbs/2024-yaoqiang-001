import BookRack.BookRack;
import Person.Administrator;
import Person.NormalUser;
import Person.User;

import java.util.Scanner;

public class Test {
    public static User login() {
        System.out.println("请输入您的名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("请确认您的身份：");
        System.out.println("1.管理员");
        System.out.println("2.普通用户");
        int choice = scanner.nextInt();
        if (choice == 1) {
            return new Administrator(name);
        }else{
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookRack bookRack = new BookRack();
        User user = login();//向上转型
        while (true) {
            int choice = user.menu();
            user.doOperation(choice, bookRack);
        }
    }
}
