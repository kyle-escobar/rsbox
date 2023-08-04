import java.util.ArrayList;

public class class108 extends class442 {
   public static class342 field1061;
   static byte[][][] field1062;
   final boolean field1063;

   public class108(boolean var1) {
      this.field1063 = var1;
   }

   static void method2167(class342 var0, class342 var1, boolean var2, int var3) {
      if (Login.field429) {
         if (var3 == 4) {
            Login.method6370(4);
         }

      } else {
         if (var3 == 0) {
            Login.method5882(var2);
         } else {
            Login.method6370(var3);
         }

         class535.method9301();
         byte[] var5 = var0.method6402("title.jpg", "");
         class406.field4516 = class32.method2580(var5);
         class53.field390 = class406.field4516.method9120();
         class434.method7715(var1, Client.field1433);
         Login.field430 = class538.method8011(var1, "titlebox", "");
         Login.field431 = class538.method8011(var1, "titlebutton", "");
         Login.field432 = class538.method8011(var1, "titlebutton_large", "");
         class354.field3917 = class538.method8011(var1, "play_now_text", "");
         class538.method8011(var1, "titlebutton_wide42,1", "");
         Login.field428 = class538.method8431(var1, "runes", "");
         class311.field3469 = class538.method8431(var1, "title_mute", "");
         class244.field2693 = class538.method8011(var1, "options_radio_buttons,0", "");
         class19.field101 = class538.method8011(var1, "options_radio_buttons,4", "");
         class20.field112 = class538.method8011(var1, "options_radio_buttons,2", "");
         class76.field633 = class538.method8011(var1, "options_radio_buttons,6", "");
         class132.field1241 = class244.field2693.field5216;
         class458.field4755 = class244.field2693.field5214;
         class169.field1805 = new class97(Login.field428);
         if (var2) {
            Login.loginUsername = "";
            Login.loginPassword = "";
            Login.field461 = new String[8];
            Login.field446 = 0;
         }

         class428.field4629 = 0;
         Login.field466 = "";
         Login.field451 = true;
         Login.field457 = false;
         if (!class141.clientPreferences.method1617()) {
            ArrayList var6 = new ArrayList();
            var6.add(new class322(class24.field121, "scape main", "", 255, false));
            class303.method2298(var6, 0, 0, 0, 100, false);
         } else {
            class303.method4211(0, 0);
         }

         class303.field3198.clear();
         class355 var7 = Js5NetQueue.field1356;
         var7.method6532(false);
         Login.field429 = true;
         Login.field447 = (class343.field3838 - 765) / 2;
         Login.field434 = 202 + Login.field447;
         class81.field718 = 180 + Login.field434;
         class406.field4516.method9034(Login.field447, 0);
         class53.field390.method9034(Login.field447 + 382, 0);
         Login.field465.method9316(382 + Login.field447 - Login.field465.field5216 / 2, 18);
      }
   }

   int method2161(class417 var1, class417 var2) {
      if (Client.field1432 == var1.field4575 && Client.field1432 == var2.field4575) {
         return this.field1063 ? var1.field4576 - var2.field4576 : var2.field4576 - var1.field4576;
      } else {
         return this.method7818(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2161((class417)var1, (class417)var2);
   }
}
