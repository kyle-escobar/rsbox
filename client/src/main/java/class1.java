import java.awt.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class1 {
    static class536 field7;
    static FontMetrics field9;
    final int field10;
    final String field2;
    final ThreadFactory field3;
    final ThreadPoolExecutor field4;

    public class1(String var1, int var2, int var3) {
        this.field2 = var1;
        this.field10 = var2;
        this.field3 = new class5(this);
        this.field4 = this.method3(var3);
    }

    final ThreadPoolExecutor method3(int var1) {
        return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field10), this.field3);
    }

    public class4 method2(class17 var1) {
        if (this.field4.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field4.getCorePoolSize() + " Queue capacity " + this.field10);
            return new class4("Queue full");
        } else {
            class4 var3 = new class4(this.field4.submit(new class15(this, var1)));
            return var3;
        }
    }

    public final void method4() {
        try {
            this.field4.shutdown();
        } catch (Exception var3) {
            System.err.println("Error shutting down RestRequestService\r\n" + var3);
        }

    }
}
