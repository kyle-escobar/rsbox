public final class class104 extends class470 {
   static class127 field1038;
   int field1022;
   int field1023;
   int field1024;
   int field1025;
   int field1026;
   int field1027;
   int field1028;
   int field1029;
   int field1030;
   int field1031;
   int field1032 = 31;
   int field1033 = 0;
   int field1034 = -1;
   int field1036;

   class104() {
   }

   static class363 method2120(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      class449 var6 = null;
      if (class160.field1750 != null) {
         var6 = new class449(var0, class160.field1750, class302.field3191[var0], 1000000);
      }

      return new class363(var6, class157.field1740, Js5NetQueue.field1356, var0, var1, var2, var3, var4);
   }

   void method2115(int var1) {
      this.field1032 = var1;
   }

   boolean method2111(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field1032 & 1 << var1) != 0;
      } else {
         return true;
      }
   }
}
