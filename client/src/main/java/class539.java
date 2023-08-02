import java.util.Comparator;

public class class539 implements Comparator {
    final boolean field5229;

    public class539(boolean var1) {
        this.field5229 = var1;
    }

    int method9364(class421 var1, class421 var2) {
        return this.field5229 ? var1.method7542().method9154(var2.method7542()) : var2.method7542().method9154(var1.method7542());
    }

    public int compare(Object var1, Object var2) {
        return this.method9364((class421) var1, (class421) var2);
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
