public class LoginType implements class294 {
   public static final LoginType field3462 = new LoginType(14, 0);
   public static final LoginType NORMAL = new LoginType(16, -2);
   public static final LoginType RECONNECT = new LoginType(18, -2);
   public static final LoginType field3466 = new LoginType(19, -2);
   static final LoginType field3461 = new LoginType(15, 4);
   static final LoginType field3465 = new LoginType(27, 0);
   static final LoginType[] field3467 = new LoginType[32];
   public final int opcode;

   static {
      LoginType[] var0 = method2515();

      for(int var1 = 0; var1 < var0.length; ++var1) {
         field3467[var0[var1].opcode] = var0[var1];
      }

   }

   LoginType(int var1, int var2) {
      this.opcode = var1;
   }

   static LoginType[] method2515() {
      return new LoginType[]{field3465, field3466, field3461, field3462, RECONNECT, NORMAL};
   }
}
