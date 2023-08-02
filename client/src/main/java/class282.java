public abstract class class282 {
   static class537[] field3048;
   int field3042;
   int field3044;
   public final class330 field3043;
   public final class330 field3046;

   class282(class330 var1, class330 var2) {
      this.field3043 = var1;
      this.field3046 = var2;
   }

   abstract class261 method5381();

   abstract int method5385();

   abstract int method5386();

   public abstract int method5405();

   boolean method5382(int var1, int var2) {
      if (this.method5388(var1, var2)) {
         return true;
      } else {
         return this.method5384(var1, var2);
      }
   }

   boolean method5387() {
      return this.method5405() >= 0;
   }

   boolean method5388(int var1, int var2) {
      if (!this.method5387()) {
         return false;
      } else {
         class197 var4 = class197.method4100(this.method5405());
         int var5 = this.method5385();
         int var6 = this.method5386();
         switch (var4.field2166.field2241) {
            case 0:
               if (var1 < this.field3044 - var5 / 2 || var1 > this.field3044 + var5 / 2) {
                  return false;
               }
               break;
            case 1:
               if (var1 <= this.field3044 - var5 || var1 > this.field3044) {
                  return false;
               }
               break;
            case 2:
               if (var1 < this.field3044 || var1 >= this.field3044 + var5) {
                  return false;
               }
         }

         switch (var4.field2164.field2122) {
            case 0:
               if (var2 <= this.field3042 - var6 || var2 > this.field3042) {
                  return false;
               }
               break;
            case 1:
               if (var2 >= this.field3042 && var2 < var6 + this.field3042) {
                  break;
               }

               return false;
            case 2:
               if (var2 < this.field3042 - var6 / 2 || var2 > var6 / 2 + this.field3042) {
                  return false;
               }
         }

         return true;
      }
   }

   boolean method5384(int var1, int var2) {
      class261 var4 = this.method5381();
      if (var4 == null) {
         return false;
      } else if (var1 >= this.field3044 - var4.field2933 / 2 && var1 <= var4.field2933 / 2 + this.field3044) {
         return var2 >= this.field3042 && var2 <= var4.field2932 + this.field3042;
      } else {
         return false;
      }
   }
}
