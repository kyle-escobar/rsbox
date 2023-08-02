public class class280 extends class273 {
   int field3034;
   int field3035;
   int field3036;
   int field3037;

   class280() {
   }

   void method5363(class519 var1) {
      int var3 = var1.method8748();
      if (class281.field3039.field3040 != var3) {
         throw new IllegalStateException("");
      } else {
         super.field3006 = var1.method8748();
         super.field3001 = var1.method8748();
         super.field3000 = var1.method8750();
         super.field2997 = var1.method8750();
         this.field3034 = var1.method8748();
         this.field3036 = var1.method8748();
         super.field2998 = var1.method8750();
         super.field3003 = var1.method8750();
         this.field3037 = var1.method8748();
         this.field3035 = var1.method8748();
         super.field3002 = var1.method8814();
         super.field2999 = var1.method8814();
      }
   }

   void method5304(class519 var1) {
      super.field3001 = Math.min(super.field3001, 4);
      super.field3004 = new short[1][64][64];
      super.field3005 = new short[super.field3001][64][64];
      super.field2996 = new byte[super.field3001][64][64];
      super.field3007 = new byte[super.field3001][64][64];
      super.field3008 = new class271[super.field3001][64][64][];
      int var3 = var1.method8748();
      if (class284.field3054.field3055 != var3) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.method8748();
         int var5 = var1.method8748();
         int var6 = var1.method8748();
         int var7 = var1.method8748();
         if (var4 == super.field2998 && super.field3003 == var5 && var6 == this.field3037 && var7 == this.field3035) {
            for(int var8 = 0; var8 < 8; ++var8) {
               for(int var9 = 0; var9 < 8; ++var9) {
                  this.method5300(var8 + this.field3037 * 8, this.field3035 * 8 + var9, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class280)) {
         return false;
      } else {
         class280 var2 = (class280)var1;
         if (var2.field2998 == super.field2998 && var2.field3003 == super.field3003) {
            return var2.field3037 == this.field3037 && var2.field3035 == this.field3035;
         } else {
            return false;
         }
      }
   }

   public int hashCode() {
      return super.field2998 | super.field3003 << 8 | this.field3037 << 16 | this.field3035 << 24;
   }

   int method5364() {
      return this.field3034;
   }

   int method5365() {
      return this.field3036;
   }

   int method5366() {
      return this.field3037;
   }

   int method5371() {
      return this.field3035;
   }
}
