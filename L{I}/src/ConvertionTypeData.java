public class ConvertionTypeData {
    public static void main(String[] args) {
        byte Thisbyte = 10;
        short Thisshort = Thisbyte;
        int Thisint = Thisshort;

        int Thisint2 = 1000;
        byte Thisbyte2 = (byte) Thisint;
    }
}
