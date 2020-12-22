import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
        programmingBooks[0] = new ProgrammingBook("code1", "name1", 300000, "author1", "JAVA", "Codegym");
        programmingBooks[1] = new ProgrammingBook("code2", "name2", 300000, "author2", "JAVA", "Codegym");
        programmingBooks[2] = new ProgrammingBook("code3", "name3", 300000, "author3", "VietNamese", "Codegym");
        programmingBooks[3] = new ProgrammingBook("code4", "name4", 300000, "author4", "VietNamese", "Codegym");
        programmingBooks[4] = new ProgrammingBook("code5", "name5", 300000, "author5", "VietNamese", "Codegym");

        FictionBook[] fictionBooks = new FictionBook[5];
        fictionBooks[0] = new FictionBook("code55", "name55", 200000, "author55", "Ngon tinh 18+", 50000);
        fictionBooks[1] = new FictionBook("code56", "name56", 200000, "author56", "Ngon tinh 18+", 50000);
        fictionBooks[2] = new FictionBook("code57", "name57", 200000, "author57", "Ngon tinh 18+", 50000);
        fictionBooks[3] = new FictionBook("code58", "name58", 200000, "author58", "Ngon tinh 18+", 50000);
        fictionBooks[4] = new FictionBook("code59", "name59", 200000, "author59", "Ngon tinh 18+", 50000);

        Book[] books = new Book[10];
        for (int i = 0; i < programmingBooks.length; i++) {
            books[i] = programmingBooks[i];
        }
        for (int i = 0; i < fictionBooks.length; i++) {
            books[5+i] = fictionBooks[i];
        }
        double sumPrice =0;
        for (int i = 0; i < books.length; i++) {
           sumPrice += books[i].getPrice();
        }
        System.out.println("Tong tien cua 10 cuon sach la: " + sumPrice);

        //so sach trong program co language la JAVA
        int count = 0;
        for (int i = 0; i <programmingBooks.length; i++) {
            if (programmingBooks[i].getLanguage().equals("Ngon tinh 18+")){
                count++;
            }
        }
        System.out.println("so sach co language Ngon Tinh 18+ la:" + count);
        double sumPromotionPrice =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap percent tu [0;1]");
        double percent = sc.nextDouble();
        for (int i = 0; i < fictionBooks.length; i++) {
          sumPromotionPrice +=  fictionBooks[i].setDiscount(percent);
        }
        System.out.println(" a mug xau zai qua"+sumPromotionPrice);
    }
}
