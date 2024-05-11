package com.enes.repository;

import com.enes.entity.Kategori;
import com.enes.entity.Urun;
import com.enes.utility.Repository;

public class KategoriRepository extends Repository<Kategori,Long> {
    public KategoriRepository() {
        super(new Kategori());
    }

    public KategoriRepository(Kategori entity) {
        super(entity);
    }
}
