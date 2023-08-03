public class class402 extends RuntimeException {
   public class402(String var1, Object[] var2) {
      super(String.format(var1, var2));
   }

   static final void method7065() {
      class308 var1 = class308.method8607(ClientPacket.field3443, Client.serverConnection.field1046);
      Client.serverConnection.method2148(var1);
      class63.field477 = true;

      for(class92 var2 = (class92) Client.field1601.method8186(); var2 != null; var2 = (class92) Client.field1601.method8194()) {
         if (0 == var2.field854 || 3 == var2.field854) {
            class102.method2083(var2, true);
         }
      }

      if (null != Client.field1605) {
         Client.method3898(Client.field1605);
         Client.field1605 = null;
      }

      class63.field477 = false;
   }
}
