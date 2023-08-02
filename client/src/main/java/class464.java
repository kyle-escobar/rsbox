public class class464 {
    static {
        new class464();
    }

    float field4778;
    float field4779;
    float field4780;
    float field4781;
    float field4782;
    float field4783;
    float field4784;
    float field4785;
    float field4786;
    float field4787;
    float field4788;
    float field4789;

    class464() {
        this.method8069();
    }

    void method8069() {
        this.field4789 = 0.0F;
        this.field4788 = 0.0F;
        this.field4784 = 0.0F;
        this.field4778 = 0.0F;
        this.field4785 = 0.0F;
        this.field4782 = 0.0F;
        this.field4787 = 0.0F;
        this.field4780 = 0.0F;
        this.field4779 = 0.0F;
        this.field4786 = 1.0F;
        this.field4781 = 1.0F;
        this.field4783 = 1.0F;
    }

    void method8053(float var1) {
        float var3 = (float) Math.cos(var1);
        float var4 = (float) Math.sin(var1);
        float var5 = this.field4779;
        float var6 = this.field4781;
        float var7 = this.field4778;
        float var8 = this.field4788;
        this.field4779 = var3 * var5 - this.field4780 * var4;
        this.field4780 = this.field4780 * var3 + var5 * var4;
        this.field4781 = var6 * var3 - var4 * this.field4782;
        this.field4782 = this.field4782 * var3 + var4 * var6;
        this.field4778 = var7 * var3 - var4 * this.field4786;
        this.field4786 = var4 * var7 + var3 * this.field4786;
        this.field4788 = var3 * var8 - this.field4789 * var4;
        this.field4789 = this.field4789 * var3 + var4 * var8;
    }

    void method8054(float var1) {
        float var3 = (float) Math.cos(var1);
        float var4 = (float) Math.sin(var1);
        float var5 = this.field4783;
        float var6 = this.field4787;
        float var7 = this.field4785;
        float var8 = this.field4784;
        this.field4783 = var5 * var3 + this.field4780 * var4;
        this.field4780 = var3 * this.field4780 - var4 * var5;
        this.field4787 = var3 * var6 + this.field4782 * var4;
        this.field4782 = this.field4782 * var3 - var6 * var4;
        this.field4785 = this.field4786 * var4 + var3 * var7;
        this.field4786 = var3 * this.field4786 - var4 * var7;
        this.field4784 = var4 * this.field4789 + var8 * var3;
        this.field4789 = var3 * this.field4789 - var4 * var8;
    }

    void method8067(float var1) {
        float var3 = (float) Math.cos(var1);
        float var4 = (float) Math.sin(var1);
        float var5 = this.field4783;
        float var6 = this.field4787;
        float var7 = this.field4785;
        float var8 = this.field4784;
        this.field4783 = var5 * var3 - this.field4779 * var4;
        this.field4779 = var5 * var4 + var3 * this.field4779;
        this.field4787 = var3 * var6 - this.field4781 * var4;
        this.field4781 = this.field4781 * var3 + var6 * var4;
        this.field4785 = var3 * var7 - this.field4778 * var4;
        this.field4778 = var4 * var7 + var3 * this.field4778;
        this.field4784 = var3 * var8 - this.field4788 * var4;
        this.field4788 = var4 * var8 + var3 * this.field4788;
    }

    void method8056(float var1, float var2, float var3) {
        this.field4784 += var1;
        this.field4788 += var2;
        this.field4789 += var3;
    }

    public String toString() {
        return this.field4783 + "," + this.field4787 + "," + this.field4785 + "," + this.field4784 + "\n" + this.field4779 + "," + this.field4781 + "," + this.field4778 + "," + this.field4788 + "\n" + this.field4780 + "," + this.field4782 + "," + this.field4786 + "," + this.field4789;
    }
}
