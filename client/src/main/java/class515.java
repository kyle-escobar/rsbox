public class class515 extends class476 {
   public static class290 field5115 = new class290(64);
   static class342 field5118;
   int[][] field5117;
   Object[][] field5116;
   public int field5114 = -1;

   class515() {
   }

   void method8697(class519 var1) {
      while(true) {
         int var3 = var1.method8748();
         if (var3 == 0) {
            return;
         }

         this.method8699(var1, var3);
      }
   }

   public Object[] method8698(int var1) {
      return null == this.field5116 ? null : this.field5116[var1];
   }

   void method8699(class519 var1, int var2) {
      if (var2 == 3) {
         int var4 = var1.method8748();
         if (null == this.field5116) {
            this.field5116 = new Object[var4][];
            this.field5117 = new int[var4][];
         }

         for(int var5 = var1.method8748(); var5 != 255; var5 = var1.method8748()) {
            int var6 = var1.method8748();
            int[] var7 = new int[var6];

            for(int var8 = 0; var8 < var6; ++var8) {
               var7[var8] = var1.method8764();
            }

            this.field5116[var5] = class511.method302(var1, var7);
            this.field5117[var5] = var7;
         }
      } else if (var2 == 4) {
         this.field5114 = var1.method8993();
      }

   }

   void method8710() {
   }
}
