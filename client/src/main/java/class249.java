import java.util.Arrays;
import java.util.HashMap;

public class class249 extends class228 {
   static boolean field2781 = true;
   static boolean[] field2758 = new boolean[6500];
   static boolean[] field2780 = new boolean[6500];
   static byte[] field2719 = new byte[1];
   static byte[] field2721 = new byte[1];
   static char[] field2767 = new char[6000];
   static char[][] field2748 = new char[6000][512];
   static class249 field2765 = new class249();
   static class249 field2784 = new class249();
   static class455 field2722 = new class455();
   static class455 field2724 = new class455();
   static class455 field2734 = new class455();
   static float[] field2757 = new float[6500];
   static float[] field2777 = new float[10];
   static int field2728;
   static int field2778;
   static int field2779;
   static int[] field2726 = new int[6500];
   static int[] field2740 = new int[10];
   static int[] field2747 = new int[6500];
   static int[] field2762 = new int[6500];
   static int[] field2763;
   static int[] field2764 = new int[6500];
   static int[] field2768 = new int[10];
   static int[] field2769 = new int[12];
   static int[] field2771 = new int[2000];
   static int[] field2772 = new int[2000];
   static int[] field2773 = new int[12];
   static int[] field2774 = new int[10];
   static int[] field2775 = new int[6500];
   static int[] field2776 = new int[6500];
   static int[] field2785;
   static int[] field2786;
   static int[] field2787;
   static int[][] field2770 = new int[12][2000];
   static final float field2725;
   byte[] field2736;
   byte[] field2737;
   byte[] field2738;
   int field2751;
   int field2752;
   int field2753;
   int field2754;
   int field2759;
   int[] field2718;
   int[] field2723;
   int[] field2727;
   int[] field2731;
   int[] field2732;
   int[] field2733;
   int[] field2735;
   int[] field2742;
   int[] field2743;
   int[] field2744;
   int[] field2760;
   int[] field2791;
   int[][] field2745;
   int[][] field2746;
   int[][] field2790;
   int[][] field2794;
   HashMap field2755 = new HashMap();
   short[] field2739;
   public boolean field2749 = false;
   public byte field2720;
   public byte field2729 = 0;
   public byte field2761;
   public byte field2792;
   public byte field2793;
   public int field2741 = 0;
   public int field2750 = 0;
   public int field2795 = 0;
   public short field2730;

   static {
      field2763 = class229.field2511;
      field2785 = class229.field2512;
      field2786 = class229.field2514;
      field2787 = class229.field2509;
      field2725 = class364.method6635(50);
   }

   class249() {
   }

   public class249(class249[] var1, int var2) {
      this.field2795 = 0;
      this.field2750 = 0;
      this.field2741 = 0;
      this.field2729 = -1;

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         class249 var4 = var1[var3];
         if (var4 != null) {
            this.field2795 += var4.field2795;
            this.field2750 += var4.field2750;
            this.field2741 += var4.field2741;
            if (this.field2729 == -1) {
               this.field2729 = var4.field2729;
            }
         }
      }

      this.method4836(this.field2795, this.field2750, this.field2741);
      this.field2795 = 0;
      this.field2750 = 0;
      this.field2741 = 0;

