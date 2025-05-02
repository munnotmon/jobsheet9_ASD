import java.util.Scanner;

public class SuratMain12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        SuratStack12 stack12 = new SuratStack12(10);
        int pilihan;

        do {
            System.out.println("\n===== MENU SURAT IZIN =====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc12.nextInt();
            sc12.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat              : ");
                    String id = sc12.nextLine();
                    System.out.print("Nama Mahasiswa        : ");
                    String nama = sc12.nextLine();
                    System.out.print("Kelas                 : ");
                    String kelas = sc12.nextLine();
                    System.out.print("Jenis Izin (S/I)      : ");
                    char jenis = sc12.next().charAt(0);
                    System.out.print("Durasi Izin (hari)    : ");
                    int durasi = sc12.nextInt();
                    sc12.nextLine();

                    Surat12 suratBaru = new Surat12(id, nama, kelas, jenis, durasi);
                    stack12.push(suratBaru);
                    break;

                case 2:
                    Surat12 diproses = stack12.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari " + diproses.namaMahasiswa + ", jenis izin: " + diproses.jenisIzin + ", durasi: " + diproses.durasi + " hari");
                    }
                    break;

                case 3:
                    Surat12 terakhir = stack12.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dikumpulkan oleh " + terakhir.namaMahasiswa + " (" + terakhir.idSurat + ")");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = sc12.nextLine();
                    stack12.cariSurat(cariNama);
                    break;

                case 0:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }
}
