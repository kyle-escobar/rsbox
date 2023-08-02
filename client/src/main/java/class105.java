public class class105 extends class442 {
   static String field1041;
   final boolean field1040;

   public class105(boolean var1) {
      this.field1040 = var1;
   }

   int method2122(class417 var1, class417 var2) {
      if (var2.field4577 != var1.field4577) {
         return this.field1040 ? var1.field4577 - var2.field4577 : var2.field4577 - var1.field4577;
      } else {
         return this.method7818(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2122((class417)var1, (class417)var2);
   }
}
