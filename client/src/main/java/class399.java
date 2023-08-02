import java.util.Iterator;

public class class399 extends class406 {
    public class399(class406 var1) {
        super(var1);
        super.field4513 = "StartSongTask";
    }

    public boolean method7131(int var1) {
        Iterator var3 = class303.field3194.iterator();

        while (var3.hasNext()) {
            class322 var4 = (class322) var3.next();
            if (null != var4 && !var4.field3525 && null != var4.field3533) {
                try {
                    var4.field3533.method5529();
                    var4.field3533.method5525(0);
                    if (null != var4.field3535) {
                        var4.field3533.method5562(var4.field3535, var4.field3529);
                    }

                    var4.field3535 = null;
                    var4.field3534 = null;
                    var4.field3531 = null;
                    var4.field3525 = true;
                } catch (Exception var6) {
                    var6.printStackTrace();
                    this.method7135(var6.getMessage());
                    return true;
                }
            }
        }

        super.field4511 = true;
        return true;
    }
}
