public class class142 extends class133 {
   static class342 field1314;
   static int field1317;
   int field1312;
   int field1313;
   int field1316;
   int field1318;
   // $FF: synthetic field
   final class148 this$0;

   class142(class148 var1) {
      this.this$0 = var1;
      this.field1318 = -1;
   }

   void method2457(PacketBuffer var1) {
      this.field1318 = var1.readUnsignedShort();
      this.field1313 = var1.readInt();
      this.field1312 = var1.readUnsignedByte();
      this.field1316 = var1.readUnsignedByte();
   }

   void method2458(class154 var1) {
      var1.method2599(this.field1318, this.field1313, this.field1312, this.field1316);
   }
}
