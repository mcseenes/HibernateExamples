package com.enes.controller;
import com.enes.entity.Kategori;
import com.enes.entity.Urun;
import com.enes.service.UrunService;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.Scanner;


public class UrunController {
    private final UrunService urunService;

    public UrunController() {
        this.urunService = new UrunService();
    }

    public void add() {
        int secim;
        do {
            System.out.println("""
                    **************************
                    ******** REHBER **********
                    **************************
                                
                    1-KATEGORI EKLE
                    2-KATEGORI LISTELE 
                    3-URUN EKLE
                    4-URUN ARA
                    5-CIKIS
                    """);

            System.out.print("Yapmak istediğiniz işlemi seçiniz...: ");

            secim = new Scanner(System.in).nextInt();
            switch (secim) {
                case 1:
                    System.out.println(" --- LISTELEME ---");
                    list(new Urun());
                    break;
                case 2:
                    System.out.println(" --- ARAMA YAPMA ---");
                    urunAra();
                    break;
                case 3:
                    System.out.println(" --- EKLEME ---");
                    register();
                    break;

                case 4:
                    System.out.println("CIKIS YAPILDI");
                    break;
                default:
                    System.out.println("HATALI BIR GIRIS YAPILDI LUTFEN TEKRAR SECIM YAPINIZ");
                    break;
            }
        } while (secim != 4);
    }
    public void list(Urun urun)
    {

        urunService.urunList();
    }
    public void register() {
        System.out.println("""
                ************************************
                ************** EKLE **************
                ************************************
                """);
        System.out.print("KATEGORI ID...........: ");
        int kategoriid = new Scanner(System.in).nextInt();
        System.out.print("URUN ADI..............: ");
        String ad = new Scanner(System.in).nextLine();
        System.out.print("FIYAT ........: ");
        Double fiyat = new Scanner(System.in).nextDouble();
        System.out.print("ACIKLAMA ........: ");
        String aciklama = new Scanner(System.in).nextLine();
        System.out.print("STOK ........: ");
        int stok = new Scanner(System.in).nextInt();

        urunService.addUrun(Urun.builder()
                .kategoriId(kategoriid)
                .ad(ad)
                .fiyat(fiyat)
                .aciklama(aciklama)
                .stok(stok)
                .build());
    }
    public void urunAra() {
        System.out.println("""
                ***********************************************
                    Aramak istediginiz urunun adini yaziniz
                ***********************************************
                """);
        String ad = new Scanner(System.in).nextLine();
        System.out.print("Urun adi ........: ");
        if (ad.length() > 24) {
            System.out.println("Urun adi uzunlugu 24 karakter ile sınırlıdır!");
        } else {
            urunService.urunSorgula(ad);
        }
    }

}

