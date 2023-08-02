public class class35 extends class65 {
    public boolean field175;
    public byte[] field178;
    public int field176;
    public int field177;
    int field179;

    class35(int var1, byte[] var2, int var3, int var4) {
        this.field176 = var1;
        this.field178 = var2;
        this.field177 = var3;
        this.field179 = var4;
    }

    class35(int var1, byte[] var2, int var3, int var4, boolean var5) {
        this.field176 = var1;
        this.field178 = var2;
        this.field177 = var3;
        this.field179 = var4;
        this.field175 = var5;
    }

    public class35 method523(class62 var1) {
        this.field178 = var1.method1252(this.field178);
        this.field176 = var1.method1245(this.field176);
        if (this.field177 == this.field179) {
            this.field177 = this.field179 = var1.method1248(this.field177);
        } else {
            this.field177 = var1.method1248(this.field177);
            this.field179 = var1.method1248(this.field179);
            if (this.field177 == this.field179) {
                --this.field177;
            }
        }

        return this;
    }
}
