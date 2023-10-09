public class class109 extends class442 {
   static Scene field1065;
   static class424 field1069;
   static int field1067;
   final boolean field1066;

   public class109(boolean var1) {
      this.field1066 = var1;
   }

   int method2169(class417 var1, class417 var2) {
      if (0 != var1.field4575) {
         if (var2.field4575 == 0) {
            return this.field1066 ? -1 : 1;
         }
      } else if (0 != var2.field4575) {
         return this.field1066 ? 1 : -1;
      }

      return this.method7818(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method2169((class417)var1, (class417)var2);
   }
}
