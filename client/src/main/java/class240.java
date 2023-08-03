import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class class240 {
   boolean field2660 = false;
   boolean field2665 = false;
   class256[][] field2664;
   class275 field2675;
   class523 field2662;
   class537[] field2666;
   int field2670;
   int field2672;
   int field2673;
   int field2674;
   HashMap field2659 = new HashMap();
   HashMap field2663;
   final class342 field2667;
   final class342 field2668;
   final HashMap field2671;
   public int field2669 = 0;

   public class240(class537[] var1, HashMap var2, class342 var3, class342 var4) {
      this.field2666 = var1;
      this.field2671 = var2;
      this.field2667 = var3;
      this.field2668 = var4;
   }

   static final void method4651(class332 var0, int var1, int var2, int var3) {
      Client.method2290();
      class321 var5 = var0.method6222(false);
      if (null != var5) {
         class535.method9304(var1, var2, var5.field3517 + var1, var2 + var5.field3518);
         if (2 != Client.field1586 && 5 != Client.field1586) {
            int var6 = Client.field1569 & 2047;
            int var7 = 48 + class146.field1362.field949 / 32;
            int var8 = 464 - class146.field1362.field963 / 32;
            class247.field2715.method9052(var1, var2, var5.field3517, var5.field3518, var7, var8, var6, 256, var5.field3520, var5.field3519);

            int var9;
            int var10;
            int var11;
            for(var9 = 0; var9 < Client.field1536; ++var9) {
               var10 = Client.field1676[var9] * 4 + 2 - class146.field1362.field949 / 32;
               var11 = 2 + 4 * Client.field1492[var9] - class146.field1362.field963 / 32;
               Client.method819(var1, var2, var10, var11, Client.field1678[var9], var5);
            }

            int var12;
            int var13;
            for(var9 = 0; var9 < 104; ++var9) {
               for(var10 = 0; var10 < 104; ++var10) {
                  class368 var17 = Client.field1568[class44.field306][var9][var10];
                  if (null != var17) {
                     var12 = var9 * 4 + 2 - class146.field1362.field949 / 32;
                     var13 = 2 + var10 * 4 - class146.field1362.field963 / 32;
                     Client.method819(var1, var2, var12, var13, class297.field3148[0], var5);
                  }
               }
            }

            for(var9 = 0; var9 < Client.field1565; ++var9) {
               class86 var15 = Client.field1489[Client.field1491[var9]];
               if (var15 != null && var15.method2065()) {
                  class191 var18 = var15.field776;
                  if (null != var18 && var18.field2066 != null) {
                     var18 = var18.method3652();
                  }

                  if (null != var18 && var18.field2076 && var18.field2082) {
                     var12 = var15.field949 / 32 - class146.field1362.field949 / 32;
                     var13 = var15.field963 / 32 - class146.field1362.field963 / 32;
                     Client.method819(var1, var2, var12, var13, class297.field3148[1], var5);
                  }
               }
            }

            var9 = class116.field1116;
            int[] var16 = class116.field1120;

            for(var11 = 0; var11 < var9; ++var11) {
               class84 var19 = Client.field1527[var16[var11]];
               if (var19 != null && var19.method2065() && !var19.field760 && class146.field1362 != var19) {
                  var13 = var19.field949 / 32 - class146.field1362.field949 / 32;
                  int var14 = var19.field963 / 32 - class146.field1362.field963 / 32;
                  if (var19.method1779()) {
                     Client.method819(var1, var2, var13, var14, class297.field3148[3], var5);
                  } else if (class146.field1362.field757 != 0 && 0 != var19.field757 && var19.field757 == class146.field1362.field757) {
                     Client.method819(var1, var2, var13, var14, class297.field3148[4], var5);
                  } else if (var19.method1790()) {
                     Client.method819(var1, var2, var13, var14, class297.field3148[5], var5);
                  } else if (var19.method1787()) {
                     Client.method819(var1, var2, var13, var14, class297.field3148[6], var5);
                  } else {
                     Client.method819(var1, var2, var13, var14, class297.field3148[2], var5);
                  }
               }
            }

            if (Client.field1452 != 0 && Client.field1445 % 20 < 10) {
               if (Client.field1452 == 1 && Client.field1612 >= 0 && Client.field1612 < Client.field1489.length) {
                  class86 var20 = Client.field1489[Client.field1612];
                  if (null != var20) {
                     var12 = var20.field949 / 32 - class146.field1362.field949 / 32;
                     var13 = var20.field963 / 32 - class146.field1362.field963 / 32;
                     Client.method3217(var1, var2, var12, var13, class95.field878[1], var5);
                  }
               }

               if (2 == Client.field1452) {
                  var11 = 2 + (Client.field1455 * 4 - class342.field3837 * 4) - class146.field1362.field949 / 32;
                  var12 = Client.field1523 * 4 - class144.field1352 * 4 + 2 - class146.field1362.field963 / 32;
                  Client.method3217(var1, var2, var11, var12, class95.field878[1], var5);
               }

               if (Client.field1452 == 10 && Client.field1454 >= 0 && Client.field1454 < Client.field1527.length) {
                  class84 var21 = Client.field1527[Client.field1454];
                  if (var21 != null) {
                     var12 = var21.field949 / 32 - class146.field1362.field949 / 32;
                     var13 = var21.field963 / 32 - class146.field1362.field963 / 32;
                     Client.method3217(var1, var2, var12, var13, class95.field878[1], var5);
                  }
               }
            }

            if (Client.field1513 != 0) {
               var11 = Client.field1513 * 4 + 2 - class146.field1362.field949 / 32;
               var12 = 2 + Client.field1680 * 4 - class146.field1362.field963 / 32;
               Client.method819(var1, var2, var11, var12, class95.field878[0], var5);
            }

            if (!class146.field1362.field760) {
               class535.method9231(var5.field3517 / 2 + var1 - 1, var5.field3518 / 2 + var2 - 1, 3, 3, 16777215);
            }
         } else {
            class535.method9232(var1, var2, 0, var5.field3520, var5.field3519);
         }

         Client.field1651[var3] = true;
      }
   }

   public void method4616(class342 var1, String var2, boolean var3) {
      if (!this.field2660) {
         this.field2665 = false;
         this.field2660 = true;
         System.nanoTime();
         int var5 = var1.method6395(class276.field3025.field3022);
         int var6 = var1.method6400(var5, var2);
         Buffer var7 = new Buffer(var1.method6402(class276.field3025.field3022, var2));
         Buffer var8 = new Buffer(var1.method6402(class276.field3021.field3022, var2));
         System.nanoTime();
         System.nanoTime();
         this.field2675 = new class275();

         try {
            this.field2675.method5343(var7, var8, var6, var3);
         } catch (IllegalStateException var17) {
            return;
         }

         this.field2675.method4927();
         this.field2675.method4946();
         this.field2675.method4947();
         this.field2670 = this.field2675.method4974() * 64;
         this.field2672 = this.field2675.method4943() * 64;
         this.field2674 = (this.field2675.method4942() - this.field2675.method4974() + 1) * 64;
         this.field2673 = (this.field2675.method4944() - this.field2675.method4943() + 1) * 64;
         int var9 = this.field2675.method4942() - this.field2675.method4974() + 1;
         int var10 = this.field2675.method4944() - this.field2675.method4943() + 1;
         System.nanoTime();
         System.nanoTime();
         class256.field2910.method5666();
         this.field2664 = new class256[var9][var10];
         Iterator var11 = this.field2675.field3018.iterator();

         while(var11.hasNext()) {
            class248 var12 = (class248)var11.next();
            int var13 = var12.field2998;
            int var14 = var12.field3003;
            int var15 = var13 - this.field2675.method4974();
            int var16 = var14 - this.field2675.method4943();
            this.field2664[var15][var16] = new class256(var13, var14, this.field2675.method4939(), this.field2671);
            this.field2664[var15][var16].method5008(var12, this.field2675.field3017);
         }

         for(int var18 = 0; var18 < var9; ++var18) {
            for(int var20 = 0; var20 < var10; ++var20) {
               if (null == this.field2664[var18][var20]) {
                  this.field2664[var18][var20] = new class256(this.field2675.method4974() + var18, this.field2675.method4943() + var20, this.field2675.method4939(), this.field2671);
                  this.field2664[var18][var20].method5009(this.field2675.field3016, this.field2675.field3017);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.method6401(class276.field3026.field3022, var2)) {
            byte[] var19 = var1.method6402(class276.field3026.field3022, var2);
            this.field2662 = class32.method2580(var19);
         }

         System.nanoTime();
         var1.method6406();
         var1.method6397();
         this.field2665 = true;
      }
   }

   public final void method4626() {
      this.field2663 = null;
   }

   public final void method4618(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var10 = class535.field5201;
      int var11 = class535.field5202;
      int var12 = class535.field5203;
      float[] var13 = class535.field5204;
      int[] var14 = new int[4];
      class535.method9240(var14);
      class274 var15 = this.method4652(var1, var2, var3, var4);
      float var16 = this.method4632(var7 - var5, var3 - var1);
      int var17 = (int)Math.ceil((double)var16);
      this.field2669 = var17;
      if (!this.field2659.containsKey(var17)) {
         class269 var18 = new class269(var17);
         var18.method5264();
         this.field2659.put(var17, var18);
      }

      int var25 = var15.field3012 + var15.field3014 - 1;
      int var19 = var15.field3011 + var15.field3013 - 1;

      int var20;
      int var21;
      for(var20 = var15.field3014; var20 <= var25; ++var20) {
         for(var21 = var15.field3011; var21 <= var19; ++var21) {
            this.field2664[var20][var21].method5016(var17, (class269)this.field2659.get(var17), this.field2666, this.field2667, this.field2668);
         }
      }

      class229.method4290(var10, var11, var12, var13);
      class535.method9226(var14);
      var20 = (int)(var16 * 64.0F);
      var21 = this.field2670 + var1;
      int var22 = var2 + this.field2672;

      for(int var23 = var15.field3014; var23 < var15.field3012 + var15.field3014; ++var23) {
         for(int var24 = var15.field3011; var24 < var15.field3011 + var15.field3013; ++var24) {
            this.field2664[var23][var24].method5007((this.field2664[var23][var24].field2899 * 64 - var21) * var20 / 64 + var5, var8 - var20 * (this.field2664[var23][var24].field2900 * 64 - var22 + 64) / 64, var20);
         }
      }

   }

   public final void method4619(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      class274 var15 = this.method4652(var1, var2, var3, var4);
      float var16 = this.method4632(var7 - var5, var3 - var1);
      int var17 = (int)(var16 * 64.0F);
      int var18 = this.field2670 + var1;
      int var19 = var2 + this.field2672;

      int var20;
      int var21;
      for(var20 = var15.field3014; var20 < var15.field3012 + var15.field3014; ++var20) {
         for(var21 = var15.field3011; var21 < var15.field3013 + var15.field3011; ++var21) {
            if (var13) {
               this.field2664[var20][var21].method5011();
            }

            this.field2664[var20][var21].method5017(var17 * (this.field2664[var20][var21].field2899 * 64 - var18) / 64 + var5, var8 - var17 * (this.field2664[var20][var21].field2900 * 64 - var19 + 64) / 64, var17, var9);
         }
      }

      if (null != var10 && var11 > 0) {
         for(var20 = var15.field3014; var20 < var15.field3012 + var15.field3014; ++var20) {
            for(var21 = var15.field3011; var21 < var15.field3011 + var15.field3013; ++var21) {
               this.field2664[var20][var21].method5018(var10, var11, var12);
            }
         }
      }

   }

   public void method4620(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.field2662) {
         this.field2662.method9038(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.field2663 == null) {
               this.method4625();
            }

            Iterator var9 = var5.iterator();

            while(true) {
               List var11;
               do {
                  if (!var9.hasNext()) {
                     return;
                  }

                  int var10 = (Integer)var9.next();
                  var11 = (List)this.field2663.get(var10);
               } while(null == var11);

               Iterator var12 = var11.iterator();

               while(var12.hasNext()) {
                  class282 var13 = (class282)var12.next();
                  int var14 = (var13.field3046.field3581 - this.field2670) * var3 / this.field2674;
                  int var15 = var4 - var4 * (var13.field3046.field3583 - this.field2672) / this.field2673;
                  class535.method9220(var14 + var1, var15 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   public List method4649(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var12 = new LinkedList();
      if (!this.field2665) {
         return var12;
      } else {
         class274 var13 = this.method4652(var1, var2, var3, var4);
         float var14 = this.method4632(var7, var3 - var1);
         int var15 = (int)(var14 * 64.0F);
         int var16 = this.field2670 + var1;
         int var17 = var2 + this.field2672;

         for(int var18 = var13.field3014; var18 < var13.field3012 + var13.field3014; ++var18) {
            for(int var19 = var13.field3011; var19 < var13.field3013 + var13.field3011; ++var19) {
               List var20 = this.field2664[var18][var19].method5126(var5 + var15 * (this.field2664[var18][var19].field2899 * 64 - var16) / 64, var8 + var6 - var15 * (this.field2664[var18][var19].field2900 * 64 - var17 + 64) / 64, var15, var9, var10);
               if (!var20.isEmpty()) {
                  var12.addAll(var20);
               }
            }
         }

         return var12;
      }
   }

   class274 method4652(int var1, int var2, int var3, int var4) {
      class274 var6 = new class274(this);
      int var7 = var1 + this.field2670;
      int var8 = var2 + this.field2672;
      int var9 = var3 + this.field2670;
      int var10 = var4 + this.field2672;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      int var14 = var10 / 64;
      var6.field3012 = var13 - var11 + 1;
      var6.field3013 = var14 - var12 + 1;
      var6.field3014 = var11 - this.field2675.method4974();
      var6.field3011 = var12 - this.field2675.method4943();
      if (var6.field3014 < 0) {
         var6.field3012 += var6.field3014;
         var6.field3014 = 0;
      }

      if (var6.field3014 > this.field2664.length - var6.field3012) {
         var6.field3012 = this.field2664.length - var6.field3014;
      }

      if (var6.field3011 < 0) {
         var6.field3013 += var6.field3011;
         var6.field3011 = 0;
      }

      if (var6.field3011 > this.field2664[0].length - var6.field3013) {
         var6.field3013 = this.field2664[0].length - var6.field3011;
      }

      var6.field3012 = Math.min(var6.field3012, this.field2664.length);
      var6.field3013 = Math.min(var6.field3013, this.field2664[0].length);
      return var6;
   }

   public boolean method4623() {
      return this.field2665;
   }

   public HashMap method4624() {
      this.method4625();
      return this.field2663;
   }

   void method4625() {
      if (null == this.field2663) {
         this.field2663 = new HashMap();
      }

      this.field2663.clear();

      for(int var2 = 0; var2 < this.field2664.length; ++var2) {
         for(int var3 = 0; var3 < this.field2664[var2].length; ++var3) {
            List var4 = this.field2664[var2][var3].method5037();
            Iterator var5 = var4.iterator();

            while(var5.hasNext()) {
               class282 var6 = (class282)var5.next();
               if (var6.method5387()) {
                  int var7 = var6.method5405();
                  if (!this.field2663.containsKey(var7)) {
                     LinkedList var8 = new LinkedList();
                     var8.add(var6);
                     this.field2663.put(var7, var8);
                  } else {
                     List var9 = (List)this.field2663.get(var7);
                     var9.add(var6);
                  }
               }
            }
         }
      }

   }

   float method4632(int var1, int var2) {
      float var4 = (float)var1 / (float)var2;
      if (var4 > 8.0F) {
         return 8.0F;
      } else if (var4 < 1.0F) {
         return 1.0F;
      } else {
         int var5 = Math.round(var4);
         return Math.abs((float)var5 - var4) < 0.05F ? (float)var5 : var4;
      }
   }
}
