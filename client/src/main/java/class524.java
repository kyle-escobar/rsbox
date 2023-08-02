import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class class524 extends RuntimeException {
   public static int field5154;
   public static int field5156;
   public static int field5157;
   public static Applet field5159;
   public static String field5155;
   String field5158;
   Throwable field5160;

   class524(Throwable var1, String var2) {
      this.field5158 = var2;
      this.field5160 = var1;
   }

   public static void method5856(String var0, Throwable var1) {
      try {
         String var3 = "";
         if (var1 != null) {
            var3 = method1993(var1);
         }

         if (null != var0) {
            if (var1 != null) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var0;
         }

         System.out.println("Error: " + var3);
         var3 = var3.replace(':', '.');
         var3 = var3.replace('@', '_');
         var3 = var3.replace('&', '_');
         var3 = var3.replace('#', '_');
         if (field5159 == null) {
            return;
         }

         URL var4 = new URL(field5159.getCodeBase(), "clienterror.ws?cv=" + field5154 + "&cs=" + field5156 + "&u=" + field5155 + "&v1=" + class178.field1871 + "&v2=" + class178.field1868 + "&ct=" + field5157 + "&e=" + var3);
         DataInputStream var5 = new DataInputStream(var4.openStream());
         var5.read();
         var5.close();
      } catch (Exception var6) {
      }

   }

   static String method1993(Throwable var0) throws IOException {
      String var2;
      if (var0 instanceof class524) {
         class524 var3 = (class524)var0;
         var2 = var3.field5158 + " | ";
         var0 = var3.field5160;
      } else {
         var2 = "";
      }

      StringWriter var13 = new StringWriter();
      PrintWriter var4 = new PrintWriter(var13);
      var0.printStackTrace(var4);
      var4.close();
      String var5 = var13.toString();
      BufferedReader var6 = new BufferedReader(new StringReader(var5));
      String var7 = var6.readLine();

      while(true) {
         while(true) {
            String var8 = var6.readLine();
            if (null == var8) {
               var2 = var2 + "| " + var7;
               return var2;
            }

            int var9 = var8.indexOf(40);
            int var10 = var8.indexOf(41, var9 + 1);
            if (var9 >= 0 && var10 >= 0) {
               String var11 = var8.substring(var9 + 1, var10);
               int var12 = var11.indexOf(".java:");
               if (var12 >= 0) {
                  var11 = var11.substring(0, var12) + var11.substring(var12 + 5);
                  var2 = var2 + var11 + ' ';
                  continue;
               }

               var8 = var8.substring(0, var9);
            }

            var8 = var8.trim();
            var8 = var8.substring(var8.lastIndexOf(32) + 1);
            var8 = var8.substring(var8.lastIndexOf(9) + 1);
            var2 = var2 + var8 + ' ';
         }
      }
   }
}
