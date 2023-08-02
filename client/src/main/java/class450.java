import java.io.IOException;
import java.io.OutputStream;

public class class450 implements Runnable {
   boolean field4726;
   byte[] field4722;
   int field4719 = 0;
   int field4721;
   int field4724 = 0;
   IOException field4725;
   OutputStream field4720;
   Thread field4723;

   class450(OutputStream var1, int var2) {
      this.field4720 = var1;
      this.field4721 = var2 + 1;
      this.field4722 = new byte[this.field4721];
      this.field4723 = new Thread(this);
      this.field4723.setDaemon(true);
      this.field4723.start();
   }

   boolean method7881() {
      if (this.field4726) {
         try {
            this.field4720.close();
            if (this.field4725 == null) {
               this.field4725 = new IOException("");
            }
         } catch (IOException var3) {
            if (this.field4725 == null) {
               this.field4725 = new IOException(var3);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void run() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if (null != this.field4725) {
                  return;
               }

               if (this.field4719 <= this.field4724) {
                  var1 = this.field4724 - this.field4719;
               } else {
                  var1 = this.field4724 + (this.field4721 - this.field4719);
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.field4720.flush();
               } catch (IOException var10) {
                  this.field4725 = var10;
                  return;
               }

               if (this.method7881()) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }
         }

         try {
            if (var1 + this.field4719 <= this.field4721) {
               this.field4720.write(this.field4722, this.field4719, var1);
            } else {
               int var13 = this.field4721 - this.field4719;
               this.field4720.write(this.field4722, this.field4719, var13);
               this.field4720.write(this.field4722, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized(this) {
               this.field4725 = var2;
               return;
            }
         }

         synchronized(this) {
            this.field4719 = (this.field4719 + var1) % this.field4721;
         }
      } while(!this.method7881());

   }

   void method7873(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            if (this.field4725 != null) {
               throw new IOException(this.field4725.toString());
            } else {
               int var6;
               if (this.field4719 <= this.field4724) {
                  var6 = this.field4719 + (this.field4721 - this.field4724) - 1;
               } else {
                  var6 = this.field4719 - this.field4724 - 1;
               }

               if (var6 < var3) {
                  throw new IOException("");
               } else {
                  if (this.field4724 + var3 <= this.field4721) {
                     System.arraycopy(var1, var2, this.field4722, this.field4724, var3);
                  } else {
                     int var7 = this.field4721 - this.field4724;
                     System.arraycopy(var1, var2, this.field4722, this.field4724, var7);
                     System.arraycopy(var1, var7 + var2, this.field4722, 0, var3 - var7);
                  }

                  this.field4724 = (this.field4724 + var3) % this.field4721;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method7874() {
      synchronized(this) {
         this.field4726 = true;
         this.notifyAll();
      }

      try {
         this.field4723.join();
      } catch (InterruptedException var4) {
      }

   }
}
