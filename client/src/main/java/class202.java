public class class202 extends class476 {
   static class290 field2191 = new class290(64);
   static class342 field2192;
   class469 field2190;

   class202() {
   }

   public static void method64(class342 var0) {
      field2192 = var0;
   }

   public static void method2657() {
      field2191.method5637();
   }

   void method3831() {
   }

   void method3824(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method3822(var1, var3);
      }
   }

   void method3822(Buffer var1, int var2) {
      if (var2 == 249) {
         this.field2190 = class200.method2466(var1, this.field2190);
      }

   }

   public int method3826(int var1, int var2) {
      return class200.method3300(this.field2190, var1, var2);
   }

   public String method3827(int var1, String var2) {
      class469 var5 = this.field2190;
      String var4;
      if (null == var5) {
         var4 = var2;
      } else {
         class486 var6 = (class486)var5.method8096((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = (String)var6.field4940;
         }
      }

      return var4;
   }
}
