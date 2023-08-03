public class class221 {
   static int[] field2434 = new int[500];
   static int[] field2435 = new int[500];
   static int[] field2436 = new int[500];
   static int[] field2441 = new int[500];
   boolean field2443 = false;
   class219 field2437 = null;
   int field2438 = -1;
   int[] field2433;
   int[] field2439;
   int[] field2440;
   int[] field2442;

   class221(byte[] var1, class219 var2) {
      this.field2437 = var2;
      PacketBuffer var3 = new PacketBuffer(var1);
      PacketBuffer var4 = new PacketBuffer(var1);
      var3.offset = 2;
      int var5 = var3.readUnsignedByte();
      int var6 = -1;
      int var7 = 0;
      var4.offset = var3.offset + var5;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.readUnsignedByte();
         if (var9 > 0) {
            if (this.field2437.field2404[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if (this.field2437.field2404[var10] == 0) {
                     field2434[var7] = var10;
                     field2441[var7] = 0;
                     field2435[var7] = 0;
                     field2436[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field2434[var7] = var8;
            short var11 = 0;
            if (this.field2437.field2404[var8] == 3) {
               var11 = 128;
            }

            if ((var9 & 1) != 0) {
               field2441[var7] = var4.readSmartByteShort();
            } else {
               field2441[var7] = var11;
            }

            if ((var9 & 2) != 0) {
               field2435[var7] = var4.readSmartByteShort();
            } else {
               field2435[var7] = var11;
            }

            if ((var9 & 4) != 0) {
               field2436[var7] = var4.readSmartByteShort();
            } else {
               field2436[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if (this.field2437.field2404[var8] == 5) {
               this.field2443 = true;
            }
         }
      }

      if (var4.offset != var1.length) {
      }

      this.field2438 = var7;
      this.field2433 = new int[var7];
      this.field2440 = new int[var7];
      this.field2439 = new int[var7];
      this.field2442 = new int[var7];

      for(var8 = 0; var8 < var7; ++var8) {
         this.field2433[var8] = field2434[var8];
         this.field2440[var8] = field2441[var8];
         this.field2439[var8] = field2435[var8];
         this.field2442[var8] = field2436[var8];
      }

   }
}
