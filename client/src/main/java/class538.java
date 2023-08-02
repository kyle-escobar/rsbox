public class class538 {
   public static int field5222;
   public static int field5224;
   public static int field5226;
   public static int[] field5223;
   public static int[] field5225;

   class538() throws Throwable {
   }

   static class537 method1776(class342 var0, int var1, int var2) {
      byte[] var5 = var0.method6381(var1, var2);
      boolean var4;
      if (var5 == null) {
         var4 = false;
      } else {
         method3764(var5);
         var4 = true;
      }

      return !var4 ? null : method1757();
   }

   public static class523[] method8028(class342 var0, int var1, int var2) {
      byte[] var5 = var0.method6381(var1, var2);
      boolean var4;
      if (var5 == null) {
         var4 = false;
      } else {
         method3764(var5);
         var4 = true;
      }

      if (!var4) {
         return null;
      } else {
         class523[] var6 = new class523[field5226];

         for(int var7 = 0; var7 < field5226; ++var7) {
            class523 var8 = var6[var7] = new class523();
            var8.field5144 = field5222;
            var8.field5142 = field5224;
            var8.field5145 = class482.field4876[var7];
            var8.field5146 = class155.field1421[var7];
            var8.field5148 = class168.field1802[var7];
            var8.field5153 = field5225[var7];
            int var9 = var8.field5148 * var8.field5153;
            byte[] var10 = class352.field3889[var7];
            var8.field5147 = new int[var9];

            for(int var11 = 0; var11 < var9; ++var11) {
               var8.field5147[var11] = field5223[var10[var11] & 255];
            }
         }

         method8588();
         return var6;
      }
   }

   public static class393 method7037(class342 var0, class342 var1, int var2, int var3) {
      byte[] var6 = var0.method6381(var2, var3);
      boolean var5;
      if (null == var6) {
         var5 = false;
      } else {
         method3764(var6);
         var5 = true;
      }

      if (!var5) {
         return null;
      } else {
         byte[] var7 = var1.method6381(var2, var3);
         class393 var9;
         if (null == var7) {
            var9 = null;
         } else {
            class393 var8 = new class393(var7, class482.field4876, class155.field1421, class168.field1802, field5225, field5223, class352.field3889);
            method8588();
            var9 = var8;
         }

         return var9;
      }
   }

   public static class537[] method8431(class342 var0, String var1, String var2) {
      if (!var0.method6401(var1, var2)) {
         return null;
      } else {
         int var4 = var0.method6395(var1);
         int var5 = var0.method6400(var4, var2);
         byte[] var8 = var0.method6381(var4, var5);
         boolean var7;
         if (var8 == null) {
            var7 = false;
         } else {
            method3764(var8);
            var7 = true;
         }

         class537[] var6;
         if (!var7) {
            var6 = null;
         } else {
            class537[] var9 = new class537[field5226];

            for(int var10 = 0; var10 < field5226; ++var10) {
               class537 var11 = var9[var10] = new class537();
               var11.field5221 = field5222;
               var11.field5218 = field5224;
               var11.field5217 = class482.field4876[var10];
               var11.field5219 = class155.field1421[var10];
               var11.field5216 = class168.field1802[var10];
               var11.field5214 = field5225[var10];
               var11.field5215 = field5223;
               var11.field5220 = class352.field3889[var10];
            }

            method8588();
            var6 = var9;
         }

         return var6;
      }
   }

   public static class537 method8011(class342 var0, String var1, String var2) {
      if (!var0.method6401(var1, var2)) {
         return null;
      } else {
         int var4 = var0.method6395(var1);
         int var5 = var0.method6400(var4, var2);
         return method1776(var0, var4, var5);
      }
   }

   public static class537 method8472(class342 var0, int var1) {
      byte[] var4 = var0.method6388(var1);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         method3764(var4);
         var3 = true;
      }

      return !var3 ? null : method1757();
   }

   static class537 method1757() {
      class537 var1 = new class537();
      var1.field5221 = field5222;
      var1.field5218 = field5224;
      var1.field5217 = class482.field4876[0];
      var1.field5219 = class155.field1421[0];
      var1.field5216 = class168.field1802[0];
      var1.field5214 = field5225[0];
      var1.field5215 = field5223;
      var1.field5220 = class352.field3889[0];
      method8588();
      return var1;
   }

   static class523 method3296() {
      class523 var1 = new class523();
      var1.field5144 = field5222;
      var1.field5142 = field5224;
      var1.field5145 = class482.field4876[0];
      var1.field5146 = class155.field1421[0];
      var1.field5148 = class168.field1802[0];
      var1.field5153 = field5225[0];
      int var2 = var1.field5153 * var1.field5148;
      byte[] var3 = class352.field3889[0];
      var1.field5147 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var1.field5147[var4] = field5223[var3[var4] & 255];
      }

      method8588();
      return var1;
   }

   public static void method3764(byte[] var0) {
      class519 var2 = new class519(var0);
      var2.field5129 = var0.length - 2;
      field5226 = var2.method8750();
      class482.field4876 = new int[field5226];
      class155.field1421 = new int[field5226];
      class168.field1802 = new int[field5226];
      field5225 = new int[field5226];
      class352.field3889 = new byte[field5226][];
      var2.field5129 = var0.length - 7 - field5226 * 8;
      field5222 = var2.method8750();
      field5224 = var2.method8750();
      int var3 = (var2.method8748() & 255) + 1;

      int var4;
      for(var4 = 0; var4 < field5226; ++var4) {
         class482.field4876[var4] = var2.method8750();
      }

      for(var4 = 0; var4 < field5226; ++var4) {
         class155.field1421[var4] = var2.method8750();
      }

      for(var4 = 0; var4 < field5226; ++var4) {
         class168.field1802[var4] = var2.method8750();
      }

      for(var4 = 0; var4 < field5226; ++var4) {
         field5225[var4] = var2.method8750();
      }

      var2.field5129 = var0.length - 7 - field5226 * 8 - (var3 - 1) * 3;
      field5223 = new int[var3];

      for(var4 = 1; var4 < var3; ++var4) {
         field5223[var4] = var2.method8752();
         if (field5223[var4] == 0) {
            field5223[var4] = 1;
         }
      }

      var2.field5129 = 0;

      for(var4 = 0; var4 < field5226; ++var4) {
         int var5 = class168.field1802[var4];
         int var6 = field5225[var4];
         int var7 = var6 * var5;
         byte[] var8 = new byte[var7];
         class352.field3889[var4] = var8;
         int var9 = var2.method8748();
         int var10;
         if (var9 == 0) {
            for(var10 = 0; var10 < var7; ++var10) {
               var8[var10] = var2.method8768();
            }
         } else if (var9 == 1) {
            for(var10 = 0; var10 < var5; ++var10) {
               for(int var11 = 0; var11 < var6; ++var11) {
                  var8[var11 * var5 + var10] = var2.method8768();
               }
            }
         }
      }

   }

   public static void method8588() {
      class482.field4876 = null;
      class155.field1421 = null;
      class168.field1802 = null;
      field5225 = null;
      field5223 = null;
      class352.field3889 = (byte[][])null;
   }
}
