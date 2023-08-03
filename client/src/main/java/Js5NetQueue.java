public class Js5NetQueue extends class133 {
   static class355 field1356;
   int field1355;
   String field1354;
   // $FF: synthetic field
   final class148 this$0;

   Js5NetQueue(class148 var1) {
      this.this$0 = var1;
   }

   void method2457(PacketBuffer var1) {
      this.field1355 = var1.readInt();
      this.field1354 = var1.readString();
   }

   void method2458(class154 var1) {
      var1.method2648(this.field1355, this.field1354);
   }
}
