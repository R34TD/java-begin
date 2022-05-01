public class TypeDataNotPrimitif {
    public static void main(String[] args) {
        Integer Thisint = 100;
        Byte Thisbyte = null;
        System.out.println(Thisbyte);
        Thisbyte = 127;
        System.out.println(Thisbyte);

            int age = 43;
            Integer age2 = age;
            int age3 = age2;

            int a2 = 200;
            Integer a3 = a2;
            short Thisshort = a3.shortValue();
            float Thisfloat = a3.floatValue();
            double Thisdouble = a3.doubleValue();
            long Thislong = a3.longValue();
            byte Thisbyte2 = a3.byteValue();
    }
}
