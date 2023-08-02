public class class214 {
   int field2323;
   int field2324;
   int field2325;
   int field2326;
   int field2327;
   int field2328;

   class214(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field2326 = var1;
      this.field2324 = var2;
      this.field2323 = var3;
      this.field2325 = var4;
      this.field2327 = var5;
      this.field2328 = var6;
   }

   static final boolean method4047(int var0, int var1, int var2, int var3, int var4) {
      class104 var6 = null;

      for(class104 var7 = (class104) Client.field1593.method6706(); var7 != null; var7 = (class104) Client.field1593.method6687()) {
         if (var7.field1036 == var0 && var1 == var7.field1023 && var7.field1024 == var2 && var7.field1022 == var3) {
            var6 = var7;
            break;
         }
      }

      if (var6 != null) {
         var6.field1030 = var4;
         return true;
      } else {
         return false;
      }
   }
}
