import java.util.Comparator;

public abstract class class442 implements Comparator {
    Comparator field4690;

    protected class442() {
    }

    final void method7817(Comparator var1) {
        if (null == this.field4690) {
            this.field4690 = var1;
        } else if (this.field4690 instanceof class442) {
            ((class442) this.field4690).method7817(var1);
        }

    }

    protected final int method7818(class421 var1, class421 var2) {
        return this.field4690 == null ? 0 : this.field4690.compare(var1, var2);
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
