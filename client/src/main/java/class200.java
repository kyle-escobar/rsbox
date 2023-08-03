public class class200 {
   static class363 field2181;

   class200() throws Throwable {
   }

   static final class469 method2466(Buffer var0, class469 var1) {
      int var3 = var0.readUnsignedByte();
      int var4;
      if (null == var1) {
         var4 = class311.method2196(var3);
         var1 = new class469(var4);
      }

      for(var4 = 0; var4 < var3; ++var4) {
         boolean var5 = var0.readUnsignedByte() == 1;
         int var6 = var0.readUnsignedMedium();
         Object var7;
         if (var5) {
            var7 = new class486(var0.readString());
         } else {
            var7 = new class492(var0.readInt());
         }

         var1.method8097((class470)var7, (long)var6);
      }

      return var1;
   }

   static int method3300(class469 var0, int var1, int var2) {
      if (null == var0) {
         return var2;
      } else {
         class492 var4 = (class492)var0.method8096((long)var1);
         return null == var4 ? var2 : var4.field4960;
      }
   }
}
