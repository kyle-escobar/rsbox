public class class136 extends class163 {
   static class363 field1254;
   byte field1260;
   int field1256;
   int field1258;
   String field1257;
   // $FF: synthetic field
   final class175 this$0;

   class136(class175 var1) {
      this.this$0 = var1;
      this.field1256 = -1;
   }

   void method3248(Buffer var1) {
      this.field1256 = var1.readUnsignedShort();
      this.field1260 = var1.readByte();
      this.field1258 = var1.readUnsignedShort();
      var1.readLong();
      this.field1257 = var1.readString();
   }

   void method3255(class164 var1) {
      class152 var3 = (class152)var1.field1772.get(this.field1256);
      var3.field1391 = this.field1260;
      var3.field1388 = this.field1258;
      var3.field1389 = new class526(this.field1257);
   }
}
