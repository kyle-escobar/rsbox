import java.util.ArrayList;
import java.util.Iterator;

public class class359 implements class383 {
   public static final class359 field3963 = new class359("runescape", "RuneScape", 0);
   public static final class359 field3964 = new class359("game3", "Game 3", 2);
   public static final class359 field3966 = new class359("game5", "Game 5", 4);
   public static final class359 field3967 = new class359("oldscape", "RuneScape 2007", 5);
   public static final class359 field3969 = new class359("game4", "Game 4", 3);
   public static final class359 field3970 = new class359("stellardawn", "Stellar Dawn", 1);
   final int field3965;
   public final String field3968;

   class359(String var1, String var2, int var3) {
      this.field3968 = var1;
      this.field3965 = var3;
   }

   static final void method6580(int var0) {
      var0 = Math.min(Math.max(var0, 0), 255);
      if (var0 != class141.field1307.method1626()) {
         label35: {
            if (class141.field1307.method1626() == 0) {
               boolean var2 = !class303.field3198.isEmpty();
               if (var2) {
                  class363 var3 = class24.field121;
                  if (!class303.field3198.isEmpty()) {
                     ArrayList var4 = new ArrayList();
                     Iterator var5 = class303.field3198.iterator();

                     while(var5.hasNext()) {
                        class322 var6 = (class322)var5.next();
                        var6.field3525 = false;
                        var6.field3530 = false;
                        var6.field3532 = false;
                        var6.field3531 = var3;
                        var6.field3527 = var0;
                        var6.field3528 = 0.0F;
                        var4.add(var6);
                     }

                     class303.method2298(var4, class303.field3192, class303.field3202, class303.field3203, class303.field3207, false);
                  }

                  Client.field1490 = false;
                  break label35;
               }
            }

            if (var0 == 0) {
               class303.method4211(0, 0);
               Client.field1490 = false;
            } else {
               class303.method375(var0);
            }
         }

         class141.field1307.method1676(var0);
      }

   }

   public int method6917() {
      return this.field3965;
   }
}
