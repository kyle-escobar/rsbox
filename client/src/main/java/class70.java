import java.net.URL;

public class class70 {
   static class113 field563;
   static class342 field577;
   static class363 field570;
   static int field567 = 0;
   static int field569 = 0;
   static int field576;
   static int[] field566 = new int[]{0, 1, 2, 3};
   static int[] field578 = new int[]{1, 1, 1, 1};
   int field562;
   int field565;
   int field568;
   int field573;
   int field574;
   String field564;
   String field571;
   String field572;

   class70() {
   }

   static boolean method1994() {
      try {
         if (field563 == null) {
            field563 = class261.field2935.method2221(new URL(class307.field3346));
         } else if (field563.method2200()) {
            byte[] var1 = field563.method2199();
            Buffer var2 = new Buffer(var1);
            var2.readInt();
            field569 = var2.readUnsignedShort();
            class380.field4385 = new class70[field569];

            class70 var4;
            for(int var3 = 0; var3 < field569; var4.field574 = var3++) {
               var4 = class380.field4385[var3] = new class70();
               var4.field565 = var2.readUnsignedShort();
               var4.field568 = var2.readInt();
               var4.field571 = var2.readString();
               var4.field572 = var2.readString();
               var4.field573 = var2.readUnsignedByte();
               var4.field562 = var2.readShort();
            }

            method3767(class380.field4385, 0, class380.field4385.length - 1, field566, field578);
            field563 = null;
            return true;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         field563 = null;
      }

      return false;
   }

   static void method5695(int var0, int var1) {
      int[] var3 = new int[4];
      int[] var4 = new int[4];
      var3[0] = var0;
      var4[0] = var1;
      int var5 = 1;

      for(int var6 = 0; var6 < 4; ++var6) {
         if (var0 != field566[var6]) {
            var3[var5] = field566[var6];
            var4[var5] = field578[var6];
            ++var5;
         }
      }

      field566 = var3;
      field578 = var4;
      method3767(class380.field4385, 0, class380.field4385.length - 1, field566, field578);
   }

   static void method3767(class70[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var6 = var1 - 1;
         int var7 = var2 + 1;
         int var8 = (var1 + var2) / 2;
         class70 var9 = var0[var8];
         var0[var8] = var0[var1];
         var0[var1] = var9;

         while(var6 < var7) {
            boolean var10 = true;

            int var11;
            int var12;
            int var13;
            do {
               --var7;

               for(var11 = 0; var11 < 4; ++var11) {
                  if (var3[var11] == 2) {
                     var12 = var0[var7].field574;
                     var13 = var9.field574;
                  } else if (1 == var3[var11]) {
                     var12 = var0[var7].field562;
                     var13 = var9.field562;
                     if (var12 == -1 && 1 == var4[var11]) {
                        var12 = 2001;
                     }

                     if (var13 == -1 && var4[var11] == 1) {
                        var13 = 2001;
                     }
                  } else if (3 == var3[var11]) {
                     var12 = var0[var7].method1474() ? 1 : 0;
                     var13 = var9.method1474() ? 1 : 0;
                  } else {
                     var12 = var0[var7].field565;
                     var13 = var9.field565;
                  }

                  if (var13 != var12) {
                     if ((var4[var11] != 1 || var12 <= var13) && (0 != var4[var11] || var12 >= var13)) {
                        var10 = false;
                     }
                     break;
                  }

                  if (var11 == 3) {
                     var10 = false;
                  }
               }
            } while(var10);

            var10 = true;

            do {
               ++var6;

               for(var11 = 0; var11 < 4; ++var11) {
                  if (var3[var11] == 2) {
                     var12 = var0[var6].field574;
                     var13 = var9.field574;
                  } else if (var3[var11] == 1) {
                     var12 = var0[var6].field562;
                     var13 = var9.field562;
                     if (var12 == -1 && 1 == var4[var11]) {
                        var12 = 2001;
                     }

                     if (var13 == -1 && var4[var11] == 1) {
                        var13 = 2001;
                     }
                  } else if (var3[var11] == 3) {
                     var12 = var0[var6].method1474() ? 1 : 0;
                     var13 = var9.method1474() ? 1 : 0;
                  } else {
                     var12 = var0[var6].field565;
                     var13 = var9.field565;
                  }

                  if (var12 != var13) {
                     if ((var4[var11] != 1 || var12 >= var13) && (var4[var11] != 0 || var12 <= var13)) {
                        var10 = false;
                     }
                     break;
                  }

                  if (var11 == 3) {
                     var10 = false;
                  }
               }
            } while(var10);

            if (var6 < var7) {
               class70 var14 = var0[var6];
               var0[var6] = var0[var7];
               var0[var7] = var14;
            }
         }

         method3767(var0, var1, var7, var3, var4);
         method3767(var0, var7 + 1, var2, var3, var4);
      }

   }

   static void method5288(int var0, boolean var1, int var2, boolean var3) {
      if (null != class380.field4385) {
         method2518(0, class380.field4385.length - 1, var0, var1, var2, var3);
      }

   }

   static void method2518(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var7 = (var0 + var1) / 2;
         int var8 = var0;
         class70 var9 = class380.field4385[var7];
         class380.field4385[var7] = class380.field4385[var1];
         class380.field4385[var1] = var9;

         for(int var10 = var0; var10 < var1; ++var10) {
            class70 var12 = class380.field4385[var10];
            int var13 = method2650(var12, var9, var2, var3);
            int var11;
            if (var13 != 0) {
               if (var3) {
                  var11 = -var13;
               } else {
                  var11 = var13;
               }
            } else if (var4 == -1) {
               var11 = 0;
            } else {
               int var14 = method2650(var12, var9, var4, var5);
               if (var5) {
                  var11 = -var14;
               } else {
                  var11 = var14;
               }
            }

            if (var11 <= 0) {
               class70 var15 = class380.field4385[var10];
               class380.field4385[var10] = class380.field4385[var8];
               class380.field4385[var8++] = var15;
            }
         }

         class380.field4385[var1] = class380.field4385[var8];
         class380.field4385[var8] = var9;
         method2518(var0, var8 - 1, var2, var3, var4, var5);
         method2518(var8 + 1, var1, var2, var3, var4, var5);
      }

   }

