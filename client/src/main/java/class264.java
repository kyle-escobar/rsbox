public class class264 implements class286 {
   int field2940;
   int field2941;
   int field2942;
   int field2943;
   int field2944;
   int field2946;
   int field2947;
   int field2948;
   int field2949;
   int field2950;

   class264() {
   }

   public void method5436(class253 var1) {
      if (var1.field2854 > this.field2943) {
         var1.field2854 = this.field2943;
      }

      if (var1.field2855 < this.field2943) {
         var1.field2855 = this.field2943;
      }

      if (var1.field2851 > this.field2949) {
         var1.field2851 = this.field2949;
      }

      if (var1.field2856 < this.field2949) {
         var1.field2856 = this.field2949;
      }

   }

   public boolean method5440(int var1, int var2, int var3) {
      if (var1 >= this.field2942 && var1 < this.field2942 + this.field2940) {
         return var2 >= (this.field2944 << 3) + (this.field2941 << 6) && var2 <= 7 + (this.field2941 << 6) + (this.field2944 << 3) && var3 >= (this.field2948 << 6) + (this.field2946 << 3) && var3 <= (this.field2946 << 3) + (this.field2948 << 6) + 7;
      } else {
         return false;
      }
   }

   public boolean method5437(int var1, int var2) {
      return var1 >= (this.field2943 << 6) + (this.field2947 << 3) && var1 <= (this.field2943 << 6) + (this.field2947 << 3) + 7 && var2 >= (this.field2949 << 6) + (this.field2950 << 3) && var2 <= (this.field2949 << 6) + (this.field2950 << 3) + 7;
   }

   public int[] method5438(int var1, int var2, int var3) {
      if (!this.method5440(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field2947 * 8 - this.field2944 * 8 + var2 + (this.field2943 * 64 - this.field2941 * 64), var3 + (this.field2949 * 64 - this.field2948 * 64) + (this.field2950 * 8 - this.field2946 * 8)};
         return var5;
      }
   }

   public class330 method5449(int var1, int var2) {
      if (!this.method5437(var1, var2)) {
         return null;
      } else {
         int var4 = var1 + (this.field2941 * 64 - this.field2943 * 64) + (this.field2944 * 8 - this.field2947 * 8);
         int var5 = this.field2946 * 8 - this.field2950 * 8 + var2 + (this.field2948 * 64 - this.field2949 * 64);
         return new class330(this.field2942, var4, var5);
      }
   }

   public void method5444(PacketBuffer var1) {
      this.field2942 = var1.readUnsignedByte();
      this.field2940 = var1.readUnsignedByte();
      this.field2941 = var1.readUnsignedShort();
      this.field2944 = var1.readUnsignedByte();
      this.field2948 = var1.readUnsignedShort();
      this.field2946 = var1.readUnsignedByte();
      this.field2943 = var1.readUnsignedShort();
      this.field2947 = var1.readUnsignedByte();
      this.field2949 = var1.readUnsignedShort();
      this.field2950 = var1.readUnsignedByte();
      this.method5184();
   }

   void method5184() {
   }
}
