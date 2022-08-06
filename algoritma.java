import java.util.Scanner;

class BelajarJava {
    public static void main(String args[]){

        int  suhu;
        Scanner input = new Scanner(System.in);

        System.out.print("Suhu minimal 21 dan maksimal 25 : ");
        suhu = input.nextByte();

        if ( suhu >= 26 && suhu < 55 ) {
            System.out.println("Suhu telampau tinggi");

        }
        else if ( suhu >= 21 &&  suhu < 26) {
            System.out.println("cocok untuk budidaya");
        }
        else if (suhu >= 10 && suhu < 20) {
            System.out.println("Perbanyak belajar");
        }
        else {
            System.out.println("Terlampau rendah");
        }


        int curah;
        Scanner iinput = new Scanner(System.in);

        System.out.print(" Curah Ujan minimal 208,33 dan maksimal 150 :");
        curah = iinput.nextInt();

        if (curah >= 208.34 && curah < 500 )  {
            System.out.println("tidak ccocok");
        }
        else if (curah >= 150 && curah < 208.33) {
            System.out.println("cocok untuk budidaya");
        }
        else if (curah >= 20 && curah < 149) {
            System.out.println("Terlampau rendah");
        }
        else {
            System.out.println("Maaf, format nilai tidak sesuai");
        }




        int kelembapan;
        Scanner iiinput = new Scanner(System.in);

        System.out.print("  Kelembapan rata-rata minimal 75 dan maksimal 85 :");
        kelembapan = iiinput.nextByte();

        if (kelembapan >= 56 && kelembapan < 70 )  {
            System.out.println(" tidak ccocok");
        }
        else if (kelembapan >= 75 && kelembapan < 86) {
            System.out.println("cocok untuk budidaya");
        }
        else if (kelembapan >= 30 && curah < 60) {
            System.out.println("Terlampau rendah");
        }
        else {
            System.out.println("Maaf, format nilai tidak sesuai");
        }




        int melon;
        Scanner oinput = new Scanner(System.in);

        System.out.print("    Hasil :");
        melon = oinput.nextByte();

        if (melon >= 2 && melon < 4)  {
            System.out.println("cocok untuk budidaya");
        }
        else if (melon >= 1)   {
            System.out.println("tidak cocok untuk budidaya");
        }
        else {
            System.out.println("Maaf, format nilai tidak sesuai");
        }







        int n;

        System.out.print("Mulai Budidaya Melon Pada Bulan Ke : ");
        n = input.nextInt();

        if ( n == 1 ) {
            System.out.println("Budidaya berhasil maka perkiraan panen maret");
        }
        else if ( n == 2) {
            System.out.println("Budidaya tidak berhasil dikarenakan bulan maret dan april cuaca tidak mendukung");
        }
        else if ( n == 3) {
            System.out.println("Budidaya tidak berhasil dikarenakan bulan mei dan juni cuaca tidak mendukung");
        }
        else if ( n == 4) {
            System.out.println("Budidaya berhasil maka perkiraan panen maret");
        }
        else if ( n == 5) {
            System.out.println("Budidaya berhasil maka perkiraan panen juli");
        }
        else if ( n == 6) {
            System.out.println("Budidaya berhasil maka perkiraan panen agustus");
        }
        else if ( n == 7) {
            System.out.println("Budidaya berhasil maka perkiraan panen september");
        }
        else if ( n == 8) {
            System.out.println("Budidaya berhasil maka perkiraan panen oktober");
        }
        else if ( n == 9) {
            System.out.println("Budidaya berhasil maka perkiraan panen November");
        }
        else if ( n == 10) {
            System.out.println("Budidaya berhasil maka perkiraan panen Desember");
        }
        else if ( n == 11) {
            System.out.println("Budidaya berhasil maka perkiraan panen Januari");
        }
        else if ( n == 12) {
            System.out.println("Budidaya berhasil maka perkiraan panen Febuari");
        }
        else {
            System.out.println("Pilihan tidak tersedia");
        }



    }

}