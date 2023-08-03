import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

class class318 implements Callable {
   static class453 field3508;
   static int field3509;
   static long field3512;
   // $FF: synthetic field
   final class289 this$0;
   // $FF: synthetic field
   final AtomicBoolean val$cancelled;

   class318(class289 var1, AtomicBoolean var2) {
      this.this$0 = var1;
      this.val$cancelled = var2;
   }

   public static byte method5854(char var0) {
      byte var2;
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 == 8364) {
            var2 = -128;
         } else if (var0 == 8218) {
            var2 = -126;
         } else if (var0 == 402) {
            var2 = -125;
         } else if (var0 == 8222) {
            var2 = -124;
         } else if (var0 == 8230) {
            var2 = -123;
         } else if (var0 == 8224) {
            var2 = -122;
         } else if (var0 == 8225) {
            var2 = -121;
         } else if (var0 == 710) {
            var2 = -120;
         } else if (var0 == 8240) {
            var2 = -119;
         } else if (var0 == 352) {
            var2 = -118;
         } else if (var0 == 8249) {
            var2 = -117;
         } else if (var0 == 338) {
            var2 = -116;
         } else if (var0 == 381) {
            var2 = -114;
         } else if (var0 == 8216) {
            var2 = -111;
         } else if (var0 == 8217) {
            var2 = -110;
         } else if (var0 == 8220) {
            var2 = -109;
         } else if (var0 == 8221) {
            var2 = -108;
         } else if (var0 == 8226) {
            var2 = -107;
         } else if (var0 == 8211) {
            var2 = -106;
         } else if (var0 == 8212) {
            var2 = -105;
         } else if (var0 == 732) {
            var2 = -104;
         } else if (var0 == 8482) {
            var2 = -103;
         } else if (var0 == 353) {
            var2 = -102;
         } else if (var0 == 8250) {
            var2 = -101;
         } else if (var0 == 339) {
            var2 = -100;
         } else if (var0 == 382) {
            var2 = -98;
         } else if (var0 == 376) {
            var2 = -97;
         } else {
            var2 = 63;
         }
      } else {
         var2 = (byte)var0;
      }

      return var2;
   }

   public static int method5851(byte[] var0, int var1) {
      return PacketBuffer.method6596(var0, 0, var1);
   }

   public Object call() {
      PriorityQueue var1 = this.this$0.field3110;

      while(true) {
         class298 var2 = null;
         synchronized(var1) {
            if (var1.isEmpty() || this.val$cancelled.get()) {
               return null;
            }

            var2 = (class298)var1.remove();
         }

         var2.field3154.method1175();
      }
   }
}
