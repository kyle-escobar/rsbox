public class class392 extends class406 {
   static int field4450;
   class322 field4452 = null;
   int field4451 = 0;

   public class392(class406 var1, int var2, boolean var3, int var4) {
      super(var1);
      super.field4513 = "FadeInTask";
      if (var2 >= 0) {
         if (var3 && var2 < class303.field3196.size()) {
            this.field4452 = (class322)class303.field3196.get(var2);
         } else if (!var3 && var2 < class303.field3194.size()) {
            this.field4452 = (class322)class303.field3194.get(var2);
         }

         this.field4451 = var4;
      }
   }

   public boolean method7131(int var1) {
      if (this.field4452 != null && this.field4452.field3533 != null) {
         this.field4452.field3532 = true;

         try {
            if (this.field4452.field3528 < (float)this.field4452.field3527 && this.field4452.field3533.method5533()) {
               float var3 = 0 == this.field4451 ? (float)this.field4451 : (float)this.field4452.field3527 / (float)this.field4451;
               class322 var10000 = this.field4452;
               var10000.field3528 += var3 == 0.0F ? (float)this.field4452.field3527 : var3;
               if (this.field4452.field3528 > (float)this.field4452.field3527) {
                  this.field4452.field3528 = (float)this.field4452.field3527;
               }

               this.field4452.field3533.method5525((int)this.field4452.field3528);
               return false;
            }
         } catch (Exception var4) {
            this.method7135(var4.getMessage());
            return true;
         }

         this.field4452.field3532 = false;
         return true;
      } else {
         return true;
      }
   }
}
