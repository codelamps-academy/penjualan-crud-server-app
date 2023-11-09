package com.codelamps.service;

import com.codelamps.model.Barang;
import com.codelamps.repository.BarangRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 09/11/23
 * Time: 14.43
 * description: penjualan-crud-app
 */

@Service
@RequiredArgsConstructor
public class TransaksiService {

    private final BarangRepository repository;

    public List<Barang> findAll(){
        return repository.findAll();
    }

    public Barang getBarangById(Long id){
        return repository.findById(id).orElse(null);
    }

//    public List<JenisBarang> getJenisBarangByMaxTerjual() {
//        List<JenisBarang> jenisBarangs = new ArrayList<>();
//
//        List<Object[]> results = repository.findBarangByMaxTerjual();
//
//    }
}
