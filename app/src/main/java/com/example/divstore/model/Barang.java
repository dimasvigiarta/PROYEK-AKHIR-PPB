package com.example.divstore.model;

public class Barang {
    private String id, gambar,  name, harga;

    public Barang(){

    }

    public Barang(String gambar, String name, String harga){
        this.gambar = gambar;
        this.name = name;
        this.harga = harga;

    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
