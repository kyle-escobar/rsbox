public final class class434 implements Comparable {
    Object field4649;
    Object field4651;
    long field4648;
    long field4650;

    class434(Object var1, Object var2) {
        this.field4649 = var1;
        this.field4651 = var2;
    }

    static void method7715(class342 var0, int var1) {
        if ((var1 & 536870912) != 0) {
            class61.field465 = class538.method8011(var0, "logo_deadman_mode", "");
        } else if (0 != (var1 & 1073741824)) {
            class61.field465 = class538.method8011(var0, "logo_seasonal_mode", "");
        } else if ((var1 & 256) != 0) {
            class61.field465 = class538.method8011(var0, "logo_speedrunning", "");
        } else {
            class61.field465 = class538.method8011(var0, "logo", "");
        }

    }

    int method7709(class434 var1) {
        if (this.field4648 < var1.field4648) {
            return -1;
        } else {
            return this.field4648 > var1.field4648 ? 1 : 0;
        }
    }

    public boolean equals(Object var1) {
        if (var1 instanceof class434) {
            return this.field4651.equals(((class434) var1).field4651);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int hashCode() {
        return this.field4651.hashCode();
    }

    public int compareTo(Object var1) {
        return this.method7709((class434) var1);
    }
}
