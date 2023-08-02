public class class467 {
   static class537 field4793;
   static final int[] field4795 = new int[16384];
   static final int[] field4797 = new int[16384];

   static {
      double var0 = 3.834951969714103E-4;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field4795[var2] = (int)(16384.0 * Math.sin(var0 * (double)var2));
         field4797[var2] = (int)(16384.0 * Math.cos(var0 * (double)var2));
      }

   }

   class467() throws Throwable {
   }

   public static int method6949(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133) & 16383;
   }

   public static int method7613(int var0) {
      return field4795[var0 & 16383];
   }
}
