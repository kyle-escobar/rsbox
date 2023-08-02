import java.util.Comparator;

public class class520 implements Comparator {
    final boolean field5131;

    public class520(boolean var1) {
        this.field5131 = var1;
    }

    int method9012(class421 var1, class421 var2) {
        return this.field5131 ? var1.method7546(var2) : var2.method7546(var1);
    }

    public int compare(Object var1, Object var2) {
        return this.method9012((class421) var1, (class421) var2);
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
