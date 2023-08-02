import java.net.URL;

public class class113 {
    static int field1084 = -1;
    static int field1090 = -2;
    final URL field1085;
    volatile byte[] field1087;
    volatile int field1086;

    class113(URL var1) {
        this.field1086 = field1084;
        this.field1085 = var1;
    }

    public boolean method2200() {
        return field1084 != this.field1086;
    }

    public byte[] method2199() {
        return this.field1087;
    }

    public String method2198() {
        return this.field1085.toString();
    }
}
