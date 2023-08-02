public class class95 extends class228 {
    static boolean field868;
    static class523[] field878;
    class215 field871;
    int field869;
    int field870;
    int field872;
    int field873;
    int field874;
    int field875;
    int field876;
    int field877;

    class95(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class228 var9) {
        this.field876 = var1;
        this.field869 = var2;
        this.field870 = var3;
        this.field877 = var4;
        this.field872 = var5;
        this.field873 = var6;
        if (var7 != -1) {
            this.field871 = class215.method2582(var7);
            this.field875 = 0;
            this.field874 = Client.field1445 - 1;
            if (this.field871.field2346 == 0 && var9 != null && var9 instanceof class95) {
                class95 var10 = (class95) var9;
                if (this.field871 == var10.field871) {
                    this.field875 = var10.field875;
                    this.field874 = var10.field874;
                    return;
                }
            }

            if (var8 && -1 != this.field871.field2355) {
                if (!this.field871.method4058()) {
                    this.field875 = (int) (Math.random() * (double) this.field871.field2336.length);
                    this.field874 -= (int) (Math.random() * (double) this.field871.field2344[this.field875]);
                } else {
                    this.field875 = (int) (Math.random() * (double) this.field871.method4059());
                }
            }
        }

    }

    protected final class249 method4273() {
        int var3;
        if (this.field871 != null) {
            int var2 = Client.field1445 - this.field874;
            if (var2 > 100 && this.field871.field2355 > 0) {
                var2 = 100;
            }

            if (this.field871.method4058()) {
                var3 = this.field871.method4059();
                this.field875 += var2;
                var2 = 0;
                if (this.field875 >= var3) {
                    this.field875 = var3 - this.field871.field2355;
                    if (this.field875 < 0 || this.field875 > var3) {
                        this.field871 = null;
                    }
                }
            } else {
                label70:
                {
                    do {
                        do {
                            if (var2 <= this.field871.field2344[this.field875]) {
                                break label70;
                            }

                            var2 -= this.field871.field2344[this.field875];
                            ++this.field875;
                        } while (this.field875 < this.field871.field2336.length);

                        this.field875 -= this.field871.field2355;
                    } while (this.field875 >= 0 && this.field875 < this.field871.field2336.length);

                    this.field871 = null;
                }
            }

            this.field874 = Client.field1445 - var2;
        }

        class184 var13 = class98.method2042(this.field876);
        if (var13.field1946 != null) {
            var13 = var13.method3456();
        }

        if (var13 == null) {
            return null;
        } else {
            int var4;
            if (this.field870 != 1 && this.field870 != 3) {
                var3 = var13.field1940;
                var4 = var13.field1944;
            } else {
                var3 = var13.field1944;
                var4 = var13.field1940;
            }

            int var5 = (var3 >> 1) + this.field872;
            int var6 = (var3 + 1 >> 1) + this.field872;
            int var7 = (var4 >> 1) + this.field873;
            int var8 = this.field873 + (var4 + 1 >> 1);
            int[][] var9 = class88.field797[this.field877];
            int var10 = var9[var6][var8] + var9[var5][var8] + var9[var5][var7] + var9[var6][var7] >> 2;
            int var11 = (var3 << 6) + (this.field872 << 7);
            int var12 = (var4 << 6) + (this.field873 << 7);
            return var13.method3454(this.field869, this.field870, var9, var11, var10, var12, this.field871, this.field875);
        }
    }
}
