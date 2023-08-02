public final class class290 {
   class390 field3120 = new class390();
   class469 field3116;
   class476 field3119 = new class476();
   int field3117;
   int field3118;

   public class290(int var1) {
      this.field3117 = var1;
      this.field3118 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
      }

      this.field3116 = new class469(var2);
   }

   public class476 method5643(long var1) {
      class476 var3 = (class476)this.field3116.method8096(var1);
      if (var3 != null) {
         this.field3120.method6965(var3);
      }

      return var3;
   }

   public void method5639(long var1) {
      class476 var3 = (class476)this.field3116.method8096(var1);
      if (var3 != null) {
         var3.method8116();
         var3.method8161();
         ++this.field3118;
      }

   }

   public void method5640(class476 var1, long var2) {
      if (this.field3118 == 0) {
         class476 var4 = this.field3120.method6974();
         var4.method8116();
         var4.method8161();
         if (var4 == this.field3119) {
            var4 = this.field3120.method6974();
            var4.method8116();
            var4.method8161();
         }
      } else {
         --this.field3118;
      }

      this.field3116.method8097(var1, var2);
      this.field3120.method6965(var1);
   }

   public void method5637() {
      this.field3120.method6964();
      this.field3116.method8098();
      this.field3119 = new class476();
      this.field3118 = this.field3117;
   }
}
