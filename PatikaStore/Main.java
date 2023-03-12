package PatikaStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mobil> cep = new ArrayList<>();
        ArrayList<Notebook> notebook = new ArrayList<>();

        cep.add(new Mobil(1, "SAMSUNG GALAXY A51", 3199, "Samsung", 128, 6.5, 32, 6,4000,  "Siyah"));
        cep.add(new Mobil(2, "iPhone 11 64 GB", 7379, "Apple", 64, 6.1, 16, 6,3046,  "Mavi"));
        cep.add(new Mobil(3, "Redmi Note 10 Pro 8GB", 4012, "Xiaomi", 128, 6.5, 35, 12,4000,  "Beyaz"));

        notebook.add(new Notebook(1, "HUAWEI Matebook 14 ", 7000, "Huawei", 512, 14, 16, 0));
        notebook.add(new Notebook(2, "LENOVO V14 IGL", 3699, "Lenovo", 1024, 14, 8, 0));
        notebook.add(new Notebook(3, "ASUS Tuf Gaming", 8199, "Asus", 2048, 15, 32, 0));

        TreeSet<String> marka = new TreeSet<>();
        marka.add("Samsung");
        marka.add("Lenova");
        marka.add("Apple");
        marka.add("Huawei");
        marka.add("Casper");
        marka.add("Asus");
        marka.add("HP");
        marka.add("Xiaomi");
        marka.add("Monster");
       
        Iterator<String> itr = marka.iterator();
        boolean secim = true;

        while (secim) {
            System.out.println();
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println();
            System.out.println("1- Notebook İşlemleri");
            System.out.println("2- Cep Telefonu İşlemleri");
            System.out.println("3- Marka Listeleme");
            System.out.println("0- Çıkış Yap");
            System.out.println();
            System.out.print("Tercihiniz: ");
            
            try {
                int tercih = input.nextInt();
                System.out.println();
                switch (tercih) {
                    case 0:
                        System.out.println("Mağzadan çıkış yaptınız tekrar bekleriz.");
                        secim = false;
                        break;
                    case 1:
                        notebookEkle(notebook);
                        break;
                    case 2:
                        cepEkle(cep);
                        break;
                    case 3:

                        System.out.println("Markalarımız \n---------------------");

                        for (int i = 0; i < marka.size(); i++) {
                            System.out.println("- " + itr.next());
                        }
                        break;
                }
            } catch (Exception e) {
                System.out.println("Lütfen 0 ile 3 arasında bir sayı giriniz !");
            }
        }
    }

    private static void cepEkle(ArrayList<Mobil> cep) {
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------------");
        System.out.println(
                "| ID  | Ürün Adı                       | Fiyat   | Marka      | Depolama| Ekran   | Kamera  | Pil     | RAM     | Renk    |");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------------");

        for (Mobil cep1 : cep) {

            System.out.printf("| %1$3s | %2$-30s | %3$7s | %4$-10s | %5$7s | %6$7s | %7$7s | %8$7s | %9$7s | %10$7s |\n",
                    cep1.getId(),
                    cep1.getUrunName(), cep1.getBirimfiyat(), cep1.getMarka(), cep1.getDepolama(),
                    cep1.getEkranboyu(), cep1.getKamera(),cep1.getPilGucu(),cep1.getRam(),cep1.getRenk());
        }
        System.out.println(
            "---------------------------------------------------------------------------------------------------------------------------");
        }

    private static void notebookEkle(ArrayList<Notebook> notebook) {

        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        System.out.println(
                "| ID  | Ürün Adı                       | Fiyat      | Marka      | Depolama   | Ekran      | RAM   |");
        System.out.println(
                "----------------------------------------------------------------------------------------------------");

        for (Notebook note : notebook) {

            System.out.printf("| %1$3s | %2$-30s | %3$10s | %4$-10s | %5$10s | %6$10s | %7$5s |\n", note.getId(),
                    note.getUrunName(), note.getBirimfiyat(), note.getMarka(), note.getDepolama(),
                    note.getEkranboyu(), note.getRam());
        }
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
    }
}
