package lesson1;
public class hw1 {
    public static void main(String[] args){
    byte b1 = 12;
    byte b2 = 014;
    byte b3 = 0b1100;
    byte b4 = 0xC;

    System.out.println(b4);
    System.out.println(b3);
    System.out.println(b2);
    System.out.println(b1);

    short s1 = -1300;
    short s2 = -02424;
    short s3 = -0b010100010100;
    short s4 = -0x514;

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);

    int i1 = 0;
    int i2 = 00;
    int i3 = 0b0;
    int i4 = 0x0;

    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3);
    System.out.println(i4);

    long l1 = 123456789;
    long l2 = 0726746425;
    long l3 = 0b0111010110111100110100010101;
    long l4 = 0x75bcd15;

    System.out.println(l1);
    System.out.println(l2);
    System.out.println(l3);
    System.out.println(l4);

    float f1 = 3.14f;
    float f2 = 20.20F;

    System.out.println(f1);
    System.out.println(f2);

    double d1 = 3.33;
    double d2 = 23.31;

    System.out.println(d1);
    System.out.println(d2);

    boolean bool1 = true;
    boolean bool2 = false;

    System.out.println(bool1);
    System.out.println(bool2);
    char c1 = 's';
    char c2 = '2';
    char c3 = ' ';
    char c4 = '\u1234';
    char c5 = 1234;

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
}
}