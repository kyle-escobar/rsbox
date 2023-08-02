import java.util.HashMap;

public class class494 {
   class342 field4994;
   class342 field4995;
   HashMap field4996;

   public class494(class342 var1, class342 var2) {
      this.field4995 = var1;
      this.field4994 = var2;
      this.field4996 = new HashMap();
   }

   public HashMap method8461(class475[] var1) {
      HashMap var3 = new HashMap();

      for(int var5 = 0; var5 < var1.length; ++var5) {
         class475 var6 = var1[var5];
         if (this.field4996.containsKey(var6)) {
            var3.put(var6, this.field4996.get(var6));
         } else {
            class342 var8 = this.field4995;
            class342 var9 = this.field4994;
            String var10 = var6.field4840;
            class393 var7;
            if (!var8.method6401(var10, "")) {
               var7 = null;
            } else {
               int var11 = var8.method6395(var10);
               int var12 = var8.method6400(var11, "");
               var7 = class538.method7037(var8, var9, var11, var12);
            }

            if (null != var7) {
               this.field4996.put(var6, var7);
               var3.put(var6, var7);
            }
         }
      }

      return var3;
   }
}
