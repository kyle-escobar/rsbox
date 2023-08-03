public class class174 extends class133 {
   int field1842;
   long field1845;
   // $FF: synthetic field
   final class148 this$0;

   class174(class148 var1) {
      this.this$0 = var1;
   }

   void method2457(Buffer var1) {
      this.field1842 = var1.readInt();
      this.field1845 = var1.readLong();
   }

   void method2458(class154 var1) {
      var1.method2602(this.field1842, this.field1845);
   }
}
