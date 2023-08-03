public class class190 extends class476 {
   public static class342 field2037;
   static byte[][][] field2039;
   static class290 field2038 = new class290(64);
   public int field2036 = 0;

   class190() {
   }

   public static class190 method818(int var0) {
      class190 var2 = (class190)field2038.method5643((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = field2037.method6381(5, var0);
         var2 = new class190();
         if (var3 != null) {
            var2.method3603(new Buffer(var3));
         }

         field2038.method5640(var2, (long)var0);
         return var2;
      }
   }

   void method3603(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method3604(var1, var3);
      }
   }

   void method3604(Buffer var1, int var2) {
      if (var2 == 2) {
         this.field2036 = var1.readUnsignedShort();
      }

   }
}
