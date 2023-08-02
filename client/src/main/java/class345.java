import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class345 {
    public static Comparator field3840 = new class385();
    public static Comparator field3842;
    public static Comparator field3843;
    public static Comparator field3844;

    static {
        new class375();
        field3842 = new class386();
        field3843 = new class348();
        field3844 = new class343();
    }

    public final List field3845;

    public class345(class519 var1, boolean var2) {
        int var3 = var1.method8750();
        boolean var4 = var1.method8748() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }

        int var6 = var1.method8750();
        this.field3845 = new ArrayList(var6);

        for (int var7 = 0; var7 < var6; ++var7) {
            this.field3845.add(new class376(var1, var5, var3));
        }

    }

    public void method6487(Comparator var1, boolean var2) {
        if (var2) {
            Collections.sort(this.field3845, var1);
        } else {
            Collections.sort(this.field3845, Collections.reverseOrder(var1));
        }

    }
}
