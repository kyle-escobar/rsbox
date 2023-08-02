public class class128 extends class442 {
   static int field1214;
   final boolean field1212;

   public class128(boolean var1) {
      this.field1212 = var1;
   }

   int method2414(class417 var1, class417 var2) {
      if (0 != var1.field4575 && 0 != var2.field4575) {
         return this.field1212 ? var1.method7542().method9154(var2.method7542()) : var2.method7542().method9154(var1.method7542());
      } else {
         return this.method7818(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2414((class417)var1, (class417)var2);
   }
}
