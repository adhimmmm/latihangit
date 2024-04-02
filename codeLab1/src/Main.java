import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {


        //inputan nama
        System.out.print("masukan nama: ");
        Scanner nama = new Scanner(System.in);
         String namaBaru = nama.nextLine();

        //inputan jenis kelamin
        System.out.print("jenis kelamin(L/P): ");
        Scanner jk = new Scanner(System.in);
        String pilihan = jk.nextLine();

        //cek jenis kelamin user
        if(pilihan.equals("p")) {
            pilihan = "perempuan";
        } else if (pilihan.equals("l")){
            pilihan = "laki-laki";
        } else {
            pilihan = "kamu manusia bukan sih??????";
        }

        //inputan tanggal lahir
        System.out.print("masukan tanggal lahir (yy-mm-dd):");
        Scanner tgl = new Scanner(System.in);
        String tanggal = tgl.nextLine();


        //mengubah string menjadi objek
        LocalDate tanggalLahir = LocalDate.parse(tanggal);

        //mendapatkan tanggal hari ini
        LocalDate hariIni = LocalDate.now();

        //menampilkan umur
        Period umur = Period.between(tanggalLahir, hariIni);


        //menampilkan umur user sekarang
        System.out.println("Nama :" + " " + namaBaru );
        System.out.println("Jenis kelamin :" + " " + pilihan);
        System.out.println("umur anda sekarang = "  + umur.getYears() + " " + "tahun" + " " + umur.getMonths() + " " + "bulan" + " " + umur.getDays() + " " + "hari");

        }
    }