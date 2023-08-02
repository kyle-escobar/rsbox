public class class225 {
    final int field2470;
    final int[] field2468;
    final int[] field2474;
    final int[][] field2469;
    final int[][] field2472;
    int field2471;
    int field2473;

    public class225(int var1, int var2) {
        this.field2472 = new int[var1][var2];
        this.field2469 = new int[var1][var2];
        int var3 = var2 * var1;
        int var4 = class311.method2196(var3 / 4);
        this.field2474 = new int[var4];
        this.field2468 = new int[var4];
        this.field2470 = var4 - 1;
    }

    void method4222() {
        for (int var2 = 0; var2 < this.field2472.length; ++var2) {
            for (int var3 = 0; var3 < this.field2472[var2].length; ++var3) {
                this.field2472[var2][var3] = 0;
                this.field2469[var2][var3] = 99999999;
            }
        }

    }

    void method4223(int var1, int var2) {
        this.field2473 = var1;
        this.field2471 = var2;
    }

    int method4224() {
        return this.field2473;
    }

    int method4247() {
        return this.field2471;
    }

    int method4226() {
        return this.field2472.length;
    }

    int method4227() {
        return this.field2472[0].length;
    }

    int[][] method4228() {
        return this.field2472;
    }

    int[][] method4250() {
        return this.field2469;
    }

    int[] method4230() {
        return this.field2474;
    }

    int[] method4231() {
        return this.field2468;
    }

    int method4232() {
        return this.field2470;
    }
}
