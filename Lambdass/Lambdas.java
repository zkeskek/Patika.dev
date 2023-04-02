package Lambdass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lambdas {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Çalıkuşu", 125, "Reşat Nuri Güntekin", 2010));
        bookList.add(new Book("Kürk Mantolu Madonna", 160, "Sabahattin Ali", 2022));
        bookList.add(new Book("Şeker Portakalı", 182, "Jose Mauro De Vasconcelos", 2019));
        bookList.add(new Book("1984", 352, "George Orwell", 2019));
        bookList.add(new Book("Kuyucaklı Yusuf", 221, "Sabahattin Ali", 2019));
        bookList.add(new Book("Saatleri Ayarlama Enstitüsü", 382, "Ahmet Hamdi Tanpınar", 2017));
        bookList.add(new Book("Aylak Adam", 156, "Yusuf Atılgan", 2017));
        bookList.add(new Book("Zeytindağı", 176, "Falih Rıfkı Atay", 2013));
        bookList.add(new Book("Gün Olur Asra Bedel", 413, "Cengiz Aytmatov", 2020));
        bookList.add(new Book("Nietzsche Ağladığında", 432, "Irvin D. Yalom", 2022));

        Map<String, String> bookMap = new HashMap<>();
        for (Book bk : bookList) {
            bookMap.put(bk.getBookName(), bk.getAuthorName());
        }

        for (String bm : bookMap.keySet()) {
            System.out.println(bm + "  " + bookMap.get(bm));
        }

        bookList.stream().filter(bkl -> bkl.getPageNumber() > 100)
                .forEach(bkl -> System.out.println(bkl.getBookName() + " " + bkl.getPageNumber()));

       
    }
}
