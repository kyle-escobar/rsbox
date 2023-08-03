public class class285 implements class286 {
   int field3060;
   int field3061;
   int field3063;
   int field3064;
   int field3065;
   int field3066;

   class285() {
   }

   public void method5436(class253 var1) {
      if (var1.field2854 > this.field3063) {
         var1.field2854 = this.field3063;
      }

      if (var1.field2855 < this.field3063) {
         var1.field2855 = this.field3063;
      }

      if (var1.field2851 > this.field3065) {
         var1.field2851 = this.field3065;
      }

      if (var1.field2856 < this.field3065) {
         var1.field2856 = this.field3065;
      }

   }

   public boolean method5440(int var1, int var2, int var3) {
      if (var1 >= this.field3066 && var1 < this.field3066 + this.field3060) {
         return this.field3061 == var2 >> 6 && var3 >> 6 == this.field3064;
      } else {
         return false;
      }
   }

   public boolean method5437(int var1, int var2) {
      return this.field3063 == var1 >> 6 && this.field3065 == var2 >> 6;
   }

   public int[] method5438(int var1, int var2, int var3) {
      if (!this.method5440(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{var2 + (this.field3063 * 64 - this.field3061 * 64), var3 + (this.field3065 * 64 - this.field3064 * 64)};
         return var5;
      }
   }

   public class330 method5449(int var1, int var2) {
      if (!this.method5437(var1, var2)) {
         return null;
      } else {
         int var4 = this.field3061 * 64 - this.field3063 * 64 + var1;
         int var5 = var2 + (this.field3064 * 64 - this.field3065 * 64);
         return new class330(this.field3066, var4, var5);
      }
   }

   public void method5444(Buffer var1) {
      this.field3066 = var1.readUnsignedByte();
      this.field3060 = var1.readUnsignedByte();
      this.field3061 = var1.readUnsignedShort();
      this.field3064 = var1.readUnsignedShort();
      this.field3063 = var1.readUnsignedShort();
      this.field3065 = var1.readUnsignedShort();
      this.method5418();
   }

   void method5418() {
   }
}
