public class class57 {
   byte[] field409 = null;
   int field406 = 0;
   int field407 = 0;

   class57() {
   }

   int method1163(int var1) {
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = 0; var1 >= 8 - this.field407; var1 -= var5) {
         var5 = 8 - this.field407;
         int var6 = (1 << var5) - 1;
         var3 += (this.field409[this.field406] >> this.field407 & var6) << var4;
         this.field407 = 0;
         ++this.field406;
         var4 += var5;
      }

      if (var1 > 0) {
         var5 = (1 << var1) - 1;
         var3 += (this.field409[this.field406] >> this.field407 & var5) << var4;
         this.field407 += var1;
      }

      return var3;
   }

   int method1164() {
      int var2 = this.field409[this.field406] >> this.field407 & 1;
      ++this.field407;
      this.field406 += this.field407 >> 3;
      this.field407 &= 7;
      return var2;
   }

   void method1165(byte[] var1, int var2) {
      this.field409 = var1;
      this.field406 = var2;
      this.field407 = 0;
   }
}
