import java.util.Iterator;

public class class491 implements Iterator {
   class469 field4956;
   class470 field4957 = null;
   class470 field4959;
   int field4958;

   public class491(class469 var1) {
      this.field4956 = var1;
      this.method8440();
   }

   void method8440() {
      this.field4959 = this.field4956.field4810[0].field4817;
      this.field4958 = 1;
      this.field4957 = null;
   }

   public class470 method8449() {
      this.method8440();
      return (class470)this.next();
   }

   public Object next() {
      class470 var1;
      if (this.field4959 != this.field4956.field4810[this.field4958 - 1]) {
         var1 = this.field4959;
         this.field4959 = var1.field4817;
         this.field4957 = var1;
         return var1;
      } else {
         do {
            if (this.field4958 >= this.field4956.field4811) {
               return null;
            }

            var1 = this.field4956.field4810[this.field4958++].field4817;
         } while(var1 == this.field4956.field4810[this.field4958 - 1]);

         this.field4959 = var1.field4817;
         this.field4957 = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if (this.field4959 != this.field4956.field4810[this.field4958 - 1]) {
         return true;
      } else {
         while(this.field4958 < this.field4956.field4811) {
            if (this.field4956.field4810[this.field4958++].field4817 != this.field4956.field4810[this.field4958 - 1]) {
               this.field4959 = this.field4956.field4810[this.field4958 - 1].field4817;
               return true;
            }

            this.field4959 = this.field4956.field4810[this.field4958 - 1];
         }

         return false;
      }
   }

   public void remove() {
      if (this.field4957 == null) {
         throw new IllegalStateException();
      } else {
         this.field4957.method8116();
         this.field4957 = null;
      }
   }
}
