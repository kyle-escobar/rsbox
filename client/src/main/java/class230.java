public class class230 {
   class115[] field2517;
   int field2518;

   class230(PacketBuffer var1, int var2) {
      this.field2517 = new class115[var2];
      this.field2518 = var1.readUnsignedByte();

      for(int var3 = 0; var3 < this.field2517.length; ++var3) {
         class115 var4 = new class115(this.field2518, var1, false);
         this.field2517[var3] = var4;
      }

      this.method4368();
   }

   void method4368() {
      class115[] var2 = this.field2517;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class115 var4 = var2[var3];
         if (var4.field1101 >= 0) {
            var4.field1096 = this.field2517[var4.field1101];
         }
      }

   }

   public int method4367() {
      return this.field2517.length;
   }

   class115 method4370(int var1) {
      return var1 >= this.method4367() ? null : this.field2517[var1];
   }

   class115[] method4385() {
      return this.field2517;
   }

   void method4372(class156 var1, int var2) {
      this.method4371(var1, var2, (boolean[])null, false);
   }

   void method4371(class156 var1, int var2, boolean[] var3, boolean var4) {
      int var6 = var1.method2686();
      int var7 = 0;
      class115[] var8 = this.method4385();

      for(int var9 = 0; var9 < var8.length; ++var9) {
         class115 var10 = var8[var9];
         if (null == var3 || var3[var7] == var4) {
            var1.method2663(var2, var10, var7, var6);
         }

         ++var7;
      }

   }
}
