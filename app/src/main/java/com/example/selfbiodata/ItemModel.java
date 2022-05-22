//Tanggal Pengerjaan : 17-5-2022
//NIM : 10119187
//Nama : Alvin Algadri
//Kelas : IF-5

package com.example.selfbiodata;

public class ItemModel {

    String name, desc;
    int gambar;

    public ItemModel(String name, String desc, int gambar) {
        this.name = name;
        this.desc = desc;
        this.gambar = gambar;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getGambar() {
        return gambar;
    }
}
