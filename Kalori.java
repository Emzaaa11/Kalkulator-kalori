import java.util.Scanner;

public class Kalori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Jenis kelamin (L/P): ");
            String jk = sc.next();
            
            if(!jk.equalsIgnoreCase("L") && !jk.equalsIgnoreCase("P")) {
                System.out.println("Input tidak valid! Masukkan L atau P.");
                continue; // kembali ke awal loop
            }

            System.out.print("Berat (kg): ");
            double w = sc.nextDouble();
            System.out.print("Tinggi (cm): ");
            double h = sc.nextDouble();
            System.out.print("Usia: ");
            int age = sc.nextInt();

            double bmr;

            if(jk.equalsIgnoreCase("L")) {
                bmr = 88.36 + (13.4 * w) + (4.8 * h) - (5.7 * age);
            } else {
                bmr = 447.6 + (9.2 * w) + (3.1 * h) - (4.3 * age);
            }

            System.out.println("Kebutuhan kalori per hari: " + bmr);

            System.out.print("Hitung lagi? (y/n): ");
            char ulang = sc.next().charAt(0);

            if(ulang == 'n' || ulang == 'N') {
                System.out.println("Program selesai.");
                break;
            }
        }

        sc.close();
    }
}
