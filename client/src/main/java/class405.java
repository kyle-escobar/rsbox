public class class405 {
   class410 field4508;
   int field4506 = 0;
   int field4507 = 0;

   class405(class410 var1, int var2, int var3) {
      this.field4508 = var1;
      this.field4506 = var2;
      this.field4507 = var3;
   }

   public String method7101() {
      if (this.method7103()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder(this.method7104());

         for(int var3 = this.field4506; var3 < this.field4507; ++var3) {
            class416 var4 = this.field4508.method7277(var3);
            var2.append(var4.field4573);
         }

         return var2.toString();
      }
   }

   boolean method7123(int var1) {
      return this.field4508.method7308() == 2 || this.field4508.method7308() == 1 && (!this.field4508.field4547 || var1 != this.field4507 - 1);
   }

   public boolean method7103() {
      return this.field4506 == this.field4507;
   }

   public int method7104() {
      return this.field4507 - this.field4506;
   }

   boolean method7105(class416 var1) {
      if (2 == this.field4508.field4557) {
         return true;
      } else if (0 == this.field4508.field4557) {
         return false;
      } else {
         return this.field4508.method7278() != var1;
      }
   }

   int method7110() {
      if (this.method7103()) {
         return 0;
      } else {
         class416 var2 = this.field4508.method7277(this.field4507 - 1);
         if (var2.field4573 == '\n') {
            return 0;
         } else if (this.method7105(var2)) {
            return this.field4508.field4546.field4538[42];
         } else {
            int var3 = this.field4508.field4546.field4538[var2.field4573];
            if (var3 == 0) {
               return var2.field4573 == '\t' ? 3 * this.field4508.field4546.field4538[32] : this.field4508.field4546.field4538[32];
            } else {
               return var3;
            }
         }
      }
   }

   public class474 method7107() {
      if (this.method7103()) {
         return new class474(0, 0);
      } else {
         class416 var2 = this.field4508.method7277(this.field4507 - 1);
         return new class474(var2.field4572 + this.method7110(), var2.field4574);
      }
   }

   public class416 method7108(int var1) {
      return var1 >= 0 && var1 < this.method7104() ? this.field4508.method7277(var1 + this.field4506) : null;
   }
}
