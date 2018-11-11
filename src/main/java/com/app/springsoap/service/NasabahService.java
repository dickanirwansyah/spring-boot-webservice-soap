package com.app.springsoap.service;

import com.app.springsoap.entity.Nasabah;

import java.util.List;

public interface NasabahService {

    List<Nasabah> getAllNasabah();
    Nasabah getNasabahById(Long nasabahId);
    boolean addNasabah(Nasabah nasabah);
    void updateNasabah(Nasabah nasabah);
    void deleteNasabah(Nasabah nasabah);
}
