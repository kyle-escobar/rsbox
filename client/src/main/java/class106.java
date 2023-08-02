import java.io.IOException;

public class class106 {
   boolean field1050 = true;
   class305 field1048 = null;
   class305 field1049;
   class305 field1054;
   class305 field1055;
   class382 field1043 = new class382();
   class424 field1051;
   class497 field1044 = new class497(40000);
   class519 field1045 = new class519(5000);
   int field1042 = 0;
   int field1052 = 0;
   int field1053 = 0;
   int field1056 = 0;
   public class540 field1046;

   class106() {
   }

   final void method2130() {
      this.field1043.method6903();
      this.field1053 = 0;
   }

   final void method2131() throws IOException {
      if (this.field1051 != null && this.field1053 > 0) {
         this.field1045.field5129 = 0;

         while(true) {
            class308 var2 = (class308)this.field1043.method6847();
            if (null == var2 || var2.field3353 > this.field1045.field5127.length - this.field1045.field5129) {
               this.field1051.method7588(this.field1045.field5127, 0, this.field1045.field5129);
               this.field1052 = 0;
               break;
            }

            this.field1045.method8741(var2.field3351.field5127, 0, var2.field3353);
            this.field1053 -= var2.field3353;
            var2.method8116();
            var2.field3351.method8730();
            var2.method5744();
         }
      }

   }

   public final void method2148(class308 var1) {
      this.field1043.method6874(var1);
      var1.field3353 = var1.field3351.field5129;
      var1.field3351.field5129 = 0;
      this.field1053 += var1.field3353;
   }

   void method2133(class424 var1) {
      this.field1051 = var1;
   }

   void method2146() {
      if (null != this.field1051) {
         this.field1051.method7589();
         this.field1051 = null;
      }

   }

   void method2150() {
      this.field1051 = null;
   }

   class424 method2137() {
      return this.field1051;
   }
}
