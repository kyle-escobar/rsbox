public class LoginMethod implements class383 {
   public static final LoginMethod OAUTH = new LoginMethod(0, 2);
   public static final LoginMethod NORMAL = new LoginMethod(4, 0);
   static final LoginMethod field5043 = new LoginMethod(1, 8);
   static final LoginMethod field5045 = new LoginMethod(2, 5);
   static final LoginMethod field5046 = new LoginMethod(5, 6);
   static final LoginMethod field5047 = new LoginMethod(3, 7);
   final int field5048;
   final int field5050;

   LoginMethod(int var1, int var2) {
      this.field5048 = var1;
      this.field5050 = var2;
   }

   public int serialId() {
      return this.field5050;
   }

   public boolean isOAuth() {
      return this == OAUTH;
   }
}
