package com.app.springsoap.repo;

import com.app.springsoap.entity.Nasabah;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NasabahRepo extends JpaRepository<Nasabah, Long> {

    Nasabah findByNasabahId(Long nasabahId);
    List<Nasabah> findByNameAndCategory(String name, String category);

}
