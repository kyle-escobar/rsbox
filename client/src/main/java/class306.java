import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

public final class class306 {
   static int field3338;
   static final HashMap field3341 = new HashMap();

   static {
      Calendar.getInstance(method5736("Europe/London"));
   }

   class306() throws Throwable {
   }

   static TimeZone method5736(String var0) {
      synchronized(field3341) {
         TimeZone var3 = (TimeZone)field3341.get(var0);
         if (null == var3) {
            var3 = TimeZone.getTimeZone(var0);
            field3341.put(var0, var3);
         }

         return var3;
      }
   }
}
