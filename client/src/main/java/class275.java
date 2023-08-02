import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class275 extends class253 {
    static List field3019;
    HashSet field3016;
    HashSet field3018;
    List field3017;

    class275() {
    }

    void method5343(class519 var1, class519 var2, int var3, boolean var4) {
        this.method4955(var1, var3);
        int var6 = var2.method8750();
        this.field3018 = new HashSet(var6);

        int var7;
        for (var7 = 0; var7 < var6; ++var7) {
            class248 var8 = new class248();

            try {
                var8.method4748(var2);
            } catch (IllegalStateException var12) {
                continue;
            }

            this.field3018.add(var8);
        }

        var7 = var2.method8750();
        this.field3016 = new HashSet(var7);

        for (int var13 = 0; var13 < var7; ++var13) {
            class280 var9 = new class280();

            try {
                var9.method5363(var2);
            } catch (IllegalStateException var11) {
                continue;
            }

            this.field3016.add(var9);
        }

        this.method5344(var2, var4);
    }

    void method5344(class519 var1, boolean var2) {
        this.field3017 = new LinkedList();
        int var4 = var1.method8750();

        for (int var5 = 0; var5 < var4; ++var5) {
            int var6 = var1.method8814();
            class330 var7 = new class330(var1.method9000());
            boolean var8 = var1.method8748() == 1;
            if (var2 || !var8) {
                this.field3017.add(new class266(null, var7, var6, null));
            }
        }

    }
}
