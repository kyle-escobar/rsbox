public class class195 extends class476 {
   public static class342 field2136;
   static class290 field2131 = new class290(64);
   public char field2133;
   public char field2134;
   public int field2130;
   public int field2139;
   public int[] field2137;
   public int[] field2138;
   public String field2135;
   public String[] field2132;

   class195() {
      this.field2135 = class364.field4028;
      this.field2139 = 0;
   }

   public static class195 method6711(int var0) {
      class195 var2 = (class195)field2131.method5643((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = field2136.method6381(8, var0);
         var2 = new class195();
         if (null != var3) {
            var2.method3744(new class519(var3));
         }

         field2131.method5640(var2, (long)var0);
         return var2;
      }
   }

   void method3744(class519 var1) {
      while(true) {
         int var3 = var1.method8748();
         if (var3 == 0) {
            return;
         }

         this.method3743(var1, var3);
      }
   }

   void method3743(class519 var1, int var2) {
      if (var2 == 1) {
         this.field2134 = (char)var1.method8748();
      } else if (var2 == 2) {
         this.field2133 = (char)var1.method8748();
      } else if (var2 == 3) {
         this.field2135 = var1.method8873();
      } else if (var2 == 4) {
         this.field2130 = var1.method9000();
      } else {
         int var4;
         if (var2 == 5) {
            this.field2139 = var1.method8750();
            this.field2137 = new int[this.field2139];
            this.field2132 = new String[this.field2139];

            for(var4 = 0; var4 < this.field2139; ++var4) {
               this.field2137[var4] = var1.method9000();
               this.field2132[var4] = var1.method8873();
            }
         } else if (var2 == 6) {
            this.field2139 = var1.method8750();
            this.field2137 = new int[this.field2139];
            this.field2138 = new int[this.field2139];

            for(var4 = 0; var4 < this.field2139; ++var4) {
               this.field2137[var4] = var1.method9000();
               this.field2138[var4] = var1.method9000();
            }
         }
      }

   }

   public int method3746() {
      return this.field2139;
   }
}
