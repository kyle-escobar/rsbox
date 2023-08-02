public class class33 {
    int field164;
    int field166;
    int[] field163;
    int[] field165;

    class33() {
        class57 var1 = class78.field674;
        var1.method1163(16);
        this.field166 = var1.method1164() != 0 ? var1.method1163(4) + 1 : 1;
        if (var1.method1164() != 0) {
            var1.method1163(8);
        }

        var1.method1163(2);
        if (this.field166 > 1) {
            this.field164 = var1.method1163(4);
        }

        this.field163 = new int[this.field166];
        this.field165 = new int[this.field166];

        for (int var2 = 0; var2 < this.field166; ++var2) {
            var1.method1163(8);
            this.field163[var2] = var1.method1163(8);
            this.field165[var2] = var1.method1163(8);
        }

    }
}
