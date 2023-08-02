import java.util.ArrayList;
import java.util.HashMap;

public class class401 {
   public static int[] field4486;
   public static ArrayList field4487 = new ArrayList();
   static byte[][] field4480 = new byte[100][];
   static byte[][] field4481 = new byte[50][];
   static byte[][] field4482 = new byte[1000][];
   static byte[][] field4483 = new byte[250][];
   static int field4473 = 0;
   static int field4474 = 100;
   static int field4475 = 0;
   static int field4476 = 0;
   static int field4477 = 0;
   static int field4478 = 1000;
   static int field4479 = 250;
   static int field4485 = 50;
   static String[] field4471;

   static {
      field4487.clear();
      field4487.add(100);
      field4487.add(5000);
      field4487.add(10000);
      field4487.add(30000);
      new HashMap();
   }

   class401() throws Throwable {
   }

   public static synchronized byte[] method7062(int var0, boolean var1) {
      byte[] var5;
      if ((var0 == 100 || var0 < 100 && var1) && field4473 > 0) {
         var5 = field4482[--field4473];
         field4482[field4473] = null;
         return var5;
      } else if ((var0 == 5000 || var0 < 5000 && var1) && field4475 > 0) {
         var5 = field4483[--field4475];
         field4483[field4475] = null;
         return var5;
      } else if ((var0 == 10000 || var0 < 10000 && var1) && field4476 > 0) {
         var5 = field4480[--field4476];
         field4480[field4476] = null;
         return var5;
      } else if ((var0 == 30000 || var0 < 30000 && var1) && field4477 > 0) {
         var5 = field4481[--field4477];
         field4481[field4477] = null;
         return var5;
      } else {
         int var3;
         if (null != class135.field1253) {
            for(var3 = 0; var3 < field4486.length; ++var3) {
               if ((var0 == field4486[var3] || var0 < field4486[var3] && var1) && class126.field1201[var3] > 0) {
                  byte[] var4 = class135.field1253[var3][--class126.field1201[var3]];
                  class135.field1253[var3][class126.field1201[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && null != field4486) {
            for(var3 = 0; var3 < field4486.length; ++var3) {
               if (var0 <= field4486[var3] && class126.field1201[var3] < class135.field1253[var3].length) {
                  return new byte[field4486[var3]];
               }
            }
         }

         return new byte[var0];
      }
   }

   public static synchronized void method6948(byte[] var0) {
      if (100 == var0.length && field4473 < field4478) {
         field4482[++field4473 - 1] = var0;
      } else if (5000 == var0.length && field4475 < field4479) {
         field4483[++field4475 - 1] = var0;
      } else if (var0.length == 10000 && field4476 < field4474) {
         field4480[++field4476 - 1] = var0;
      } else if (var0.length == 30000 && field4477 < field4485) {
         field4481[++field4477 - 1] = var0;
      } else {
         if (class135.field1253 != null) {
            for(int var2 = 0; var2 < field4486.length; ++var2) {
               if (field4486[var2] == var0.length && class126.field1201[var2] < class135.field1253[var2].length) {
                  class135.field1253[var2][class126.field1201[var2]++] = var0;
                  return;
               }
            }
         }

      }
   }
}
