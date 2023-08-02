import java.util.Arrays;

public class class216 implements class27 {
    public char field2370;
    public int field2371;
    public int field2372 = 0;
    public int[] field2360 = new int[128];
    boolean[] field2367 = new boolean[112];
    boolean[] field2368 = new boolean[112];
    boolean[] field2369 = new boolean[112];
    char[] field2358 = new char[128];
    int field2359 = 0;
    int field2362 = 0;
    int field2363 = 0;
    int field2364 = 0;
    int[] field2365 = new int[128];
    int[] field2366 = new int[128];

    public boolean method389(int var1) {
        this.method4101(var1);
        this.field2367[var1] = true;
        this.field2368[var1] = true;
        this.field2369[var1] = false;
        this.field2360[++this.field2372 - 1] = var1;
        return true;
    }

    public boolean method380(int var1) {
        this.field2367[var1] = false;
        this.field2368[var1] = false;
        this.field2369[var1] = true;
        this.field2365[++this.field2363 - 1] = var1;
        return true;
    }

    public boolean method381(char var1) {
        int var3 = this.field2359 + 1 & 127;
        if (var3 != this.field2364) {
            this.field2366[this.field2359] = -1;
            this.field2358[this.field2359] = var1;
            this.field2359 = var3;
        }

        return false;
    }

    void method4101(int var1) {
        int var3 = 1 + this.field2359 & 127;
        if (this.field2364 != var3) {
            this.field2366[this.field2359] = var1;
            this.field2358[this.field2359] = 0;
            this.field2359 = var3;
        }

    }

    public boolean method382(boolean var1) {
        return false;
    }

    public void method4118() {
        this.field2364 = this.field2362;
        this.field2362 = this.field2359;
        this.field2372 = 0;
        this.field2363 = 0;
        Arrays.fill(this.field2368, false);
        Arrays.fill(this.field2369, false);
    }

    public final boolean method4109() {
        if (this.field2362 == this.field2364) {
            return false;
        } else {
            this.field2371 = this.field2366[this.field2364];
            this.field2370 = this.field2358[this.field2364];
            this.field2364 = 1 + this.field2364 & 127;
            return true;
        }
    }

    public boolean method4102(int var1) {
        return var1 >= 0 && var1 < 112 && this.field2368[var1];
    }

    public boolean method4103(int var1) {
        return var1 >= 0 && var1 < 112 && this.field2367[var1];
    }

    public boolean method4104(int var1) {
        return var1 >= 0 && var1 < 112 && this.field2369[var1];
    }

    public int[] method4124() {
        int[] var2 = new int[this.field2372];

        System.arraycopy(this.field2360, 0, var2, 0, this.field2372);

        return var2;
    }

    public int[] method4106() {
        int[] var2 = new int[this.field2363];

        System.arraycopy(this.field2365, 0, var2, 0, this.field2363);

        return var2;
    }
}
