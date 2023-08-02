import java.util.Iterator;

public final class class469 implements Iterable {
   class470 field4812;
   class470 field4813;
   class470[] field4810;
   int field4811;
   int field4814 = 0;

   public class469(int var1) {
      this.field4811 = var1;
      this.field4810 = new class470[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class470 var3 = this.field4810[var2] = new class470();
         var3.field4817 = var3;
         var3.field4815 = var3;
      }

   }

   public class470 method8096(long var1) {
      class470 var3 = this.field4810[(int)(var1 & (long)(this.field4811 - 1))];

      for(this.field4812 = var3.field4817; this.field4812 != var3; this.field4812 = this.field4812.field4817) {
         if (this.field4812.field4816 == var1) {
            class470 var4 = this.field4812;
            this.field4812 = this.field4812.field4817;
            return var4;
         }
      }

      this.field4812 = null;
      return null;
   }

   public void method8097(class470 var1, long var2) {
      if (var1.field4815 != null) {
         var1.method8116();
      }

      class470 var4 = this.field4810[(int)(var2 & (long)(this.field4811 - 1))];
      var1.field4815 = var4.field4815;
      var1.field4817 = var4;
      var1.field4815.field4817 = var1;
      var1.field4817.field4815 = var1;
      var1.field4816 = var2;
   }

   public void method8098() {
      for(int var1 = 0; var1 < this.field4811; ++var1) {
         class470 var2 = this.field4810[var1];

         while(true) {
            class470 var3 = var2.field4817;
            if (var3 == var2) {
               break;
            }

            var3.method8116();
         }
      }

      this.field4812 = null;
      this.field4813 = null;
   }

   public class470 method8100() {
      this.field4814 = 0;
      return this.method8108();
   }

   public class470 method8108() {
      class470 var1;
      if (this.field4814 > 0 && this.field4813 != this.field4810[this.field4814 - 1]) {
         var1 = this.field4813;
         this.field4813 = var1.field4817;
         return var1;
      } else {
         do {
            if (this.field4814 >= this.field4811) {
               return null;
            }

            var1 = this.field4810[this.field4814++].field4817;
         } while(var1 == this.field4810[this.field4814 - 1]);

         this.field4813 = var1.field4817;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class491(this);
   }
}