      for(var3 = 0; var3 < var2; ++var3) {
         this.method4775(var1[var3]);
      }

   }

   public class249(int var1, int var2, int var3, byte var4) {
      this.method4836(var1, var2, var3);
      this.field2729 = var4;
      this.field2795 = 0;
      this.field2750 = 0;
      this.field2741 = 0;
   }

   void method4836(int var1, int var2, int var3) {
      this.field2733 = new int[var1];
      this.field2727 = new int[var1];
      this.field2723 = new int[var1];
      this.field2718 = new int[var2];
      this.field2731 = new int[var2];
      this.field2732 = new int[var2];
      this.field2743 = new int[var2];
      this.field2760 = new int[var2];
      this.field2735 = new int[var2];
      if (var3 > 0) {
         this.field2742 = new int[var3];
         this.field2791 = new int[var3];
         this.field2744 = new int[var3];
      }

   }

   void method4756(class249 var1) {
      int var2 = this.field2718.length;
      if (this.field2736 == null && (var1.field2736 != null || this.field2729 != var1.field2729)) {
         this.field2736 = new byte[var2];
         Arrays.fill(this.field2736, this.field2729);
      }

      if (this.field2737 == null && var1.field2737 != null) {
         this.field2737 = new byte[var2];
         Arrays.fill(this.field2737, (byte)0);
      }

      if (this.field2739 == null && var1.field2739 != null) {
         this.field2739 = new short[var2];
         Arrays.fill(this.field2739, (short)-1);
      }

      if (this.field2738 == null && var1.field2738 != null) {
         this.field2738 = new byte[var2];
         Arrays.fill(this.field2738, (byte)-1);
      }

   }

   public void method4775(class249 var1) {
      if (var1 != null) {
         this.method4756(var1);

         int var2;
         for(var2 = 0; var2 < var1.field2750; ++var2) {
            this.field2718[this.field2750] = var1.field2718[var2] + this.field2795;
            this.field2731[this.field2750] = var1.field2731[var2] + this.field2795;
            this.field2732[this.field2750] = var1.field2732[var2] + this.field2795;
            this.field2743[this.field2750] = var1.field2743[var2];
            this.field2760[this.field2750] = var1.field2760[var2];
            this.field2735[this.field2750] = var1.field2735[var2];
            if (this.field2736 != null) {
               this.field2736[this.field2750] = var1.field2736 != null ? var1.field2736[var2] : var1.field2729;
            }

            if (this.field2737 != null && var1.field2737 != null) {
               this.field2737[this.field2750] = var1.field2737[var2];
            }

            if (this.field2739 != null) {
               this.field2739[this.field2750] = var1.field2739 != null ? var1.field2739[var2] : -1;
            }

            if (this.field2738 != null) {
               if (var1.field2738 != null && var1.field2738[var2] != -1) {
                  this.field2738[this.field2750] = (byte)(var1.field2738[var2] + this.field2741);
               } else {
                  this.field2738[this.field2750] = -1;
               }
            }

            ++this.field2750;
         }

         for(var2 = 0; var2 < var1.field2741; ++var2) {
            this.field2742[this.field2741] = var1.field2742[var2] + this.field2795;
            this.field2791[this.field2741] = var1.field2791[var2] + this.field2795;
            this.field2744[this.field2741] = var1.field2744[var2] + this.field2795;
            ++this.field2741;
         }

         for(var2 = 0; var2 < var1.field2795; ++var2) {
            this.field2733[this.field2795] = var1.field2733[var2];
            this.field2727[this.field2795] = var1.field2727[var2];
            this.field2723[this.field2795] = var1.field2723[var2];
            ++this.field2795;
         }

      }
   }

   public class249 method4758(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method4763();
      int var7 = var2 - this.field2752;
      int var8 = var2 + this.field2752;
      int var9 = var4 - this.field2752;
      int var10 = var4 + this.field2752;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            class249 var11;
            if (var5) {
               var11 = new class249();
               var11.field2795 = this.field2795;
               var11.field2750 = this.field2750;
               var11.field2741 = this.field2741;
               var11.field2733 = this.field2733;
               var11.field2723 = this.field2723;
               var11.field2718 = this.field2718;
               var11.field2731 = this.field2731;
               var11.field2732 = this.field2732;
               var11.field2743 = this.field2743;
               var11.field2760 = this.field2760;
               var11.field2735 = this.field2735;
               var11.field2736 = this.field2736;
               var11.field2737 = this.field2737;
               var11.field2738 = this.field2738;
               var11.field2739 = this.field2739;
               var11.field2729 = this.field2729;
               var11.field2742 = this.field2742;
               var11.field2791 = this.field2791;
               var11.field2744 = this.field2744;
               var11.field2745 = this.field2745;
               var11.field2746 = this.field2746;
               var11.field2749 = this.field2749;
               var11.field2727 = new int[var11.field2795];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.field2795; ++var12) {
                  var13 = this.field2733[var12] + var2;
                  var14 = this.field2723[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field2727[var12] = this.field2727[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field2795; ++var12) {
                  var13 = (-this.field2727[var12] << 16) / super.field2507;
                  if (var13 < var6) {
                     var14 = this.field2733[var12] + var2;
                     var15 = this.field2723[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field2727[var12] = this.field2727[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method4790();
            return var11;
         }
      } else {
         return this;
      }
   }

   public class249 method4759(boolean var1) {
      if (!var1 && field2719.length < this.field2750) {
         field2719 = new byte[this.field2750 + 100];
      }

      return this.method4761(var1, field2765, field2719);
   }

   public class249 method4760(boolean var1) {
      if (!var1 && field2721.length < this.field2750) {
         field2721 = new byte[this.field2750 + 100];
      }

      return this.method4761(var1, field2784, field2721);
   }

   class249 method4761(boolean var1, class249 var2, byte[] var3) {
      var2.field2795 = this.field2795;
      var2.field2750 = this.field2750;
      var2.field2741 = this.field2741;
      if (var2.field2733 == null || var2.field2733.length < this.field2795) {
         var2.field2733 = new int[this.field2795 + 100];
         var2.field2727 = new int[this.field2795 + 100];
         var2.field2723 = new int[this.field2795 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.field2795; ++var4) {
         var2.field2733[var4] = this.field2733[var4];
         var2.field2727[var4] = this.field2727[var4];
         var2.field2723[var4] = this.field2723[var4];
      }

      if (var1) {
         var2.field2737 = this.field2737;
      } else {
         var2.field2737 = var3;
         if (this.field2737 == null) {
            for(var4 = 0; var4 < this.field2750; ++var4) {
               var2.field2737[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.field2750; ++var4) {
               var2.field2737[var4] = this.field2737[var4];
            }
         }
      }

      var2.field2718 = this.field2718;
      var2.field2731 = this.field2731;
      var2.field2732 = this.field2732;
      var2.field2743 = this.field2743;
      var2.field2760 = this.field2760;
      var2.field2735 = this.field2735;
      var2.field2736 = this.field2736;
      var2.field2738 = this.field2738;
      var2.field2739 = this.field2739;
      var2.field2729 = this.field2729;
      var2.field2742 = this.field2742;
      var2.field2791 = this.field2791;
      var2.field2744 = this.field2744;
      var2.field2745 = this.field2745;
      var2.field2746 = this.field2746;
      var2.field2794 = this.field2794;
      var2.field2790 = this.field2790;
      var2.field2749 = this.field2749;
      var2.method4790();
      var2.field2720 = 0;
      return var2;
   }

   void method4762(int var1) {
      if (!this.field2755.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field2785[var1];
         int var9 = field2763[var1];

         for(int var10 = 0; var10 < this.field2795; ++var10) {
            int var11 = class242.method2035(this.field2733[var10], this.field2723[var10], var8, var9);
            int var12 = this.field2727[var10];
            int var14 = this.field2733[var10];
            int var15 = this.field2723[var10];
            int var13 = var15 * var8 - var14 * var9 >> 16;
            if (var11 < var2) {
               var2 = var11;
            }

            if (var11 > var5) {
               var5 = var11;
            }

            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }
         }

         class214 var17 = new class214((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
         boolean var18 = true;
         if (var17.field2325 < 32) {
            var17.field2325 = 32;
         }

         if (var17.field2328 < 32) {
            var17.field2328 = 32;
         }

         if (this.field2749) {
            boolean var19 = true;
            var17.field2325 += 8;
            var17.field2328 += 8;
         }

         this.field2755.put(var1, var17);
      }
   }

   public void method4763() {
      if (this.field2759 != 1) {
         this.field2759 = 1;
         super.field2507 = 0;
         this.field2751 = 0;
         this.field2752 = 0;

         for(int var1 = 0; var1 < this.field2795; ++var1) {
            int var2 = this.field2733[var1];
            int var3 = this.field2727[var1];
            int var4 = this.field2723[var1];
            if (-var3 > super.field2507) {
               super.field2507 = -var3;
            }

            if (var3 > this.field2751) {
               this.field2751 = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2752) {
               this.field2752 = var5;
            }
         }

         this.field2752 = (int)(Math.sqrt((double)this.field2752) + 0.99);
         this.field2754 = (int)(Math.sqrt((double)(this.field2752 * this.field2752 + super.field2507 * super.field2507)) + 0.99);
         this.field2753 = this.field2754 + (int)(Math.sqrt((double)(this.field2752 * this.field2752 + this.field2751 * this.field2751)) + 0.99);
      }
   }

   void method4837() {
      if (this.field2759 != 2) {
         this.field2759 = 2;
         this.field2752 = 0;

         for(int var1 = 0; var1 < this.field2795; ++var1) {
            int var2 = this.field2733[var1];
            int var3 = this.field2727[var1];
            int var4 = this.field2723[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.field2752) {
               this.field2752 = var5;
            }
         }

         this.field2752 = (int)(Math.sqrt((double)this.field2752) + 0.99);
         this.field2754 = this.field2752;
         this.field2753 = this.field2752 + this.field2752;
      }
   }

   public int method4765() {
      this.method4763();
      return this.field2752;
   }

   public void method4790() {
      this.field2759 = 0;
      this.field2755.clear();
   }

   public void method4821(class247 var1, int var2) {
      if (this.field2745 != null) {
         if (var2 != -1) {
            class221 var3 = var1.field2716[var2];
            class219 var4 = var3.field2437;
            field2778 = 0;
            field2779 = 0;
            field2728 = 0;

            for(int var5 = 0; var5 < var3.field2438; ++var5) {
               int var6 = var3.field2433[var5];
               this.method4803(var4.field2404[var6], var4.field2405[var6], var3.field2440[var5], var3.field2439[var5], var3.field2442[var5]);
            }

            this.method4790();
         }
      }
   }

   public void method4767(class156 var1, int var2) {
      class219 var3 = var1.field1425;
      class230 var4 = var3.method4198();
      if (var4 != null) {
         var3.method4198().method4372(var1, var2);
         this.method4769(var3.method4198(), var1.method2686());
      }

      if (var1.method2677()) {
         this.method4768(var1, var2);
      }

      this.method4790();
   }

   void method4768(class156 var1, int var2) {
      class219 var3 = var1.field1425;

      for(int var4 = 0; var4 < var3.field2400; ++var4) {
         int var5 = var3.field2404[var4];
         if (var5 == 5 && var1.field1424 != null && var1.field1424[var4] != null && var1.field1424[var4][0] != null && this.field2746 != null && this.field2737 != null) {
            class143 var6 = var1.field1424[var4][0];
            int[] var7 = var3.field2405[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.field2746.length) {
                  int[] var11 = this.field2746[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.field2737[var13] & 255) + var6.method2523(var2) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = 255;
                     }

                     this.field2737[var13] = (byte)var14;
                  }
               }
            }
         }
      }

   }

   void method4769(class230 var1, int var2) {
      this.method4789(var1, var2);
   }

   public void method4865(class247 var1, int var2, class247 var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            class221 var6 = var1.field2716[var2];
            class221 var7 = var3.field2716[var4];
            class219 var8 = var6.field2437;
            field2778 = 0;
            field2779 = 0;
            field2728 = 0;
            int var9 = 0;
            int var10 = var5[var9++];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.field2438; ++var11) {
               for(var12 = var6.field2433[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 != var10 || var8.field2404[var12] == 0) {
                  this.method4803(var8.field2404[var12], var8.field2405[var12], var6.field2440[var11], var6.field2439[var11], var6.field2442[var11]);
               }
            }

            field2778 = 0;
            field2779 = 0;
            field2728 = 0;
            byte var13 = 0;
            var9 = var13 + 1;
            var10 = var5[var13];

            for(var11 = 0; var11 < var7.field2438; ++var11) {
               for(var12 = var7.field2433[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 == var10 || var8.field2404[var12] == 0) {
                  this.method4803(var8.field2404[var12], var8.field2405[var12], var7.field2440[var11], var7.field2439[var11], var7.field2442[var11]);
               }
            }

            this.method4790();
         } else {
            this.method4821(var1, var2);
         }
      }
   }

   public void method4771(class219 var1, class156 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      class230 var7 = var1.method4198();
      if (var7 != null) {
         var7.method4371(var2, var3, var4, var5);
         if (var6) {
            this.method4769(var7, var2.method2686());
         }
      }

      if (!var5 && var2.method2677()) {
         this.method4768(var2, var3);
      }

   }

   public void method4772(class247 var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.method4821(var1, var2);
      } else {
         class221 var5 = var1.field2716[var2];
         class219 var6 = var5.field2437;
         int var7 = 0;
         int var8 = var3[var7++];
         field2778 = 0;
         field2779 = 0;
         field2728 = 0;

         for(int var9 = 0; var9 < var5.field2438; ++var9) {
            int var10;
            for(var10 = var5.field2433[var9]; var10 > var8; var8 = var3[var7++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.field2404[var10] == 0) {
                  this.method4803(var6.field2404[var10], var6.field2405[var10], var5.field2440[var9], var5.field2439[var9], var5.field2442[var9]);
               }
            } else if (var10 != var8 || var6.field2404[var10] == 0) {
               this.method4803(var6.field2404[var10], var6.field2405[var10], var5.field2440[var9], var5.field2439[var9], var5.field2442[var9]);
            }
         }

      }
   }

   void method4803(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if (var1 == 0) {
         var7 = 0;
         field2778 = 0;
         field2779 = 0;
         field2728 = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var18 = var2[var8];
            if (var18 < this.field2745.length) {
               int[] var19 = this.field2745[var18];

               for(var11 = 0; var11 < var19.length; ++var11) {
                  var12 = var19[var11];
                  field2778 += this.field2733[var12];
                  field2779 += this.field2727[var12];
                  field2728 += this.field2723[var12];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            field2778 = field2778 / var7 + var3;
            field2779 = field2779 / var7 + var4;
            field2728 = field2728 / var7 + var5;
         } else {
            field2778 = var3;
            field2779 = var4;
            field2728 = var5;
         }

      } else {
         int[] var9;
         int var10;
         int[] var10000;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field2745.length) {
                  var9 = this.field2745[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.field2733;
                     var10000[var11] += var3;
                     var10000 = this.field2727;
                     var10000[var11] += var4;
                     var10000 = this.field2723;
                     var10000[var11] += var5;
                  }
               }
            }

         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field2745.length) {
                  var9 = this.field2745[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.field2733;
                     var10000[var11] -= field2778;
                     var10000 = this.field2727;
                     var10000[var11] -= field2779;
                     var10000 = this.field2723;
                     var10000[var11] -= field2728;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = field2763[var14];
                        var16 = field2785[var14];
                        var17 = this.field2727[var11] * var15 + this.field2733[var11] * var16 >> 16;
                        this.field2727[var11] = this.field2727[var11] * var16 - this.field2733[var11] * var15 >> 16;
                        this.field2733[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = field2763[var12];
                        var16 = field2785[var12];
                        var17 = this.field2727[var11] * var16 - this.field2723[var11] * var15 >> 16;
                        this.field2723[var11] = this.field2727[var11] * var15 + this.field2723[var11] * var16 >> 16;
                        this.field2727[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = field2763[var13];
                        var16 = field2785[var13];
                        var17 = this.field2723[var11] * var15 + this.field2733[var11] * var16 >> 16;
                        this.field2723[var11] = this.field2723[var11] * var16 - this.field2733[var11] * var15 >> 16;
                        this.field2733[var11] = var17;
                     }

                     var10000 = this.field2733;
                     var10000[var11] += field2778;
                     var10000 = this.field2727;
                     var10000[var11] += field2779;
                     var10000 = this.field2723;
                     var10000[var11] += field2728;
                  }
               }
            }

         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field2745.length) {
                  var9 = this.field2745[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.field2733;
                     var10000[var11] -= field2778;
                     var10000 = this.field2727;
                     var10000[var11] -= field2779;
                     var10000 = this.field2723;
                     var10000[var11] -= field2728;
                     this.field2733[var11] = this.field2733[var11] * var3 / 128;
                     this.field2727[var11] = this.field2727[var11] * var4 / 128;
                     this.field2723[var11] = this.field2723[var11] * var5 / 128;
                     var10000 = this.field2733;
                     var10000[var11] += field2778;
                     var10000 = this.field2727;
                     var10000[var11] += field2779;
                     var10000 = this.field2723;
                     var10000[var11] += field2728;
                  }
               }
            }

         } else if (var1 == 5) {
            if (this.field2746 != null && this.field2737 != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if (var8 < this.field2746.length) {
                     var9 = this.field2746[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.field2737[var11] & 255) + var3 * 8;
                        if (var12 < 0) {
                           var12 = 0;
                        } else if (var12 > 255) {
                           var12 = 255;
                        }

                        this.field2737[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   public void method4774() {
      for(int var1 = 0; var1 < this.field2795; ++var1) {
         int var2 = this.field2733[var1];
         this.field2733[var1] = this.field2723[var1];
         this.field2723[var1] = -var2;
      }

      this.method4790();
   }

   public void method4777() {
      for(int var1 = 0; var1 < this.field2795; ++var1) {
         this.field2733[var1] = -this.field2733[var1];
         this.field2723[var1] = -this.field2723[var1];
      }

      this.method4790();
   }

   public void method4857() {
      for(int var1 = 0; var1 < this.field2795; ++var1) {
         int var2 = this.field2723[var1];
         this.field2723[var1] = this.field2733[var1];
         this.field2733[var1] = -var2;
      }

      this.method4790();
   }

   public void method4778(int var1) {
      int var2 = field2763[var1];
      int var3 = field2785[var1];

      for(int var4 = 0; var4 < this.field2795; ++var4) {
         int var5 = this.field2727[var4] * var3 - this.field2723[var4] * var2 >> 16;
         this.field2723[var4] = this.field2727[var4] * var2 + this.field2723[var4] * var3 >> 16;
         this.field2727[var4] = var5;
      }

      this.method4790();
   }

   public void method4830(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2795; ++var4) {
         int[] var10000 = this.field2733;
         var10000[var4] += var1;
         var10000 = this.field2727;
         var10000[var4] += var2;
         var10000 = this.field2723;
         var10000[var4] += var3;
      }

      this.method4790();
   }

   public void method4779(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2795; ++var4) {
         this.field2733[var4] = this.field2733[var4] * var1 / 128;
         this.field2727[var4] = this.field2727[var4] * var2 / 128;
         this.field2723[var4] = this.field2723[var4] * var3 / 128;
      }

      this.method4790();
   }

   public final void method4780(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.field2759 != 2 && this.field2759 != 1) {
         this.method4837();
      }

      int var8 = class229.method4282();
      int var9 = class229.method4283();
      int var10 = field2763[var1];
      int var11 = field2785[var1];
      int var12 = field2763[var2];
      int var13 = field2785[var2];
      int var14 = field2763[var3];
      int var15 = field2785[var3];
      int var16 = field2763[var4];
      int var17 = field2785[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.field2795; ++var19) {
         int var20 = this.field2733[var19];
         int var21 = this.field2727[var19];
         int var22 = this.field2723[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field2762[var19] = var22 - var18;
         field2775[var19] = var8 + var20 * class229.method4288() / var22;
         field2747[var19] = var9 + var23 * class229.method4288() / var22;
         field2757[var19] = class364.method6635(var22);
         if (this.field2741 > 0) {
            field2726[var19] = var20;
            field2764[var19] = var23;
            field2776[var19] = var22;
         }
      }

      try {
         this.method4783(false, false, false, 0L);
      } catch (Exception var24) {
      }

   }

   public final void method4781(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field2759 != 2 && this.field2759 != 1) {
         this.method4837();
      }

      int var9 = class229.method4282();
      int var10 = class229.method4283();
      int var11 = field2763[var1];
      int var12 = field2785[var1];
      int var13 = field2763[var2];
      int var14 = field2785[var2];
      int var15 = field2763[var3];
      int var16 = field2785[var3];
      int var17 = field2763[var4];
      int var18 = field2785[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.field2795; ++var20) {
         int var21 = this.field2733[var20];
         int var22 = this.field2727[var20];
         int var23 = this.field2723[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field2762[var20] = var23 - var19;
         field2775[var20] = var9 + var21 * class229.method4288() / var8;
         field2747[var20] = var10 + var24 * class229.method4288() / var8;
         field2757[var20] = class364.method6635(var8);
         if (this.field2741 > 0) {
            field2726[var20] = var21;
            field2764[var20] = var24;
            field2776[var20] = var23;
         }
      }

      try {
         this.method4783(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   void method4275(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (this.field2759 != 1) {
         this.method4763();
      }

      this.method4762(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.field2752 * var3 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.field2752) * class229.method4288();
         if (var16 / var14 < class229.method4285()) {
            int var17 = (var15 + this.field2752) * class229.method4288();
            if (var17 / var14 > class229.method4364()) {
               int var18 = var7 * var3 - var11 * var2 >> 16;
               int var19 = this.field2752 * var2 >> 16;
               int var20 = var19 + (this.field2751 * var3 >> 16);
               int var21 = (var18 + var20) * class229.method4288();
               if (var21 / var14 > class229.method4287()) {
                  int var22 = var19 + (super.field2507 * var3 >> 16);
                  int var23 = (var18 - var22) * class229.method4288();
                  if (var23 / var14 < class229.method4280()) {
                     int var24 = var13 + (super.field2507 * var2 >> 16);
                     boolean var25 = false;
                     boolean var26 = false;
                     if (var12 - var24 <= 50) {
                        var26 = true;
                     }

                     boolean var27 = var26 || this.field2741 > 0;
                     int var28 = class252.field2836;
                     int var30 = class252.field2837;
                     boolean var32 = class252.method2063();
                     boolean var34 = var9 != 0L;
                     boolean var35;
                     if (var34) {
                        var35 = 1 == (int)(var9 >>> 16 & 1L);
                        var34 = !var35;
                     }

                     var35 = false;
                     int var37;
                     int var38;
                     int var39;
                     if (var34 && var32) {
                        boolean var36 = false;
                        if (field2781) {
                           var36 = class252.method5838(this, var1, var6, var7, var8);
                        } else {
                           var37 = var12 - var13;
                           if (var37 <= 50) {
                              var37 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var37;
                           } else {
                              var17 /= var14;
                              var16 /= var37;
                           }

                           if (var18 > 0) {
                              var23 /= var14;
                              var21 /= var37;
                           } else {
                              var21 /= var14;
                              var23 /= var37;
                           }

                           var38 = var28 - class229.method4282();
                           var39 = var30 - class229.method4283();
                           if (var38 > var16 && var38 < var17 && var39 > var23 && var39 < var21) {
                              var36 = true;
                           }
                        }

                        if (var36) {
                           if (this.field2749) {
                              class252.field2843[++class252.field2838 - 1] = var9;
                           } else {
                              var35 = true;
                           }
                        }
                     }

                     int var46 = class229.method4282();
                     var37 = class229.method4283();
                     var38 = 0;
                     var39 = 0;
                     if (var1 != 0) {
                        var38 = field2763[var1];
                        var39 = field2785[var1];
                     }

                     for(int var40 = 0; var40 < this.field2795; ++var40) {
                        int var41 = this.field2733[var40];
                        int var42 = this.field2727[var40];
                        int var43 = this.field2723[var40];
                        int var44;
                        if (var1 != 0) {
                           var44 = var43 * var38 + var41 * var39 >> 16;
                           var43 = var43 * var39 - var41 * var38 >> 16;
                           var41 = var44;
                        }

                        var41 += var6;
                        var42 += var7;
                        var43 += var8;
                        var44 = var43 * var4 + var41 * var5 >> 16;
                        var43 = var43 * var5 - var41 * var4 >> 16;
                        var41 = var44;
                        var44 = var42 * var3 - var43 * var2 >> 16;
                        var43 = var42 * var2 + var43 * var3 >> 16;
                        field2762[var40] = var43 - var12;
                        if (var43 >= 50) {
                           field2775[var40] = var46 + var41 * class229.method4288() / var43;
                           field2747[var40] = var37 + var44 * class229.method4288() / var43;
                           field2757[var40] = class364.method6635(var43);
                        } else {
                           field2775[var40] = -5000;
                           var25 = true;
                        }

                        if (var27) {
                           field2726[var40] = var41;
                           field2764[var40] = var44;
                           field2776[var40] = var43;
                        }
                     }

                     try {
                        this.method4783(var25, var35, this.field2749, var9);
                     } catch (Exception var45) {
                     }

                  }
               }
            }
         }
      }
   }

   final void method4783(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.field2753 < 6000) {
         int var6;
         for(var6 = 0; var6 < this.field2753; ++var6) {
            field2767[var6] = 0;
         }

         var6 = var3 ? 20 : 5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.field2750; var7 = (char)(var7 + 1)) {
            if (this.field2735[var7] != -2) {
               var8 = this.field2718[var7];
               var9 = this.field2731[var7];
               var10 = this.field2732[var7];
               var11 = field2775[var8];
               var12 = field2775[var9];
               var13 = field2775[var10];
               int var17;
               int var32;
               if (var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
                  var32 = field2726[var8];
                  var15 = field2726[var9];
                  var16 = field2726[var10];
                  var17 = field2764[var8];
                  var18 = field2764[var9];
                  int var19 = field2764[var10];
                  int var20 = field2776[var8];
                  int var21 = field2776[var9];
                  int var22 = field2776[var10];
                  var32 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var32 * var22;
                  int var25 = var32 * var19 - var17 * var16;
                  if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     field2758[var7] = true;
                     int var26 = (field2762[var8] + field2762[var9] + field2762[var10]) / 3 + this.field2754;
                     field2748[var26][field2767[var26]++] = (char)var7;
                  }
               } else {
                  if (var2) {
                     var15 = field2747[var8];
                     var16 = field2747[var9];
                     var17 = field2747[var10];
                     var18 = class252.field2837 + var6;
                     boolean var14;
                     if (var18 < var15 && var18 < var16 && var18 < var17) {
                        var14 = false;
                     } else {
                        var18 = class252.field2837 - var6;
                        if (var18 > var15 && var18 > var16 && var18 > var17) {
                           var14 = false;
                        } else {
                           var18 = var6 + class252.field2836;
                           if (var18 < var11 && var18 < var12 && var18 < var13) {
                              var14 = false;
                           } else {
                              var18 = class252.field2836 - var6;
                              if (var18 > var11 && var18 > var12 && var18 > var13) {
                                 var14 = false;
                              } else {
                                 var14 = true;
                              }
                           }
                        }
                     }

                     if (var14) {
                        class252.field2843[++class252.field2838 - 1] = var4;
                        var2 = false;
                     }
                  }

                  if ((var11 - var12) * (field2747[var10] - field2747[var9]) - (field2747[var8] - field2747[var9]) * (var13 - var12) > 0) {
                     field2758[var7] = false;
                     var32 = class229.method4284();
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var32 && var12 <= var32 && var13 <= var32) {
                        field2780[var7] = false;
                     } else {
                        field2780[var7] = true;
                     }

                     var15 = (field2762[var8] + field2762[var9] + field2762[var10]) / 3 + this.field2754;
                     field2748[var15][field2767[var15]++] = (char)var7;
                  }
               }
            }
         }

         char var27;
         char[] var28;
         if (this.field2736 == null) {
            for(var7 = this.field2753 - 1; var7 >= 0; --var7) {
               var27 = field2767[var7];
               if (var27 > 0) {
                  var28 = field2748[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     this.method4784(var28[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field2769[var7] = 0;
               field2773[var7] = 0;
            }

            for(var7 = this.field2753 - 1; var7 >= 0; --var7) {
               var27 = field2767[var7];
               if (var27 > 0) {
                  var28 = field2748[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     char var29 = var28[var10];
                     byte var30 = this.field2736[var29];
                     var13 = field2769[var30]++;
                     field2770[var30][var13] = var29;
                     if (var30 < 10) {
                        int[] var35 = field2773;
                        var35[var30] += var7;
                     } else if (var30 == 10) {
                        field2771[var13] = var7;
                     } else {
                        field2772[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if (field2769[1] > 0 || field2769[2] > 0) {
               var7 = (field2773[1] + field2773[2]) / (field2769[1] + field2769[2]);
            }

            var8 = 0;
            if (field2769[3] > 0 || field2769[4] > 0) {
               var8 = (field2773[3] + field2773[4]) / (field2769[3] + field2769[4]);
            }

            var9 = 0;
            if (field2769[6] > 0 || field2769[8] > 0) {
               var9 = (field2773[6] + field2773[8]) / (field2769[6] + field2769[8]);
            }

            var11 = 0;
            var12 = field2769[10];
            int[] var31 = field2770[10];
            int[] var33 = field2771;
            if (var11 == var12) {
               var11 = 0;
               var12 = field2769[11];
               var31 = field2770[11];
               var33 = field2772;
            }

            if (var11 < var12) {
               var10 = var33[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.method4784(var31[var11++]);
                  if (var11 == var12 && var31 != field2770[11]) {
                     var11 = 0;
                     var12 = field2769[11];
                     var31 = field2770[11];
                     var33 = field2772;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.method4784(var31[var11++]);
                  if (var11 == var12 && var31 != field2770[11]) {
                     var11 = 0;
                     var12 = field2769[11];
                     var31 = field2770[11];
                     var33 = field2772;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.method4784(var31[var11++]);
                  if (var11 == var12 && var31 != field2770[11]) {
                     var11 = 0;
                     var12 = field2769[11];
                     var31 = field2770[11];
                     var33 = field2772;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field2769[var15];
               int[] var34 = field2770[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.method4784(var34[var18]);
               }
            }

            while(var10 != -1000) {
               this.method4784(var31[var11++]);
               if (var11 == var12 && var31 != field2770[11]) {
                  var11 = 0;
                  var31 = field2770[11];
                  var12 = field2769[11];
                  var33 = field2772;
               }

               if (var11 < var12) {
                  var10 = var33[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   final void method4784(int var1) {
      if (field2758[var1]) {
         this.method4787(var1);
      } else {
         int var2 = this.field2718[var1];
         int var3 = this.field2731[var1];
         int var4 = this.field2732[var1];
         class229.field2513.field2826 = field2780[var1];
         if (this.field2737 == null) {
            class229.field2513.field2816 = 0;
         } else {
            class229.field2513.field2816 = (this.field2737[var1] == -1 ? 253 : this.field2737[var1]) & 255;
         }

         this.method4786(var1, field2747[var2], field2747[var3], field2747[var4], field2775[var2], field2775[var3], field2775[var4], field2757[var2], field2757[var3], field2757[var4], this.field2743[var1], this.field2760[var1], this.field2735[var1]);
      }
   }

   boolean method4785(int var1) {
      return this.field2720 > 0 && var1 < this.field2730;
   }

   final void method4786(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
      if (this.field2739 != null && this.field2739[var1] != -1) {
         int var15;
         int var16;
         int var18;
         if (this.field2738 != null && this.field2738[var1] != -1) {
            int var17 = this.field2738[var1] & 255;
            var18 = this.field2742[var17];
            var15 = this.field2791[var17];
            var16 = this.field2744[var17];
         } else {
            var18 = this.field2718[var1];
            var15 = this.field2731[var1];
            var16 = this.field2732[var1];
         }

         if (this.field2735[var1] == -1) {
            class229.method4298(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2726[var18], field2726[var15], field2726[var16], field2764[var18], field2764[var15], field2764[var16], field2776[var18], field2776[var15], field2776[var16], this.field2739[var1]);
         } else {
            class229.method4298(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2726[var18], field2726[var15], field2726[var16], field2764[var18], field2764[var15], field2764[var16], field2776[var18], field2776[var15], field2776[var16], this.field2739[var1]);
         }
      } else {
         boolean var14 = this.method4785(var1);
         if (this.field2735[var1] == -1 && var14) {
            class229.method4301(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2786[this.field2743[var1]], this.field2761, this.field2792, this.field2793, this.field2720);
         } else if (this.field2735[var1] == -1) {
            class229.method4331(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2786[this.field2743[var1]]);
         } else if (var14) {
            class229.method4300(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.field2761, this.field2792, this.field2793, this.field2720);
         } else {
            class229.method4296(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }

   }

   final void method4787(int var1) {
      int var2 = class229.method4282();
      int var3 = class229.method4283();
      int var4 = 0;
      int var5 = this.field2718[var1];
      int var6 = this.field2731[var1];
      int var7 = this.field2732[var1];
      int var8 = field2776[var5];
      int var9 = field2776[var6];
      int var10 = field2776[var7];
      if (this.field2737 == null) {
         class229.field2513.field2816 = 0;
      } else {
         class229.field2513.field2816 = this.field2737[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         field2774[var4] = field2775[var5];
         field2768[var4] = field2747[var5];
         field2777[var4] = field2757[var7];
         field2740[var4++] = this.field2743[var1];
      } else {
         var11 = field2726[var5];
         var12 = field2764[var5];
         var13 = this.field2743[var1];
         if (var10 >= 50) {
            var14 = (50 - var8) * field2787[var10 - var8];
            field2774[var4] = var2 + (var11 + ((field2726[var7] - var11) * var14 >> 16)) * class229.method4288() / 50;
            field2768[var4] = var3 + (var12 + ((field2764[var7] - var12) * var14 >> 16)) * class229.method4288() / 50;
            field2777[var4] = field2725;
            field2740[var4++] = var13 + ((this.field2735[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = (50 - var8) * field2787[var9 - var8];
            field2774[var4] = var2 + (var11 + ((field2726[var6] - var11) * var14 >> 16)) * class229.method4288() / 50;
            field2768[var4] = var3 + (var12 + ((field2764[var6] - var12) * var14 >> 16)) * class229.method4288() / 50;
            field2777[var4] = field2725;
            field2740[var4++] = var13 + ((this.field2760[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         field2774[var4] = field2775[var6];
         field2768[var4] = field2747[var6];
         field2777[var4] = field2757[var7];
         field2740[var4++] = this.field2760[var1];
      } else {
         var11 = field2726[var6];
         var12 = field2764[var6];
         var13 = this.field2760[var1];
         if (var8 >= 50) {
            var14 = (50 - var9) * field2787[var8 - var9];
            field2774[var4] = var2 + (var11 + ((field2726[var5] - var11) * var14 >> 16)) * class229.method4288() / 50;
            field2768[var4] = var3 + (var12 + ((field2764[var5] - var12) * var14 >> 16)) * class229.method4288() / 50;
            field2777[var4] = field2725;
            field2740[var4++] = var13 + ((this.field2743[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = (50 - var9) * field2787[var10 - var9];
            field2774[var4] = var2 + (var11 + ((field2726[var7] - var11) * var14 >> 16)) * class229.method4288() / 50;
            field2768[var4] = var3 + (var12 + ((field2764[var7] - var12) * var14 >> 16)) * class229.method4288() / 50;
            field2740[var4++] = var13 + ((this.field2735[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         field2774[var4] = field2775[var7];
         field2768[var4] = field2747[var7];
         field2777[var4] = field2757[var7];
         field2740[var4++] = this.field2735[var1];
      } else {
         var11 = field2726[var7];
         var12 = field2764[var7];
         var13 = this.field2735[var1];
         if (var9 >= 50) {
            var14 = (50 - var10) * field2787[var9 - var10];
            field2774[var4] = var2 + (var11 + ((field2726[var6] - var11) * var14 >> 16)) * class229.method4288() / 50;
            field2768[var4] = var3 + (var12 + ((field2764[var6] - var12) * var14 >> 16)) * class229.method4288() / 50;
            field2777[var4] = field2725;
            field2740[var4++] = var13 + ((this.field2760[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = (50 - var10) * field2787[var8 - var10];
            field2774[var4] = var2 + (var11 + ((field2726[var5] - var11) * var14 >> 16)) * class229.method4288() / 50;
            field2768[var4] = var3 + (var12 + ((field2764[var5] - var12) * var14 >> 16)) * class229.method4288() / 50;
            field2777[var4] = field2725;
            field2740[var4++] = var13 + ((this.field2743[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field2774[0];
      var12 = field2774[1];
      var13 = field2774[2];
      var14 = field2768[0];
      int var15 = field2768[1];
      int var16 = field2768[2];
      float var17 = field2777[0];
      float var18 = field2777[1];
      float var19 = field2777[2];
      class229.field2513.field2826 = false;
      int var20 = class229.method4284();
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
            class229.field2513.field2826 = true;
         }

         this.method4786(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2740[0], field2740[1], field2740[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2774[3] < 0 || field2774[3] > var20) {
            class229.field2513.field2826 = true;
         }

         int var22;
         if (this.field2739 != null && this.field2739[var1] != -1) {
            int var23;
            int var25;
            if (this.field2738 != null && this.field2738[var1] != -1) {
               int var24 = this.field2738[var1] & 255;
               var25 = this.field2742[var24];
               var22 = this.field2791[var24];
               var23 = this.field2744[var24];
            } else {
               var25 = var5;
               var22 = var6;
               var23 = var7;
            }

            short var26 = this.field2739[var1];
            if (this.field2735[var1] == -1) {
               class229.method4298(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.field2743[var1], this.field2743[var1], this.field2743[var1], field2726[var25], field2726[var22], field2726[var23], field2764[var25], field2764[var22], field2764[var23], field2776[var25], field2776[var22], field2776[var23], var26);
               class229.method4298(var14, var16, field2768[3], var11, var13, field2774[3], var17, var19, field2777[3], this.field2743[var1], this.field2743[var1], this.field2743[var1], field2726[var25], field2726[var22], field2726[var23], field2764[var25], field2764[var22], field2764[var23], field2776[var25], field2776[var22], field2776[var23], var26);
            } else {
               class229.method4298(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2740[0], field2740[1], field2740[2], field2726[var25], field2726[var22], field2726[var23], field2764[var25], field2764[var22], field2764[var23], field2776[var25], field2776[var22], field2776[var23], var26);
               class229.method4298(var14, var16, field2768[3], var11, var13, field2774[3], var17, var19, field2777[3], field2740[0], field2740[2], field2740[3], field2726[var25], field2726[var22], field2726[var23], field2764[var25], field2764[var22], field2764[var23], field2776[var25], field2776[var22], field2776[var23], var26);
            }
         } else {
            boolean var21 = this.method4785(var1);
            if (this.field2735[var1] == -1 && var21) {
               var22 = field2786[this.field2743[var1]];
               class229.method4301(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.field2761, this.field2792, this.field2793, this.field2720);
               class229.method4301(var14, var16, field2768[3], var11, var13, field2774[3], var17, var19, field2777[3], var22, this.field2761, this.field2792, this.field2793, this.field2720);
            } else if (this.field2735[var1] == -1) {
               var22 = field2786[this.field2743[var1]];
               class229.method4331(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
               class229.method4331(var14, var16, field2768[3], var11, var13, field2774[3], var17, var19, field2777[3], var22);
            } else if (var21) {
               class229.method4300(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2740[0], field2740[1], field2740[2], this.field2761, this.field2793, this.field2792, this.field2720);
               class229.method4300(var14, var16, field2768[3], var11, var13, field2774[3], 0.0F, 0.0F, 0.0F, field2740[0], field2740[2], field2740[3], this.field2761, this.field2793, this.field2792, this.field2720);
            } else {
               class229.method4296(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2740[0], field2740[1], field2740[2]);
               class229.method4296(var14, var16, field2768[3], var11, var13, field2774[3], var17, var19, field2777[3], field2740[0], field2740[2], field2740[3]);
            }
         }
      }

   }

   void method4826(int var1, class455 var2) {
      float var3 = (float)this.field2733[var1];
      float var4 = (float)(-this.field2727[var1]);
      float var5 = (float)(-this.field2723[var1]);
      float var6 = 1.0F;
      this.field2733[var1] = (int)(var2.field4749[0] * var3 + var2.field4749[4] * var4 + var2.field4749[8] * var5 + var2.field4749[12] * var6);
      this.field2727[var1] = -((int)(var2.field4749[1] * var3 + var2.field4749[5] * var4 + var2.field4749[9] * var5 + var2.field4749[13] * var6));
      this.field2723[var1] = -((int)(var2.field4749[2] * var3 + var2.field4749[6] * var4 + var2.field4749[10] * var5 + var2.field4749[14] * var6));
   }

   void method4789(class230 var1, int var2) {
      if (this.field2794 != null) {
         for(int var3 = 0; var3 < this.field2795; ++var3) {
            int[] var4 = this.field2794[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.field2790[var3];
               field2722.method7949();

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  class115 var8 = var1.method4370(var7);
                  if (var8 != null) {
                     field2734.method7951((float)var5[var6] / 255.0F);
                     field2724.method7988(var8.method2253(var2));
                     field2724.method7984(field2734);
                     field2722.method7953(field2724);
                  }
               }

               this.method4826(var3, field2722);
            }
         }

      }
   }
}
