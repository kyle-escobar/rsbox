import java.applet.Applet;
import netscape.javascript.JSObject;

public class class30 {
   class30() throws Throwable {
   }

   public static void method441(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   public static Object method443(Applet var0, String var1, Object[] var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }
}
