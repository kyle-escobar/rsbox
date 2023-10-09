public class class402 extends RuntimeException {
   public class402(String var1, Object[] var2) {
      super(String.format(var1, var2));
   }

   static final void method7065() {
      class308 var1 = class308.createPacket(ClientPacket.field3443, Client.serverConnection.field1046);
      Client.serverConnection.write(var1);
      class63.field477 = true;

      for(SubInterface var2 = (SubInterface) Client.activeSubInterfaces.method8186(); var2 != null; var2 = (SubInterface) Client.activeSubInterfaces.method8194()) {
         if (0 == var2.type || 3 == var2.type) {
            class102.closeSubInterface(var2, true);
         }
      }

      if (null != Client.meslayerPauseButtonComponent) {
         Client.setDirty(Client.meslayerPauseButtonComponent);
         Client.meslayerPauseButtonComponent = null;
      }

      class63.field477 = false;
   }
}
