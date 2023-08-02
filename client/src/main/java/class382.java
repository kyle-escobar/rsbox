import java.util.Collection;
import java.util.Iterator;

public class class382 implements Iterable, Collection {
    class470 field4395 = new class470();
    class470 field4396;

    public class382() {
        this.field4395.field4817 = this.field4395;
        this.field4395.field4815 = this.field4395;
    }

    public static void method6846(class470 var0, class470 var1) {
        if (var0.field4815 != null) {
            var0.method8116();
        }

        var0.field4815 = var1;
        var0.field4817 = var1.field4817;
        var0.field4815.field4817 = var0;
        var0.field4817.field4815 = var0;
    }

    public void method6903() {
        while (this.field4395.field4817 != this.field4395) {
            this.field4395.field4817.method8116();
        }

    }

    public void method6874(class470 var1) {
        if (var1.field4815 != null) {
            var1.method8116();
        }

        var1.field4815 = this.field4395.field4815;
        var1.field4817 = this.field4395;
        var1.field4815.field4817 = var1;
        var1.field4817.field4815 = var1;
    }

    public void method6845(class470 var1) {
        if (var1.field4815 != null) {
            var1.method8116();
        }

        var1.field4815 = this.field4395;
        var1.field4817 = this.field4395.field4817;
        var1.field4815.field4817 = var1;
        var1.field4817.field4815 = var1;
    }

    public class470 method6847() {
        return this.method6848(null);
    }

    class470 method6848(class470 var1) {
        class470 var2;
        if (var1 == null) {
            var2 = this.field4395.field4817;
        } else {
            var2 = var1;
        }

        if (var2 == this.field4395) {
            this.field4396 = null;
            return null;
        } else {
            this.field4396 = var2.field4817;
            return var2;
        }
    }

    public class470 method6849() {
        class470 var1 = this.field4396;
        if (var1 == this.field4395) {
            this.field4396 = null;
            return null;
        } else {
            this.field4396 = var1.field4817;
            return var1;
        }
    }

    int method6850() {
        int var1 = 0;

        for (class470 var2 = this.field4395.field4817; var2 != this.field4395; var2 = var2.field4817) {
            ++var1;
        }

        return var1;
    }

    public boolean method6851() {
        return this.field4395.field4817 == this.field4395;
    }

    class470[] method6883() {
        class470[] var1 = new class470[this.method6850()];
        int var2 = 0;

        for (class470 var3 = this.field4395.field4817; var3 != this.field4395; var3 = var3.field4817) {
            var1[var2++] = var3;
        }

        return var1;
    }

    public Iterator iterator() {
        return new class378(this);
    }

    public int size() {
        return this.method6850();
    }

    public boolean isEmpty() {
        return this.method6851();
    }

    public boolean contains(Object var1) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6883();
    }

    public Object[] toArray(Object[] var1) {
        int var2 = 0;

        for (class470 var3 = this.field4395.field4817; var3 != this.field4395; var3 = var3.field4817) {
            var1[var2++] = var3;
        }

        return var1;
    }

    boolean method6914(class470 var1) {
        this.method6874(var1);
        return true;
    }

    public boolean remove(Object var1) {
        throw new RuntimeException();
    }

    public boolean containsAll(Collection var1) {
        throw new RuntimeException();
    }

    public boolean addAll(Collection var1) {
        throw new RuntimeException();
    }

    public boolean removeAll(Collection var1) {
        throw new RuntimeException();
    }

    public boolean retainAll(Collection var1) {
        throw new RuntimeException();
    }

    public void clear() {
        this.method6903();
    }

    public boolean add(Object var1) {
        return this.method6914((class470) var1);
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
