public class class414 extends class406 {
   class322 field4570 = null;
   int field4571 = 0;

   public class414(class406 var1, int var2, boolean var3, int var4) {
      super(var1);
      super.field4513 = "FadeOutTask";
      if (var2 >= 0) {
         if (var3 && var2 < class303.field3196.size()) {
            this.field4570 = (class322)class303.field3196.get(var2);
         } else if (!var3 && var2 < class303.field3194.size()) {
            this.field4570 = (class322)class303.field3194.get(var2);
         }

         this.field4571 = var4;
      }
   }

   public boolean method7131(int var1) {
      if (this.field4570 != null && null != this.field4570.field3533) {
         this.field4570.field3532 = true;

         try {
            if (this.field4570.field3528 > 0.0F && this.field4570.field3533.method5533()) {
               float var3 = this.field4571 == 0 ? (float)this.field4571 : (float)this.field4570.field3527 / (float)this.field4571;
               class322 var10000 = this.field4570;
               var10000.field3528 -= 0.0F == var3 ? (float)this.field4570.field3527 : var3;
               if (this.field4570.field3528 < 0.0F) {
                  this.field4570.field3528 = 0.0F;
               }

               this.field4570.field3533.method5525((int)this.field4570.field3528);
               return false;
            }
         } catch (Exception var4) {
            this.method7135(var4.getMessage());
            return true;
         }

         this.field4570.field3532 = false;
         return true;
      } else {
         return true;
      }
   }
}
