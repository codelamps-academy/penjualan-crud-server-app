package com.codelamps.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

import static jakarta.persistence.GenerationType.AUTO;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 08/11/23
 * Time: 20.27
 * description: penjualan-crud-app
 */

@Data
@Entity
@Table(name = "transaksi")
public class Transaksi {

    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "nama_barang_id", nullable = false)
    private Barang namaBarang;

    @Column(name = "jumlah_terjual")
    private int jumlahTerjual;

    @Column(name = "tanggal_transaksi")
    private Date tanggalTransaksi;

}
