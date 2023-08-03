public class class307 {
   static class537[] field3350;
   static String field3346;

   class307() throws Throwable {
   }

   public static String method5741(PacketBuffer var0) {
      String var2;
      try {
         int var3 = var0.readUnsignedSmartByteShort();
         if (var3 > 32767) {
            var3 = 32767;
         }

         byte[] var4 = new byte[var3];
         var0.offset += class324.field3541.method5785(var0.data, var0.offset, var4, 0, var3);
         String var5 = CP1252UTF8.cp1252ToUtf8(var4, 0, var3);
         var2 = var5;
      } catch (Exception var6) {
         var2 = "Cabbage";
      }

      return var2;
   }
}
