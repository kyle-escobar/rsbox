import java.util.Iterator;

public class class395 extends class406 {
   public class395(class406 var1) {
      super(var1);
      super.field4513 = "AddRequestTask";
   }

   public boolean method7131(int var1) {
      while(!class303.field3196.isEmpty()) {
         class322 var3 = (class322)class303.field3196.peek();
         if (var3 == null) {
            class303.field3196.pop();
         } else {
            var3.field3533 = this.method7029();
            class303.field3194.add(var3);
            class303.field3196.pop();
         }
      }

      return true;
   }

   class289 method7029() {
      class289 var2 = null;
      Iterator var3 = class303.field3195.iterator();

      while(true) {
         class289 var4;
         do {
            do {
               if (!var3.hasNext()) {
                  if (null != var2) {
                     ++var2.field3113;
                     if (var2.method5526() == 0 && var2.method5533()) {
                        var2.method5532();
                        var2.method5530();
                        var2.method5525(0);
                     }
                  }

                  return var2;
               }

               var4 = (class289)var3.next();
            } while(var4 == null);
         } while(null != var2 && var2.field3113 <= var4.field3113 && (var4.field3113 != var2.field3113 || var4.method5526() != 0 || !var4.method5533()));

         var2 = var4;
      }
   }
}
