public class class149 extends class133 {
   static class424 js5Socket;
   byte field1375;
   int field1376;
   // $FF: synthetic field
   final class148 this$0;

   class149(class148 var1) {
      this.this$0 = var1;
      this.field1376 = -1;
   }

   void method2457(PacketBuffer var1) {
      this.field1376 = var1.readUnsignedShort();
      this.field1375 = var1.readByte();
   }

   void method2458(class154 var1) {
      var1.method2596(this.field1376, this.field1375);
   }
}
