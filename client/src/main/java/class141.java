public class class141 extends class133 {
   static class79 clientPreferences;
   boolean field1308;
   byte field1305;
   byte field1306;
   byte field1309;
   byte field1311;
   // $FF: synthetic field
   final class148 this$0;

   class141(class148 var1) {
      this.this$0 = var1;
   }

   void method2457(Buffer var1) {
      this.field1308 = var1.readUnsignedByte() == 1;
      this.field1306 = var1.readByte();
      this.field1305 = var1.readByte();
      this.field1309 = var1.readByte();
      this.field1311 = var1.readByte();
   }

   void method2458(class154 var1) {
      var1.field1401 = this.field1308;
      var1.field1403 = this.field1306;
      var1.field1397 = this.field1305;
      var1.field1404 = this.field1309;
      var1.field1405 = this.field1311;
   }
}
