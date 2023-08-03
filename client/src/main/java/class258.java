public class class258 implements class286 {
   int field2912;
   int field2913;
   int field2914;
   int field2915;
   int field2916;
   int field2917;
   int field2918;
   int field2919;
   int field2920;
   int field2921;

   class258() {
   }

   public void method5436(class253 var1) {
      if (var1.field2854 > this.field2918) {
         var1.field2854 = this.field2918;
      }

      if (var1.field2855 < this.field2920) {
         var1.field2855 = this.field2920;
      }

      if (var1.field2851 > this.field2917) {
         var1.field2851 = this.field2917;
      }

      if (var1.field2856 < this.field2915) {
         var1.field2856 = this.field2915;
      }

   }

   public boolean method5440(int var1, int var2, int var3) {
      if (var1 >= this.field2921 && var1 < this.field2921 + this.field2913) {
         return var2 >> 6 >= this.field2914 && var2 >> 6 <= this.field2916 && var3 >> 6 >= this.field2919 && var3 >> 6 <= this.field2912;
      } else {
         return false;
      }
   }

   public boolean method5437(int var1, int var2) {
      return var1 >> 6 >= this.field2918 && var1 >> 6 <= this.field2920 && var2 >> 6 >= this.field2917 && var2 >> 6 <= this.field2915;
   }

   public int[] method5438(int var1, int var2, int var3) {
      if (!this.method5440(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{var2 + (this.field2918 * 64 - this.field2914 * 64), var3 + (this.field2917 * 64 - this.field2919 * 64)};
         return var5;
      }
   }

   public class330 method5449(int var1, int var2) {
      if (!this.method5437(var1, var2)) {
         return null;
      } else {
         int var4 = this.field2914 * 64 - this.field2918 * 64 + var1;
         int var5 = this.field2919 * 64 - this.field2917 * 64 + var2;
         return new class330(this.field2921, var4, var5);
      }
   }

   public void method5444(PacketBuffer var1) {
      this.field2921 = var1.readUnsignedByte();
      this.field2913 = var1.readUnsignedByte();
      this.field2914 = var1.readUnsignedShort();
      this.field2919 = var1.readUnsignedShort();
      this.field2916 = var1.readUnsignedShort();
      this.field2912 = var1.readUnsignedShort();
      this.field2918 = var1.readUnsignedShort();
      this.field2917 = var1.readUnsignedShort();
      this.field2920 = var1.readUnsignedShort();
      this.field2915 = var1.readUnsignedShort();
      this.method5148();
   }

   void method5148() {
   }
}
