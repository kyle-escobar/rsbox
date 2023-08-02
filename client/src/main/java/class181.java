public class class181 extends class188 {
    long field1881 = System.nanoTime();

    public void method3588() {
        this.field1881 = System.nanoTime();
    }

    public int method3590(int var1, int var2) {
        long var4 = 1000000L * (long) var2;
        long var6 = this.field1881 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }

        class292.method354(var6 / 1000000L);
        long var8 = System.nanoTime();

        int var10;
        for (var10 = 0; var10 < 10 && (var10 < 1 || this.field1881 < var8); this.field1881 += 1000000L * (long) var1) {
            ++var10;
        }

        if (this.field1881 < var8) {
            this.field1881 = var8;
        }

        return var10;
    }
}
