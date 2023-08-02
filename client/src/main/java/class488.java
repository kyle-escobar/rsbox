public class class488 {
   public static int field4948;
   boolean field4950 = false;
   class342 field4944;
   int field4947 = 0;
   String field4946;

   class488(class342 var1) {
      this.field4944 = var1;
   }

   void method8413(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         if (var1 != this.field4946) {
            this.field4946 = var1;
            this.field4947 = 0;
            this.field4950 = false;
            this.method8414();
         }
      }
   }

   int method8414() {
      if (null == this.field4946) {
         this.field4947 = 100;
         this.field4950 = true;
      } else {
         if (this.field4947 < 33) {
            if (!this.field4944.method6403(class276.field3021.field3022, this.field4946)) {
               return this.field4947;
            }

            this.field4947 = 33;
         }

         if (this.field4947 == 33) {
            if (this.field4944.method6401(class276.field3026.field3022, this.field4946) && !this.field4944.method6403(class276.field3026.field3022, this.field4946)) {
               return this.field4947;
            }

            this.field4947 = 66;
         }

         if (this.field4947 == 66) {
            if (!this.field4944.method6403(this.field4946, class276.field3024.field3022)) {
               return this.field4947;
            }

            this.field4947 = 100;
            this.field4950 = true;
         }
      }

      return this.field4947;
   }

   boolean method8415() {
      return this.field4950;
   }

   int method8416() {
      return this.field4947;
   }
}
