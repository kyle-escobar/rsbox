public class class175 {
   class382 field1851 = new class382();
   long field1846;
   long field1847 = -1L;

   public class175(class519 var1) {
      this.method3383(var1);
   }

   void method3383(class519 var1) {
      this.field1846 = var1.method8755();
      this.field1847 = var1.method8755();

      for(int var3 = var1.method8748(); var3 != 0; var3 = var1.method8748()) {
         Object var4;
         if (var3 == 1) {
            var4 = new class139(this);
         } else if (var3 == 4) {
            var4 = new class180(this);
         } else if (var3 == 3) {
            var4 = new class150(this);
         } else if (var3 == 2) {
            var4 = new class136(this);
         } else {
            if (var3 != 5) {
               throw new RuntimeException("");
            }

            var4 = new class159(this);
         }

         ((class163)var4).method3248(var1);
         this.field1851.method6874((class470)var4);
      }

   }

   public void method3384(class164 var1) {
      if (this.field1846 == var1.field4816 && this.field1847 == var1.field1771) {
         for(class163 var3 = (class163)this.field1851.method6847(); var3 != null; var3 = (class163)this.field1851.method6849()) {
            var3.method3255(var1);
         }

         ++var1.field1771;
      } else {
         throw new RuntimeException("");
      }
   }
}
