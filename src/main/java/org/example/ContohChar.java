package org.example;

public class ContohChar {
    public void testChar() {
        // Deklarasi dan inisialisasi variabel char
        char gender = 'M';
        char grade = 'A';
        char symbol = '#';

        // Menggunakan variabel char dalam pernyataan
        System.out.println("Gender: " + gender);
        System.out.println("Grade: " + grade);
        System.out.println("Symbol: " + symbol);

        // Operasi matematika dengan tipe data char (unicode)
        char letterA = 'A';
        char letterB = (char) (letterA + 1);
        System.out.println("Letter B: " + letterB);
        System.out.println();
    }
    public void testUnicode() {
        // Mencetak karakter dengan kode Unicode
        char euroSymbol = '\u20AC';
        char smileyFace = '\u263A';
        char heartSymbol = '\u2764';

        System.out.println("Euro Symbol: " + euroSymbol);
        System.out.println("Smiley Face: " + smileyFace);
        System.out.println("Heart Symbol: " + heartSymbol);
        System.out.println();

        int unicodeValueEuroSymbol = euroSymbol;

        // Mencetak kode Unicode
        System.out.println("Kode Integer Unicode dari " + euroSymbol + " adalah " + unicodeValueEuroSymbol + " sedangkan unicode nya adalah u" + Integer.toHexString(unicodeValueEuroSymbol) );
        System.out.println();
    }
    public void testgabungChar() {
        // Mencetak karakter dengan kode Unicode
        char a = 'J';
        char b = 'A';
        char c = 'V';
        char d = 'A';

        String strJava = "Java";
        String strBean = "Bean";
        int strJavaLen = strJava.length();

        String myStr = "Hello";

        System.out.println("String char at 0:" + myStr.charAt(0));
        System.out.println("String length :" + myStr.length());
        System.out.println();

        System.out.println("Char concat: : " + a + b + c + d);
        System.out.println("String : " + strJava);
        System.out.println("String concat: " + strJava + ' ' + strBean);
        System.out.println("String length: " + strJavaLen);
        System.out.println();
    }

    public static void main(String[] args) {
        ContohChar ch = new ContohChar();
        ch.testChar();
        ch.testUnicode();
        ch.testgabungChar();
    }
}
