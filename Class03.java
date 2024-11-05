public class Class03 {
    public static void main(String[] args) {
        //zadanie 1
        System.out.println("---Zadanie 1 ---");
        System.out.println("Decymalny: " +14);
        System.out.println("Binarny: " + 0b1110);
        System.out.println("Oktalny: " + 016);
        System.out.println("Hexagonalny: " + 0xE);
        System.out.println("    --- ---");

        //zadanie 2
        //s34310
        System.out.println("---Zadanie 2 ---");
        System.out.println(0x34310);
        System.out.println(0b0011_0101_0011_0001_0000);
        System.out.println("    --- ---");

        //zadanie 3
        System.out.println("---Zadanie 3 ---");
        System.out.println("Binarny: " + 0b10101011);
        System.out.println("Decymalny: " + 171);
        System.out.println("Oktalny: " + 0253);
        System.out.println("Hexagonalny: " + 0xAB);
        System.out.println("    --- ---");
        System.out.println("Oktalny :" + 0131);
        System.out.println("Binarny: " + 0b001011001);
        System.out.println("Decymalny: " + 89);
        System.out.println("Hexagonalny: " + 0x59);
        System.out.println("    --- ---");
        System.out.println("Oktalny :" + 0152);
        System.out.println("Binarny: " + 0b01101010);
        System.out.println("Decymalny: " + 106);
        System.out.println("Hexagonalny: " + 0x6A);
        System.out.println("    --- ---");


        //zadanie 4
        System.out.println("---Zadanie 4 ---");

        Byte byteMinValue = Byte.MIN_VALUE;
        Byte byteMaxValue = Byte.MAX_VALUE;


        System.out.println("Minimalna wartość dla typu byte: " + Integer.toBinaryString(byteMinValue));
        System.out.println("Minimalna wartość dla typu byte (Hex): " + Integer.toHexString(byteMinValue));
        System.out.println("Minimalna wartość dla typu byte (Oct): " + Integer.toOctalString(byteMinValue));
        System.out.println("Maksymalna wartość dla typu byte (Oct): " + Integer.toOctalString(byteMaxValue));
        System.out.println("Maksymalna wartość dla typu byte (Hex): " + Integer.toHexString(byteMaxValue));
        System.out.println("Maksymalna wartość dla typu byte: " + Integer.toBinaryString(byteMaxValue));

        System.out.println("    --- ---");

        //zadanie 5
        System.out.println("---Zadanie 5 ---");
        byte num = -96;
        System.out.println("Decymalna: " + num);
        System.out.println("Binarna: " + ~0b1011111);
        System.out.println("Oktalna: " + ~0137);
        System.out.println("Hexagonalna: " + ~0x5F);
        System.out.println("    --- ---");

        //zadanie 6
        System.out.println("---Zadanie 6 ---");
        System.out.println(0b101 & 0b011);
        System.out.println(0b1100 | 0b101);
        System.out.println(0b0110 ^ 0b011);
        System.out.println(0b10000 >> 0b0010);
        System.out.println(~0b0010);
        System.out.println((0b0101 | 0b0010) & (0b1000 ^ 0b0011));
        System.out.println(0b1010 > 0b0101 ? 0b0011 * 0b0100 : 0b0101 + 0b0110);
        System.out.println("    --- ---");
    }
}
