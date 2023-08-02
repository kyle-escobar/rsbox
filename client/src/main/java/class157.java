import java.io.File;

public class class157 extends class133 {
   static class449 field1740;
   static File field1739;
   int field1742;
   String field1738;
   long field1737;
   // $FF: synthetic field
   final class148 this$0;

   class157(class148 var1) {
      this.this$0 = var1;
      this.field1737 = -1L;
      this.field1738 = null;
      this.field1742 = 0;
   }

   void method2457(class519 var1) {
      if (var1.method8748() != 255) {
         --var1.field5129;
         this.field1737 = var1.method8755();
      }

      this.field1738 = var1.method8758();
      this.field1742 = var1.method8750();
   }

   void method2458(class154 var1) {
      var1.method2593(this.field1737, this.field1738, this.field1742);
   }
}