   static int method2650(class70 var0, class70 var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var5 = var0.field562;
         int var6 = var1.field562;
         if (!var3) {
            if (var5 == -1) {
               var5 = 2001;
            }

            if (var6 == -1) {
               var6 = 2001;
            }
         }

         return var5 - var6;
      } else if (var2 == 2) {
         return var0.field573 - var1.field573;
      } else if (var2 == 3) {
         if (var0.field572.equals("-")) {
            if (var1.field572.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.field572.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.field572.compareTo(var1.field572);
         }
      } else if (var2 == 4) {
         return var0.method1435() ? (var1.method1435() ? 0 : 1) : (var1.method1435() ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method1433() ? (var1.method1433() ? 0 : 1) : (var1.method1433() ? -1 : 0);
      } else if (var2 == 6) {
         return var0.method1459() ? (var1.method1459() ? 0 : 1) : (var1.method1459() ? -1 : 0);
      } else if (var2 == 7) {
         return var0.method1474() ? (var1.method1474() ? 0 : 1) : (var1.method1474() ? -1 : 0);
      } else {
         return var0.field565 - var1.field565;
      }
   }

   static class70 method533() {
      field567 = 0;
      return class419.method7529();
   }

   boolean method1474() {
      return (1 & this.field568) != 0;
   }

   boolean method1432() {
      return (65536 & this.field568) != 0;
   }

   boolean method1433() {
      return (2 & this.field568) != 0;
   }

   boolean method1459() {
      return (4 & this.field568) != 0;
   }

   boolean method1435() {
      return (8 & this.field568) != 0;
   }

   boolean method1469() {
      return 0 != (536870912 & this.field568);
   }

   boolean method1437() {
      return 0 != (33554432 & this.field568);
   }

   boolean method1438() {
      return (1073741824 & this.field568) != 0;
   }

   boolean method1439() {
      return 0 != (256 & this.field568);
   }

   boolean method1440() {
      return (134217728 & this.field568) != 0;
   }
}
