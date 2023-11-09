package com.codelamps.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import static jakarta.persistence.GenerationType.AUTO;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 08/11/23
 * Time: 20.23
 * description: penjualan-crud-app
 */

@Data
@Entity
@Table(name = "barang")
public class Barang {

    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;

    @Column(name = "nama_barang")
    @NotNull(message = "nama_barang tidak boleh kosong")
    private String namaBarang;

    @Min(0)
    @Column(name = "stok")
    private int stok;

    @ManyToOne
    @JoinColumn(name = "jenis_barang_id", nullable = false)
    private JenisBarang jenisBarang;
}
