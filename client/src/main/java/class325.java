public class class325 extends class51 {
   class289 field3542;
   class31 field3544 = new class31();
   class368 field3543 = new class368();

   class325(class289 var1) {
      this.field3542 = var1;
   }

   public static String method5891(CharSequence var0) {
      long var4 = 0L;
      int var6 = var0.length();

      for(int var7 = 0; var7 < var6; ++var7) {
         var4 *= 37L;
         char var8 = var0.charAt(var7);
         if (var8 >= 'A' && var8 <= 'Z') {
            var4 += (long)(var8 + 1 - 65);
         } else if (var8 >= 'a' && var8 <= 'z') {
            var4 += (long)(var8 + 1 - 97);
         } else if (var8 >= '0' && var8 <= '9') {
            var4 += (long)(var8 + 27 - 48);
         }

         if (var4 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var4 % 37L && var4 != 0L) {
         var4 /= 37L;
      }

      String var9 = class365.method3380(var4);
      if (null == var9) {
         var9 = "";
      }

      return var9;
   }

   protected class51 method1040() {
      class335 var1 = (class335)this.field3543.method6706();
      if (null == var1) {
         return null;
      } else {
         return (class51)(var1.field3767 != null ? var1.field3767 : this.method1043());
      }
   }

   protected class51 method1043() {
      class335 var1;
      do {
         var1 = (class335)this.field3543.method6687();
         if (var1 == null) {
            return null;
         }
      } while(null == var1.field3767);

      return var1.field3767;
   }

   protected int method1042() {
      return 0;
   }

   protected void method1044(int[] var1, int var2, int var3) {
      this.field3544.method1044(var1, var2, var3);

      for(class335 var6 = (class335)this.field3543.method6706(); var6 != null; var6 = (class335)this.field3543.method6687()) {
         if (!this.field3542.method5557(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.field3757) {
                  this.method5893(var6, var1, var4, var5, var4 + var5);
                  var6.field3757 -= var5;
                  break;
               }

               this.method5893(var6, var1, var4, var6.field3757, var5 + var4);
               var4 += var6.field3757;
               var5 -= var6.field3757;
            } while(!this.field3542.method5558(var6, var1, var4, var5));
         }
      }

   }

   protected void method1045(int var1) {
      this.field3544.method1045(var1);

      for(class335 var3 = (class335)this.field3543.method6706(); var3 != null; var3 = (class335)this.field3543.method6687()) {
         if (!this.field3542.method5557(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.field3757) {
                  this.method5892(var3, var2);
                  var3.field3757 -= var2;
                  break;
               }

               this.method5892(var3, var3.field3757);
               var2 -= var3.field3757;
            } while(!this.field3542.method5558(var3, (int[])null, 0, var2));
         }
      }

   }

   void method5893(class335 var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (this.field3542.field3107[var1.field3765] & 4) && var1.field3770 < 0) {
         int var7 = this.field3542.field3114[var1.field3765] / class37.field198;

         while(true) {
            int var8 = (var7 + 1048575 - var1.field3776) / var7;
            if (var8 > var4) {
               var1.field3776 += var7 * var4;
               break;
            }

            var1.field3767.method1044(var2, var3, var8);
            var3 += var8;
            var4 -= var8;
            var1.field3776 += var8 * var7 - 1048576;
            int var9 = class37.field198 / 100;
            int var10 = 262144 / var7;
            if (var10 < var9) {
               var9 = var10;
            }

            class46 var11 = var1.field3767;
            if (0 == this.field3542.field3098[var1.field3765]) {
               var1.field3767 = class46.method849(var1.field3758, var11.method864(), var11.method969(), var11.method880());
            } else {
               var1.field3767 = class46.method849(var1.field3758, var11.method864(), 0, var11.method880());
               this.field3542.method5539(var1, var1.field3760.field3157[var1.field3761] < 0);
               var1.field3767.method860(var9, var11.method969());
            }

            if (var1.field3760.field3157[var1.field3761] < 0) {
               var1.field3767.method851(-1);
            }

            var11.method862(var9);
            var11.method1044(var2, var3, var5 - var3);
            if (var11.method993()) {
               this.field3544.method449(var11);
            }
         }
      }

      var1.field3767.method1044(var2, var3, var4);
   }

   void method5892(class335 var1, int var2) {
      if ((this.field3542.field3107[var1.field3765] & 4) != 0 && var1.field3770 < 0) {
         int var4 = this.field3542.field3114[var1.field3765] / class37.field198;
         int var5 = (var4 + 1048575 - var1.field3776) / var4;
         var1.field3776 = var2 * var4 + var1.field3776 & 1048575;
         if (var5 <= var2) {
            if (this.field3542.field3098[var1.field3765] == 0) {
               var1.field3767 = class46.method849(var1.field3758, var1.field3767.method864(), var1.field3767.method969(), var1.field3767.method880());
            } else {
               var1.field3767 = class46.method849(var1.field3758, var1.field3767.method864(), 0, var1.field3767.method880());
               this.field3542.method5539(var1, var1.field3760.field3157[var1.field3761] < 0);
            }

            if (var1.field3760.field3157[var1.field3761] < 0) {
               var1.field3767.method851(-1);
            }

            var2 = var1.field3776 / var4;
         }
      }

      var1.field3767.method1045(var2);
   }
}
