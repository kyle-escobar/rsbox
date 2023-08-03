public class class170 extends class188 {
   int field1811 = 0;
   int field1813 = 1;
   int field1815 = 256;
   int field1816;
   long field1814 = class302.safeTime();
   long[] field1812 = new long[10];

   public class170() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field1812[var1] = this.field1814;
      }

   }

   public void method3588() {
      for(int var2 = 0; var2 < 10; ++var2) {
         this.field1812[var2] = 0L;
      }

   }

   public int method3590(int var1, int var2) {
      int var4 = this.field1815;
      int var5 = this.field1813;
      this.field1815 = 300;
      this.field1813 = 1;
      this.field1814 = class302.safeTime();
      if (0L == this.field1812[this.field1816]) {
         this.field1815 = var4;
         this.field1813 = var5;
      } else if (this.field1814 > this.field1812[this.field1816]) {
         this.field1815 = (int)((long)(var1 * 2560) / (this.field1814 - this.field1812[this.field1816]));
      }

      if (this.field1815 < 25) {
         this.field1815 = 25;
      }

      if (this.field1815 > 256) {
         this.field1815 = 256;
         this.field1813 = (int)((long)var1 - (this.field1814 - this.field1812[this.field1816]) / 10L);
      }

      if (this.field1813 > var1) {
         this.field1813 = var1;
      }

      this.field1812[this.field1816] = this.field1814;
      this.field1816 = (this.field1816 + 1) % 10;
      int var6;
      if (this.field1813 > 1) {
         for(var6 = 0; var6 < 10; ++var6) {
            if (this.field1812[var6] != 0L) {
               this.field1812[var6] += (long)this.field1813;
            }
         }
      }

      if (this.field1813 < var2) {
         this.field1813 = var2;
      }

      class292.method354((long)this.field1813);

      for(var6 = 0; this.field1811 < 256; this.field1811 += this.field1815) {
         ++var6;
      }

      this.field1811 &= 255;
      return var6;
   }
}
