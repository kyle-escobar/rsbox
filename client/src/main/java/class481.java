public final class class481 {
   class470 field4871;
   class470 field4873;
   class470[] field4874;
   int field4872;
   int field4875 = 0;

   public class481(int var1) {
      this.field4872 = var1;
      this.field4874 = new class470[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class470 var3 = this.field4874[var2] = new class470();
         var3.field4817 = var3;
         var3.field4815 = var3;
      }

   }

   public class470 get(long var1) {
      class470 var3 = this.field4874[(int)(var1 & (long)(this.field4872 - 1))];

      for(this.field4873 = var3.field4817; this.field4873 != var3; this.field4873 = this.field4873.field4817) {
         if (this.field4873.field4816 == var1) {
            class470 var4 = this.field4873;
            this.field4873 = this.field4873.field4817;
            return var4;
         }
      }

      this.field4873 = null;
      return null;
   }

   public int method8192() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.field4872; ++var2) {
         class470 var3 = this.field4874[var2];

         for(class470 var4 = var3.field4817; var4 != var3; var4 = var4.field4817) {
            ++var1;
         }
      }

      return var1;
   }

   public void put(class470 var1, long var2) {
      if (var1.field4815 != null) {
         var1.method8116();
      }

      class470 var4 = this.field4874[(int)(var2 & (long)(this.field4872 - 1))];
      var1.field4815 = var4.field4815;
      var1.field4817 = var4;
      var1.field4815.field4817 = var1;
      var1.field4817.field4815 = var1;
      var1.field4816 = var2;
   }

   public class470 method8186() {
      this.field4875 = 0;
      return this.method8194();
   }

   public class470 method8194() {
      class470 var1;
      if (this.field4875 > 0 && this.field4871 != this.field4874[this.field4875 - 1]) {
         var1 = this.field4871;
         this.field4871 = var1.field4817;
         return var1;
      } else {
         do {
            if (this.field4875 >= this.field4872) {
               return null;
            }

            var1 = this.field4874[this.field4875++].field4817;
         } while(var1 == this.field4874[this.field4875 - 1]);

         this.field4871 = var1.field4817;
         return var1;
      }
   }
}
