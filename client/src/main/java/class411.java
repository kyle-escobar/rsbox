import java.util.ArrayList;
import java.util.Iterator;

public class class411 extends class406 {
    ArrayList field4563;

    public class411(class406 var1, ArrayList var2) {
        super(var1);
        super.field4513 = "ClearRequestTask";
        this.field4563 = var2;
    }

    public boolean method7131(int var1) {
        if (this.field4563.isEmpty()) {
            return true;
        } else {
            Iterator var3 = this.field4563.iterator();

            while (var3.hasNext()) {
                class322 var4 = (class322) var3.next();

                try {
                    if (class303.field3194.contains(var4)) {
                        if (null == var4) {
                            class303.field3194.remove(var4);
                        } else {
                            --var4.field3533.field3113;
                            if (0 == var4.field3533.field3113) {
                                var4.field3533.method5532();
                                var4.field3533.method5530();
                                var4.field3533.method5525(0);
                            }

                            class303.method3925(var4.field3524, var4.field3526);
                            class303.field3194.remove(var4);
                        }
                    }
                } catch (Exception var6) {
                    var6.printStackTrace();
                    this.method7135(var6.getMessage());
                    class303.field3194.clear();
                    return true;
                }
            }

            return true;
        }
    }
}
