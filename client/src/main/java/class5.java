import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class class5 implements ThreadFactory {
    // $FF: synthetic field
    final class1 this$0;
    final ThreadGroup field28;
    final AtomicInteger field29;

    class5(class1 var1) {
        this.this$0 = var1;
        this.field29 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field28 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
    }

    public Thread newThread(Runnable var1) {
        Thread var2 = new Thread(this.field28, var1, this.this$0.field2 + "-rest-request-" + this.field29.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
