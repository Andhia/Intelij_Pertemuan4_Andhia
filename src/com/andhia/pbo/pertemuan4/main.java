package com.andhia.pbo.pertemuan4;

import java.lang.management.ManagementFactory;

public class main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Pegawai pegawai = new Pegawai();

        manager.nip  = 21102317;
        manager.nama = "Andhia";

        pegawai.nip = 123456789;
        pegawai.nama = "Ilyas";

        manager.showinfo();
        manager.extrainfo();
        manager.bonus(1000000);

        pegawai.showinfo();
        pegawai.extrainfo();

    }
}
