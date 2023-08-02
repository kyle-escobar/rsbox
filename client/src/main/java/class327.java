import java.awt.datatransfer.*;

public class class327 {
    boolean field3554 = false;
    boolean field3555 = true;
    boolean field3569 = false;
    class334 field3571;
    class334 field3572;
    class410 field3547 = new class410();
    class410 field3565 = new class410();
    int field3545 = Integer.MAX_VALUE;
    int field3552 = 0;
    int field3556 = 0;
    int field3558 = 0;
    int field3559 = 0;
    int field3560 = 0;
    int field3561 = 0;
    int field3562 = 0;
    int field3563 = 0;
    int field3564 = 0;
    int field3566 = Integer.MAX_VALUE;
    int field3567 = 0;
    int field3568 = 0;
    int field3570 = 0;

    class327() {
        this.field3547.method7287(1);
        this.field3565.method7287(1);
    }

    void method5904() {
        this.field3556 = (1 + this.field3556) % 60;
        if (this.field3564 > 0) {
            --this.field3564;
        }

    }

    public boolean method5902(boolean var1) {
        var1 = var1 && this.field3555;
        boolean var3 = var1 != this.field3554;
        this.field3554 = var1;
        if (!this.field3554) {
            this.method5926(this.field3561, this.field3561);
        }

        return var3;
    }

    public void method5903(boolean var1) {
        this.field3555 = var1;
        this.field3554 = var1 && this.field3554;
    }

    boolean method6038(String var1) {
        String var3 = this.field3547.method7333();
        if (!var3.equals(var1)) {
            var1 = this.method5970(var1);
            this.field3547.method7294(var1);
            this.method5950(this.field3560, this.field3570);
            this.method5974();
            this.method5979();
            return true;
        } else {
            return false;
        }
    }

    boolean method5905(String var1) {
        this.field3565.method7294(var1);
        return true;
    }

    boolean method5986(class407 var1) {
        boolean var3 = !this.field3569;
        this.field3547.method7414(var1);
        this.field3565.method7414(var1);
        this.field3569 = true;
        var3 |= this.method5950(this.field3560, this.field3570);
        var3 |= this.method5926(this.field3562, this.field3561);
        if (this.method5974()) {
            this.method5979();
            var3 = true;
        }

        return var3;
    }

    public boolean method5907(int var1, int var2) {
        boolean var4 = this.field3567 != var1 || this.field3568 != var2;
        this.field3567 = var1;
        this.field3568 = var2;
        var4 |= this.method5950(this.field3560, this.field3570);
        return var4;
    }

    public boolean method6073(int var1) {
        if (var1 < 0) {
            var1 = Integer.MAX_VALUE;
        }

        boolean var3 = var1 == this.field3547.method7305();
        this.field3547.method7349(var1);
        this.field3565.method7349(var1);
        if (this.method5974()) {
            this.method5979();
            var3 = true;
        }

        return var3;
    }

    public boolean method5909(int var1) {
        this.field3547.method7284(var1);
        if (this.method5974()) {
            this.method5979();
            return true;
        } else {
            return false;
        }
    }

    public boolean method5910(int var1) {
        this.field3566 = var1;
        if (this.method5974()) {
            this.method5979();
            return true;
        } else {
            return false;
        }
    }

    public boolean method5950(int var1, int var2) {
        if (!this.method5958()) {
            this.field3560 = var1;
            this.field3570 = var2;
            return false;
        } else {
            int var4 = this.field3560;
            int var5 = this.field3570;
            int var6 = Math.max(0, this.field3547.method7300() - this.field3567 + 2);
            int var7 = Math.max(0, this.field3547.method7283() - this.field3568 + 1);
            this.field3560 = Math.max(0, Math.min(var6, var1));
            this.field3570 = Math.max(0, Math.min(var7, var2));
            return this.field3560 != var4 || this.field3570 != var5;
        }
    }

