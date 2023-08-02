public final class class124 extends class228 {
    static class363 field1182;
    static Client field1180;
    int field1174;
    int field1176 = 31;
    int field1178;

    class124() {
    }

    void method2340(int var1) {
        this.field1176 = var1;
    }

    boolean method2341(int var1) {
        if (var1 >= 0 && var1 <= 4) {
            return 0 != (this.field1176 & 1 << var1);
        } else {
            return true;
        }
    }

    protected class249 method4273() {
        return class185.method2355(this.field1174).method3501(this.field1178);
    }
}
