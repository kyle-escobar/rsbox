public class class85 {
    class76[] field768 = new class76[100];
    int field767;

    class85() {
    }

    class76 method1840(int var1, String var2, String var3, String var4) {
        class76 var6 = this.field768[99];

        for (int var7 = this.field767; var7 > 0; --var7) {
            if (var7 != 100) {
                this.field768[var7] = this.field768[var7 - 1];
            }
        }

        if (null == var6) {
            var6 = new class76(var1, var2, var4, var3);
        } else {
            var6.method8116();
            var6.method8161();
            var6.method1555(var1, var2, var4, var3);
        }

        this.field768[0] = var6;
        if (this.field767 < 100) {
            ++this.field767;
        }

        return var6;
    }

    class76 method1828(int var1) {
        return var1 >= 0 && var1 < this.field767 ? this.field768[var1] : null;
    }

    int method1827() {
        return this.field767;
    }
}