    public boolean method5912(int var1, int var2) {
        boolean var4 = var1 >= 0 && var1 <= 2;

        if (var2 < 0 || var2 > 2) {
            var4 = false;
        }

        return var4 && this.field3547.method7288(var1, var2);
    }

    public void method6052(int var1) {
        this.field3547.method7282(var1);
    }

    public void method6092(int var1) {
        this.field3552 = var1;
    }

    public void method5915(int var1) {
        this.field3547.method7287(var1);
    }

    public void method6019(int var1) {
        this.field3547.method7357(var1);
    }

    public boolean method5917(int var1) {
        this.field3558 = var1;
        String var3 = this.field3547.method7333();
        int var4 = var3.length();
        var3 = this.method5970(var3);
        if (var3.length() != var4) {
            this.field3547.method7294(var3);
            this.method5950(this.field3560, this.field3570);
            this.method5974();
            this.method5979();
            return true;
        } else {
            return false;
        }
    }

    public void method5918() {
        this.field3569 = false;
    }

    public boolean method6164(int var1) {
        if (this.method5959(var1)) {
            this.method5924();
            class398 var3 = this.field3547.method7291((char) var1, this.field3561, this.field3545);
            this.method5926(var3.method7050(), var3.method7050());
            this.method5974();
            this.method5979();
        }

        return true;
    }

    public void method5977() {
        if (!this.method5924() && this.field3561 > 0) {
            int var2 = this.field3547.method7402(this.field3561 - 1);
            this.method5979();
            this.method5926(var2, var2);
        }

    }

    public void method5921() {
        if (!this.method5924() && this.field3561 < this.field3547.method7281()) {
            int var2 = this.field3547.method7402(this.field3561);
            this.method5979();
            this.method5926(var2, var2);
        }

    }

    public void method5922() {
        if (!this.method5924() && this.field3561 > 0) {
            class474 var2 = this.method5919(this.field3561 - 1);
            int var3 = this.field3547.method7297((Integer) var2.field4833, this.field3561);
            this.method5979();
            this.method5926(var3, var3);
        }

    }

    public void method5923() {
        if (!this.method5924() && this.field3561 < this.field3547.method7281()) {
            class474 var2 = this.method5919(this.field3561);
            int var3 = this.field3547.method7297(this.field3561, (Integer) var2.field4831);
            this.method5979();
            this.method5926(var3, var3);
        }

    }

    boolean method5924() {
        if (!this.method5908()) {
            return false;
        } else {
            int var2 = this.field3547.method7297(this.field3562, this.field3561);
            this.method5979();
            this.method5926(var2, var2);
            return true;
        }
    }

    public void method5976() {
        this.method5926(0, this.field3547.method7281());
    }

    public boolean method5926(int var1, int var2) {
        if (!this.method5958()) {
            this.field3562 = var1;
            this.field3561 = var2;
            return false;
        } else {
            if (var1 > this.field3547.method7281()) {
                var1 = this.field3547.method7281();
            }

            if (var2 > this.field3547.method7281()) {
                var2 = this.field3547.method7281();
            }

            boolean var4 = this.field3562 != var1 || var2 != this.field3561;
            this.field3562 = var1;
            if (var2 != this.field3561) {
                this.field3561 = var2;
                this.field3556 = 0;
                this.method6137();
            }

            if (var4 && null != this.field3572) {
                this.field3572.method6358();
            }

            return var4;
        }
    }

    public void method6063(boolean var1) {
        class474 var3 = this.method5916(this.field3561);
        this.method5975((Integer) var3.field4833, var1);
    }

    public void method5928(boolean var1) {
        class474 var3 = this.method5916(this.field3561);
        this.method5975((Integer) var3.field4831, var1);
    }

    public void method5929(boolean var1) {
        this.method5975(0, var1);
    }

    public void method6059(boolean var1) {
        this.method5975(this.field3547.method7281(), var1);
    }

