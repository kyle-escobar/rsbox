public class class512 {
   int[] field5098 = new int[8];
   short[] field5099 = new short[8];

   public class512(class191 var1) {
      int var2 = 0;
      if (var1.method3625()) {
         var2 = var1.method3630().length;
         System.arraycopy(var1.method3630(), 0, this.field5098, 0, var2);
         System.arraycopy(var1.method3660(), 0, this.field5099, 0, var2);
      }

      for(int var3 = var2; var3 < 8; ++var3) {
         this.field5098[var3] = -1;
         this.field5099[var3] = -1;
      }

   }

   public int[] method8647() {
      return this.field5098;
   }

   public short[] method8648() {
      return this.field5099;
   }

   public void method8649(int var1, int var2, short var3) {
      this.field5098[var1] = var2;
      this.field5099[var1] = var3;
   }

   public void method8657(int[] var1, short[] var2) {
      this.field5098 = var1;
      this.field5099 = var2;
   }
}
