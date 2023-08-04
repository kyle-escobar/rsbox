import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class class289 extends class51 {
   static class162 field3115;
   static ThreadPoolExecutor field3112 = null;
   static AtomicBoolean field3111 = null;
   boolean field3104;
   class288 field3103 = new class288();
   class325 field3109 = new class325(this);
   class335[][] field3101 = new class335[16][128];
   class335[][] field3102 = new class335[16][128];
   class481 field3085 = new class481(128);
   int field3084 = 1000000;
   int field3094 = 256;
   int field3100;
   int field3105;
   int[] field3083 = new int[16];
   int[] field3086 = new int[16];
   int[] field3087 = new int[16];
   int[] field3088 = new int[16];
   int[] field3089 = new int[16];
   int[] field3091 = new int[16];
   int[] field3093 = new int[16];
   int[] field3095 = new int[16];
   int[] field3096 = new int[16];
   int[] field3097 = new int[16];
   int[] field3098 = new int[16];
   int[] field3099 = new int[16];
   int[] field3106 = new int[16];
   int[] field3107 = new int[16];
   int[] field3114 = new int[16];
   PriorityQueue field3110 = new PriorityQueue(5, new class320());
   long field3090;
   long field3108;
   public int field3113 = 0;

   public class289() {
      this.method5576();
   }

   public synchronized void method5525(int var1) {
      this.field3094 = var1;
   }

   public int method5526() {
      return this.field3094;
   }

   public synchronized boolean method5527(class328 var1, class342 var2, class34 var3) {
      boolean var5 = true;
      synchronized(this.field3110) {
         this.field3110.clear();
      }

      for(class336 var6 = (class336)var1.field3573.method8186(); var6 != null; var6 = (class336)var1.field3573.method8194()) {
         int var7 = (int)var6.field4816;
         class299 var8 = (class299)this.field3085.get((long)var7);
         if (var8 == null) {
            byte[] var10 = var2.method6388(var7);
            class299 var9;
            if (null == var10) {
               var9 = null;
            } else {
               var9 = new class299(var10);
            }

            var8 = var9;
            if (var9 == null) {
               var5 = false;
               continue;
            }

            this.field3085.put(var9, (long)var7);
         }

         if (!var8.method5690(var3, var6.field3779)) {
            var5 = false;
         } else if (null != this.field3110) {
            synchronized(this.field3110) {
               Iterator var15 = var8.field3163.iterator();

               while(var15.hasNext()) {
                  class58 var11 = (class58)var15.next();
                  this.field3110.add(new class298(var6.field3778, var11));
               }
            }
         }
      }

      return var5;
   }

   public void method5550() {
      if (null != this.field3110) {
         if (field3111 != null) {
            field3111.set(true);
         }

         field3111 = new AtomicBoolean(false);
         AtomicBoolean var2 = field3111;
         if (null == field3112) {
            int var3 = Runtime.getRuntime().availableProcessors();
            field3112 = new ThreadPoolExecutor(0, var3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class293(this));
         }

         field3112.submit(new class318(this, var2));
      }
   }

   public synchronized void method5529() {
      for(class299 var2 = (class299)this.field3085.method8186(); var2 != null; var2 = (class299)this.field3085.method8194()) {
         var2.method5693();
      }

   }

   public synchronized void method5530() {
      for(class299 var2 = (class299)this.field3085.method8186(); null != var2; var2 = (class299)this.field3085.method8194()) {
         var2.method8116();
      }

   }

   public synchronized void method5562(class328 var1, boolean var2) {
      this.method5532();
      this.field3103.method5466(var1.field3574);
      this.field3104 = var2;
      this.field3090 = 0L;
      int var4 = this.field3103.method5468();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field3103.method5469(var5);
         this.field3103.method5472(var5);
         this.field3103.method5470(var5);
      }

      this.field3105 = this.field3103.method5522();
      this.field3100 = this.field3103.field3073[this.field3105];
      this.field3108 = this.field3103.method5476(this.field3100);
   }

   public synchronized void method5532() {
      this.field3103.method5486();
      this.method5576();
   }

   public synchronized boolean method5533() {
      return this.field3103.method5503();
   }

   public synchronized boolean method5619() {
      return this.field3085.method8192() > 0;
   }

   public synchronized void method5535(int var1, int var2) {
      this.method5601(var1, var2);
   }

   void method5601(int var1, int var2) {
      this.field3089[var1] = var2;
      this.field3095[var1] = var2 & -128;
      this.method5537(var1, var2);
   }

   void method5537(int var1, int var2) {
      if (this.field3088[var1] != var2) {
         this.field3088[var1] = var2;

         for(int var4 = 0; var4 < 128; ++var4) {
            this.field3102[var1][var4] = null;
         }
      }

   }

   void method5598(int var1, int var2, int var3) {
      this.method5540(var1, var2, 64);
      if ((this.field3107[var1] & 2) != 0) {
         for(class335 var5 = (class335)this.field3109.field3543.method6695(); var5 != null; var5 = (class335)this.field3109.field3543.method6704()) {
            if (var1 == var5.field3765 && var5.field3770 < 0) {
               this.field3101[var1][var5.field3761] = null;
               this.field3101[var1][var2] = var5;
               int var6 = (var5.field3766 * var5.field3759 >> 12) + var5.field3774;
               var5.field3774 += var2 - var5.field3761 << 8;
               var5.field3759 = var6 - var5.field3774;
               var5.field3766 = 4096;
               var5.field3761 = var2;
               return;
            }
         }
      }

      class299 var9 = (class299)this.field3085.get((long)this.field3088[var1]);
      if (null != var9) {
         if (var9.field3158[var2] != null) {
            class35 var10 = var9.field3158[var2].method1183();
            if (var10 != null) {
               class335 var7 = new class335();
               var7.field3765 = var1;
               var7.field3760 = var9;
               var7.field3758 = var10;
               var7.field3775 = var9.field3161[var2];
               var7.field3763 = var9.field3160[var2];
               var7.field3761 = var2;
               var7.field3762 = 1024 + var3 * var3 * var9.field3162 * var9.field3159[var2] >> 11;
               var7.field3756 = var9.field3164[var2] & 255;
               var7.field3774 = (var2 << 8) - (var9.field3157[var2] & 32767);
               var7.field3764 = 0;
               var7.field3768 = 0;
               var7.field3769 = 0;
               var7.field3770 = -1;
               var7.field3771 = 0;
               if (0 == this.field3098[var1]) {
                  var7.field3767 = class46.method849(var10, this.method5625(var7), this.method5633(var7), this.method5554(var7));
               } else {
                  var7.field3767 = class46.method849(var10, this.method5625(var7), 0, this.method5554(var7));
                  this.method5539(var7, var9.field3157[var2] < 0);
               }

               if (var9.field3157[var2] < 0) {
                  var7.field3767.method851(-1);
               }

               if (var7.field3763 >= 0) {
                  class335 var8 = this.field3102[var1][var7.field3763];
                  if (null != var8 && var8.field3770 < 0) {
                     this.field3101[var1][var8.field3761] = null;
                     var8.field3770 = 0;
                  }

                  this.field3102[var1][var7.field3763] = var7;
               }

               this.field3109.field3543.method6680(var7);
               this.field3101[var1][var2] = var7;
            }
         }
      }
   }

   void method5539(class335 var1, boolean var2) {
      int var4 = var1.field3758.field178.length;
      int var5;
      if (var2 && var1.field3758.field175) {
         int var6 = var4 + var4 - var1.field3758.field177;
         var5 = (int)((long)this.field3098[var1.field3765] * (long)var6 >> 6);
         var4 <<= 8;
         if (var5 >= var4) {
            var5 = var4 + var4 - 1 - var5;
            var1.field3767.method974(true);
         }
      } else {
         var5 = (int)((long)var4 * (long)this.field3098[var1.field3765] >> 6);
      }

      var1.field3767.method950(var5);
   }

   void method5540(int var1, int var2, int var3) {
      class335 var5 = this.field3101[var1][var2];
      if (null != var5) {
         this.field3101[var1][var2] = null;
         if ((this.field3107[var1] & 2) != 0) {
            for(class335 var6 = (class335)this.field3109.field3543.method6706(); var6 != null; var6 = (class335)this.field3109.field3543.method6687()) {
               if (var5.field3765 == var6.field3765 && var6.field3770 < 0 && var5 != var6) {
                  var5.field3770 = 0;
                  break;
               }
            }
         } else {
            var5.field3770 = 0;
         }

      }
   }

   void method5541(int var1, int var2, int var3) {
   }

   void method5542(int var1, int var2) {
   }

   void method5543(int var1, int var2) {
      this.field3083[var1] = var2;
   }

   void method5572(int var1) {
      for(class335 var3 = (class335)this.field3109.field3543.method6706(); var3 != null; var3 = (class335)this.field3109.field3543.method6687()) {
         if (var1 < 0 || var3.field3765 == var1) {
            if (var3.field3767 != null) {
               var3.field3767.method862(class37.field198 / 100);
               if (var3.field3767.method993()) {
                  this.field3109.field3544.method449(var3.field3767);
               }

               var3.method6361();
            }

            if (var3.field3770 < 0) {
               this.field3101[var3.field3765][var3.field3761] = null;
            }

            var3.method8116();
         }
      }

   }

   void method5545(int var1) {
      if (var1 >= 0) {
         this.field3086[var1] = 12800;
         this.field3087[var1] = 8192;
         this.field3099[var1] = 16383;
         this.field3083[var1] = 8192;
         this.field3093[var1] = 0;
         this.field3106[var1] = 8192;
         this.method5548(var1);
         this.method5549(var1);
         this.field3107[var1] = 0;
         this.field3096[var1] = 32767;
         this.field3097[var1] = 256;
         this.field3098[var1] = 0;
         this.method5551(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method5545(var1);
         }

      }
   }

   void method5546(int var1) {
      for(class335 var3 = (class335)this.field3109.field3543.method6706(); var3 != null; var3 = (class335)this.field3109.field3543.method6687()) {
         if ((var1 < 0 || var1 == var3.field3765) && var3.field3770 < 0) {
            this.field3101[var3.field3765][var3.field3761] = null;
            var3.field3770 = 0;
         }
      }

   }

   void method5576() {
      this.method5572(-1);
      this.method5545(-1);

      int var2;
      for(var2 = 0; var2 < 16; ++var2) {
         this.field3088[var2] = this.field3089[var2];
      }

      for(var2 = 0; var2 < 16; ++var2) {
         this.field3095[var2] = this.field3089[var2] & -128;
      }

   }

   void method5548(int var1) {
      if (0 != (this.field3107[var1] & 2)) {
         for(class335 var3 = (class335)this.field3109.field3543.method6706(); null != var3; var3 = (class335)this.field3109.field3543.method6687()) {
            if (var3.field3765 == var1 && this.field3101[var1][var3.field3761] == null && var3.field3770 < 0) {
               var3.field3770 = 0;
            }
         }
      }

   }

   void method5549(int var1) {
      if (0 != (this.field3107[var1] & 4)) {
         for(class335 var3 = (class335)this.field3109.field3543.method6706(); var3 != null; var3 = (class335)this.field3109.field3543.method6687()) {
            if (var1 == var3.field3765) {
               var3.field3776 = 0;
            }
         }
      }

   }

   void method5573(int var1) {
      int var3 = var1 & 240;
      int var4;
      int var5;
      int var6;
      if (var3 == 128) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method5540(var4, var5, var6);
      } else if (var3 == 144) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var6 > 0) {
            this.method5598(var4, var5, var6);
         } else {
            this.method5540(var4, var5, 64);
         }

      } else if (var3 == 160) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method5541(var4, var5, var6);
      } else if (var3 == 176) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var5 == 0) {
            this.field3095[var4] = (var6 << 14) + (this.field3095[var4] & -2080769);
         }

         if (var5 == 32) {
            this.field3095[var4] = (var6 << 7) + (this.field3095[var4] & -16257);
         }

         if (var5 == 1) {
            this.field3093[var4] = (this.field3093[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 33) {
            this.field3093[var4] = (this.field3093[var4] & -128) + var6;
         }

         if (var5 == 5) {
            this.field3106[var4] = (var6 << 7) + (this.field3106[var4] & -16257);
         }

         if (var5 == 37) {
            this.field3106[var4] = (this.field3106[var4] & -128) + var6;
         }

         if (var5 == 7) {
            this.field3086[var4] = (var6 << 7) + (this.field3086[var4] & -16257);
         }

         if (var5 == 39) {
            this.field3086[var4] = (this.field3086[var4] & -128) + var6;
         }

         if (var5 == 10) {
            this.field3087[var4] = (this.field3087[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 42) {
            this.field3087[var4] = (this.field3087[var4] & -128) + var6;
         }

         if (var5 == 11) {
            this.field3099[var4] = (var6 << 7) + (this.field3099[var4] & -16257);
         }

         if (var5 == 43) {
            this.field3099[var4] = (this.field3099[var4] & -128) + var6;
         }

         int[] var10000;
         if (var5 == 64) {
            if (var6 >= 64) {
               var10000 = this.field3107;
               var10000[var4] |= 1;
            } else {
               var10000 = this.field3107;
               var10000[var4] &= -2;
            }
         }

         if (var5 == 65) {
            if (var6 >= 64) {
               var10000 = this.field3107;
               var10000[var4] |= 2;
            } else {
               this.method5548(var4);
               var10000 = this.field3107;
               var10000[var4] &= -3;
            }
         }

         if (var5 == 99) {
            this.field3096[var4] = (var6 << 7) + (this.field3096[var4] & 127);
         }

         if (var5 == 98) {
            this.field3096[var4] = var6 + (this.field3096[var4] & 16256);
         }

         if (var5 == 101) {
            this.field3096[var4] = (var6 << 7) + (this.field3096[var4] & 127) + 16384;
         }

         if (var5 == 100) {
            this.field3096[var4] = 16384 + (this.field3096[var4] & 16256) + var6;
         }

         if (var5 == 120) {
            this.method5572(var4);
         }

         if (var5 == 121) {
            this.method5545(var4);
         }

         if (var5 == 123) {
            this.method5546(var4);
         }

         int var7;
         if (var5 == 6) {
            var7 = this.field3096[var4];
            if (var7 == 16384) {
               this.field3097[var4] = (this.field3097[var4] & -16257) + (var6 << 7);
            }
         }

         if (var5 == 38) {
            var7 = this.field3096[var4];
            if (var7 == 16384) {
               this.field3097[var4] = (this.field3097[var4] & -128) + var6;
            }
         }

         if (var5 == 16) {
            this.field3098[var4] = (this.field3098[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 48) {
            this.field3098[var4] = (this.field3098[var4] & -128) + var6;
         }

         if (var5 == 81) {
            if (var6 >= 64) {
               var10000 = this.field3107;
               var10000[var4] |= 4;
            } else {
               this.method5549(var4);
               var10000 = this.field3107;
               var10000[var4] &= -5;
            }
         }

         if (var5 == 17) {
            this.method5551(var4, (this.field3091[var4] & -16257) + (var6 << 7));
         }

         if (var5 == 49) {
            this.method5551(var4, (this.field3091[var4] & -128) + var6);
         }

      } else if (var3 == 192) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method5537(var4, var5 + this.field3095[var4]);
      } else if (var3 == 208) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method5542(var4, var5);
      } else if (var3 == 224) {
         var4 = var1 & 15;
         var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method5543(var4, var5);
      } else {
         var3 = var1 & 255;
         if (var3 == 255) {
            this.method5576();
         }
      }
   }

   void method5551(int var1, int var2) {
      this.field3091[var1] = var2;
      this.field3114[var1] = (int)(2097152.0 * Math.pow(2.0, (double)var2 * 5.4931640625E-4) + 0.5);
   }

   int method5625(class335 var1) {
      int var3 = (var1.field3766 * var1.field3759 >> 12) + var1.field3774;
      var3 += (this.field3083[var1.field3765] - 8192) * this.field3097[var1.field3765] >> 12;
      class297 var4 = var1.field3775;
      int var5;
      if (var4.field3146 > 0 && (var4.field3145 > 0 || this.field3093[var1.field3765] > 0)) {
         var5 = var4.field3145 << 2;
         int var6 = var4.field3147 << 1;
         if (var1.field3772 < var6) {
            var5 = var1.field3772 * var5 / var6;
         }

         var5 += this.field3093[var1.field3765] >> 7;
         double var7 = Math.sin(0.01227184630308513 * (double)(var1.field3773 & 511));
         var3 += (int)((double)var5 * var7);
      }

      var5 = (int)((double)(256 * var1.field3758.field176) * Math.pow(2.0, 3.255208333333333E-4 * (double)var3) / (double)class37.field198 + 0.5);
      return var5 < 1 ? 1 : var5;
   }

   int method5633(class335 var1) {
      class297 var3 = var1.field3775;
      int var4 = this.field3099[var1.field3765] * this.field3086[var1.field3765] + 4096 >> 13;
      var4 = var4 * var4 + 16384 >> 15;
      var4 = 16384 + var4 * var1.field3762 >> 15;
      var4 = this.field3094 * var4 + 128 >> 8;
      if (var3.field3141 > 0) {
         var4 = (int)((double)var4 * Math.pow(0.5, (double)var3.field3141 * 1.953125E-5 * (double)var1.field3764) + 0.5);
      }

      int var5;
      int var6;
      int var7;
      int var8;
      if (var3.field3140 != null) {
         var5 = var1.field3768;
         var6 = var3.field3140[var1.field3769 + 1];
         if (var1.field3769 < var3.field3140.length - 2) {
            var7 = (var3.field3140[var1.field3769] & 255) << 8;
            var8 = (var3.field3140[2 + var1.field3769] & 255) << 8;
            var6 += (var3.field3140[var1.field3769 + 3] - var6) * (var5 - var7) / (var8 - var7);
         }

         var4 = var6 * var4 + 32 >> 6;
      }

      if (var1.field3770 > 0 && var3.field3139 != null) {
         var5 = var1.field3770;
         var6 = var3.field3139[1 + var1.field3771];
         if (var1.field3771 < var3.field3139.length - 2) {
            var7 = (var3.field3139[var1.field3771] & 255) << 8;
            var8 = (var3.field3139[2 + var1.field3771] & 255) << 8;
            var6 += (var3.field3139[var1.field3771 + 3] - var6) * (var5 - var7) / (var8 - var7);
         }

         var4 = var4 * var6 + 32 >> 6;
      }

      return var4;
   }

   int method5554(class335 var1) {
      int var3 = this.field3087[var1.field3765];
      return var3 < 8192 ? var3 * var1.field3756 + 32 >> 6 : 16384 - (32 + (128 - var1.field3756) * (16384 - var3) >> 6);
   }

   protected synchronized class51 method1040() {
      return this.field3109;
   }

   protected synchronized class51 method1043() {
      return null;
   }

   protected synchronized int method1042() {
      return 0;
   }

   protected synchronized void method1044(int[] var1, int var2, int var3) {
      if (this.field3103.method5503()) {
         int var4 = this.field3084 * this.field3103.field3070 / class37.field198;

         do {
            long var5 = (long)var4 * (long)var3 + this.field3090;
            if (this.field3108 - var5 >= 0L) {
               this.field3090 = var5;
               break;
            }

            int var7 = (int)((this.field3108 - this.field3090 + (long)var4 - 1L) / (long)var4);
            this.field3090 += (long)var4 * (long)var7;
            this.field3109.method1044(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method5556();
         } while(this.field3103.method5503());
      }

      this.field3109.method1044(var1, var2, var3);
   }

   protected synchronized void method1045(int var1) {
      if (this.field3103.method5503()) {
         int var2 = this.field3084 * this.field3103.field3070 / class37.field198;

         do {
            long var3 = this.field3090 + (long)var1 * (long)var2;
            if (this.field3108 - var3 >= 0L) {
               this.field3090 = var3;
               break;
            }

            int var5 = (int)(((long)var2 + (this.field3108 - this.field3090) - 1L) / (long)var2);
            this.field3090 += (long)var2 * (long)var5;
            this.field3109.method1045(var5);
            var1 -= var5;
            this.method5556();
         } while(this.field3103.method5503());
      }

      this.field3109.method1045(var1);
   }

   void method5556() {
      int var2 = this.field3105;
      int var3 = this.field3100;

      long var4;
      for(var4 = this.field3108; var3 == this.field3100; var4 = this.field3103.method5476(var3)) {
         while(this.field3103.field3073[var2] == var3) {
            this.field3103.method5469(var2);
            int var6 = this.field3103.method5473(var2);
            if (var6 == 1) {
               this.field3103.method5471();
               this.field3103.method5470(var2);
               if (this.field3103.method5521()) {
                  if (!this.field3104 || var3 == 0) {
                     this.method5576();
                     this.field3103.method5486();
                     return;
                  }

                  this.field3103.method5465(var4);
               }
               break;
            }

            if (0 != (var6 & 128)) {
               this.method5573(var6);
            }

            this.field3103.method5472(var2);
            this.field3103.method5470(var2);
         }

         var2 = this.field3103.method5522();
         var3 = this.field3103.field3073[var2];
      }

      this.field3105 = var2;
      this.field3100 = var3;
      this.field3108 = var4;
   }

   boolean method5557(class335 var1) {
      if (null == var1.field3767) {
         if (var1.field3770 >= 0) {
            var1.method8116();
            if (var1.field3763 > 0 && var1 == this.field3102[var1.field3765][var1.field3763]) {
               this.field3102[var1.field3765][var1.field3763] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   boolean method5558(class335 var1, int[] var2, int var3, int var4) {
      var1.field3757 = class37.field198 / 100;
      if (var1.field3770 < 0 || var1.field3767 != null && !var1.field3767.method865()) {
         int var6 = var1.field3766;
         if (var6 > 0) {
            var6 -= (int)(16.0 * Math.pow(2.0, 4.921259842519685E-4 * (double)this.field3106[var1.field3765]) + 0.5);
            if (var6 < 0) {
               var6 = 0;
            }

            var1.field3766 = var6;
         }

         var1.field3767.method863(this.method5625(var1));
         class297 var7 = var1.field3775;
         boolean var8 = false;
         ++var1.field3772;
         var1.field3773 += var7.field3146;
         double var9 = (double)((var1.field3761 - 60 << 8) + (var1.field3766 * var1.field3759 >> 12)) * 5.086263020833333E-6;
         if (var7.field3141 > 0) {
            if (var7.field3150 > 0) {
               var1.field3764 += (int)(128.0 * Math.pow(2.0, (double)var7.field3150 * var9) + 0.5);
            } else {
               var1.field3764 += 128;
            }
         }

         if (var7.field3140 != null) {
            if (var7.field3142 > 0) {
               var1.field3768 += (int)(128.0 * Math.pow(2.0, (double)var7.field3142 * var9) + 0.5);
            } else {
               var1.field3768 += 128;
            }

            while(var1.field3769 < var7.field3140.length - 2 && var1.field3768 > (var7.field3140[var1.field3769 + 2] & 255) << 8) {
               var1.field3769 += 2;
            }

            if (var1.field3769 == var7.field3140.length - 2 && var7.field3140[var1.field3769 + 1] == 0) {
               var8 = true;
            }
         }

         if (var1.field3770 >= 0 && var7.field3139 != null && 0 == (this.field3107[var1.field3765] & 1) && (var1.field3763 < 0 || this.field3102[var1.field3765][var1.field3763] != var1)) {
            if (var7.field3144 > 0) {
               var1.field3770 += (int)(128.0 * Math.pow(2.0, (double)var7.field3144 * var9) + 0.5);
            } else {
               var1.field3770 += 128;
            }

            while(var1.field3771 < var7.field3139.length - 2 && var1.field3770 > (var7.field3139[var1.field3771 + 2] & 255) << 8) {
               var1.field3771 += 2;
            }

            if (var1.field3771 == var7.field3139.length - 2) {
               var8 = true;
            }
         }

         if (var8) {
            var1.field3767.method862(var1.field3757);
            if (var2 != null) {
               var1.field3767.method1044(var2, var3, var4);
            } else {
               var1.field3767.method1045(var4);
            }

            if (var1.field3767.method993()) {
               this.field3109.field3544.method449(var1.field3767);
            }

            var1.method6361();
            if (var1.field3770 >= 0) {
               var1.method8116();
               if (var1.field3763 > 0 && var1 == this.field3102[var1.field3765][var1.field3763]) {
                  this.field3102[var1.field3765][var1.field3763] = null;
               }
            }

            return true;
         } else {
            var1.field3767.method861(var1.field3757, this.method5633(var1), this.method5554(var1));
            return false;
         }
      } else {
         var1.method6361();
         var1.method8116();
         if (var1.field3763 > 0 && this.field3102[var1.field3765][var1.field3763] == var1) {
            this.field3102[var1.field3765][var1.field3763] = null;
         }

         return true;
      }
   }
}
