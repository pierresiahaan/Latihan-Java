import java.util.ArrayList;
import java.util.List;

class Transaksi {
    private String keterangan;
    private double jumlah;
    private boolean isPemasukan;

    public Transaksi(String keterangan, double jumlah, boolean isPemasukan) {
        this.keterangan = keterangan;
        this.jumlah = jumlah;
        this.isPemasukan = isPemasukan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public double getJumlah() {
        return jumlah;
    }

    public boolean isPemasukan() {
        return isPemasukan;
    }

    public String toString() {
        return "Transaksi{" +
                "keterangan='" + keterangan + '\'' +
                ", jumlah=" + jumlah +
                ", isPemasukan=" + isPemasukan +
                '}';
    }
}

class SistemPencatatan {
    private List<Transaksi> daftarTransaksi;

    public SistemPencatatan() {
        daftarTransaksi = new ArrayList<>();
    }

    public void tambahkanTransaksi(String keterangan, double jumlah, boolean isPemasukan) {
        Transaksi transaksiBaru = new Transaksi(keterangan, jumlah, isPemasukan);
        daftarTransaksi.add(transaksiBaru);
    }

    public void tampilkanTransaksi() {
        System.out.println("Daftar Transaksi:");
        for (Transaksi transaksi : daftarTransaksi) {
            String jenisTransaksi = transaksi.isPemasukan() ? "Pemasukan" : "Pengeluaran";
            System.out.println(jenisTransaksi + " - " + transaksi.getKeterangan() + ": " + transaksi.getJumlah());
        }
    }

    public double hitungSaldo() {
        double saldo = 0;
        for (Transaksi transaksi : daftarTransaksi) {
            if (transaksi.isPemasukan()) {
                saldo += transaksi.getJumlah();
            } else {
                saldo -= transaksi.getJumlah();
            }
        }
        return saldo;
    }
}

class Main {
    public static void main(String[] args) {
        SistemPencatatan sistemKeuangan = new SistemPencatatan();

        sistemKeuangan.tambahkanTransaksi("Gaji Bulan Ini", 3000, true);
        sistemKeuangan.tambahkanTransaksi("Beli Makan Siang", 10, false);
        sistemKeuangan.tambahkanTransaksi("Beli Bahan Bakar", 50, false);

        sistemKeuangan.tampilkanTransaksi();

        double saldoAkhir = sistemKeuangan.hitungSaldo();
        System.out.println("Saldo Akhir: " + saldoAkhir);
    }
}
