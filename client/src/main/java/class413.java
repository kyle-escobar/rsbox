public class class413 {
   int field4566;
   int field4567;
   int field4568;
   int field4569;

   class413() throws Throwable {
   }

   public String toString() {
      boolean var1 = true;
      int var2 = 10 - Integer.toString(this.field4566).length();
      int var3 = 10 - Integer.toString(this.field4568).length();
      int var4 = 10 - Integer.toString(this.field4567).length();
      String var5 = "          ".substring(10 - var2);
      String var6 = "          ".substring(10 - var3);
      String var7 = "          ".substring(10 - var4);
      return "    Size: " + this.field4566 + var5 + "Created: " + this.field4567 + var7 + "Total used: " + this.field4568 + var6 + "Max-In-Use: " + this.field4569;
   }
}
