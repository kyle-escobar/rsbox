public class class526 implements Comparable {
    String field5164;
    String field5165;

    public class526(String var1) {
        this.field5164 = var1;
        this.field5165 = class495.method7637(var1, class477.field4854);
    }

    public class526(String var1, class477 var2) {
        this.field5164 = var1;
        this.field5165 = class495.method7637(var1, var2);
    }

    public String method9155() {
        return this.field5164;
    }

    public String method9156() {
        return this.field5165;
    }

    public boolean method9157() {
        return this.field5165 != null;
    }

    public boolean equals(Object var1) {
        if (var1 instanceof class526) {
            class526 var2 = (class526) var1;
            if (null == this.field5165) {
                return var2.field5165 == null;
            } else if (null == var2.field5165) {
                return false;
            } else {
                return this.hashCode() == var2.hashCode() && this.field5165.equals(var2.field5165);
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5165 == null ? 0 : this.field5165.hashCode();
    }

    public String toString() {
        return this.method9155();
    }

    public int method9154(class526 var1) {
        if (this.field5165 == null) {
            return null == var1.field5165 ? 0 : 1;
        } else {
            return null == var1.field5165 ? -1 : this.field5165.compareTo(var1.field5165);
        }
    }

    public int compareTo(Object var1) {
        return this.method9154((class526) var1);
    }
}
