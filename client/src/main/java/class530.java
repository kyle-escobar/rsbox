public class class530 {
    boolean field5182;
    int field5173;
    int field5174;
    int field5175;
    int field5176;
    int field5178;
    int field5179;
    int field5180 = 0;
    int field5181 = 0;
    int field5183;
    int field5184;
    int field5185;
    int field5186;

    public void method9201(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
        this.field5179 = var1;
        this.field5184 = var2;
        this.field5175 = var3;
        this.field5174 = var4;
        this.field5183 = var5;
        this.field5178 = var6;
        this.field5180 = var7;
        this.field5181 = var8;
        this.field5182 = var9;
    }

    public void method9208(int var1, int var2, int var3, int var4) {
        this.field5176 = var1;
        this.field5173 = var2;
        this.field5185 = var3;
        this.field5186 = var4;
    }

    public void method9199(class410 var1, class393 var2) {
        if (null != var2) {
            int var4 = var2.field4527;
            int var5 = Math.min(this.field5174, (int) ((float) var4 * 0.9F));
            int var6 = var1.method7309(this.field5175);
            int var7 = var1.method7310(this.field5174);
            int var8 = this.field5179 - this.field5183 + var6;
            int var9 = var4 + this.field5184 - this.field5178 + var7;
            class535.method9304(this.field5179, this.field5184, this.field5179 + this.field5175, this.field5184 + this.field5174);
            int var10 = this.field5181;
            int var11 = this.field5180;
            if (var10 > var11) {
                int var12 = var10;
                var10 = var11;
                var11 = var12;
            }

            class405 var22 = var1.method7387(0, var10);
            class405 var13 = var1.method7387(var10, var11);
            class405 var14 = var1.method7387(var11, var1.method7281());
            class405 var15 = var1.method7387(0, this.field5180);
            int var17;
            int var19;
            if (!var13.method7103()) {
                int var16 = var2.field4525 + var2.field4522;

                for (var17 = 0; var17 < var13.method7104(); ++var17) {
                    class416 var18 = var13.method7108(var17);
                    var19 = var18.field4572 + var8;
                    int var20 = var2.method7241(var18.field4573);
                    int var21 = var9 + var18.field4574 - var4;
                    class535.method9231(var19, var21, var20, var16, this.field5186);
                }
            }

            if (!var22.method7103()) {
                var2.method7198(var22, var8, var9, this.field5176, this.field5173, -1);
            }

            if (!var13.method7103()) {
                var2.method7198(var13, var8, var9, this.field5185, this.field5173, -1);
            }

            if (!var14.method7103()) {
                var2.method7198(var14, var8, var9, this.field5176, this.field5173, -1);
            }

            if (this.field5182) {
                class474 var23 = var15.method7107();
                var17 = var8 + (Integer) var23.field4833;
                int var24 = var9 + (Integer) var23.field4831;
                var19 = var24 - var5;
                class535.method9281(var17, var24, var17, var19, this.field5176);
                if (this.field5173 != -1) {
                    class535.method9281(var17 + 1, var24 + 1, var17 + 1, var19 + 1, this.field5173);
                }
            }

        }
    }
}
