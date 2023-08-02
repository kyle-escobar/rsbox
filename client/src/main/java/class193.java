public class class193 extends class476 {
   public static class290 field2100 = new class290(64);
   public static class290 field2101 = new class290(64);
   public static class290 field2102 = new class290(20);
   public static class342 field2099;
   public static class342 field2105;
   int field2103 = -1;
   int field2106 = -1;
   int field2109 = -1;
   int field2110 = -1;
   int field2111 = -1;
   int field2113 = -1;
   int field2121 = -1;
   String field2116 = "";
   public int field2098 = 0;
   public int field2107 = 16777215;
   public int field2112 = 70;
   public int field2114 = 0;
   public int field2115 = -1;
   public int field2118 = 0;
   public int field2120 = -1;
   public int[] field2119;

   class193() {
   }

   public static class193 method3287(int var0) {
      class193 var2 = (class193)field2100.method5643((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = field2105.method6381(32, var0);
         var2 = new class193();
         if (var3 != null) {
            var2.method3698(new class519(var3));
         }

         field2100.method5640(var2, (long)var0);
         return var2;
      }
   }

   void method3698(class519 var1) {
      while(true) {
         int var3 = var1.method8748();
         if (var3 == 0) {
            return;
         }

         this.method3697(var1, var3);
      }
   }

   void method3697(class519 var1, int var2) {
      if (var2 == 1) {
         this.field2106 = var1.method8814();
      } else if (var2 == 2) {
         this.field2107 = var1.method8752();
      } else if (var2 == 3) {
         this.field2103 = var1.method8814();
      } else if (var2 == 4) {
         this.field2111 = var1.method8814();
      } else if (var2 == 5) {
         this.field2113 = var1.method8814();
      } else if (var2 == 6) {
         this.field2110 = var1.method8814();
      } else if (var2 == 7) {
         this.field2118 = var1.method9001();
      } else if (var2 == 8) {
         this.field2116 = var1.method8760();
      } else if (var2 == 9) {
         this.field2112 = var1.method8750();
      } else if (var2 == 10) {
         this.field2114 = var1.method9001();
      } else if (var2 == 11) {
         this.field2115 = 0;
      } else if (var2 == 12) {
         this.field2120 = var1.method8748();
      } else if (var2 == 13) {
         this.field2098 = var1.method9001();
      } else if (var2 == 14) {
         this.field2115 = var1.method8750();
      } else if (var2 == 17 || var2 == 18) {
         this.field2109 = var1.method8750();
         if (this.field2109 == 65535) {
            this.field2109 = -1;
         }

         this.field2121 = var1.method8750();
         if (65535 == this.field2121) {
            this.field2121 = -1;
         }

         int var4 = -1;
         if (var2 == 18) {
            var4 = var1.method8750();
            if (var4 == 65535) {
               var4 = -1;
            }
         }

         int var5 = var1.method8748();
         this.field2119 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field2119[var6] = var1.method8750();
            if (this.field2119[var6] == 65535) {
               this.field2119[var6] = -1;
            }
         }

         this.field2119[var5 + 1] = var4;
      }

   }

   public final class193 method3718() {
      int var2 = -1;
      if (-1 != this.field2109) {
         var2 = class254.method5005(this.field2109);
      } else if (this.field2121 != -1) {
         var2 = class329.field3577[this.field2121];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field2119.length - 1) {
         var3 = this.field2119[var2];
      } else {
         var3 = this.field2119[this.field2119.length - 1];
      }

      return var3 != -1 ? method3287(var3) : null;
   }

   public String method3699(int var1) {
      String var3 = this.field2116;

      while(true) {
         int var4 = var3.indexOf("%1");
         if (var4 < 0) {
            return var3;
         }

         var3 = var3.substring(0, var4) + class380.method8645(var1, false) + var3.substring(var4 + 2);
      }
   }

   public class523 method3696() {
      if (this.field2103 < 0) {
         return null;
      } else {
         class523 var2 = (class523)field2101.method5643((long)this.field2103);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class485.method8408(class380.field4384, this.field2103, 0);
            if (null != var2) {
               field2101.method5640(var2, (long)this.field2103);
            }

            return var2;
         }
      }
   }

   public class523 method3700() {
      if (this.field2113 < 0) {
         return null;
      } else {
         class523 var2 = (class523)field2101.method5643((long)this.field2113);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class485.method8408(class380.field4384, this.field2113, 0);
            if (var2 != null) {
               field2101.method5640(var2, (long)this.field2113);
            }

            return var2;
         }
      }
   }

   public class523 method3701() {
      if (this.field2111 < 0) {
         return null;
      } else {
         class523 var2 = (class523)field2101.method5643((long)this.field2111);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class485.method8408(class380.field4384, this.field2111, 0);
            if (var2 != null) {
               field2101.method5640(var2, (long)this.field2111);
            }

            return var2;
         }
      }
   }

   public class523 method3702() {
      if (this.field2110 < 0) {
         return null;
      } else {
         class523 var2 = (class523)field2101.method5643((long)this.field2110);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class485.method8408(class380.field4384, this.field2110, 0);
            if (null != var2) {
               field2101.method5640(var2, (long)this.field2110);
            }

            return var2;
         }
      }
   }

   public class393 method3729() {
      if (this.field2106 == -1) {
         return null;
      } else {
         class393 var2 = (class393)field2102.method5643((long)this.field2106);
         if (null != var2) {
            return var2;
         } else {
            var2 = class538.method7037(class380.field4384, field2099, this.field2106, 0);
            if (var2 != null) {
               field2102.method5640(var2, (long)this.field2106);
            }

            return var2;
         }
      }
   }
}
