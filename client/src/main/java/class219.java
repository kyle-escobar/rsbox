public class class219 extends class470 {
    class230 field2403;
    int field2400;
    int field2402;
    int[] field2404;
    int[][] field2405;

    public class219(int var1, byte[] var2) {
        this.field2402 = var1;
        class519 var3 = new class519(var2);
        this.field2400 = var3.method8748();
        this.field2404 = new int[this.field2400];
        this.field2405 = new int[this.field2400][];

        int var4;
        for (var4 = 0; var4 < this.field2400; ++var4) {
            this.field2404[var4] = var3.method8748();
        }

        for (var4 = 0; var4 < this.field2400; ++var4) {
            this.field2405[var4] = new int[var3.method8748()];
        }

        for (var4 = 0; var4 < this.field2400; ++var4) {
            for (int var5 = 0; var5 < this.field2405[var4].length; ++var5) {
                this.field2405[var4][var5] = var3.method8748();
            }
        }

        if (var3.field5129 < var3.field5127.length) {
            var4 = var3.method8750();
            if (var4 > 0) {
                this.field2403 = new class230(var3, var4);
            }
        }

    }

    public int method4203() {
        return this.field2400;
    }

    public class230 method4198() {
        return this.field2403;
    }
}
