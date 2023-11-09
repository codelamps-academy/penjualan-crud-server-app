package com.codelamps.model;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.GenerationType.AUTO;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 08/11/23
 * Time: 20.25
 * description: penjualan-crud-app
 */

@Data
@Entity
@Table(name = "jenis_barang")
public class JenisBarang {

    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;

    @Column(name = "nama_jenis")
    private String namaJenis;
}
