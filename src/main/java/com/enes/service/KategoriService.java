package com.enes.service;
import com.enes.entity.Kategori;
import com.enes.repository.KategoriRepository;
import java.util.List;

public class KategoriService {
    private final KategoriRepository kategoriRepository;

    public KategoriService() {
        this.kategoriRepository = new KategoriRepository();
    }
    public void addKategori(Kategori kategori) {
        kategoriRepository.save(kategori);
    }
    public List<Kategori> kategoriList() {

        return kategoriRepository.findAll();
    }
}
