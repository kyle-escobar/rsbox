public class class330 {
    public int field3581;
    public int field3582;
    public int field3583;

    public class330(int var1, int var2, int var3) {
        this.field3582 = var1;
        this.field3581 = var2;
        this.field3583 = var3;
    }

    public class330(class330 var1) {
        this.field3582 = var1.field3582;
        this.field3581 = var1.field3581;
        this.field3583 = var1.field3583;
    }

    public class330(int var1) {
        if (var1 == -1) {
            this.field3582 = -1;
        } else {
            this.field3582 = var1 >> 28 & 3;
            this.field3581 = var1 >> 14 & 16383;
            this.field3583 = var1 & 16383;
        }

    }

    static int method8197(int var0, int var1, int var2) {
        return var0 << 28 | var1 << 14 | var2;
    }

    public int method6190() {
        return method8197(this.field3582, this.field3581, this.field3583);
    }

    public boolean equals(Object var1) {
        if (var1 == this) {
            return true;
        } else {
            return var1 instanceof class330 && this.method6203((class330) var1);
        }
    }

    boolean method6203(class330 var1) {
        if (this.field3582 != var1.field3582) {
            return false;
        } else if (var1.field3581 != this.field3581) {
            return false;
        } else {
            return this.field3583 == var1.field3583;
        }
    }

    public int hashCode() {
        return this.method6190();
    }

    public String toString() {
        return this.method6192(",");
    }

    String method6192(String var1) {
        return this.field3582 + var1 + (this.field3581 >> 6) + var1 + (this.field3583 >> 6) + var1 + (this.field3581 & 63) + var1 + (this.field3583 & 63);
    }
}
