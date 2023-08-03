import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class178 implements Runnable {
   public static String field1868;
   public static String field1871;
   boolean field1870 = false;
   class177 field1865 = null;
   class177 field1867 = null;
   Thread field1869;

   public class178() {
      field1871 = "Unknown";
      field1868 = "1.6";

      try {
         field1871 = System.getProperty("java.vendor");
         field1868 = System.getProperty("java.version");
      } catch (Exception var2) {
      }

      this.field1870 = false;
      this.field1869 = new Thread(this);
      this.field1869.setPriority(10);
      this.field1869.setDaemon(true);
      this.field1869.start();
   }

   public final void method3398() {
      synchronized(this) {
         this.field1870 = true;
         this.notifyAll();
      }

      try {
         this.field1869.join();
      } catch (InterruptedException var4) {
      }

   }

   public final void run() {
      while(true) {
         class177 var1;
         synchronized(this) {
            while(true) {
               if (this.field1870) {
                  return;
               }

               if (null != this.field1867) {
                  var1 = this.field1867;
                  this.field1867 = this.field1867.field1862;
                  if (this.field1867 == null) {
                     this.field1865 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var7) {
               }
            }
         }

         try {
            int var2 = var1.field1861;
            if (var2 == 1) {
               var1.result = new Socket(InetAddress.getByName((String)var1.field1863), var1.field1860);
            } else if (var2 == 2) {
               Thread var3 = new Thread((Runnable)var1.field1863);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.field1860);
               var1.result = var3;
            } else if (var2 == 4) {
               var1.result = new DataInputStream(((URL)var1.field1863).openStream());
            }

            var1.field1859 = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.field1859 = 2;
         }
      }
   }

   final class177 method3405(int var1, int var2, int var3, Object var4) {
      class177 var6 = new class177();
      var6.field1861 = var1;
      var6.field1860 = var2;
      var6.field1863 = var4;
      synchronized(this) {
         if (this.field1865 != null) {
            this.field1865.field1862 = var6;
            this.field1865 = var6;
         } else {
            this.field1865 = this.field1867 = var6;
         }

         this.notify();
         return var6;
      }
   }

   public final class177 newSocketTask(String var1, int var2) {
      return this.method3405(1, var2, 0, var1);
   }

   public final class177 method3400(Runnable var1, int var2) {
      return this.method3405(2, var2, 0, var1);
   }
}
