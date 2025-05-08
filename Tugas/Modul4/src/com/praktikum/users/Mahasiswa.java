package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    private List<String> laporanBarang;

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
        this.laporanBarang = new ArrayList<>();
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return getNama().equals(inputNama) && getNim().equals(inputNim);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }

    @Override
    public void reportItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Deskripsi Barang: ");
        String deskripsi = scanner.nextLine();
        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasi = scanner.nextLine();

        String laporan = "Nama Barang: " + namaBarang +
                ", Deskripsi: " + deskripsi +
                ", Lokasi: " + lokasi;
        laporanBarang.add(laporan);

        System.out.println(">> Laporan barang berhasil disimpan! <<");
    }

    @Override
    public void viewReportedItems() {
        if (laporanBarang.isEmpty()) {
            System.out.println(">> Belum ada laporan barang. <<");
        } else {
            System.out.println(">> Daftar Laporan Barang <<");
            for (int i = 0; i < laporanBarang.size(); i++) {
                System.out.println((i + 1) + ". " + laporanBarang.get(i));
            }
        }
    }

    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n== Menu Mahasiswa ==");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    System.out.println("Logout...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}