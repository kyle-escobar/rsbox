import java.util.concurrent.ThreadFactory;

class class293 implements ThreadFactory {
    public static class36 field3132;
    static int field3130;
    // $FF: synthetic field
    final class289 this$0;

    class293(class289 var1) {
        this.this$0 = var1;
    }

    public Thread newThread(Runnable var1) {
        return new Thread(var1, "OSRS WAV Load");
    }
}
