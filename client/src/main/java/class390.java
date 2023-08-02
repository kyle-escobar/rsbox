import java.util.Iterator;

public class class390 implements Iterable {
   class476 field4444;
   public class476 field4445 = new class476();

   public class390() {
      this.field4445.field4849 = this.field4445;
      this.field4445.field4848 = this.field4445;
   }

   public static void method6972(class476 var0, class476 var1) {
      if (var0.field4848 != null) {
         var0.method8161();
      }

      var0.field4848 = var1;
      var0.field4849 = var1.field4849;
      var0.field4848.field4849 = var0;
      var0.field4849.field4848 = var0;
   }

   public void method6964() {
      while(this.field4445.field4849 != this.field4445) {
         this.field4445.field4849.method8161();
      }

   }

   public void method6965(class476 var1) {
      if (var1.field4848 != null) {
         var1.method8161();
      }

      var1.field4848 = this.field4445.field4848;
      var1.field4849 = this.field4445;
      var1.field4848.field4849 = var1;
      var1.field4849.field4848 = var1;
   }

   public class476 method6974() {
      class476 var1 = this.field4445.field4849;
      if (var1 == this.field4445) {
         return null;
      } else {
         var1.method8161();
         return var1;
      }
   }

   public class476 method6967() {
      return this.method6968((class476)null);
   }

   class476 method6968(class476 var1) {
      class476 var2;
      if (var1 == null) {
         var2 = this.field4445.field4849;
      } else {
         var2 = var1;
      }

      if (var2 == this.field4445) {
         this.field4444 = null;
         return null;
      } else {
         this.field4444 = var2.field4849;
         return var2;
      }
   }

   public class476 method6969() {
      class476 var1 = this.field4444;
      if (var1 == this.field4445) {
         this.field4444 = null;
         return null;
      } else {
         this.field4444 = var1.field4849;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class374(this);
   }
}
