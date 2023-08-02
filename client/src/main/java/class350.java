public class class350 implements Runnable {
   static boolean field3871 = false;
   static class368 field3869 = new class368();
   static int field3870 = 0;
   static Object field3872 = new Object();
   static Thread field3878;
   static final class368 field3868 = new class368();

   class350() {
   }

   static void method2547(int var0, class449 var1, class363 var2) {
      class352 var4 = new class352();
      var4.field3890 = 1;
      var4.field4816 = (long)var0;
      var4.field3886 = var1;
      var4.field3887 = var2;
      synchronized(field3868) {
         field3868.method6680(var4);
      }

      method5742();
   }

   public static void method7876() {
      while(true) {
         class352 var1;
         synchronized(field3868) {
            var1 = (class352)field3869.method6683();
         }

         if (null == var1) {
            return;
         }

         var1.field3887.method6602(var1.field3886, (int)var1.field4816, var1.field3885, false);
      }
   }

   static void method5742() {
      synchronized(field3872) {
         if (field3870 == 0) {
            field3878 = new Thread(new class350());
            field3878.setDaemon(true);
            field3878.start();
            field3878.setPriority(5);
         }

         field3870 = 600;
         field3871 = false;
      }
   }

   public static void method6519() {
      synchronized(field3872) {
         if (0 != field3870) {
            field3870 = 1;
            field3871 = true;

            try {
               field3872.wait();
            } catch (InterruptedException var4) {
            }
         }

      }
   }

   public void run() {
      try {
         while(true) {
            class352 var1;
            synchronized(field3868) {
               var1 = (class352)field3868.method6706();
            }

            if (null != var1) {
               if (var1.field3890 == 0) {
                  var1.field3886.method7868((int)var1.field4816, var1.field3885, var1.field3885.length);
                  synchronized(field3868) {
                     var1.method8116();
                  }
               } else if (1 == var1.field3890) {
                  var1.field3885 = var1.field3886.method7860((int)var1.field4816);
                  synchronized(field3868) {
                     field3869.method6680(var1);
                  }
               }

               synchronized(field3872) {
                  if ((field3871 || field3870 <= 1) && field3868.method6689()) {
                     field3870 = 0;
                     field3872.notifyAll();
                     return;
                  }

                  field3870 = 600;
               }
            } else {
               class292.method354(100L);
               synchronized(field3872) {
                  if ((field3871 || field3870 <= 1) && field3868.method6689()) {
                     field3870 = 0;
                     field3872.notifyAll();
                     return;
                  }

                  --field3870;
               }
            }
         }
      } catch (Exception var13) {
         class524.method5856((String)null, var13);
      }
   }
}
