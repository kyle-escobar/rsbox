import java.util.Comparator;

final class class385 implements Comparator {
    int method6939(class376 var1, class376 var2) {
        return var1.field4368 < var2.field4368 ? -1 : (var2.field4368 == var1.field4368 ? 0 : 1);
    }

    public int compare(Object var1, Object var2) {
        return this.method6939((class376) var1, (class376) var2);
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
