public class class346 {
   public static int[] field3848 = new int[99];
   public static final boolean[] field3846 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};

   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0 * Math.pow(2.0, (double)var2 / 7.0));
         var0 += var3;
         field3848[var1] = var0 / 4;
      }

   }

   class346() throws Throwable {
   }
}
