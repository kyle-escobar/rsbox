public final class class74 extends class228 {
    boolean field604 = false;
    class215 field613;
    double field605;
    double field606;
    double field608;
    double field609;
    double field610;
    double field611;
    double field612;
    double field615;
    int field593;
    int field594 = 0;
    int field595;
    int field596;
    int field597;
    int field598;
    int field599;
    int field600;
    int field601;
    int field602;
    int field603;
    int field607;
    int field616;
    int field617 = 0;
    int field618;

    class74(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        this.field607 = var1;
        this.field598 = var2;
        this.field595 = var3;
        this.field596 = var4;
        this.field593 = var5;
        this.field599 = var6;
        this.field600 = var7;
        this.field601 = var8;
        this.field602 = var9;
        this.field603 = var10;
        this.field616 = var11;
        this.field604 = false;
        int var12 = class205.method3634(this.field607).field2204;
        if (var12 != -1) {
            this.field613 = class215.method2582(var12);
        } else {
            this.field613 = null;
        }

    }

    void method1518(int var1, int var2, int var3, int var4) {
        double var6;
        if (!this.field604) {
            var6 = var1 - this.field595;
            double var8 = var2 - this.field596;
            double var10 = Math.sqrt(var8 * var8 + var6 * var6);
            this.field605 = (double) this.field595 + (double) this.field602 * var6 / var10;
            this.field606 = (double) this.field596 + var8 * (double) this.field602 / var10;
            this.field615 = this.field593;
        }

        var6 = 1 + this.field600 - var4;
        this.field608 = ((double) var1 - this.field605) / var6;
        this.field609 = ((double) var2 - this.field606) / var6;
        this.field610 = Math.sqrt(this.field609 * this.field609 + this.field608 * this.field608);
        if (!this.field604) {
            this.field611 = -this.field610 * Math.tan(0.02454369 * (double) this.field601);
        }

        this.field612 = ((double) var3 - this.field615 - var6 * this.field611) * 2.0 / (var6 * var6);
    }

    void method1519(int var1) {
        this.field604 = true;
        this.field605 += this.field608 * (double) var1;
        this.field606 += this.field609 * (double) var1;
        this.field615 += (double) var1 * this.field612 * 0.5 * (double) var1 + (double) var1 * this.field611;
        this.field611 += this.field612 * (double) var1;
        this.field597 = (int) (Math.atan2(this.field608, this.field609) * 325.949) + 1024 & 2047;
        this.field618 = (int) (Math.atan2(this.field611, this.field610) * 325.949) & 2047;
        if (null != this.field613) {
            if (!this.field613.method4058()) {
                this.field617 += var1;

                while (true) {
                    do {
                        do {
                            if (this.field617 <= this.field613.field2344[this.field594]) {
                                return;
                            }

                            this.field617 -= this.field613.field2344[this.field594];
                            ++this.field594;
                        } while (this.field594 < this.field613.field2336.length);

                        this.field594 -= this.field613.field2355;
                    } while (this.field594 >= 0 && this.field594 < this.field613.field2336.length);

                    this.field594 = 0;
                }
            } else {
                this.field594 += var1;
                int var3 = this.field613.method4059();
                if (this.field594 >= var3) {
                    this.field594 = var3 - this.field613.field2355;
                }
            }
        }

    }

    protected class249 method4273() {
        class205 var2 = class205.method3634(this.field607);
        class249 var3 = var2.method3857(this.field594);
        if (null == var3) {
            return null;
        } else {
            var3.method4778(this.field618);
            return var3;
        }
    }
}
