package com.enes.service;

import com.enes.entity.Kategori;
import com.enes.entity.Urun;
import com.enes.repository.UrunRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UrunService {
    private final UrunRepository urunRepository;
    public UrunService() {

            this.urunRepository = new UrunRepository();
    }
    public void addUrun(Urun urun) {
        urunRepository.save(urun);
    }
    public List<Urun> urunList() {

        return urunRepository.findAll();
    }
    public List<Urun> urunSorgula(String urunAdi){
        if (urunAdi.isEmpty()){
            throw new RuntimeException("Urun bulunamadi!");
        }
        return urunRepository.listUrunFirtsTenByAd(urunAdi);
        }


}
