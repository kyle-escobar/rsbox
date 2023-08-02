public class class267 implements class286 {
    int field2967;
    int field2968;
    int field2969;
    int field2970;
    int field2971;
    int field2972;
    int field2973;
    int field2974;
    int field2975;
    int field2976;
    int field2977;
    int field2978;
    int field2979;
    int field2980;

    class267() {
    }

    public void method5436(class253 var1) {
        if (var1.field2854 > this.field2978) {
            var1.field2854 = this.field2978;
        }

        if (var1.field2855 < this.field2978) {
            var1.field2855 = this.field2978;
        }

        if (var1.field2851 > this.field2974) {
            var1.field2851 = this.field2974;
        }

        if (var1.field2856 < this.field2974) {
            var1.field2856 = this.field2974;
        }

    }

    public boolean method5440(int var1, int var2, int var3) {
        if (var1 >= this.field2972 && var1 < this.field2972 + this.field2971) {
            return var2 >= (this.field2973 << 3) + (this.field2969 << 6) && var2 <= (this.field2975 << 3) + (this.field2969 << 6) + 7 && var3 >= (this.field2970 << 6) + (this.field2979 << 3) && var3 <= (this.field2970 << 6) + (this.field2976 << 3) + 7;
        } else {
            return false;
        }
    }

    public boolean method5437(int var1, int var2) {
        return var1 >= (this.field2978 << 6) + (this.field2977 << 3) && var1 <= (this.field2978 << 6) + (this.field2967 << 3) + 7 && var2 >= (this.field2974 << 6) + (this.field2968 << 3) && var2 <= 7 + (this.field2974 << 6) + (this.field2980 << 3);
    }

    public int[] method5438(int var1, int var2, int var3) {
        if (!this.method5440(var1, var2, var3)) {
            return null;
        } else {
            int[] var5 = new int[]{var2 + (this.field2978 * 64 - this.field2969 * 64) + (this.field2977 * 8 - this.field2973 * 8), var3 + (this.field2974 * 64 - this.field2970 * 64) + (this.field2968 * 8 - this.field2979 * 8)};
            return var5;
        }
    }

    public class330 method5449(int var1, int var2) {
        if (!this.method5437(var1, var2)) {
            return null;
        } else {
            int var4 = this.field2973 * 8 - this.field2977 * 8 + this.field2969 * 64 - this.field2978 * 64 + var1;
            int var5 = var2 + (this.field2970 * 64 - this.field2974 * 64) + (this.field2979 * 8 - this.field2968 * 8);
            return new class330(this.field2972, var4, var5);
        }
    }

    public void method5444(class519 var1) {
        this.field2972 = var1.method8748();
        this.field2971 = var1.method8748();
        this.field2969 = var1.method8750();
        this.field2973 = var1.method8748();
        this.field2975 = var1.method8748();
        this.field2970 = var1.method8750();
        this.field2979 = var1.method8748();
        this.field2976 = var1.method8748();
        this.field2978 = var1.method8750();
        this.field2977 = var1.method8748();
        this.field2967 = var1.method8748();
        this.field2974 = var1.method8750();
        this.field2968 = var1.method8748();
        this.field2980 = var1.method8748();
        this.method5231();
    }

    void method5231() {
    }
}
