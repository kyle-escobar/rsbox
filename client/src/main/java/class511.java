public class class511 {
   static final int field5096 = (int)(Math.pow(2.0, 4.0) - 1.0);
   static final int field5097 = (int)(Math.pow(2.0, 8.0) - 1.0);

   class511() throws Throwable {
   }

   public static int method4906(int var0) {
      return var0 >>> 12;
   }

   public static int method1574(int var0) {
      return var0 >>> 4 & field5097;
   }

   static Object[] method302(Buffer var0, int[] var1) {
      int var3 = var0.readUnsignedSmartByteShort();
      Object[] var4 = new Object[var3 * var1.length];

      for(int var5 = 0; var5 < var3; ++var5) {
         for(int var6 = 0; var6 < var1.length; ++var6) {
            int var7 = var6 + var5 * var1.length;
            class507 var8 = class516.method7421(var1[var6]);
            var4[var7] = var8.method8596(var0);
         }
      }

      return var4;
   }
}
