public class class400 extends class406 {
    public class400(class406 var1) {
        super(var1);
        super.field4513 = "SwapSongTask";
    }

    public boolean method7131(int var1) {
        if (class303.field3194.size() > 1 && class303.field3194.get(0) != null && ((class322) class303.field3194.get(0)).field3533.method5533() && class303.field3194.get(1) != null && ((class322) class303.field3194.get(1)).field3533.method5533()) {
            class322 var3 = (class322) class303.field3194.get(0);
            class303.field3194.set(0, class303.field3194.get(1));
            class303.field3194.set(1, var3);
        }

        return true;
    }
}
