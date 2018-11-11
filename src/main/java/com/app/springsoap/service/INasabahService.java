package com.app.springsoap.service;

import com.app.springsoap.entity.Nasabah;
import com.app.springsoap.repo.NasabahRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class INasabahService implements NasabahService{

    @Autowired
    private NasabahRepo nasabahRepo;

    @Override
    public List<Nasabah> getAllNasabah() {
        return nasabahRepo.findAll();
    }

    @Override
    public Nasabah getNasabahById(Long nasabahId) {
        return null;
    }

    @Override
    public boolean addNasabah(Nasabah nasabah) {
        return false;
    }

    @Override
    public void updateNasabah(Nasabah nasabah) {

    }

    @Override
    public void deleteNasabah(Nasabah nasabah) {

    }
}
