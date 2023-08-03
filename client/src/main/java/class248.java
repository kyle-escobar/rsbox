public class class248 extends class273 {
   class248() {
   }

   void method4748(PacketBuffer var1) {
      int var3 = var1.readUnsignedByte();
      if (var3 != class281.field3041.field3040) {
         throw new IllegalStateException("");
      } else {
         super.field3006 = var1.readUnsignedByte();
         super.field3001 = var1.readUnsignedByte();
         super.field3000 = var1.readUnsignedShort();
         super.field2997 = var1.readUnsignedShort();
         super.field2998 = var1.readUnsignedShort();
         super.field3003 = var1.readUnsignedShort();
         super.field3002 = var1.method8814();
         super.field2999 = var1.method8814();
      }
   }

   void method5304(PacketBuffer var1) {
      super.field3001 = Math.min(super.field3001, 4);
      super.field3004 = new short[1][64][64];
      super.field3005 = new short[super.field3001][64][64];
      super.field2996 = new byte[super.field3001][64][64];
      super.field3007 = new byte[super.field3001][64][64];
      super.field3008 = new class271[super.field3001][64][64][];
      int var3 = var1.readUnsignedByte();
      if (class284.field3058.field3055 != var3) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.readUnsignedByte();
         int var5 = var1.readUnsignedByte();
         if (var4 == super.field2998 && super.field3003 == var5) {
            for(int var6 = 0; var6 < 64; ++var6) {
               for(int var7 = 0; var7 < 64; ++var7) {
                  this.method5300(var6, var7, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class248)) {
         return false;
      } else {
         class248 var2 = (class248)var1;
         return var2.field2998 == super.field2998 && var2.field3003 == super.field3003;
      }
   }

   public int hashCode() {
      return super.field2998 | super.field3003 << 8;
   }
}
