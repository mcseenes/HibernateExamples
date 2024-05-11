package com.enes.repository;

import com.enes.entity.Kategori;
import com.enes.entity.Urun;
import com.enes.utility.Repository;
import jakarta.persistence.TypedQuery;

import java.util.*;
import java.util.stream.Collectors;

public class UrunRepository  extends Repository<Urun,Long> {
    public UrunRepository() {
        super(new Urun());
    }

    public UrunRepository(Urun entity) {
        super(entity);
    }

    public List<Urun> listUrunFirtsTenByAd(String value) {
        openEntityManager();
        TypedQuery<Urun> typedQuery = getEm().createNamedQuery("Urun.urunAra", Urun.class);
        typedQuery.setParameter("arananKelime", value);
        return typedQuery.getResultList();
}





}
