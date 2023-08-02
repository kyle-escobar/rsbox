import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public abstract class class114 implements Runnable {
    final Thread field1091 = new Thread(this);
    int field1094;
    Queue field1093 = new LinkedList();
    volatile boolean field1092;

    class114(int var1) {
        this.field1091.setPriority(1);
        this.field1091.start();
        this.field1094 = var1;
    }

    abstract void method2211(class113 var1) throws IOException;

    public void run() {
        while (!this.field1092) {
            try {
                class113 var1;
                synchronized (this) {
                    var1 = (class113) this.field1093.poll();
                    if (var1 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var5) {
                        }
                        continue;
                    }
                }

                this.method2211(var1);
            } catch (Exception var7) {
                class524.method5856(null, var7);
            }
        }

    }

    int method2212(URLConnection var1) {
        int var3 = class113.field1090;
        if (null != var1) {
            try {
                if (var1 instanceof HttpURLConnection) {
                    var3 = ((HttpURLConnection) var1).getResponseCode();
                }
            } catch (IOException var5) {
            }
        }

        return var3;
    }

    void method2213(URLConnection var1) {
        var1.setConnectTimeout(5000);
        var1.setReadTimeout(5000);
        var1.setUseCaches(false);
        var1.setRequestProperty("Connection", "close");
        var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1094);
    }

    void method2214(URLConnection var1, class113 var2) {
        DataInputStream var4 = null;

        try {
            int var6 = var1.getContentLength();
            var4 = new DataInputStream(var1.getInputStream());
            byte[] var5;
            if (var6 >= 0) {
                var5 = new byte[var6];
                var4.readFully(var5);
            } else {
                var5 = new byte[0];
                byte[] var7 = class321.method5869(5000);

                byte[] var9;
                for (int var8 = var4.read(var7, 0, var7.length); var8 > -1; var5 = var9) {
                    var9 = new byte[var5.length + var8];
                    System.arraycopy(var5, 0, var9, 0, var5.length);
                    System.arraycopy(var7, 0, var9, var5.length, var8);
                }

                class401.method6948(var7);
            }

            var2.field1087 = var5;
        } catch (IOException var15) {
            var2.field1087 = null;
        } finally {
            var2.field1086 = this.method2212(var1);
        }

        if (var4 != null) {
            try {
                var4.close();
            } catch (IOException var14) {
            }
        }

    }

    public class113 method2221(URL var1) {
        class113 var3 = new class113(var1);
        synchronized (this) {
            this.field1093.add(var3);
            this.notify();
            return var3;
        }
    }

    public void method2227() {
        this.field1092 = true;

        try {
            synchronized (this) {
                this.notify();
            }

            this.field1091.join();
        } catch (InterruptedException var5) {
        }

    }
}
