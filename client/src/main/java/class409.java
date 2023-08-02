import java.util.Iterator;

public class class409 extends class406 {
    class342 field4543;
    class342 field4544;
    class342 field4545;

    public class409(class406 var1, class342 var2, class342 var3, class342 var4) {
        super(var1);
        this.field4543 = var2;
        this.field4544 = var3;
        this.field4545 = var4;
        super.field4513 = "LoadSongTask";
    }

    public boolean method7131(int var1) {
        int var3 = 0;
        Iterator var4 = class303.field3194.iterator();

        while (true) {
            while (var4.hasNext()) {
                class322 var5 = (class322) var4.next();
                if (var5 != null && var5.field3533.field3113 > 1 && var5.field3533.method5619()) {
                    this.method7135("Attempted to load patches of already loading midiplayer!");
                    return true;
                }

                if (null != var5 && !var5.field3530) {
                    try {
                        if (null != var5.field3531 && var5.field3524 != -1 && -1 != var5.field3526) {
                            if (var5.field3535 == null) {
                                var5.field3535 = class328.method6179(var5.field3531, var5.field3524, var5.field3526);
                                if (var5.field3535 == null) {
                                    continue;
                                }
                            }

                            if (var5.field3534 == null) {
                                var5.field3534 = new class34(this.field4545, this.field4544);
                            }

                            if (var5.field3533.method5527(var5.field3535, this.field4543, var5.field3534)) {
                                ++var3;
                                var5.field3530 = true;
                                var5.field3533.method5550();
                            }
                        } else {
                            ++var3;
                        }
                    } catch (Exception var7) {
                        var7.printStackTrace();
                        this.method7135(var7.getMessage());
                        return true;
                    }
                } else {
                    ++var3;
                }
            }

            return var3 == class303.field3194.size();
        }
    }
}
