public class class453 {
    static String field4738;
    public int field4739;
    public int field4740;
    public int field4741;
    public int field4742;

    public class453(int var1, int var2) {
        this(0, 0, var1, var2);
    }

    public class453(int var1, int var2, int var3, int var4) {
        this.method7915(var1, var2);
        this.method7916(var3, var4);
    }

    public void method7915(int var1, int var2) {
        this.field4741 = var1;
        this.field4739 = var2;
    }

    public void method7916(int var1, int var2) {
        this.field4742 = var1;
        this.field4740 = var2;
    }

    public boolean method7938(int var1, int var2) {
        return var1 >= this.field4741 && var1 < this.field4741 + this.field4742 && var2 >= this.field4739 && var2 < this.field4740 + this.field4739;
    }

    public String toString() {
        return null;
    }

    public void method7928(class453 var1, class453 var2) {
        this.method7932(var1, var2);
        this.method7919(var1, var2);
    }

    void method7932(class453 var1, class453 var2) {
        var2.field4741 = this.field4741;
        var2.field4742 = this.field4742;
        if (this.field4741 < var1.field4741) {
            var2.field4742 = (var2.field4742 * 1322732417 - (var1.field4741 * 1322732417 - this.field4741 * 1322732417)) * 1200419969;
            var2.field4741 = var1.field4741;
        }

        if (var2.method7920() > var1.method7920()) {
            var2.field4742 -= var2.method7920() - var1.method7920();
        }

        if (var2.field4742 < 0) {
            var2.field4742 = 0;
        }

    }

    void method7919(class453 var1, class453 var2) {
        var2.field4739 = this.field4739;
        var2.field4740 = this.field4740;
        if (this.field4739 < var1.field4739) {
            var2.field4740 = (var2.field4740 * 1916255941 - (var1.field4739 * 1916255941 - this.field4739 * 1916255941)) * 1043533837;
            var2.field4739 = var1.field4739;
        }

        if (var2.method7921() > var1.method7921()) {
            var2.field4740 -= var2.method7921() - var1.method7921();
        }

        if (var2.field4740 < 0) {
            var2.field4740 = 0;
        }

    }

    int method7920() {
        return this.field4742 + this.field4741;
    }

    int method7921() {
        return this.field4740 + this.field4739;
    }
}
