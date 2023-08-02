public class class474 {
    public final Object field4831;
    public final Object field4833;

    public class474(Object var1, Object var2) {
        this.field4833 = var1;
        this.field4831 = var2;
    }

    public String toString() {
        return this.field4833 + ", " + this.field4831;
    }

    public boolean equals(Object var1) {
        if (null != var1 && var1 instanceof class474) {
            class474 var2 = (class474) var1;
            if (this.field4833 == null) {
                if (var2.field4833 != null) {
                    return false;
                }
            } else if (!this.field4833.equals(var2.field4833)) {
                return false;
            }

            if (null == this.field4831) {
                return null == var2.field4831;
            } else return this.field4831.equals(var2.field4831);
        } else {
            return false;
        }
    }

    public int hashCode() {
        int var1 = 0;
        if (null != this.field4833) {
            var1 += this.field4833.hashCode();
        }

        if (null != this.field4831) {
            var1 += 31 * this.field4831.hashCode();
        }

        return var1;
    }
}
