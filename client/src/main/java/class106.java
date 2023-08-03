import java.io.IOException;

public class class106 {
   boolean field1050 = true;
   ServerPacket serverPacket = null;
   ServerPacket field1049;
   ServerPacket field1054;
   ServerPacket field1055;
   class382 field1043 = new class382();
   class424 field1051;
   PacketBuffer buffer = new PacketBuffer(40000);
   Buffer field1045 = new Buffer(5000);
   int packetLength = 0;
   int field1052 = 0;
   int field1053 = 0;
   int field1056 = 0;
   public class540 field1046;

   class106() {
   }

   final void clearQueue() {
      this.field1043.method6903();
      this.field1053 = 0;
   }

   final void method2131() throws IOException {
      if (this.field1051 != null && this.field1053 > 0) {
         this.field1045.offset = 0;

         while(true) {
            class308 var2 = (class308)this.field1043.method6847();
            if (null == var2 || var2.field3353 > this.field1045.data.length - this.field1045.offset) {
               this.field1051.write(this.field1045.data, 0, this.field1045.offset);
               this.field1052 = 0;
               break;
            }

            this.field1045.writeBytes(var2.packet.data, 0, var2.field3353);
            this.field1053 -= var2.field3353;
            var2.method8116();
            var2.packet.release();
            var2.method5744();
         }
      }

   }

   public final void method2148(class308 var1) {
      this.field1043.method6874(var1);
      var1.field3353 = var1.packet.offset;
      var1.packet.offset = 0;
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
