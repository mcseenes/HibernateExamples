package com.enes;

import com.enes.controller.AnaController;
import com.enes.controller.KategoriController;
import com.enes.controller.UrunController;
import com.enes.entity.Kategori;

public class Runner {
    public static void main(String[] args) {
        AnaController anaController=new AnaController();
        anaController.secim();
        /*UrunController urunController=new UrunController();
        urunController.add();
        urunController.urunAra();*/

    }
}
