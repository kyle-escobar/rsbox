public class class169 extends class133 {
   static class97 field1805;
   static int field1810;
   String field1809;
   long field1806;
   // $FF: synthetic field
   final class148 this$0;

   class169(class148 var1) {
      this.this$0 = var1;
      this.field1806 = -1L;
      this.field1809 = null;
   }

   static float method3302(class143 var0, float var1) {
      if (null == var0) {
         return 0.0F;
      } else {
         float var3 = var1 - var0.field1325;
         return (var0.field1329 + (var0.field1327 * var3 + var0.field1328) * var3) * var3 + var0.field1337;
      }
   }

   void method2457(class519 var1) {
      if (var1.method8748() != 255) {
         --var1.field5129;
         this.field1806 = var1.method8755();
      }

      this.field1809 = var1.method8758();
   }

   void method2458(class154 var1) {
      var1.method2594(this.field1806, this.field1809);
   }
}
