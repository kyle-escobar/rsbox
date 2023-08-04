public final class class77 extends class470 {
   static class368 field643 = new class368();
   class184 field644;
   class46 field646;
   class46 field649;
   int field637;
   int field638;
   int field639;
   int field640;
   int field641;
   int field642;
   int field645;
   int field648;
   int field650;
   int field654;
   int[] field647;

   class77() {
   }

   static void method2555() {
      for(class77 var1 = (class77)field643.method6706(); null != var1; var1 = (class77)field643.method6687()) {
         if (null != var1.field646) {
            class103.field1019.method468(var1.field646);
            var1.field646 = null;
         }

         if (var1.field649 != null) {
            class103.field1019.method468(var1.field649);
            var1.field649 = null;
         }
      }

      field643.method6692();
   }

   static void method261() {
      for(class77 var1 = (class77)field643.method6706(); var1 != null; var1 = (class77)field643.method6687()) {
         if (null != var1.field644) {
            var1.method1575();
         }
      }

   }

   static void method1507(int var0, int var1, int var2, class184 var3, int var4) {
      class77 var6 = new class77();
      var6.field637 = var0;
      var6.field638 = var1 * 128;
      var6.field639 = var2 * 128;
      int var7 = var3.field1940;
      int var8 = var3.field1944;
      if (var4 == 1 || var4 == 3) {
         var7 = var3.field1944;
         var8 = var3.field1940;
      }

      var6.field640 = 128 * (var1 + var7);
      var6.field650 = 128 * (var2 + var8);
      var6.field641 = var3.field1949;
      var6.field642 = var3.field1950 * 128;
      var6.field645 = var3.field1931;
      var6.field654 = var3.field1952;
      var6.field647 = var3.field1953;
      if (var3.field1946 != null) {
         var6.field644 = var3;
         var6.method1575();
      }

      field643.method6680(var6);
      if (var6.field647 != null) {
         var6.field648 = var6.field645 + (int)(Math.random() * (double)(var6.field654 - var6.field645));
      }

   }

   static void method8024(int var0, int var1, int var2, int var3) {
      for(class77 var5 = (class77)field643.method6706(); var5 != null; var5 = (class77)field643.method6687()) {
         if (var5.field641 != -1 || var5.field647 != null) {
            int var6 = 0;
            if (var1 > var5.field640) {
               var6 += var1 - var5.field640;
            } else if (var1 < var5.field638) {
               var6 += var5.field638 - var1;
            }

            if (var2 > var5.field650) {
               var6 += var2 - var5.field650;
            } else if (var2 < var5.field639) {
               var6 += var5.field639 - var2;
            }

            if (var6 - 64 <= var5.field642 && class141.clientPreferences.method1629() != 0 && var0 == var5.field637) {
               var6 -= 64;
               if (var6 < 0) {
                  var6 = 0;
               }

               int var7 = (var5.field642 - var6) * class141.clientPreferences.method1629() / var5.field642;
               if (null == var5.field646) {
                  if (var5.field641 >= 0) {
                     class29 var8 = class29.method434(class136.field1254, var5.field641, 0);
                     if (null != var8) {
                        class35 var9 = var8.method430().method523(class34.field167);
                        class46 var10 = class46.method848(var9, 100, var7);
                        var10.method851(-1);
                        class103.field1019.method449(var10);
                        var5.field646 = var10;
                     }
                  }
               } else {
                  var5.field646.method1006(var7);
               }

               if (var5.field649 == null) {
                  if (var5.field647 != null && (var5.field648 -= var3) <= 0) {
                     int var12 = (int)(Math.random() * (double)var5.field647.length);
                     class29 var13 = class29.method434(class136.field1254, var5.field647[var12], 0);
                     if (null != var13) {
                        class35 var14 = var13.method430().method523(class34.field167);
                        class46 var11 = class46.method848(var14, 100, var7);
                        var11.method851(0);
                        class103.field1019.method449(var11);
                        var5.field649 = var11;
                        var5.field648 = var5.field645 + (int)(Math.random() * (double)(var5.field654 - var5.field645));
                     }
                  }
               } else {
                  var5.field649.method1006(var7);
                  if (!var5.field649.method8120()) {
                     var5.field649 = null;
                  }
               }
            } else {
               if (null != var5.field646) {
                  class103.field1019.method468(var5.field646);
                  var5.field646 = null;
               }

               if (var5.field649 != null) {
                  class103.field1019.method468(var5.field649);
                  var5.field649 = null;
               }
            }
         }
      }

   }

   void method1575() {
      int var2 = this.field641;
      class184 var3 = this.field644.method3456();
      if (null != var3) {
         this.field641 = var3.field1949;
         this.field642 = var3.field1950 * 128;
         this.field645 = var3.field1931;
         this.field654 = var3.field1952;
         this.field647 = var3.field1953;
      } else {
         this.field641 = -1;
         this.field642 = 0;
         this.field645 = 0;
         this.field654 = 0;
         this.field647 = null;
      }

      if (this.field641 != var2 && this.field646 != null) {
         class103.field1019.method468(this.field646);
         this.field646 = null;
      }

   }
}