    public void method5931(boolean var1) {
        if (this.method5908() && !var1) {
            this.method5975(Math.min(this.field3562, this.field3561), var1);
        } else if (this.field3561 > 0) {
            this.method5975(this.field3561 - 1, var1);
        }

    }

    public void method5932(boolean var1) {
        if (this.method5908() && !var1) {
            this.method5975(Math.max(this.field3562, this.field3561), var1);
        } else if (this.field3561 < this.field3547.method7281()) {
            this.method5975(1 + this.field3561, var1);
        }

    }

    public void method5933(boolean var1) {
        if (this.field3561 > 0) {
            class474 var3 = this.method5919(this.field3561 - 1);
            this.method5975((Integer) var3.field4833, var1);
        }

    }

    public void method5934(boolean var1) {
        if (this.field3561 < this.field3547.method7281()) {
            class474 var3 = this.method5919(this.field3561 + 1);
            this.method5975((Integer) var3.field4831, var1);
        }

    }

    public void method6100(boolean var1) {
        if (this.field3561 > 0) {
            this.method5975(this.field3547.method7299(this.field3561, -1), var1);
        }

    }

    public void method5936(boolean var1) {
        if (this.field3561 < this.field3547.method7281()) {
            this.method5975(this.field3547.method7299(this.field3561, 1), var1);
        }

    }

    public void method5937(boolean var1) {
        if (this.field3561 > 0) {
            int var3 = this.method6072();
            this.method5975(this.field3547.method7299(this.field3561, -var3), var1);
        }

    }

    public void method5900(boolean var1) {
        if (this.field3561 < this.field3547.method7281()) {
            int var3 = this.method6072();
            this.method5975(this.field3547.method7299(this.field3561, var3), var1);
        }

    }

    public void method6095(boolean var1) {
        class405 var3 = this.field3547.method7387(0, this.field3561);
        class474 var4 = var3.method7107();
        this.method5975(this.field3547.method7298((Integer) var4.field4833, this.field3570), var1);
    }

    public void method5940(boolean var1) {
        class405 var3 = this.field3547.method7387(0, this.field3561);
        class474 var4 = var3.method7107();
        this.method5975(this.field3547.method7298((Integer) var4.field4833, this.field3570 + this.field3568), var1);
    }

    public void method6169(int var1, int var2, boolean var3, boolean var4) {
        boolean var6 = false;
        class474 var7;
        int var9;
        if (!this.field3569) {
            var9 = 0;
        } else {
            var1 += this.field3560;
            var2 += this.field3570;
            var7 = this.method5980();
            var9 = this.field3547.method7298(var1 - (Integer) var7.field4833, var2 - (Integer) var7.field4831);
        }

        if (var3 && var4) {
            this.field3559 = 1;
            var7 = this.method5919(var9);
            class474 var8 = this.method5919(this.field3563);
            this.method5971(var8, var7);
        } else if (var3) {
            this.field3559 = 1;
            var7 = this.method5919(var9);
            this.method5926((Integer) var7.field4833, (Integer) var7.field4831);
            this.field3563 = (Integer) var7.field4833;
        } else if (var4) {
            this.method5926(this.field3563, var9);
        } else {
            if (this.field3564 > 0 && this.field3563 == var9) {
                if (this.field3561 == this.field3562) {
                    this.field3559 = 1;
                    var7 = this.method5919(var9);
                    this.method5926((Integer) var7.field4833, (Integer) var7.field4831);
                } else {
                    this.field3559 = 2;
                    var7 = this.method5916(var9);
                    this.method5926((Integer) var7.field4833, (Integer) var7.field4831);
                }
            } else {
                this.field3559 = 0;
                this.method5926(var9, var9);
                this.field3563 = var9;
            }

            this.field3564 = 25;
        }

    }

