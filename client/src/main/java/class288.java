public class class288 {
   static final byte[] field3078 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   class519 field3075 = new class519((byte[])null);
   int field3069;
   int field3070;
   int[] field3071;
   int[] field3072;
   int[] field3073;
   int[] field3076;
   long field3077;

   class288() {
   }

   void method5466(byte[] var1) {
      this.field3075.field5127 = var1;
      this.field3075.field5129 = 10;
      int var2 = this.field3075.method8750();
      this.field3070 = this.field3075.method8750();
      this.field3069 = 500000;
      this.field3071 = new int[var2];

      class519 var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.field5129 += var5) {
         int var4 = this.field3075.method9000();
         var5 = this.field3075.method9000();
         if (var4 == 1297379947) {
            this.field3071[var3] = this.field3075.field5129;
            ++var3;
         }

         var10000 = this.field3075;
      }

      this.field3077 = 0L;
      this.field3072 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field3072[var3] = this.field3071[var3];
      }

      this.field3073 = new int[var2];
      this.field3076 = new int[var2];
   }

   void method5486() {
      this.field3075.field5127 = null;
      this.field3071 = null;
      this.field3072 = null;
      this.field3073 = null;
      this.field3076 = null;
   }

   boolean method5503() {
      return this.field3075.field5127 != null;
   }

   int method5468() {
      return this.field3072.length;
   }

   void method5469(int var1) {
      this.field3075.field5129 = this.field3072[var1];
   }

   void method5470(int var1) {
      this.field3072[var1] = this.field3075.field5129;
   }

   void method5471() {
      this.field3075.field5129 = -1;
   }

   void method5472(int var1) {
      int var2 = this.field3075.method8769();
      int[] var10000 = this.field3073;
      var10000[var1] += var2;
   }

   int method5473(int var1) {
      int var2 = this.method5474(var1);
      return var2;
   }

   int method5474(int var1) {
      int var2 = this.field3075.field5127[this.field3075.field5129];
      if (var2 < 0) {
         var2 &= 255;
         this.field3076[var1] = var2;
         ++this.field3075.field5129;
      } else {
         var2 = this.field3076[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return this.method5475(var1, var2);
      } else {
         int var3 = this.field3075.method8769();
         if (var2 == 247 && var3 > 0) {
            int var4 = this.field3075.field5127[this.field3075.field5129] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               ++this.field3075.field5129;
               this.field3076[var1] = var4;
               return this.method5475(var1, var4);
            }
         }

         class519 var10000 = this.field3075;
         var10000.field5129 += var3;
         return 0;
      }
   }

   int method5475(int var1, int var2) {
      int var3;
      int var4;
      if (var2 == 255) {
         var3 = this.field3075.method8748();
         var4 = this.field3075.method8769();
         class519 var10000;
         if (var3 == 47) {
            var10000 = this.field3075;
            var10000.field5129 += var4;
            return 1;
         } else if (var3 == 81) {
            int var5 = this.field3075.method8752();
            var4 -= 3;
            int var6 = this.field3073[var1];
            this.field3077 += (long)var6 * (long)(this.field3069 - var5);
            this.field3069 = var5;
            var10000 = this.field3075;
            var10000.field5129 += var4;
            return 2;
         } else {
            var10000 = this.field3075;
            var10000.field5129 += var4;
            return 3;
         }
      } else {
         var3 = field3078[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.field3075.method8748() << 8;
         }

         if (var3 >= 2) {
            var4 |= this.field3075.method8748() << 16;
         }

         return var4;
      }
   }

   long method5476(int var1) {
      return this.field3077 + (long)var1 * (long)this.field3069;
   }

   int method5522() {
      int var1 = this.field3072.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field3072[var4] >= 0 && this.field3073[var4] < var3) {
            var2 = var4;
            var3 = this.field3073[var4];
         }
      }

      return var2;
   }

   boolean method5521() {
      int var1 = this.field3072.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field3072[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   void method5465(long var1) {
      this.field3077 = var1;
      int var3 = this.field3072.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field3073[var4] = 0;
         this.field3076[var4] = 0;
         this.field3075.field5129 = this.field3071[var4];
         this.method5472(var4);
         this.field3072[var4] = this.field3075.field5129;
      }

   }
}
