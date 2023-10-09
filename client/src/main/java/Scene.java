public class Scene {
   public static boolean field2595 = true;
   public static int selectedY = -1;
   public static int selectedX = -1;
   static boolean field2578 = false;
   static boolean field2584 = false;
   static boolean[][] field2587;
   static boolean[][][][] field2606;
   static class237[] field2577 = new class237[100];
   static class250[] field2591;
   static class250[][] field2589;
   static class368 field2592;
   static int field2547;
   static int field2551;
   static int field2552;
   static int field2554;
   static int field2555 = 0;
   static int field2560;
   static int field2561 = 0;
   static int field2562 = 0;
   static int field2563;
   static int field2566;
   static int field2567;
   static int field2568;
   static int field2569;
   static int field2570;
   static int field2571;
   static int field2572;
   static int field2573;
   static int field2574;
   static int field2575;
   static int field2579 = 0;
   static int field2581 = 4;
   static int field2590 = 0;
   static int field2593;
   static int field2597;
   static int field2608;
   static int field2609;
   static int field2613;
   static int[] field2588;
   static final int[] field2559;
   static final int[] field2564;
   static final int[] field2565;
   static final int[] field2594;
   static final int[] field2598;
   static final int[] field2599;
   static final int[] field2612;
   class220[][][] field2576;
   class237[] field2611 = new class237[5000];
   int field2548;
   int field2549;
   int field2550 = 0;
   int field2596;
   int field2602 = 0;
   int[][] field2604 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   int[][] field2605 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   int[][][] field2556;
   int[][][] field2607;

   static {
      field2588 = new int[field2581];
      field2589 = new class250[field2581][500];
      field2563 = 0;
      field2591 = new class250[500];
      field2592 = new class368();
      field2564 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      field2594 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      field2559 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      field2612 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      field2565 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      field2598 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      field2599 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      field2606 = new boolean[8][32][51][51];
   }

   public Scene(int var1, int var2, int var3, int[][][] var4) {
      this.field2548 = var1;
      this.field2549 = var2;
      this.field2596 = var3;
      this.field2576 = new class220[var1][var2][var3];
      this.field2556 = new int[var1][var2 + 1][var3 + 1];
      this.field2607 = var4;
      this.method4534();
   }

   public static void method4408(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class250 var8 = new class250();
      var8.field2801 = var2 / 128;
      var8.field2800 = var3 / 128;
      var8.field2810 = var4 / 128;
      var8.field2799 = var5 / 128;
      var8.field2812 = var1;
      var8.field2803 = var2;
      var8.field2802 = var3;
      var8.field2797 = var4;
      var8.field2798 = var5;
      var8.field2805 = var6;
      var8.field2806 = var7;
      field2589[var0][field2588[var0]++] = var8;
   }

   public static void method4546(int[] var0, int var1, int var2, int var3, int var4) {
      field2597 = 0;
      field2554 = 0;
      field2593 = var3;
      field2613 = var4;
      field2608 = var3 / 2;
      field2551 = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            field2573 = class229.field2511[var6];
            field2574 = class229.field2512[var6];
            field2575 = class229.field2511[var7];
            field2609 = class229.field2512[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -26; var10 < 26; ++var10) {
               for(var11 = -26; var11 < 26; ++var11) {
                  var12 = var10 * 128;
                  int var13 = var11 * 128;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if (method4443(var12, var0[var8] + var15, var13)) {
                        var14 = true;
                        break;
                     }
                  }

                  var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               for(var9 = -25; var9 < 25; ++var9) {
                  boolean var16 = false;

                  label76:
                  for(var11 = -1; var11 <= 1; ++var11) {
                     for(var12 = -1; var12 <= 1; ++var12) {
                        if (var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }
                     }
                  }

                  field2606[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   static boolean method4443(int var0, int var1, int var2) {
      int var3 = var2 * field2575 + var0 * field2609 >> 16;
      int var4 = var2 * field2609 - var0 * field2575 >> 16;
      int var5 = var1 * field2573 + var4 * field2574 >> 16;
      int var6 = var1 * field2574 - var4 * field2573 >> 16;
      if (var5 >= 50 && var5 <= 3500) {
         int var7 = field2608 + var3 * 128 / var5;
         int var8 = field2551 + var6 * 128 / var5;
         return var7 >= field2597 && var7 <= field2593 && var8 >= field2554 && var8 <= field2613;
      } else {
         return false;
      }
   }

   public static boolean shouldSendWalk() {
      return field2584 && selectedX != -1;
   }

   public static void method4447() {
      selectedX = -1;
      field2584 = false;
   }

   static final int method4405(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   static boolean method4457(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         if (var8 == 0) {
            if (var9 != 0) {
               return var9 < 0 ? var10 <= 0 : var10 >= 0;
            } else {
               return true;
            }
         } else {
            return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
         }
      }
   }

   public void method4534() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field2548; ++var1) {
         for(var2 = 0; var2 < this.field2549; ++var2) {
            for(int var3 = 0; var3 < this.field2596; ++var3) {
               this.field2576[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < field2581; ++var1) {
         for(var2 = 0; var2 < field2588[var1]; ++var2) {
            field2589[var1][var2] = null;
         }

         field2588[var1] = 0;
      }

      for(var1 = 0; var1 < this.field2550; ++var1) {
         this.field2611[var1] = null;
      }

      this.field2550 = 0;

      for(var1 = 0; var1 < field2577.length; ++var1) {
         field2577[var1] = null;
      }

   }

   public void method4580(int var1) {
      this.field2602 = var1;

      for(int var2 = 0; var2 < this.field2549; ++var2) {
         for(int var3 = 0; var3 < this.field2596; ++var3) {
            if (this.field2576[var1][var2][var3] == null) {
               this.field2576[var1][var2][var3] = new class220(var1, var2, var3);
            }
         }
      }

   }

   public void method4407(int var1, int var2) {
      class220 var3 = this.field2576[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         class220 var5 = this.field2576[var4][var1][var2] = this.field2576[var4 + 1][var1][var2];
         if (var5 != null) {
            --var5.field2428;

            for(int var6 = 0; var6 < var5.field2418; ++var6) {
               class237 var7 = var5.field2419[var6];
               long var9 = var7.field2639;
               boolean var8 = class252.method110(var9) == 2;
               if (var8 && var7.field2638 == var1 && var7.field2635 == var2) {
                  --var7.field2628;
               }
            }
         }
      }

      if (this.field2576[0][var1][var2] == null) {
         this.field2576[0][var1][var2] = new class220(0, var1, var2);
      }

      this.field2576[0][var1][var2].field2408 = var3;
      this.field2576[3][var1][var2] = null;
   }

   public void method4409(int var1, int var2, int var3, int var4) {
      class220 var5 = this.field2576[var1][var2][var3];
      if (var5 != null) {
         this.field2576[var1][var2][var3].field2417 = var4;
      }
   }

   public void method4410(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class246 var21;
      int var22;
      if (var4 == 0) {
         var21 = new class246(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2576[var22][var2][var3] == null) {
               this.field2576[var22][var2][var3] = new class220(var22, var2, var3);
            }
         }

         this.field2576[var1][var2][var3].field2412 = var21;
      } else if (var4 != 1) {
         class255 var23 = new class255(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2576[var22][var2][var3] == null) {
               this.field2576[var22][var2][var3] = new class220(var22, var2, var3);
            }
         }

         this.field2576[var1][var2][var3].field2420 = var23;
      } else {
         var21 = new class246(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2576[var22][var2][var3] == null) {
               this.field2576[var22][var2][var3] = new class220(var22, var2, var3);
            }
         }

         this.field2576[var1][var2][var3].field2412 = var21;
      }
   }

   public void method4411(int var1, int var2, int var3, int var4, class228 var5, long var6, int var8) {
      if (var5 != null) {
         class224 var9 = new class224();
         var9.field2461 = var5;
         var9.field2467 = var2 * 128 + 64;
         var9.field2462 = var3 * 128 + 64;
         var9.field2465 = var4;
         var9.field2464 = var6;
         var9.field2463 = var8;
         if (this.field2576[var1][var2][var3] == null) {
            this.field2576[var1][var2][var3] = new class220(var1, var2, var3);
         }

         this.field2576[var1][var2][var3].field2422 = var9;
      }
   }

   public void method4412(int var1, int var2, int var3, int var4, class228 var5, long var6, class228 var8, class228 var9) {
      class232 var10 = new class232();
      var10.field2532 = var5;
      var10.field2537 = var2 * 128 + 64;
      var10.field2531 = var3 * 128 + 64;
      var10.field2533 = var4;
      var10.field2529 = var6;
      var10.field2536 = var8;
      var10.field2535 = var9;
      int var11 = 0;
      class220 var12 = this.field2576[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.field2418; ++var13) {
            if ((var12.field2419[var13].field2633 & 256) == 256 && var12.field2419[var13].field2627 instanceof class249) {
               class249 var14 = (class249)var12.field2419[var13].field2627;
               var14.method4763();
               if (var14.field2507 > var11) {
                  var11 = var14.field2507;
               }
            }
         }
      }

      var10.field2530 = var11;
      if (this.field2576[var1][var2][var3] == null) {
         this.field2576[var1][var2][var3] = new class220(var1, var2, var3);
      }

      this.field2576[var1][var2][var3].field2423 = var10;
   }

   public void method4413(int var1, int var2, int var3, int var4, class228 var5, class228 var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         class239 var12 = new class239();
         var12.field2654 = var9;
         var12.field2655 = var11;
         var12.field2648 = var2 * 128 + 64;
         var12.field2658 = var3 * 128 + 64;
         var12.field2649 = var4;
         var12.field2647 = var5;
         var12.field2653 = var6;
         var12.field2650 = var7;
         var12.field2651 = var8;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.field2576[var13][var2][var3] == null) {
               this.field2576[var13][var2][var3] = new class220(var13, var2, var3);
            }
         }

         this.field2576[var1][var2][var3].field2414 = var12;
      }
   }

   public void method4414(int var1, int var2, int var3, int var4, class228 var5, class228 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         class254 var14 = new class254();
         var14.field2869 = var11;
         var14.field2863 = var13;
         var14.field2861 = var2 * 128 + 64;
         var14.field2868 = var3 * 128 + 64;
         var14.field2870 = var4;
         var14.field2867 = var5;
         var14.field2862 = var6;
         var14.field2865 = var7;
         var14.field2864 = var8;
         var14.field2860 = var9;
         var14.field2866 = var10;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.field2576[var15][var2][var3] == null) {
               this.field2576[var15][var2][var3] = new class220(var15, var2, var3);
            }
         }

         this.field2576[var1][var2][var3].field2415 = var14;
      }
   }

   public boolean method4415(int var1, int var2, int var3, int var4, int var5, int var6, class228 var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + var5 * 64;
         int var13 = var3 * 128 + var6 * 64;
         return this.method4481(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public boolean method4452(int var1, int var2, int var3, int var4, int var5, class228 var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return this.method4481(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public boolean method4417(int var1, int var2, int var3, int var4, int var5, class228 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.method4481(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   boolean method4481(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class228 var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.field2549 || var16 >= this.field2596) {
               return false;
            }

            class220 var17 = this.field2576[var1][var15][var16];
            if (var17 != null && var17.field2418 >= 5) {
               return false;
            }
         }
      }

      class237 var21 = new class237();
      var21.field2639 = var12;
      var21.field2633 = var14;
      var21.field2628 = var1;
      var21.field2629 = var6;
      var21.field2630 = var7;
      var21.field2634 = var8;
      var21.field2627 = var9;
      var21.field2632 = var10;
      var21.field2638 = var2;
      var21.field2635 = var3;
      var21.field2640 = var2 + var4 - 1;
      var21.field2636 = var3 + var5 - 1;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var22 = var3; var22 < var3 + var5; ++var22) {
            int var18 = 0;
            if (var16 > var2) {
               ++var18;
            }

            if (var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var22 > var3) {
               var18 += 8;
            }

            if (var22 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if (this.field2576[var19][var16][var22] == null) {
                  this.field2576[var19][var16][var22] = new class220(var19, var16, var22);
               }
            }

            class220 var23 = this.field2576[var1][var16][var22];
            var23.field2419[var23.field2418] = var21;
            var23.field2409[var23.field2418] = var18;
            var23.field2421 |= var18;
            ++var23.field2418;
         }
      }

      if (var11) {
         this.field2611[this.field2550++] = var21;
      }

      return true;
   }

   public void method4419() {
      for(int var1 = 0; var1 < this.field2550; ++var1) {
         class237 var2 = this.field2611[var1];
         this.method4420(var2);
         this.field2611[var1] = null;
      }

      this.field2550 = 0;
   }

   void method4420(class237 var1) {
      for(int var2 = var1.field2638; var2 <= var1.field2640; ++var2) {
         for(int var3 = var1.field2635; var3 <= var1.field2636; ++var3) {
            class220 var4 = this.field2576[var1.field2628][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.field2418; ++var5) {
                  if (var4.field2419[var5] == var1) {
                     --var4.field2418;

                     for(int var6 = var5; var6 < var4.field2418; ++var6) {
                        var4.field2419[var6] = var4.field2419[var6 + 1];
                        var4.field2409[var6] = var4.field2409[var6 + 1];
                     }

                     var4.field2419[var4.field2418] = null;
                     break;
                  }
               }

               var4.field2421 = 0;

               for(var5 = 0; var5 < var4.field2418; ++var5) {
                  var4.field2421 |= var4.field2409[var5];
               }
            }
         }
      }

   }

   public void method4421(int var1, int var2, int var3, int var4) {
      class220 var5 = this.field2576[var1][var2][var3];
      if (var5 != null) {
         class254 var6 = var5.field2415;
         if (var6 != null) {
            var6.field2860 = var6.field2860 * var4 / 16;
            var6.field2866 = var6.field2866 * var4 / 16;
         }
      }
   }

   public void method4422(int var1, int var2, int var3) {
      class220 var4 = this.field2576[var1][var2][var3];
      if (var4 != null) {
         var4.field2414 = null;
      }
   }

   public void method4520(int var1, int var2, int var3) {
      class220 var4 = this.field2576[var1][var2][var3];
      if (var4 != null) {
         var4.field2415 = null;
      }
   }

   public void method4424(int var1, int var2, int var3) {
      class220 var4 = this.field2576[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.field2418; ++var5) {
            class237 var6 = var4.field2419[var5];
            long var8 = var6.field2639;
            boolean var7 = class252.method110(var8) == 2;
            if (var7 && var6.field2638 == var2 && var6.field2635 == var3) {
               this.method4420(var6);
               return;
            }
         }

      }
   }

   public void method4425(int var1, int var2, int var3) {
      class220 var4 = this.field2576[var1][var2][var3];
      if (var4 != null) {
         var4.field2422 = null;
      }
   }

   public void method4426(int var1, int var2, int var3) {
      class220 var4 = this.field2576[var1][var2][var3];
      if (var4 != null) {
         var4.field2423 = null;
      }
   }

   public class239 method4427(int var1, int var2, int var3) {
      class220 var4 = this.field2576[var1][var2][var3];
      return var4 == null ? null : var4.field2414;
   }

   public class254 method4462(int var1, int var2, int var3) {
      class220 var4 = this.field2576[var1][var2][var3];
      return var4 == null ? null : var4.field2415;
   }

   public class237 method4429(int var1, int var2, int var3) {
      class220 var4 = this.field2576[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field2418; ++var5) {
            class237 var6 = var4.field2419[var5];
            long var8 = var6.field2639;
            boolean var7 = class252.method110(var8) == 2;
            if (var7 && var6.field2638 == var2 && var6.field2635 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public class224 method4430(int var1, int var2, int var3) {
      class220 var4 = this.field2576[var1][var2][var3];
      return var4 != null && var4.field2422 != null ? var4.field2422 : null;
   }

   public long method4431(int var1, int var2, int var3) {
      class220 var4 = this.field2576[var1][var2][var3];
      return var4 != null && var4.field2414 != null ? var4.field2414.field2654 : 0L;
   }

   public long method4432(int var1, int var2, int var3) {
      class220 var4 = this.field2576[var1][var2][var3];
      return var4 != null && var4.field2415 != null ? var4.field2415.field2869 : 0L;
   }

   public long method4574(int var1, int var2, int var3) {
      class220 var4 = this.field2576[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.field2418; ++var5) {
            class237 var6 = var4.field2419[var5];
            long var8 = var6.field2639;
            boolean var7 = class252.method110(var8) == 2;
            if (var7 && var6.field2638 == var2 && var6.field2635 == var3) {
               return var6.field2639;
            }
         }

         return 0L;
      }
   }

   public long method4434(int var1, int var2, int var3) {
      class220 var4 = this.field2576[var1][var2][var3];
      return var4 != null && var4.field2422 != null ? var4.field2422.field2464 : 0L;
   }

   public int method4435(int var1, int var2, int var3, long var4) {
      class220 var6 = this.field2576[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.field2414 != null && var6.field2414.field2654 == var4) {
         return var6.field2414.field2655 & 255;
      } else if (var6.field2415 != null && var6.field2415.field2869 == var4) {
         return var6.field2415.field2863 & 255;
      } else if (var6.field2422 != null && var6.field2422.field2464 == var4) {
         return var6.field2422.field2463 & 255;
      } else {
         for(int var7 = 0; var7 < var6.field2418; ++var7) {
            if (var6.field2419[var7].field2639 == var4) {
               return var6.field2419[var7].field2633 & 255;
            }
         }

         return -1;
      }
   }

   public void method4436(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2548; ++var4) {
         for(int var5 = 0; var5 < this.field2549; ++var5) {
            for(int var6 = 0; var6 < this.field2596; ++var6) {
               class220 var7 = this.field2576[var4][var5][var6];
               if (var7 != null) {
                  class239 var8 = var7.field2414;
                  class213 var10;
                  if (var8 != null && var8.field2647 instanceof class213) {
                     class213 var9 = (class213)var8.field2647;
                     this.method4438(var9, var4, var5, var6, 1, 1);
                     if (var8.field2653 instanceof class213) {
                        var10 = (class213)var8.field2653;
                        this.method4438(var10, var4, var5, var6, 1, 1);
                        class213.method3975(var9, var10, 0, 0, 0, false);
                        var8.field2653 = var10.method3976(var10.field2310, var10.field2322, var1, var2, var3);
                     }

                     var8.field2647 = var9.method3976(var9.field2310, var9.field2322, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.field2418; ++var12) {
                     class237 var14 = var7.field2419[var12];
                     if (var14 != null && var14.field2627 instanceof class213) {
                        class213 var11 = (class213)var14.field2627;
                        this.method4438(var11, var4, var5, var6, var14.field2640 - var14.field2638 + 1, var14.field2636 - var14.field2635 + 1);
                        var14.field2627 = var11.method3976(var11.field2310, var11.field2322, var1, var2, var3);
                     }
                  }

                  class224 var13 = var7.field2422;
                  if (var13 != null && var13.field2461 instanceof class213) {
                     var10 = (class213)var13.field2461;
                     this.method4404(var10, var4, var5, var6);
                     var13.field2461 = var10.method3976(var10.field2310, var10.field2322, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   void method4404(class213 var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for(int var9 = var3; var9 <= var6; ++var9) {
         if (var9 >= 0 && var9 < this.field2549) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (var10 >= 0 && var10 < this.field2596 && (var9 >= var6 || var10 >= var8)) {
                  class220 var11 = this.field2576[var2][var9][var10];
                  if (var11 != null && var11.field2422 != null && var11.field2422.field2461 instanceof class213) {
                     int var12 = this.method4439(var2, var9, var10, var2, var3, var4);
                     class213 var13 = (class213)var11.field2422.field2461;
                     class213.method3975(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                  }
               }
            }
         }
      }

   }

   void method4438(class213 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.field2548) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.field2549) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.field2596 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        class220 var15 = this.field2576[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = this.method4439(var12, var13, var14, var2, var3, var4);
                           class239 var17 = var15.field2414;
                           if (var17 != null) {
                              class213 var18;
                              if (var17.field2647 instanceof class213) {
                                 var18 = (class213)var17.field2647;
                                 class213.method3975(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.field2653 instanceof class213) {
                                 var18 = (class213)var17.field2653;
                                 class213.method3975(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field2418; ++var23) {
                              class237 var19 = var15.field2419[var23];
                              if (var19 != null && var19.field2627 instanceof class213) {
                                 class213 var20 = (class213)var19.field2627;
                                 int var21 = var19.field2640 - var19.field2638 + 1;
                                 int var22 = var19.field2636 - var19.field2635 + 1;
                                 class213.method3975(var1, var20, (var19.field2638 - var3) * 128 + (var21 - var5) * 64, var16, (var19.field2635 - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   int method4439(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.method4440(var1, var2, var3) - this.method4440(var4, var5, var6);
   }

   int method4440(int var1, int var2, int var3) {
      return (this.field2607[var1][var2][var3] + this.field2607[var1][var2 + 1][var3] + this.field2607[var1][var2][var3 + 1] + this.field2607[var1][var2 + 1][var3 + 1]) / 4;
   }

   public void method4441(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      class220 var7 = this.field2576[var4][var5][var6];
      if (var7 != null) {
         class246 var8 = var7.field2412;
         int var10;
         if (var8 != null) {
            int var18 = var8.field2709;
            if (var18 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            class255 var9 = var7.field2420;
            if (var9 != null) {
               var10 = var9.field2884;
               int var11 = var9.field2885;
               int var12 = var9.field2894;
               int var13 = var9.field2887;
               int[] var14 = this.field2604[var10];
               int[] var15 = this.field2605[var11];
               int var16 = 0;
               int var17;
               if (var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   public void method4529(int var1, int var2, int var3, boolean var4) {
      if (!shouldSendWalk() || var4) {
         field2578 = true;
         field2584 = var4;
         field2579 = var1;
         field2555 = var2;
         field2590 = var3;
         selectedX = -1;
         selectedY = -1;
      }
   }

   public void method4445() {
      field2584 = true;
   }

   public void method4448(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.field2549 * 128) {
         var1 = this.field2549 * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.field2596 * 128) {
         var3 = this.field2596 * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      ++field2547;
      field2573 = class229.field2511[var4];
      field2574 = class229.field2512[var4];
      field2575 = class229.field2511[var5];
      field2609 = class229.field2512[var5];
      field2587 = field2606[(var4 - 128) / 32][var5 / 64];
      field2560 = var1;
      field2571 = var2;
      field2572 = var3;
      field2568 = var1 / 128;
      field2569 = var3 / 128;
      field2562 = var6;
      field2567 = field2568 - 25;
      if (field2567 < 0) {
         field2567 = 0;
      }

      field2566 = field2569 - 25;
      if (field2566 < 0) {
         field2566 = 0;
      }

      field2570 = field2568 + 25;
      if (field2570 > this.field2549) {
         field2570 = this.field2549;
      }

      field2552 = field2569 + 25;
      if (field2552 > this.field2596) {
         field2552 = this.field2596;
      }

      this.method4454();
      field2561 = 0;

      int var7;
      class220[][] var8;
      int var9;
      int var10;
      for(var7 = this.field2602; var7 < this.field2548; ++var7) {
         var8 = this.field2576[var7];

         for(var9 = field2567; var9 < field2570; ++var9) {
            for(var10 = field2566; var10 < field2552; ++var10) {
               class220 var11 = var8[var9][var10];
               if (var11 != null) {
                  if (var11.field2417 > var6 || !field2587[var9 - field2568 + 25][var10 - field2569 + 25] && this.field2607[var7][var9][var10] - var2 < 2000) {
                     var11.field2410 = false;
                     var11.field2413 = false;
                     var11.field2426 = 0;
                  } else {
                     var11.field2410 = true;
                     var11.field2413 = true;
                     if (var11.field2418 > 0) {
                        var11.field2425 = true;
                     } else {
                        var11.field2425 = false;
                     }

                     ++field2561;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      class220 var15;
      int var16;
      for(var7 = this.field2602; var7 < this.field2548; ++var7) {
         var8 = this.field2576[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field2568 + var9;
            var16 = field2568 - var9;
            if (var10 >= field2567 || var16 < field2570) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field2569 + var12;
                  var14 = field2569 - var12;
                  if (var10 >= field2567) {
                     if (var13 >= field2566) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.field2410) {
                           this.method4449(var15, true);
                        }
                     }

                     if (var14 < field2552) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.field2410) {
                           this.method4449(var15, true);
                        }
                     }
                  }

                  if (var16 < field2570) {
                     if (var13 >= field2566) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.field2410) {
                           this.method4449(var15, true);
                        }
                     }

                     if (var14 < field2552) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.field2410) {
                           this.method4449(var15, true);
                        }
                     }
                  }

                  if (field2561 == 0) {
                     field2578 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.field2602; var7 < this.field2548; ++var7) {
         var8 = this.field2576[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field2568 + var9;
            var16 = field2568 - var9;
            if (var10 >= field2567 || var16 < field2570) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field2569 + var12;
                  var14 = field2569 - var12;
                  if (var10 >= field2567) {
                     if (var13 >= field2566) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.field2410) {
                           this.method4449(var15, false);
                        }
                     }

                     if (var14 < field2552) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.field2410) {
                           this.method4449(var15, false);
                        }
                     }
                  }

                  if (var16 < field2570) {
                     if (var13 >= field2566) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.field2410) {
                           this.method4449(var15, false);
                        }
                     }

                     if (var14 < field2552) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.field2410) {
                           this.method4449(var15, false);
                        }
                     }
                  }

                  if (field2561 == 0) {
                     field2578 = false;
                     return;
                  }
               }
            }
         }
      }

      field2578 = false;
   }

   void method4449(class220 var1, boolean var2) {
      field2592.method6680(var1);

      while(true) {
         class220 var3;
         int var4;
         int var5;
         int var6;
         int var7;
         class220[][] var8;
         class220 var9;
         int var11;
         int var14;
         int var15;
         int var16;
         int var24;
         int var26;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              class239 var10;
                              class237 var12;
                              int var17;
                              int var18;
                              int var21;
                              boolean var22;
                              class220 var33;
                              while(true) {
                                 do {
                                    var3 = (class220)field2592.method6683();
                                    if (var3 == null) {
                                       return;
                                    }
                                 } while(!var3.field2413);

                                 var4 = var3.field2416;
                                 var5 = var3.field2427;
                                 var6 = var3.field2428;
                                 var7 = var3.field2411;
                                 var8 = this.field2576[var6];
                                 if (!var3.field2410) {
                                    break;
                                 }

                                 if (var2) {
                                    if (var6 > 0) {
                                       var9 = this.field2576[var6 - 1][var4][var5];
                                       if (var9 != null && var9.field2413) {
                                          continue;
                                       }
                                    }

                                    if (var4 <= field2568 && var4 > field2567) {
                                       var9 = var8[var4 - 1][var5];
                                       if (var9 != null && var9.field2413 && (var9.field2410 || (var3.field2421 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var4 >= field2568 && var4 < field2570 - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if (var9 != null && var9.field2413 && (var9.field2410 || (var3.field2421 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= field2569 && var5 > field2566) {
                                       var9 = var8[var4][var5 - 1];
                                       if (var9 != null && var9.field2413 && (var9.field2410 || (var3.field2421 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= field2569 && var5 < field2552 - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if (var9 != null && var9.field2413 && (var9.field2410 || (var3.field2421 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.field2410 = false;
                                 if (var3.field2408 != null) {
                                    var9 = var3.field2408;
                                    if (var9.field2412 != null) {
                                       if (!this.method4444(0, var4, var5)) {
                                          this.method4528(var9.field2412, 0, field2573, field2574, field2575, field2609, var4, var5);
                                       }
                                    } else if (var9.field2420 != null && !this.method4444(0, var4, var5)) {
                                       this.method4451(var9.field2420, field2573, field2574, field2575, field2609, var4, var5);
                                    }

                                    var10 = var9.field2414;
                                    if (var10 != null) {
                                       var10.field2647.method4275(0, field2573, field2574, field2575, field2609, var10.field2648 - field2560, var10.field2649 - field2571, var10.field2658 - field2572, var10.field2654);
                                    }

                                    for(var11 = 0; var11 < var9.field2418; ++var11) {
                                       var12 = var9.field2419[var11];
                                       if (var12 != null) {
                                          var12.field2627.method4275(var12.field2632, field2573, field2574, field2575, field2609, var12.field2629 - field2560, var12.field2634 - field2571, var12.field2630 - field2572, var12.field2639);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var3.field2412 != null) {
                                    if (!this.method4444(var7, var4, var5)) {
                                       var22 = true;
                                       if (var3.field2412.field2704 != 12345678 || field2578 && var6 <= field2579) {
                                          this.method4528(var3.field2412, var7, field2573, field2574, field2575, field2609, var4, var5);
                                       }
                                    }
                                 } else if (var3.field2420 != null && !this.method4444(var7, var4, var5)) {
                                    var22 = true;
                                    this.method4451(var3.field2420, field2573, field2574, field2575, field2609, var4, var5);
                                 }

                                 var21 = 0;
                                 var11 = 0;
                                 class239 var23 = var3.field2414;
                                 class254 var13 = var3.field2415;
                                 if (var23 != null || var13 != null) {
                                    if (field2568 == var4) {
                                       ++var21;
                                    } else if (field2568 < var4) {
                                       var21 += 2;
                                    }

                                    if (field2569 == var5) {
                                       var21 += 3;
                                    } else if (field2569 > var5) {
                                       var21 += 6;
                                    }

                                    var11 = field2564[var21];
                                    var3.field2429 = field2559[var21];
                                 }

                                 if (var23 != null) {
                                    if ((var23.field2650 & field2594[var21]) != 0) {
                                       if (var23.field2650 == 16) {
                                          var3.field2426 = 3;
                                          var3.field2430 = field2612[var21];
                                          var3.field2424 = 3 - var3.field2430;
                                       } else if (var23.field2650 == 32) {
                                          var3.field2426 = 6;
                                          var3.field2430 = field2565[var21];
                                          var3.field2424 = 6 - var3.field2430;
                                       } else if (var23.field2650 == 64) {
                                          var3.field2426 = 12;
                                          var3.field2430 = field2598[var21];
                                          var3.field2424 = 12 - var3.field2430;
                                       } else {
                                          var3.field2426 = 9;
                                          var3.field2430 = field2599[var21];
                                          var3.field2424 = 9 - var3.field2430;
                                       }
                                    } else {
                                       var3.field2426 = 0;
                                    }

                                    if ((var23.field2650 & var11) != 0 && !this.method4450(var7, var4, var5, var23.field2650)) {
                                       var23.field2647.method4275(0, field2573, field2574, field2575, field2609, var23.field2648 - field2560, var23.field2649 - field2571, var23.field2658 - field2572, var23.field2654);
                                    }

                                    if ((var23.field2651 & var11) != 0 && !this.method4450(var7, var4, var5, var23.field2651)) {
                                       var23.field2653.method4275(0, field2573, field2574, field2575, field2609, var23.field2648 - field2560, var23.field2649 - field2571, var23.field2658 - field2572, var23.field2654);
                                    }
                                 }

                                 if (var13 != null && !this.method4456(var7, var4, var5, var13.field2867.field2507)) {
                                    if ((var13.field2865 & var11) != 0) {
                                       var13.field2867.method4275(0, field2573, field2574, field2575, field2609, var13.field2861 - field2560 + var13.field2860, var13.field2870 - field2571, var13.field2868 - field2572 + var13.field2866, var13.field2869);
                                    } else if (var13.field2865 == 256) {
                                       var14 = var13.field2861 - field2560;
                                       var15 = var13.field2870 - field2571;
                                       var16 = var13.field2868 - field2572;
                                       var17 = var13.field2864;
                                       if (var17 != 1 && var17 != 2) {
                                          var18 = var14;
                                       } else {
                                          var18 = -var14;
                                       }

                                       int var19;
                                       if (var17 != 2 && var17 != 3) {
                                          var19 = var16;
                                       } else {
                                          var19 = -var16;
                                       }

                                       if (var19 < var18) {
                                          var13.field2867.method4275(0, field2573, field2574, field2575, field2609, var14 + var13.field2860, var15, var16 + var13.field2866, var13.field2869);
                                       } else if (var13.field2862 != null) {
                                          var13.field2862.method4275(0, field2573, field2574, field2575, field2609, var14, var15, var16, var13.field2869);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    class224 var27 = var3.field2422;
                                    if (var27 != null) {
                                       var27.field2461.method4275(0, field2573, field2574, field2575, field2609, var27.field2467 - field2560, var27.field2465 - field2571, var27.field2462 - field2572, var27.field2464);
                                    }

                                    class232 var31 = var3.field2423;
                                    if (var31 != null && var31.field2530 == 0) {
                                       if (var31.field2536 != null) {
                                          var31.field2536.method4275(0, field2573, field2574, field2575, field2609, var31.field2537 - field2560, var31.field2533 - field2571, var31.field2531 - field2572, var31.field2529);
                                       }

                                       if (var31.field2535 != null) {
                                          var31.field2535.method4275(0, field2573, field2574, field2575, field2609, var31.field2537 - field2560, var31.field2533 - field2571, var31.field2531 - field2572, var31.field2529);
                                       }

                                       if (var31.field2532 != null) {
                                          var31.field2532.method4275(0, field2573, field2574, field2575, field2609, var31.field2537 - field2560, var31.field2533 - field2571, var31.field2531 - field2572, var31.field2529);
                                       }
                                    }
                                 }

                                 var14 = var3.field2421;
                                 if (var14 != 0) {
                                    if (var4 < field2568 && (var14 & 4) != 0) {
                                       var33 = var8[var4 + 1][var5];
                                       if (var33 != null && var33.field2413) {
                                          field2592.method6680(var33);
                                       }
                                    }

                                    if (var5 < field2569 && (var14 & 2) != 0) {
                                       var33 = var8[var4][var5 + 1];
                                       if (var33 != null && var33.field2413) {
                                          field2592.method6680(var33);
                                       }
                                    }

                                    if (var4 > field2568 && (var14 & 1) != 0) {
                                       var33 = var8[var4 - 1][var5];
                                       if (var33 != null && var33.field2413) {
                                          field2592.method6680(var33);
                                       }
                                    }

                                    if (var5 > field2569 && (var14 & 8) != 0) {
                                       var33 = var8[var4][var5 - 1];
                                       if (var33 != null && var33.field2413) {
                                          field2592.method6680(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var3.field2426 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var3.field2418; ++var21) {
                                    if (var3.field2419[var21].field2631 != field2547 && (var3.field2409[var21] & var3.field2426) == var3.field2430) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var10 = var3.field2414;
                                    if (!this.method4450(var7, var4, var5, var10.field2650)) {
                                       var10.field2647.method4275(0, field2573, field2574, field2575, field2609, var10.field2648 - field2560, var10.field2649 - field2571, var10.field2658 - field2572, var10.field2654);
                                    }

                                    var3.field2426 = 0;
                                 }
                              }

                              if (!var3.field2425) {
                                 break;
                              }

                              try {
                                 int var25 = var3.field2418;
                                 var3.field2425 = false;
                                 var21 = 0;

                                 label563:
                                 for(var11 = 0; var11 < var25; ++var11) {
                                    var12 = var3.field2419[var11];
                                    if (var12.field2631 != field2547) {
                                       for(var26 = var12.field2638; var26 <= var12.field2640; ++var26) {
                                          for(var14 = var12.field2635; var14 <= var12.field2636; ++var14) {
                                             var33 = var8[var26][var14];
                                             if (var33.field2410) {
                                                var3.field2425 = true;
                                                continue label563;
                                             }

                                             if (var33.field2426 != 0) {
                                                var16 = 0;
                                                if (var26 > var12.field2638) {
                                                   ++var16;
                                                }

                                                if (var26 < var12.field2640) {
                                                   var16 += 4;
                                                }

                                                if (var14 > var12.field2635) {
                                                   var16 += 8;
                                                }

                                                if (var14 < var12.field2636) {
                                                   var16 += 2;
                                                }

                                                if ((var16 & var33.field2426) == var3.field2424) {
                                                   var3.field2425 = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       field2577[var21++] = var12;
                                       var26 = field2568 - var12.field2638;
                                       var14 = var12.field2640 - field2568;
                                       if (var14 > var26) {
                                          var26 = var14;
                                       }

                                       var15 = field2569 - var12.field2635;
                                       var16 = var12.field2636 - field2569;
                                       if (var16 > var15) {
                                          var12.field2637 = var26 + var16;
                                       } else {
                                          var12.field2637 = var26 + var15;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var11 = -50;
                                    var24 = -1;

                                    for(var26 = 0; var26 < var21; ++var26) {
                                       class237 var34 = field2577[var26];
                                       if (var34.field2631 != field2547) {
                                          if (var34.field2637 > var11) {
                                             var11 = var34.field2637;
                                             var24 = var26;
                                          } else if (var34.field2637 == var11) {
                                             var15 = var34.field2629 - field2560;
                                             var16 = var34.field2630 - field2572;
                                             var17 = field2577[var24].field2629 - field2560;
                                             var18 = field2577[var24].field2630 - field2572;
                                             if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    class237 var35 = field2577[var24];
                                    var35.field2631 = field2547;
                                    if (!this.method4557(var7, var35.field2638, var35.field2640, var35.field2635, var35.field2636, var35.field2627.field2507)) {
                                       var35.field2627.method4275(var35.field2632, field2573, field2574, field2575, field2609, var35.field2629 - field2560, var35.field2634 - field2571, var35.field2630 - field2572, var35.field2639);
                                    }

                                    for(var14 = var35.field2638; var14 <= var35.field2640; ++var14) {
                                       for(var15 = var35.field2635; var15 <= var35.field2636; ++var15) {
                                          class220 var36 = var8[var14][var15];
                                          if (var36.field2426 != 0) {
                                             field2592.method6680(var36);
                                          } else if ((var14 != var4 || var15 != var5) && var36.field2413) {
                                             field2592.method6680(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var3.field2425) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var3.field2425 = false;
                                 break;
                              }
                           }
                        } while(!var3.field2413);
                     } while(var3.field2426 != 0);

                     if (var4 > field2568 || var4 <= field2567) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.field2413);

                  if (var4 < field2568 || var4 >= field2570 - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.field2413);

               if (var5 > field2569 || var5 <= field2566) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.field2413);

            if (var5 < field2569 || var5 >= field2552 - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.field2413);

         var3.field2413 = false;
         --field2561;
         class232 var29 = var3.field2423;
         if (var29 != null && var29.field2530 != 0) {
            if (var29.field2536 != null) {
               var29.field2536.method4275(0, field2573, field2574, field2575, field2609, var29.field2537 - field2560, var29.field2533 - field2571 - var29.field2530, var29.field2531 - field2572, var29.field2529);
            }

            if (var29.field2535 != null) {
               var29.field2535.method4275(0, field2573, field2574, field2575, field2609, var29.field2537 - field2560, var29.field2533 - field2571 - var29.field2530, var29.field2531 - field2572, var29.field2529);
            }

            if (var29.field2532 != null) {
               var29.field2532.method4275(0, field2573, field2574, field2575, field2609, var29.field2537 - field2560, var29.field2533 - field2571 - var29.field2530, var29.field2531 - field2572, var29.field2529);
            }
         }

         if (var3.field2429 != 0) {
            class254 var30 = var3.field2415;
            if (var30 != null && !this.method4456(var7, var4, var5, var30.field2867.field2507)) {
               if ((var30.field2865 & var3.field2429) != 0) {
                  var30.field2867.method4275(0, field2573, field2574, field2575, field2609, var30.field2861 - field2560 + var30.field2860, var30.field2870 - field2571, var30.field2868 - field2572 + var30.field2866, var30.field2869);
               } else if (var30.field2865 == 256) {
                  var11 = var30.field2861 - field2560;
                  var24 = var30.field2870 - field2571;
                  var26 = var30.field2868 - field2572;
                  var14 = var30.field2864;
                  if (var14 != 1 && var14 != 2) {
                     var15 = var11;
                  } else {
                     var15 = -var11;
                  }

                  if (var14 != 2 && var14 != 3) {
                     var16 = var26;
                  } else {
                     var16 = -var26;
                  }

                  if (var16 >= var15) {
                     var30.field2867.method4275(0, field2573, field2574, field2575, field2609, var11 + var30.field2860, var24, var26 + var30.field2866, var30.field2869);
                  } else if (var30.field2862 != null) {
                     var30.field2862.method4275(0, field2573, field2574, field2575, field2609, var11, var24, var26, var30.field2869);
                  }
               }
            }

            class239 var28 = var3.field2414;
            if (var28 != null) {
               if ((var28.field2651 & var3.field2429) != 0 && !this.method4450(var7, var4, var5, var28.field2651)) {
                  var28.field2653.method4275(0, field2573, field2574, field2575, field2609, var28.field2648 - field2560, var28.field2649 - field2571, var28.field2658 - field2572, var28.field2654);
               }

               if ((var28.field2650 & var3.field2429) != 0 && !this.method4450(var7, var4, var5, var28.field2650)) {
                  var28.field2647.method4275(0, field2573, field2574, field2575, field2609, var28.field2648 - field2560, var28.field2649 - field2571, var28.field2658 - field2572, var28.field2654);
               }
            }
         }

         class220 var32;
         if (var6 < this.field2548 - 1) {
            var32 = this.field2576[var6 + 1][var4][var5];
            if (var32 != null && var32.field2413) {
               field2592.method6680(var32);
            }
         }

         if (var4 < field2568) {
            var32 = var8[var4 + 1][var5];
            if (var32 != null && var32.field2413) {
               field2592.method6680(var32);
            }
         }

         if (var5 < field2569) {
            var32 = var8[var4][var5 + 1];
            if (var32 != null && var32.field2413) {
               field2592.method6680(var32);
            }
         }

         if (var4 > field2568) {
            var32 = var8[var4 - 1][var5];
            if (var32 != null && var32.field2413) {
               field2592.method6680(var32);
            }
         }

         if (var5 > field2569) {
            var32 = var8[var4][var5 - 1];
            if (var32 != null && var32.field2413) {
               field2592.method6680(var32);
            }
         }
      }
   }

   void method4528(class246 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - field2560;
      int var11;
      int var12 = var11 = (var8 << 7) - field2572;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.field2607[var2][var7][var8] - field2571;
      int var18 = this.field2607[var2][var7 + 1][var8] - field2571;
      int var19 = this.field2607[var2][var7 + 1][var8 + 1] - field2571;
      int var20 = this.field2607[var2][var7][var8 + 1] - field2571;
      int var21 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var21;
      if (var12 >= 50) {
         var21 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var21;
         if (var11 >= 50) {
            var21 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var21;
            if (var16 >= 50) {
               var21 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var15 * var3 >> 16;
               var15 = var20 * var3 + var15 * var4 >> 16;
               if (var15 >= 50) {
                  int var22 = class229.method4282() + var10 * class229.method4288() / var12;
                  int var23 = class229.method4283() + var17 * class229.method4288() / var12;
                  int var24 = class229.method4282() + var14 * class229.method4288() / var11;
                  int var25 = class229.method4283() + var18 * class229.method4288() / var11;
                  int var26 = class229.method4282() + var13 * class229.method4288() / var16;
                  int var27 = class229.method4283() + var19 * class229.method4288() / var16;
                  int var28 = class229.method4282() + var9 * class229.method4288() / var15;
                  int var29 = class229.method4283() + var21 * class229.method4288() / var15;
                  float var30 = class364.method6635(var12);
                  float var31 = class364.method6635(var11);
                  float var32 = class364.method6635(var16);
                  float var33 = class364.method6635(var15);
                  class229.field2513.field2816 = 0;
                  int var34;
                  int var35;
                  if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     class229.field2513.field2826 = false;
                     var34 = class229.method4284();
                     if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var34 || var28 > var34 || var24 > var34) {
                        class229.field2513.field2826 = true;
                     }

                     if (field2578 && method4457(field2555, field2590, var27, var29, var25, var26, var28, var24)) {
                        selectedX = var7;
                        selectedY = var8;
                     }

                     if (var1.field2708 == -1) {
                        if (var1.field2704 != 12345678) {
                           class229.method4296(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field2704, var1.field2705, var1.field2703);
                        }
                     } else if (!field2595) {
                        if (var1.field2707) {
                           class229.method4299(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field2704, var1.field2705, var1.field2703, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field2708);
                        } else {
                           class229.method4299(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field2704, var1.field2705, var1.field2703, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field2708);
                        }
                     } else {
                        var35 = class229.field2513.field2815.method5167(var1.field2708);
                        class229.method4296(var27, var29, var25, var26, var28, var24, var32, var33, var31, method4405(var35, var1.field2704), method4405(var35, var1.field2705), method4405(var35, var1.field2703));
                     }
                  }

                  if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     class229.field2513.field2826 = false;
                     var34 = class229.method4284();
                     if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) {
                        class229.field2513.field2826 = true;
                     }

                     if (field2578 && method4457(field2555, field2590, var23, var25, var29, var22, var24, var28)) {
                        selectedX = var7;
                        selectedY = var8;
                     }

                     if (var1.field2708 == -1) {
                        if (var1.field2706 != 12345678) {
                           class229.method4296(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.field2706, var1.field2703, var1.field2705);
                        }
                     } else if (!field2595) {
                        class229.method4299(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.field2706, var1.field2703, var1.field2705, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field2708);
                     } else {
                        var35 = class229.field2513.field2815.method5167(var1.field2708);
                        class229.method4296(var23, var25, var29, var22, var24, var28, var30, var31, var33, method4405(var35, var1.field2706), method4405(var35, var1.field2703), method4405(var35, var1.field2705));
                     }
                  }

               }
            }
         }
      }
   }

   void method4451(class255 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field2877.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field2877[var9] - field2560;
         var11 = var1.field2874[var9] - field2571;
         var12 = var1.field2890[var9] - field2572;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if (var12 < 50) {
            return;
         }

         if (var1.field2879 != null) {
            class255.field2875[var9] = var10;
            class255.field2892[var9] = var13;
            class255.field2873[var9] = var12;
         }

         class255.field2888[var9] = class229.method4282() + var10 * class229.method4288() / var12;
         class255.field2889[var9] = class229.method4283() + var13 * class229.method4288() / var12;
         class255.field2895[var9] = class364.method6635(var12);
      }

      class229.field2513.field2816 = 0;
      var8 = var1.field2893.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field2893[var9];
         var11 = var1.field2880[var9];
         var12 = var1.field2881[var9];
         var13 = class255.field2888[var10];
         int var14 = class255.field2888[var11];
         int var15 = class255.field2888[var12];
         int var16 = class255.field2889[var10];
         int var17 = class255.field2889[var11];
         int var18 = class255.field2889[var12];
         float var19 = class255.field2895[var10];
         float var20 = class255.field2895[var11];
         float var21 = class255.field2895[var12];
         if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class229.field2513.field2826 = false;
            int var22 = class229.method4284();
            if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > var22 || var14 > var22 || var15 > var22) {
               class229.field2513.field2826 = true;
            }

            if (field2578 && method4457(field2555, field2590, var16, var17, var18, var13, var14, var15)) {
               selectedX = var6;
               selectedY = var7;
            }

            if (var1.field2879 != null && var1.field2879[var9] != -1) {
               if (!field2595) {
                  if (var1.field2883) {
                     class229.method4299(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field2876[var9], var1.field2891[var9], var1.field2878[var9], class255.field2875[0], class255.field2875[1], class255.field2875[3], class255.field2892[0], class255.field2892[1], class255.field2892[3], class255.field2873[0], class255.field2873[1], class255.field2873[3], var1.field2879[var9]);
                  } else {
                     class229.method4299(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field2876[var9], var1.field2891[var9], var1.field2878[var9], class255.field2875[var10], class255.field2875[var11], class255.field2875[var12], class255.field2892[var10], class255.field2892[var11], class255.field2892[var12], class255.field2873[var10], class255.field2873[var11], class255.field2873[var12], var1.field2879[var9]);
                  }
               } else {
                  int var23 = class229.field2513.field2815.method5167(var1.field2879[var9]);
                  class229.method4296(var16, var17, var18, var13, var14, var15, var19, var20, var21, method4405(var23, var1.field2876[var9]), method4405(var23, var1.field2891[var9]), method4405(var23, var1.field2878[var9]));
               }
            } else if (var1.field2876[var9] != 12345678) {
               class229.method4296(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field2876[var9], var1.field2891[var9], var1.field2878[var9]);
            }
         }
      }

   }

   void method4454() {
      int var1 = field2588[field2562];
      class250[] var2 = field2589[field2562];
      field2563 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         class250 var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if (var4.field2812 == 1) {
            var5 = var4.field2801 - field2568 + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.field2810 - field2569 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2799 - field2569 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (field2587[var5][var6++]) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = field2560 - var4.field2803;
                  if (var9 > 32) {
                     var4.field2807 = 1;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.field2807 = 2;
                     var9 = -var9;
                  }

                  var4.field2804 = (var4.field2797 - field2572 << 8) / var9;
                  var4.field2811 = (var4.field2798 - field2572 << 8) / var9;
                  var4.field2796 = (var4.field2805 - field2571 << 8) / var9;
                  var4.field2813 = (var4.field2806 - field2571 << 8) / var9;
                  field2591[field2563++] = var4;
               }
            }
         } else if (var4.field2812 == 2) {
            var5 = var4.field2810 - field2569 + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.field2801 - field2568 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2800 - field2568 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (field2587[var6++][var5]) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = field2572 - var4.field2797;
                  if (var9 > 32) {
                     var4.field2807 = 3;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.field2807 = 4;
                     var9 = -var9;
                  }

                  var4.field2808 = (var4.field2803 - field2560 << 8) / var9;
                  var4.field2809 = (var4.field2802 - field2560 << 8) / var9;
                  var4.field2796 = (var4.field2805 - field2571 << 8) / var9;
                  var4.field2813 = (var4.field2806 - field2571 << 8) / var9;
                  field2591[field2563++] = var4;
               }
            }
         } else if (var4.field2812 == 4) {
            var5 = var4.field2805 - field2571;
            if (var5 > 128) {
               var6 = var4.field2810 - field2569 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2799 - field2569 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               if (var6 <= var7) {
                  int var8 = var4.field2801 - field2568 + 25;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.field2800 - field2568 + 25;
                  if (var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label146:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (field2587[var11][var12]) {
                           var10 = true;
                           break label146;
                        }
                     }
                  }

                  if (var10) {
                     var4.field2807 = 5;
                     var4.field2808 = (var4.field2803 - field2560 << 8) / var5;
                     var4.field2809 = (var4.field2802 - field2560 << 8) / var5;
                     var4.field2804 = (var4.field2797 - field2572 << 8) / var5;
                     var4.field2811 = (var4.field2798 - field2572 << 8) / var5;
                     field2591[field2563++] = var4;
                  }
               }
            }
         }
      }

   }

   boolean method4444(int var1, int var2, int var3) {
      int var4 = this.field2556[var1][var2][var3];
      if (var4 == -field2547) {
         return false;
      } else if (var4 == field2547) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.method4494(var5 + 1, this.field2607[var1][var2][var3], var6 + 1) && this.method4494(var5 + 128 - 1, this.field2607[var1][var2 + 1][var3], var6 + 1) && this.method4494(var5 + 128 - 1, this.field2607[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method4494(var5 + 1, this.field2607[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field2556[var1][var2][var3] = field2547;
            return true;
         } else {
            this.field2556[var1][var2][var3] = -field2547;
            return false;
         }
      }
   }

   boolean method4450(int var1, int var2, int var3, int var4) {
      if (!this.method4444(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field2607[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > field2560) {
                  if (!this.method4494(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method4494(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method4494(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method4494(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method4494(var5, var9, var6)) {
                  return false;
               }

               if (!this.method4494(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < field2572) {
                  if (!this.method4494(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.method4494(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method4494(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.method4494(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method4494(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.method4494(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < field2560) {
                  if (!this.method4494(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.method4494(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method4494(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.method4494(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method4494(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.method4494(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > field2572) {
                  if (!this.method4494(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method4494(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method4494(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method4494(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.method4494(var5, var9, var6)) {
                  return false;
               }

               if (!this.method4494(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.method4494(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.method4494(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.method4494(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.method4494(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.method4494(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   boolean method4456(int var1, int var2, int var3, int var4) {
      if (!this.method4444(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method4494(var5 + 1, this.field2607[var1][var2][var3] - var4, var6 + 1) && this.method4494(var5 + 128 - 1, this.field2607[var1][var2 + 1][var3] - var4, var6 + 1) && this.method4494(var5 + 128 - 1, this.field2607[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method4494(var5 + 1, this.field2607[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   boolean method4557(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var2 == var3 && var4 == var5) {
         if (!this.method4444(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method4494(var7 + 1, this.field2607[var1][var2][var4] - var6, var8 + 1) && this.method4494(var7 + 128 - 1, this.field2607[var1][var2 + 1][var4] - var6, var8 + 1) && this.method4494(var7 + 128 - 1, this.field2607[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method4494(var7 + 1, this.field2607[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.field2556[var1][var7][var8] == -field2547) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field2607[var1][var2][var4] - var6;
         if (!this.method4494(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method4494(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.method4494(var7, var9, var11)) {
                  return false;
               } else if (!this.method4494(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   boolean method4494(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field2563; ++var4) {
         class250 var5 = field2591[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.field2807 == 1) {
            var6 = var5.field2803 - var1;
            if (var6 > 0) {
               var7 = var5.field2797 + (var5.field2804 * var6 >> 8);
               var8 = var5.field2798 + (var5.field2811 * var6 >> 8);
               var9 = var5.field2805 + (var5.field2796 * var6 >> 8);
               var10 = var5.field2806 + (var5.field2813 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2807 == 2) {
            var6 = var1 - var5.field2803;
            if (var6 > 0) {
               var7 = var5.field2797 + (var5.field2804 * var6 >> 8);
               var8 = var5.field2798 + (var5.field2811 * var6 >> 8);
               var9 = var5.field2805 + (var5.field2796 * var6 >> 8);
               var10 = var5.field2806 + (var5.field2813 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2807 == 3) {
            var6 = var5.field2797 - var3;
            if (var6 > 0) {
               var7 = var5.field2803 + (var5.field2808 * var6 >> 8);
               var8 = var5.field2802 + (var5.field2809 * var6 >> 8);
               var9 = var5.field2805 + (var5.field2796 * var6 >> 8);
               var10 = var5.field2806 + (var5.field2813 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2807 == 4) {
            var6 = var3 - var5.field2797;
            if (var6 > 0) {
               var7 = var5.field2803 + (var5.field2808 * var6 >> 8);
               var8 = var5.field2802 + (var5.field2809 * var6 >> 8);
               var9 = var5.field2805 + (var5.field2796 * var6 >> 8);
               var10 = var5.field2806 + (var5.field2813 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2807 == 5) {
            var6 = var2 - var5.field2805;
            if (var6 > 0) {
               var7 = var5.field2803 + (var5.field2808 * var6 >> 8);
               var8 = var5.field2802 + (var5.field2809 * var6 >> 8);
               var9 = var5.field2797 + (var5.field2804 * var6 >> 8);
               var10 = var5.field2798 + (var5.field2811 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }
}