    public void method5942(int var1, int var2) {
        if (this.field3569 && this.method5953()) {
            var1 += this.field3560;
            var2 += this.field3570;
            class474 var4 = this.method5980();
            int var5 = this.field3547.method7298(var1 - (Integer) var4.field4833, var2 - (Integer) var4.field4831);
            class474 var6;
            class474 var7;
            switch (this.field3559) {
                case 0:
                    this.method5926(this.field3562, var5);
                    break;
                case 1:
                    var6 = this.method5919(this.field3563);
                    var7 = this.method5919(var5);
                    this.method5971(var6, var7);
                    break;
                case 2:
                    var6 = this.method5916(this.field3563);
                    var7 = this.method5916(var5);
                    this.method5971(var6, var7);
            }
        }

    }

    public void method5943(Clipboard var1) {
        class405 var3 = this.field3547.method7387(this.field3562, this.field3561);
        if (!var3.method7103()) {
            String var4 = var3.method7101();
            if (!var4.isEmpty()) {
                var1.setContents(new StringSelection(var4), null);
            }
        }

    }

    public void method5944(Clipboard var1) {
        if (this.method5908()) {
            this.method5943(var1);
            this.method5924();
        }

    }

    public void method5945(Clipboard var1) {
        Transferable var3 = var1.getContents(null);
        if (null != var3 && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            try {
                String var4 = this.method5970((String) var3.getTransferData(DataFlavor.stringFlavor));
                this.method5924();
                class398 var5 = this.field3547.method7292(var4, this.field3561, this.field3545);
                this.method5926(var5.method7050(), var5.method7050());
                this.method5974();
                this.method5979();
            } catch (Exception var6) {
            }
        }

    }

    public void method5972() {
        this.field3570 = Math.max(0, this.field3570 - this.field3547.method7316());
    }

    public void method5927() {
        int var2 = Math.max(0, this.field3547.method7283() - this.field3568);
        this.field3570 = Math.min(var2, this.field3570 + this.field3547.method7316());
    }

    public void method5969(class334 var1) {
        this.field3571 = var1;
    }

    public void method5949(class334 var1) {
        this.field3572 = var1;
    }

    public class410 method6006() {
        return this.field3547;
    }

    public class410 method6157() {
        return this.field3565;
    }

    public class405 method5952() {
        return this.field3547.method7387(this.field3562, this.field3561);
    }

    public boolean method5953() {
        return this.field3554;
    }

    public boolean method5954() {
        return this.field3555;
    }

    public boolean method6030() {
        return this.method5953() && this.field3556 % 60 < 30;
    }

    public int method5956() {
        return this.field3561;
    }

    public int method5957() {
        return this.field3562;
    }

    public boolean method5958() {
        return this.field3569;
    }

    public int method6058() {
        return this.field3560;
    }

    public int method5960() {
        return this.field3570;
    }

    public int method5961() {
        return this.field3547.method7305();
    }

    public int method5962() {
        return this.field3547.method7306();
    }

    public int method5963() {
        return this.field3566;
    }

    public int method5946() {
        return this.field3552;
    }

    public int method5965() {
        return this.field3547.method7345();
    }

    public int method6053() {
        return this.field3558;
    }

    public int method6042() {
        return this.field3547.method7308();
    }

    public boolean method5968() {
        return this.method5962() > 1;
    }

    boolean method5908() {
        return this.field3561 != this.field3562;
    }

    String method5970(String var1) {
        StringBuilder var3 = new StringBuilder(var1.length());

        for (int var4 = 0; var4 < var1.length(); ++var4) {
            char var5 = var1.charAt(var4);
            if (this.method5959(var5)) {
                var3.append(var5);
            }
        }

        return var3.toString();
    }

    void method5971(class474 var1, class474 var2) {
        if ((Integer) var2.field4833 < (Integer) var1.field4833) {
            this.method5926((Integer) var1.field4831, (Integer) var2.field4833);
        } else {
            this.method5926((Integer) var1.field4833, (Integer) var2.field4831);
        }

    }

