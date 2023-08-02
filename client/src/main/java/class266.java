public class class266 extends class282 {
   static int field2966;
   final class261 field2963;
   final int field2962;
   final int field2964;
   final int field2965;

   class266(class330 var1, class330 var2, int var3, class261 var4) {
      super(var1, var2);
      this.field2962 = var3;
      this.field2963 = var4;
      class197 var5 = class197.method4100(this.method5405());
      class523 var6 = var5.method3771(false);
      if (var6 != null) {
         this.field2964 = var6.field5148;
         this.field2965 = var6.field5153;
      } else {
         this.field2964 = 0;
         this.field2965 = 0;
      }

   }

   public int method5405() {
      return this.field2962;
   }

   class261 method5381() {
      return this.field2963;
   }

   int method5385() {
      return this.field2964;
   }

   int method5386() {
      return this.field2965;
   }
}
