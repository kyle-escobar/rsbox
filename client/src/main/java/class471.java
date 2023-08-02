public class class471 extends class480 {
    double field4818 = 0.0;
    double field4821 = 0.0;
    double field4822 = 0.0;
    double field4823 = 0.0;
    double field4824 = 0.0;
    int field4819 = 0;
    int field4820 = 0;

    public class471(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        super(var9, var10);
        this.field4820 = var3;
        this.field4819 = var6;
        if ((var8 - var2) * (var4 - var7) == (var7 - var1) * (var5 - var8)) {
            this.field4824 = var4;
            this.field4821 = var5;
        } else {
            double var11 = (double) ((float) (var1 + var7)) / 2.0;
            double var13 = (double) ((float) (var8 + var2)) / 2.0;
            double var15 = (double) ((float) (var7 + var4)) / 2.0;
            double var17 = (double) ((float) (var8 + var5)) / 2.0;
            double var19 = (double) (var7 - var1) * -1.0 / (double) (var8 - var2);
            double var21 = (double) (var4 - var7) * -1.0 / (double) (var5 - var8);
            this.field4824 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
            this.field4821 = var13 + (this.field4824 - var11) * var19;
            this.field4822 = Math.sqrt(Math.pow(this.field4824 - (double) var1, 2.0) + Math.pow(this.field4821 - (double) var2, 2.0));
            this.field4823 = Math.atan2((double) var2 - this.field4821, (double) var1 - this.field4824);
            double var23 = Math.atan2((double) var8 - this.field4821, (double) var7 - this.field4824);
            this.field4818 = Math.atan2((double) var5 - this.field4821, (double) var4 - this.field4824);
            boolean var25 = this.field4823 <= var23 && var23 <= this.field4818 || this.field4818 <= var23 && var23 <= this.field4823;
            if (!var25) {
                this.field4818 += Math.PI * (double) (this.field4823 - this.field4818 > 0.0 ? 2 : -2);
            }

        }
    }

    public int method8178() {
        double var2 = this.method8168();
        double var4 = this.field4823 + (this.field4818 - this.field4823) * var2;
        return (int) Math.round(this.field4824 + this.field4822 * Math.cos(var4));
    }

    public int method8175() {
        double var2 = this.method8168();
        double var4 = (this.field4818 - this.field4823) * var2 + this.field4823;
        return (int) Math.round(this.field4821 + this.field4822 * Math.sin(var4));
    }

    public int method8176() {
        double var2 = this.method8168();
        return (int) Math.round((double) this.field4820 + var2 * (double) (this.field4819 - this.field4820));
    }
}
