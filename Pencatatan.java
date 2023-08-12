import java.util.ArrayList;
import java.util.List;

class SistemPencatatan {
    private List<Transaksi> daftarTransaksi;
    private double saldo;

    public SistemPencatatan() {
        daftarTransaksi = new ArrayList<>();
        saldo = 0;
    }

    public void tambahkanPemasukan(String keterangan, double jumlah) {
        daftarTransaksi.add(new Transaksi(keterangan, jumlah, true));
        saldo += jumlah;
    }

    public void tambahkanPengeluaran(String keterangan, double jumlah) {
        daftarTransaksi.add(new Transaksi(keterangan, jumlah, false));
        saldo -= jumlah;
    }

    public void tampilkanTransaksi() {
        System.out.println("Daftar Transaksi:");
        for (Transaksi transaksi : daftarTransaksi) {
            String jenisTransaksi = transaksi.isPemasukan() ? "Pemasukan" : "Pengeluaran";
            System.out.println(jenisTransaksi + " - " + transaksi.getKeterangan() + ": " + transaksi.getJumlah());
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

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
}

class Main {
    public static void main(String[] args) {
        SistemPencatatan sistemKeuangan = new SistemPencatatan();

        sistemKeuangan.tambahkanPemasukan("Gaji Bulan Ini", 3000);
        sistemKeuangan.tambahkanPengeluaran("Beli Makan Siang", 10);
        sistemKeuangan.tambahkanPengeluaran("Beli Bahan Bakar", 50);

        sistemKeuangan.tampilkanTransaksi();

        double saldoAkhir = sistemKeuangan.getSaldo();
        System.out.println("Saldo Akhir: " + saldoAkhir);
    }
}
