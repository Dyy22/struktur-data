package org.example;

public class ContohBoolean {
    public void testBoolean(boolean isSunny, boolean isRainy)
    {
        // Penggunaan variabel boolean dalam pernyataan if-else
        if (isSunny) {
            System.out.println("Hari ini cerah!");
        } else {
            System.out.println("Hari ini tidak cerah.");
        }

        if (isRainy) {
            System.out.println("Hari ini hujan.");
        } else {
            System.out.println("Hari ini tidak hujan.");
        }
    }

    public void cekNilaiTuton(int Nilai) {
        int passingGrade = 60;

        // Pernyataan if dengan kondisi boolean dan nilai numerik
        if (Nilai >= 90) {
            System.out.println("Excellent performance!");
        } else if (Nilai >= 71 && Nilai < 90) {
            System.out.println("Good job!");
        } else if (Nilai >= 61 && Nilai < 70) {
            System.out.println("nice job!");
        } else {
            System.out.println("Keep trying, you can do better!");
        }
    }
    public void testKalimatKebenaran() {
        int a = 10;
        int b = 5;

        boolean hasil = !((a <= 15)^(b > 6));

        System.out.println("hasilnya adalah : " + hasil);
    }

    public static void main(String[] args) {
        ContohBoolean be = new ContohBoolean();
        be.testBoolean(false, true);
        be.cekNilaiTuton(98);
        be.testKalimatKebenaran();
    }
}
