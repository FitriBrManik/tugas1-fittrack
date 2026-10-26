/**
 * Class pengujian untuk sistem keanggotaan FitTrack.
 * Membuat beberapa objek Member dan menunjukkan validasi bekerja.
 */
public class TesFitTrack {
    public static void main(String[] args) {

    }
}

// Membuat objek Member dengan constructor lengkap dan tanpa paket
        Member m1 = new Member("Ahmad Dahlan", "081234567890", "10-01-2026", "Basic");
        Member m2 = new Member("Siti Nurhaliza", "085678901234", "12-01-2026", "Premium");
        Member m3 = new Member("Budi Santoso", "089012345678", "15-01-2026", "VIP");
        Member m4 = new Member("Dewi Lestari", "087712345678", "18-01-2026");

        // Sengaja memasukkan data tidak valid untuk menguji pesan penolakan
        Member m5 = new Member("Rudi Tabuti", "12345", "20-01-2026", "SuperVIP");