    class474 method5919(int var1) {
        int var3 = this.field3547.method7281();
        int var4 = 0;
        int var5 = var3;

        int var6;
        for (var6 = var1; var6 > 0; --var6) {
            if (this.method6034(this.field3547.method7277(var6 - 1).field4573)) {
                var4 = var6;
                break;
            }
        }

        for (var6 = var1; var6 < var3; ++var6) {
            if (this.method6034(this.field3547.method7277(var6).field4573)) {
                var5 = var6;
                break;
            }
        }

        return new class474(var4, var5);
    }

    class474 method5916(int var1) {
        int var3 = this.field3547.method7281();
        int var4 = 0;
        int var5 = var3;

        int var6;
        for (var6 = var1; var6 > 0; --var6) {
            if (this.field3547.method7277(var6 - 1).field4573 == '\n') {
                var4 = var6;
                break;
            }
        }

        for (var6 = var1; var6 < var3; ++var6) {
            if (this.field3547.method7277(var6).field4573 == '\n') {
                var5 = var6;
                break;
            }
        }

        return new class474(var4, var5);
    }

    boolean method5974() {
        if (!this.method5958()) {
            return false;
        } else {
            boolean var2 = false;
            if (this.field3547.method7281() > this.field3566) {
                this.field3547.method7297(this.field3566, this.field3547.method7281());
                var2 = true;
            }

            int var3 = this.method5962();
            int var4;
            if (this.field3547.method7303() > var3) {
                var4 = this.field3547.method7299(0, var3) - 1;
                this.field3547.method7297(var4, this.field3547.method7281());
                var2 = true;
            }

            if (var2) {
                var4 = this.field3561;
                int var5 = this.field3562;
                int var6 = this.field3547.method7281();
                if (this.field3561 > var6) {
                    var4 = var6;
                }

                if (this.field3562 > var6) {
                    var5 = var6;
                }

                this.method5926(var5, var4);
            }

            return var2;
        }
    }

    void method5975(int var1, boolean var2) {
        if (var2) {
            this.method5926(this.field3562, var1);
        } else {
            this.method5926(var1, var1);
        }

    }

    int method6072() {
        return this.field3568 / this.field3547.method7316();
    }

    void method6137() {
        class405 var2 = this.field3547.method7387(0, this.field3561);
        class474 var3 = var2.method7107();
        int var4 = this.field3547.method7316();
        int var5 = (Integer) var3.field4833 - 10;
        int var6 = var5 + 20;
        int var7 = (Integer) var3.field4831 - 3;
        int var8 = var4 + var7 + 6;
        int var9 = this.field3560;
        int var10 = this.field3567 + var9;
        int var11 = this.field3570;
        int var12 = var11 + this.field3568;
        int var13 = this.field3560;
        int var14 = this.field3570;
        if (var5 < var9) {
            var13 = var5;
        } else if (var6 > var10) {
            var13 = var6 - this.field3567;
        }

        if (var7 < var11) {
            var14 = var7;
        } else if (var8 > var12) {
            var14 = var8 - this.field3568;
        }

        this.method5950(var13, var14);
    }

    boolean method6034(int var1) {
        return var1 == 32 || var1 == 10 || var1 == 9;
    }

    void method5979() {
        if (null != this.field3571) {
            this.field3571.method6358();
        }

    }

    boolean method5959(int var1) {
        switch (this.field3558) {
            case 1:
                return class380.method2440((char) var1);
            case 2:
                return class380.method102((char) var1);
            case 3:
                return class380.method3292((char) var1);
            case 4:
                char var3 = (char) var1;
                if (class380.method3292(var3)) {
                    return true;
                } else {
                    return var3 == 'k' || var3 == 'K' || var3 == 'm' || var3 == 'M' || var3 == 'b' || var3 == 'B';
                }
            default:
                return true;
        }
    }

    class474 method5980() {
        int var2 = this.field3547.method7309(this.field3567);
        int var3 = this.field3547.method7310(this.field3568);
        return new class474(var2, var3);
    }
}
