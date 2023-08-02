public class class451 {
    static {
        new class451(0.0F, 0.0F, 0.0F);
        new class451(1.0F, 1.0F, 1.0F);
        new class451(1.0F, 0.0F, 0.0F);
        new class451(0.0F, 1.0F, 0.0F);
        new class451(0.0F, 0.0F, 1.0F);
    }

    float field4727;
    float field4728;
    float field4729;

    class451(float var1, float var2, float var3) {
        this.field4729 = var1;
        this.field4728 = var2;
        this.field4727 = var3;
    }

    final float method7884() {
        return (float) Math.sqrt(this.field4729 * this.field4729 + this.field4728 * this.field4728 + this.field4727 * this.field4727);
    }

    public String toString() {
        return this.field4729 + ", " + this.field4728 + ", " + this.field4727;
    }
}
