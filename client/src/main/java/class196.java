public class class196 extends class476 {
   public static class290 field2143 = new class290(64);
   public static class342 field2144;
   static String field2146;
   static final int[] field2145 = new int[32];
   public int field2140;
   public int field2141;
   public int field2142;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2145[var1] = var0 - 1;
         var0 += var0;
      }

   }

   public static void method1032(class342 var0) {
      field2144 = var0;
   }

   public void method3754(PacketBuffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method3755(var1, var3);
      }
   }

   void method3755(PacketBuffer var1, int var2) {
      if (var2 == 1) {
         this.field2142 = var1.readUnsignedShort();
         this.field2140 = var1.readUnsignedByte();
         this.field2141 = var1.readUnsignedByte();
      }

   }
}
