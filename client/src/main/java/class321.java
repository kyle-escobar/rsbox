public class class321 extends class476 {
   public final int field3517;
   public final int field3518;
   public final int[] field3519;
   public final int[] field3520;

   class321(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.field3517 = var1;
      this.field3518 = var2;
      this.field3519 = var3;
      this.field3520 = var4;
   }

   public static synchronized byte[] method5869(int var0) {
      return class401.method7062(var0, false);
   }

   public boolean method5865(int var1, int var2) {
      if (var2 >= 0 && var2 < this.field3520.length) {
         int var4 = this.field3520[var2];
         if (var1 >= var4 && var1 <= this.field3519[var2] + var4) {
            return true;
         }
      }

      return false;
   }
}
