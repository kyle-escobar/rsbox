public class class525 {
    public final int field5163;
    public Object field5162;

    public class525(int var1) {
        this.field5163 = var1;
    }

    public class525(int var1, Object var2) {
        this.field5163 = var1;
        this.field5162 = var2;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object var1) {
        if (!(var1 instanceof class525)) {
            return false;
        } else {
            class525 var2 = (class525) var1;
            if (var2.field5162 == null && null != this.field5162) {
                return false;
            } else if (null == this.field5162 && var2.field5162 != null) {
                return false;
            } else {
                return var2.field5163 == this.field5163 && var2.field5162.equals(this.field5162);
            }
        }
    }
}
