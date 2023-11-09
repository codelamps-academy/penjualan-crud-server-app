package com.codelamps.repository;

import com.codelamps.model.Barang;
import com.codelamps.model.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 09/11/23
 * Time: 14.39
 * description: penjualan-crud-app
 */
public interface BarangRepository extends JpaRepository<Barang, Long> {
    public Barang findBarangByName(String namaBarang);
    public Transaksi findBarangByTanggal(Date tanggal);

    @Query("SELECT t.namaBarang.jenisBarang, SUM(t.jumlahTerjual)" +
    "FROM Transaksi t " +
    "GROUP BY t.namaBarang.jenisBarang " +
    "ORDER BY SUM(t.jumlahTerjual) DESC")
    List<Object[]> findBarangByMaxTerjual();

    @Query("SELECT t.namaBarang.jenisBarang, SUM (t.jumlahTerjual) " +
    "FROM Transaksi t " +
    "GROUP BY t.namaBarang.jenisBarang " +
    "ORDER BY SUM(t.jumlahTerjual) DESC")
    List<Object[]> findBarangByMinTerjual();
}
