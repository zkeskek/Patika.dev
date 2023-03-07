package java102.BookSorter;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();

        books.add(new Book("Masumiyet Müzesi", 453, "Orhan Pamuk", 1970));
        books.add(new Book("Orman", 538, "Harlan Coben", 1941));
        books.add(new Book("Deliliğe Övgü", 284, "Desiderius Erasmus", 1980));
        books.add(new Book("Felsefenin Tesellisi", 200, "Boethius", 1803));
        books.add(new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", 1899));
        books.add(new Book("İçimzideki Şeytan", 268, "Sabahattin Ali", 2016));
        books.add(new Book("Hayvan Çiftliği", 152, "George Orwell", 2020));
        books.add(new Book("1984", 352, "George Orwell", 2018));
        books.add(new Book("Beyaz Zambaklar Ülkesinde", 140, "Grigory Petrov", 2018));
        books.add(new Book("Zübük", 272, "Aziz Nesin", 2005));
        books.add(new Book("Şeker Portakalı", 183, "José Mauro de Vasconcelos", 1968));
        books.add(new Book("Delifişek", 160, "José Mauro de Vasconcelos", 1960));
        books.add(new Book("Kürk Mantolu Madonna", 177, "Sabahattin Ali", 1943));
        books.add(new Book("Fahrenheit 451", 350, "Ray Bradbury", 1953));

        System.out.println("................Sorted By Book Name............");
        for (Book bk : books) {
            System.out.printf("Book Name :%1$-30s Author Name :%2$-30s Page Number :%3$4s  Publish Date :%4$5s \n",
                    bk.getName(), bk.getAuthorName(),
                    bk.getPageNumber(), bk.getBookPublishDate());
        }

        System.out.println("................Sorted By Page Number............");

        TreeSet<Book> book1 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        book1.addAll(books);

        for (Book bk : book1) {
            System.out.printf("Book Name :%1$-30s Author Name :%2$-30s Page Number :%3$4s  Publish Date :%4$5s \n",
            bk.getName(), bk.getAuthorName(),
            bk.getPageNumber(), bk.getBookPublishDate());        }

        System.out.println("................Sorted By Author Name............");

        TreeSet<Book> book2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthorName().compareTo(o2.getAuthorName());
            }
        });
        book2.addAll(books);
        for (Book bk : book2) {
            System.out.printf("Book Name :%1$-30s Author Name :%2$-30s Page Number :%3$4s  Publish Date :%4$5s \n",
                    bk.getName(), bk.getAuthorName(),
                    bk.getPageNumber(), bk.getBookPublishDate());
        }

        System.out.println("................Sorted By Publish Date............");

        TreeSet<Book> book3 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookPublishDate() - (o2.getBookPublishDate());
            }
        });
        book3.addAll(books);
        for (Book bk : book3) {
            System.out.printf("Book Name :%1$-30s Author Name :%2$-30s Page Number :%3$4s  Publish Date :%4$5s \n",
            bk.getName(), bk.getAuthorName(),
            bk.getPageNumber(), bk.getBookPublishDate());
        }
    }
}
