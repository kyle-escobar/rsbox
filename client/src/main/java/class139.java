public class class139 extends class163 {
   static byte[][] regionLandArchives;
   byte field1292;
   int field1288;
   String field1289;
   // $FF: synthetic field
   final class175 this$0;

   class139(class175 var1) {
      this.this$0 = var1;
      this.field1289 = null;
   }

   void method3248(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         var1.readLong();
      }

      this.field1289 = var1.readStringOrNull();
      this.field1288 = var1.readUnsignedShort();
      this.field1292 = var1.readByte();
      var1.readLong();
   }

   void method3255(class164 var1) {
      class152 var3 = new class152();
      var3.field1389 = new class526(this.field1289);
      var3.field1388 = this.field1288;
      var3.field1391 = this.field1292;
      var1.method3260(var3);
   }
}
