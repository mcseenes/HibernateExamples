package com.enes.controller;
import com.enes.entity.Kategori;
import com.enes.entity.Urun;
import com.enes.service.KategoriService;
import com.enes.service.UrunService;
import java.util.List;
import java.util.Scanner;

public class KategoriController {
    private final KategoriService kategoriService;

    public KategoriController() {
        this.kategoriService = new KategoriService();
    }

    public void secim() {
        int secim;
        do {
            System.out.println("""
                    **************************
                    ******** KATEGORI ISLEME **********
                    **************************
                                
                    1- LISTELE
                    2- EKLEME 
                    3- KAPAT
                    """);

            System.out.print("Yapmak istediğiniz işlemi seçiniz...: ");

            secim = new Scanner(System.in).nextInt();
            switch (secim) {
                case 1:
                    System.out.println(" --- LISTELEME ---");
                    list(new Kategori());
                    break;
                case 2:

                    System.out.println(" --- EKLEME ---");
                    register();
                    break;

                case 3:
                    System.out.println("CIKIS YAPILDI");
                    break;
                default:
                    System.out.println("HATALI BIR GIRIS YAPILDI LUTFEN TEKRAR SECIM YAPINIZ");
                    break;
            }
        } while (secim != 3);
    }

    public void list(Kategori kategori)
    {

        kategoriService.kategoriList();
    }
    public void register() {
        System.out.println("""
                ************************************
                ************** EKLE **************
                ************************************
                """);
        System.out.print("KATEGORI AD...........: ");
        String kategoriAd = new Scanner(System.in).nextLine();
        kategoriService.addKategori(Kategori.builder()
                .ad(kategoriAd)
                .build());
    }


}
