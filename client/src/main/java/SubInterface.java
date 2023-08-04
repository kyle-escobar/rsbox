import java.util.ArrayList;

public class SubInterface extends class470 {
   boolean field852 = false;
   int id;
   int type;

   SubInterface() {
   }

   public static boolean method1973(int var0) {
      boolean var2 = false;
      boolean var3 = false;
      if (!class303.field3199.isEmpty()) {
         class406 var4 = (class406)class303.field3199.get(0);
         if (var4 == null) {
            class303.field3199.remove(0);
         } else if (var4.method7131(var0)) {
            if (var4.method7150()) {
               System.out.println("Error in midimanager.service: " + var4.method7133());
               var2 = true;
            } else {
               if (var4.method7134() != null) {
                  class303.field3199.add(1, var4.method7134());
               }

               var3 = var4.method7132();
            }

            class303.field3199.remove(0);
         } else {
            var3 = var4.method7132();
         }
      }

      if (var2) {
         class303.field3199.clear();
         ArrayList var5 = class303.method3308();
         class303.field3199.add(new class411((class406)null, var5));
      }

      return var3;
   }
}
