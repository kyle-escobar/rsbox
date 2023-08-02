import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class class61 {
   static boolean field429;
   static boolean field451;
   static boolean field455;
   static boolean field457;
   static boolean field463;
   static class537 field430;
   static class537 field431;
   static class537 field432;
   static class537 field465;
   static class537[] field428;
   static int field433;
   static int field434;
   static int field437;
   static int field438;
   static int field439;
   static int field446;
   static int field447 = 0;
   static int field449;
   static int field450;
   static int field452;
   static int field456;
   static int field458;
   static String field435;
   static String field436;
   static String field440;
   static String field441;
   static String field443;
   static String field444;
   static String field445;
   static String field448;
   static String field453;
   static String field454;
   static String field466;
   static String field468;
   static String[] field427;
   static String[] field442;
   static String[] field461;
   static String[] field462;
   static long field459;
   static long field460;

   static {
      field434 = field447 + 202;
      field450 = 10;
      field436 = "";
      field437 = -1;
      field438 = 1;
      field439 = 0;
      field440 = "";
      field454 = "";
      field435 = "";
      field443 = "";
      field441 = "";
      field445 = "";
      field446 = 0;
      field461 = new String[8];
      field448 = "";
      field463 = false;
      field455 = false;
      field451 = true;
      field452 = 0;
      field453 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef\u00bf\u00bd$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
      field444 = "1234567890";
      field457 = false;
      field456 = -1;
      field449 = 0;
      field458 = 0;
      new DecimalFormat("##0.00");
      new class147();
      field459 = -1L;
      field460 = -1L;
      field427 = new String[]{"title.jpg"};
      field462 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
      field442 = new String[]{"logo_speedrunning"};
   }

   class61() throws Throwable {
   }

   static int method6489(class342 var0) {
      int var2 = field462.length + field427.length;
      String[] var3 = field442;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         String var5 = var3[var4];
         if (var0.method6395(var5) != -1) {
            ++var2;
         }
      }

      return var2;
   }

   static class537 method529(boolean var0, boolean var1) {
      return var0 ? (var1 ? class76.field633 : class20.field112) : (var1 ? class19.field101 : class244.field2693);
   }

   static String method6() {
      String var1;
      if (class141.field1307.method1615()) {
         String var3 = field441;
         int var5 = var3.length();
         char[] var6 = new char[var5];

         for(int var7 = 0; var7 < var5; ++var7) {
            var6[var7] = '*';
         }

         String var4 = new String(var6);
         var1 = var4;
      } else {
         var1 = field441;
      }

      return var1;
   }

   static void method4749() {
      if (field429) {
         field430 = null;
         field431 = null;
         field428 = null;
         class406.field4516 = null;
         class53.field390 = null;
         field465 = null;
         class311.field3469 = null;
         class244.field2693 = null;
         class20.field112 = null;
         class131.field1229 = null;
         class307.field3350 = null;
         class32.field158 = null;
         class223.field2455 = null;
         class467.field4793 = null;
         class169.field1805.method2034();
         class303.method4211(0, 100);
         class355 var1 = class145.field1356;
         var1.method6532(true);
         field429 = false;
      }
   }

   static void method7296() {
      if (Client.field1483 && field441 != null && field441.length() > 0) {
         field452 = 1;
      } else {
         field452 = 0;
      }

   }

   static void method3299(class43 var0, class393 var1, class393 var2) {
      if (field457) {
         method59(var0);
      } else {
         if ((1 == class41.field256 || !class40.field238 && 4 == class41.field256) && class41.field257 >= 765 + field447 - 50 && class41.field258 >= 453) {
            class141.field1307.method1616(!class141.field1307.method1617());
            if (!class141.field1307.method1617()) {
               ArrayList var4 = new ArrayList();
               var4.add(new class322(class24.field121, "scape main", "", 255, false));
               class303.method2298(var4, 0, 0, 0, 100, false);
            } else {
               class303.method4211(0, 0);
            }

            class303.field3198.clear();
         }

         if (5 != Client.field1728) {
            if (field459 == -1L) {
               field459 = class302.method2194() + 1000L;
            }

            long var28 = class302.method2194();
            if (Client.method597() && -1L == field460) {
               field460 = var28;
               if (field460 > field459) {
                  field459 = field460;
               }
            }

            if (10 == Client.field1728 || Client.field1728 == 11) {
               int var6;
               int var7;
               int var8;
               if (class384.field4403 == class63.field496) {
                  if (class41.field256 == 1 || !class40.field238 && class41.field256 == 4) {
                     var6 = field447 + 5;
                     var7 = 463;
                     var8 = 100;
                     byte var9 = 35;
                     if (class41.field257 >= var6 && class41.field257 <= var6 + var8 && class41.field258 >= var7 && class41.field258 <= var9 + var7) {
                        if (class70.method1994()) {
                           field457 = true;
                           field449 = 0;
                           field458 = 0;
                        }

                        return;
                     }
                  }

                  if (class70.field563 != null && class70.method1994()) {
                     field457 = true;
                     field449 = 0;
                     field458 = 0;
                  }
               }

               var6 = class41.field256;
               var7 = class41.field257;
               var8 = class41.field258;
               if (var6 == 0) {
                  var7 = class41.field249;
                  var8 = class41.field250;
               }

               if (!class40.field238 && var6 == 4) {
                  var6 = 1;
               }

               class216 var29 = Client.method4736();
               int var11;
               short var32;
               if (field439 == 0) {
                  boolean var49 = false;

                  while(var29.method4109()) {
                     if (84 == var29.field2371) {
                        var49 = true;
                     }
                  }

                  var11 = class81.field718 - 80;
                  var32 = 291;
                  if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20) {
                     class45.method1843(Client.method2209("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var11 = class81.field718 + 80;
                  if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20 || var49) {
                     if (0 != (Client.field1433 & 33554432)) {
                        field440 = "";
                        field454 = class364.field4243;
                        field435 = class364.field4244;
                        field443 = class364.field4291;
                        method6370(1);
                        method7296();
                     } else if ((Client.field1433 & 4) != 0) {
                        if ((Client.field1433 & 1024) != 0) {
                           field454 = class364.field4240;
                           field435 = class364.field4241;
                           field443 = class364.field4283;
                        } else {
                           field454 = class364.field4306;
                           field435 = class364.field4285;
                           field443 = class364.field4236;
                        }

                        field440 = class364.field4233;
                        method6370(1);
                        method7296();
                     } else if ((Client.field1433 & 1024) != 0) {
                        field454 = class364.field4231;
                        field435 = class364.field4224;
                        field443 = class364.field4036;
                        field440 = class364.field4233;
                        method6370(1);
                        method7296();
                     } else {
                        class314.method5805(false);
                     }
                  }
               } else {
                  int var10;
                  short var33;
                  if (field439 == 1) {
                     while(true) {
                        if (!var29.method4109()) {
                           var10 = class81.field718 - 80;
                           var33 = 321;
                           if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                              class314.method5805(false);
                           }

                           var10 = class81.field718 + 80;
                           if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                              method6370(0);
                           }
                           break;
                        }

                        if (var29.field2371 == 84) {
                           class314.method5805(false);
                        } else if (var29.field2371 == 13) {
                           method6370(0);
                        }
                     }
                  } else {
                     int var15;
                     short var30;
                     boolean var34;
                     if (field439 == 2) {
                        var30 = 201;
                        var10 = var30 + 52;
                        if (var6 == 1 && var8 >= var10 - 12 && var8 < var10 + 2) {
                           field452 = 0;
                        }

                        var10 += 15;
                        if (var6 == 1 && var8 >= var10 - 12 && var8 < var10 + 2) {
                           field452 = 1;
                        }

                        var10 += 15;
                        var30 = 361;
                        if (null != class360.field3976) {
                           var11 = class360.field3976.field4742 / 2;
                           if (var6 == 1 && var7 >= class360.field3976.field4741 - var11 && var7 <= var11 + class360.field3976.field4741 && var8 >= var30 - 15 && var8 < var30) {
                              switch (field438) {
                                 case 1:
                                    method2098(class364.field4282, class364.field4242, class364.field4218);
                                    method6370(5);
                                    return;
                                 case 2:
                                    class45.method1843("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var11 = class81.field718 - 80;
                        var32 = 321;
                        if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20) {
                           field441 = field441.trim();
                           if (field441.length() == 0) {
                              method2098(class364.field4105, class364.field4142, class364.field4247);
                              return;
                           }

                           if (field445.length() == 0) {
                              method2098(class364.field4046, class364.field4259, class364.field4146);
                              return;
                           }

                           method2098(class364.field4316, class364.field4249, class364.field4292);
                           Client.method6480(false);
                           Client.method2323(20);
                           return;
                        }

                        var11 = 180 + field434 + 80;
                        if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20) {
                           method6370(0);
                           field441 = "";
                           field445 = "";
                           class428.field4629 = 0;
                           field466 = "";
                           field451 = true;
                        }

                        var11 = class81.field718 + -117;
                        var32 = 277;
                        field463 = var7 >= var11 && var7 < class132.field1241 + var11 && var8 >= var32 && var8 < class458.field4755 + var32;
                        if (var6 == 1 && field463) {
                           Client.field1483 = !Client.field1483;
                           if (!Client.field1483 && class141.field1307.method1631() != null) {
                              class141.field1307.method1630((String)null);
                           }
                        }

                        var11 = 24 + class81.field718;
                        var32 = 277;
                        field455 = var7 >= var11 && var7 < class132.field1241 + var11 && var8 >= var32 && var8 < class458.field4755 + var32;
                        if (var6 == 1 && field455) {
                           class141.field1307.method1677(!class141.field1307.method1615());
                           if (!class141.field1307.method1615()) {
                              field441 = "";
                              class141.field1307.method1630((String)null);
                              method7296();
                           }
                        }

                        label1056:
                        while(true) {
                           Transferable var41;
                           do {
                              while(true) {
                                 char var38;
                                 label997:
                                 do {
                                    while(true) {
                                       while(var29.method4109()) {
                                          if (13 != var29.field2371) {
                                             if (0 != field452) {
                                                continue label997;
                                             }

                                             method1162(var29.field2370);
                                             if (85 == var29.field2371 && field441.length() > 0) {
                                                field441 = field441.substring(0, field441.length() - 1);
                                             }

                                             if (84 == var29.field2371 || 80 == var29.field2371) {
                                                field452 = 1;
                                             }

                                             var38 = var29.field2370;
                                             var34 = field453.indexOf(var38) != -1;
                                             if (var34 && field441.length() < 320) {
                                                field441 = field441 + var29.field2370;
                                             }
                                          } else {
                                             method6370(0);
                                             field441 = "";
                                             field445 = "";
                                             class428.field4629 = 0;
                                             field466 = "";
                                             field451 = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(field452 != 1);

                                 if (var29.field2371 == 85 && field445.length() > 0) {
                                    field445 = field445.substring(0, field445.length() - 1);
                                 } else if (84 == var29.field2371 || var29.field2371 == 80) {
                                    field452 = 0;
                                    if (84 == var29.field2371) {
                                       field441 = field441.trim();
                                       if (field441.length() == 0) {
                                          method2098(class364.field4105, class364.field4142, class364.field4247);
                                          return;
                                       }

                                       if (field445.length() == 0) {
                                          method2098(class364.field4046, class364.field4259, class364.field4146);
                                          return;
                                       }

                                       method2098(class364.field4316, class364.field4249, class364.field4292);
                                       Client.method6480(false);
                                       Client.method2323(20);
                                       return;
                                    }
                                 }

                                 if ((var29.method4103(82) || var29.method4103(87)) && var29.field2371 == 67) {
                                    Clipboard var40 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var41 = var40.getContents(class124.field1180);
                                    var15 = 20 - field445.length();
                                    break;
                                 }

                                 if (class389.method1754(var29.field2370)) {
                                    var38 = var29.field2370;
                                    var34 = field453.indexOf(var38) != -1;
                                    if (var34 && field445.length() < 20) {
                                       field445 = field445 + var29.field2370;
                                    }
                                 }
                              }
                           } while(var15 <= 0);

                           try {
                              String var44 = (String)var41.getTransferData(DataFlavor.stringFlavor);
                              int var42 = Math.min(var15, var44.length());
                              int var43 = 0;

                              while(true) {
                                 if (var43 >= var42) {
                                    field445 = field445 + var44.substring(0, var42);
                                    continue label1056;
                                 }

                                 char var47 = var44.charAt(var43);
                                 boolean var45;
                                 if ((var47 < ' ' || var47 >= 127) && (var47 <= 127 || var47 >= 160) && (var47 <= 160 || var47 > 255)) {
                                    label1180: {
                                       if (var47 != 0) {
                                          char[] var21 = class389.field4443;

                                          for(int var22 = 0; var22 < var21.length; ++var22) {
                                             char var23 = var21[var22];
                                             if (var23 == var47) {
                                                var45 = true;
                                                break label1180;
                                             }
                                          }
                                       }

                                       var45 = false;
                                    }
                                 } else {
                                    var45 = true;
                                 }

                                 if (!var45) {
                                    break;
                                 }

                                 char var50 = var44.charAt(var43);
                                 boolean var48 = field453.indexOf(var50) != -1;
                                 if (!var48) {
                                    break;
                                 }

                                 ++var43;
                              }

                              method6370(3);
                              return;
                           } catch (UnsupportedFlavorException var26) {
                           } catch (IOException var27) {
                           }
                        }
                     } else {
                        class453 var12;
                        if (3 == field439) {
                           var10 = field434 + 180;
                           var11 = 241;
                           var12 = var1.method7162(25, class364.field4165.length() - 34, class364.field4165, var10, var11);
                           if (var6 == 1 && var12.method7938(var7, var8)) {
                              class45.method1843(class364.field4330, true, false);
                           }

                           var10 = 180 + field434;
                           var11 = 276;
                           if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                              method5882(false);
                           }

                           var10 = field434 + 180;
                           var11 = 326;
                           if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                              method2098(class364.field4282, class364.field4242, class364.field4218);
                              method6370(5);
                              return;
                           }
                        } else {
                           int var13;
                           if (field439 == 4) {
                              var10 = field434 + 180 - 80;
                              var11 = 321;
                              if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                 field466.trim();
                                 if (field466.length() != 6) {
                                    method2098(class364.field4060, class364.field4061, class364.field4062);
                                    return;
                                 }

                                 class428.field4629 = Integer.parseInt(field466);
                                 field466 = "";
                                 Client.method6480(true);
                                 method2098(class364.field4316, class364.field4249, class364.field4292);
                                 Client.method2323(20);
                                 return;
                              }

                              if (var6 == 1 && var7 >= 180 + field434 - 9 && var7 <= 130 + 180 + field434 && var8 >= 263 && var8 <= 296) {
                                 field451 = !field451;
                              }

                              if (var6 == 1 && var7 >= field434 + 180 - 34 && var7 <= field434 + 180 + 34 && var8 >= 351 && var8 <= 363) {
                                 class45.method1843(Client.method2209("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                              }

                              var10 = field434 + 180 + 80;
                              if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                 method6370(0);
                                 field441 = "";
                                 field445 = "";
                                 class428.field4629 = 0;
                                 field466 = "";
                              }

                              while(var29.method4109()) {
                                 boolean var31 = false;

                                 for(var13 = 0; var13 < field444.length(); ++var13) {
                                    if (var29.field2370 == field444.charAt(var13)) {
                                       var31 = true;
                                       break;
                                    }
                                 }

                                 if (var29.field2371 == 13) {
                                    method6370(0);
                                    field441 = "";
                                    field445 = "";
                                    class428.field4629 = 0;
                                    field466 = "";
                                 } else {
                                    if (85 == var29.field2371 && field466.length() > 0) {
                                       field466 = field466.substring(0, field466.length() - 1);
                                    }

                                    if (var29.field2371 == 84) {
                                       field466.trim();
                                       if (field466.length() != 6) {
                                          method2098(class364.field4060, class364.field4061, class364.field4062);
                                          return;
                                       }

                                       class428.field4629 = Integer.parseInt(field466);
                                       field466 = "";
                                       Client.method6480(true);
                                       method2098(class364.field4316, class364.field4249, class364.field4292);
                                       Client.method2323(20);
                                       return;
                                    }

                                    if (var31 && field466.length() < 6) {
                                       field466 = field466 + var29.field2370;
                                    }
                                 }
                              }
                           } else {
                              int var14;
                              if (5 == field439) {
                                 var10 = 180 + field434 - 80;
                                 var11 = 321;
                                 if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                    method1467();
                                    return;
                                 }

                                 var10 = field434 + 180 + 80;
                                 if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                    class314.method5805(true);
                                 }

                                 var32 = 361;
                                 if (null != class318.field3508) {
                                    var13 = class318.field3508.field4742 / 2;
                                    if (var6 == 1 && var7 >= class318.field3508.field4741 - var13 && var7 <= var13 + class318.field3508.field4741 && var8 >= var32 - 15 && var8 < var32) {
                                       class45.method1843(Client.method2209("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                                    }
                                 }

                                 while(var29.method4109()) {
                                    var34 = false;

                                    for(var14 = 0; var14 < field453.length(); ++var14) {
                                       if (var29.field2370 == field453.charAt(var14)) {
                                          var34 = true;
                                          break;
                                       }
                                    }

                                    if (13 == var29.field2371) {
                                       class314.method5805(true);
                                    } else {
                                       if (var29.field2371 == 85 && field441.length() > 0) {
                                          field441 = field441.substring(0, field441.length() - 1);
                                       }

                                       if (var29.field2371 == 84) {
                                          method1467();
                                          return;
                                       }

                                       if (var34 && field441.length() < 320) {
                                          field441 = field441 + var29.field2370;
                                       }
                                    }
                                 }
                              } else if (field439 != 6) {
                                 if (7 == field439) {
                                    if (class76.field635 && !Client.field1440) {
                                       var10 = class81.field718 - 150;
                                       var11 = 40 + 25 + var10 + 240;
                                       var32 = 231;
                                       var13 = var32 + 40;
                                       if (var6 == 1 && var7 >= var10 && var7 <= var11 && var8 >= var32 && var8 <= var13) {
                                          field446 = method2469(var10, var7);
                                       }

                                       var14 = field434 + 180 - 80;
                                       var15 = 321;
                                       boolean var16;
                                       Date var17;
                                       boolean var18;
                                       Calendar var19;
                                       Date var20;
                                       boolean var46;
                                       if (var6 == 1 && var7 >= var14 - 75 && var7 <= var14 + 75 && var8 >= var15 - 20 && var8 <= var15 + 20) {
                                          label900: {
                                             try {
                                                var17 = method91();
                                             } catch (ParseException var25) {
                                                method6370(7);
                                                method2098("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                var16 = false;
                                                break label900;
                                             }

                                             if (var17 == null) {
                                                var16 = false;
                                             } else {
                                                var19 = Calendar.getInstance();
                                                var19.set(1, var19.get(1) - 13);
                                                var19.set(5, var19.get(5) + 1);
                                                var19.set(11, 0);
                                                var19.set(12, 0);
                                                var19.set(13, 0);
                                                var19.set(14, 0);
                                                var20 = var19.getTime();
                                                var18 = var17.before(var20);
                                                var46 = method8030(var17);
                                                if (!var46) {
                                                   method6370(7);
                                                   method2098("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                   var16 = false;
                                                } else {
                                                   if (!var18) {
                                                      class70.field576 = 8388607;
                                                   } else {
                                                      class70.field576 = (int)(var17.getTime() / 86400000L - 11745L);
                                                   }

                                                   var16 = true;
                                                }
                                             }
                                          }

                                          if (var16) {
                                             Client.method2323(50);
                                             return;
                                          }
                                       }

                                       var14 = field434 + 180 + 80;
                                       if (var6 == 1 && var7 >= var14 - 75 && var7 <= var14 + 75 && var8 >= var15 - 20 && var8 <= var15 + 20) {
                                          field461 = new String[8];
                                          class314.method5805(true);
                                       }

                                       while(var29.method4109()) {
                                          if (var29.field2371 == 101) {
                                             field461[field446] = null;
                                          }

                                          if (var29.field2371 == 85) {
                                             if (null == field461[field446] && field446 > 0) {
                                                --field446;
                                             }

                                             field461[field446] = null;
                                          }

                                          if (var29.field2370 >= '0' && var29.field2370 <= '9') {
                                             field461[field446] = "" + var29.field2370;
                                             if (field446 < 7) {
                                                ++field446;
                                             }
                                          }

                                          if (var29.field2371 == 84) {
                                             label836: {
                                                try {
                                                   var17 = method91();
                                                } catch (ParseException var24) {
                                                   method6370(7);
                                                   method2098("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                   var16 = false;
                                                   break label836;
                                                }

                                                if (var17 == null) {
                                                   var16 = false;
                                                } else {
                                                   var19 = Calendar.getInstance();
                                                   var19.set(1, var19.get(1) - 13);
                                                   var19.set(5, var19.get(5) + 1);
                                                   var19.set(11, 0);
                                                   var19.set(12, 0);
                                                   var19.set(13, 0);
                                                   var19.set(14, 0);
                                                   var20 = var19.getTime();
                                                   var18 = var17.before(var20);
                                                   var46 = method8030(var17);
                                                   if (!var46) {
                                                      method6370(7);
                                                      method2098("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                      var16 = false;
                                                   } else {
                                                      if (!var18) {
                                                         class70.field576 = 8388607;
                                                      } else {
                                                         class70.field576 = (int)(var17.getTime() / 86400000L - 11745L);
                                                      }

                                                      var16 = true;
                                                   }
                                                }
                                             }

                                             if (var16) {
                                                Client.method2323(50);
                                             }

                                             return;
                                          }
                                       }
                                    } else {
                                       var10 = 180 + field434 - 80;
                                       var11 = 321;
                                       if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                          class45.method1843(Client.method2209("secure", true) + "m=dob/set_dob.ws", true, false);
                                          method2098(class364.field4279, class364.field4280, class364.field4281);
                                          method6370(6);
                                          return;
                                       }

                                       var10 = 80 + 180 + field434;
                                       if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                          class314.method5805(true);
                                       }
                                    }
                                 } else if (field439 == 8) {
                                    var10 = field434 + 180 - 80;
                                    var33 = 321;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class45.method1843("https://www.jagex.com/terms/privacy", true, false);
                                       method2098(class364.field4279, class364.field4280, class364.field4281);
                                       method6370(6);
                                       return;
                                    }

                                    var10 = 80 + field434 + 180;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class314.method5805(true);
                                    }
                                 } else if (9 == field439) {
                                    var10 = 180 + field434;
                                    var33 = 311;
                                    if (84 == var29.field2371 || var29.field2371 == 13 || var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       method5882(false);
                                    }
                                 } else if (10 == field439) {
                                    var10 = 180 + field434;
                                    var33 = 209;
                                    if (84 == var29.field2371 || var6 == 1 && var7 >= var10 - 109 && var7 <= var10 + 109 && var8 >= var33 && var8 <= var33 + 68) {
                                       method2098(class364.field4316, class364.field4249, class364.field4292);
                                       Client.field1472 = class500.field5044;
                                       Client.method6480(false);
                                       Client.method2323(20);
                                    }
                                 } else if (field439 == 12) {
                                    var10 = class81.field718;
                                    var33 = 233;
                                    var12 = var2.method7162(0, 30, class364.field4311, var10, var33);
                                    class453 var35 = var2.method7162(32, 32, class364.field4311, var10, var33);
                                    class453 var36 = var2.method7162(70, 34, class364.field4311, var10, var33);
                                    var11 = var33 + 17;
                                    class453 var37 = var2.method7162(0, 34, class364.field4312, var10, var11);
                                    if (var6 == 1) {
                                       if (var12.method7938(var7, var8)) {
                                          class45.method1843("https://www.jagex.com/terms", true, false);
                                       } else if (var35.method7938(var7, var8)) {
                                          class45.method1843("https://www.jagex.com/terms/privacy", true, false);
                                       } else if (var36.method7938(var7, var8) || var37.method7938(var7, var8)) {
                                          class45.method1843("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                                       }
                                    }

                                    var10 = class81.field718 - 80;
                                    var33 = 311;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class141.field1307.method1632(Client.field1437);
                                       method5882(true);
                                    }

                                    var10 = class81.field718 + 80;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       field439 = 13;
                                    }
                                 } else if (field439 == 13) {
                                    var10 = class81.field718;
                                    var33 = 321;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       method5882(true);
                                    }
                                 } else if (field439 == 14) {
                                    String var39 = "";
                                    switch (field437) {
                                       case 0:
                                          var39 = "https://secure.runescape.com/m=offence-appeal/account-history";
                                          break;
                                       case 1:
                                          var39 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                                          break;
                                       case 2:
                                          var39 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                          break;
                                       default:
                                          class314.method5805(false);
                                    }

                                    var11 = 180 + field434;
                                    var32 = 276;
                                    if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20) {
                                       class45.method1843(var39, true, false);
                                       method2098(class364.field4279, class364.field4280, class364.field4281);
                                       method6370(6);
                                       return;
                                    }

                                    var11 = 180 + field434;
                                    var32 = 326;
                                    if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20) {
                                       class314.method5805(false);
                                    }
                                 } else if (24 == field439) {
                                    var10 = field434 + 180;
                                    var33 = 301;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       method5882(false);
                                    }
                                 } else if (field439 == 32) {
                                    var10 = 180 + field434 - 80;
                                    var33 = 321;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class45.method1843(Client.method2209("secure", true) + "m=dob/set_dob.ws", true, false);
                                       method2098(class364.field4279, class364.field4280, class364.field4281);
                                       method6370(6);
                                       return;
                                    }

                                    var10 = 80 + field434 + 180;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class314.method5805(true);
                                    }
                                 } else if (33 == field439) {
                                    var10 = field434 + 180;
                                    var33 = 276;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class45.method1843(class364.field4330, true, false);
                                    }

                                    var10 = field434 + 180;
                                    var33 = 326;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class314.method5805(true);
                                    }
                                 }
                              } else {
                                 while(true) {
                                    do {
                                       if (!var29.method4109()) {
                                          var30 = 321;
                                          if (var6 == 1 && var8 >= var30 - 20 && var8 <= var30 + 20) {
                                             class314.method5805(true);
                                          }

                                          return;
                                       }
                                    } while(84 != var29.field2371 && var29.field2371 != 13);

                                    class314.method5805(true);
                                 }
                              }
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   static boolean method8030(Date var0) {
      Date var2 = method3791();
      return var0.after(var2);
   }

   static Date method3791() {
      Calendar var1 = Calendar.getInstance();
      var1.set(2, 0);
      var1.set(5, 1);
      var1.set(1, 1900);
      return var1.getTime();
   }

   static Date method91() throws ParseException {
      SimpleDateFormat var1 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
      var1.setLenient(false);
      StringBuilder var2 = new StringBuilder();
      String[] var3 = field461;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         String var5 = var3[var4];
         if (null == var5) {
            method6370(7);
            method2098("Date not valid.", "Please ensure all characters are populated.", "");
            return null;
         }

         var2.append(var5);
      }

      var2.append("12");
      return var1.parse(var2.toString());
   }

   static int method2469(int var0, int var1) {
      for(int var3 = 0; var3 < 8; ++var3) {
         if (var1 <= var0 + 30) {
            return var3;
         }

         var0 += 30;
         var0 += var3 != 1 && var3 != 3 ? 5 : 20;
      }

      return 0;
   }

   static boolean method1162(char var0) {
      for(int var2 = 0; var2 < field453.length(); ++var2) {
         if (var0 == field453.charAt(var2)) {
            return true;
         }
      }

      return false;
   }

   static void method5882(boolean var0) {
      byte var2 = 0;
      boolean var3 = class141.field1307.method1687() >= Client.field1437;
      if (!var3) {
         var2 = 12;
      } else if (class124.field1180.method2695() || class124.field1180.method3185() || class124.field1180.method2884()) {
         var2 = 10;
      }

      method6370(var2);
      if (var0) {
         field441 = "";
         field445 = "";
         class428.field4629 = 0;
         field466 = "";
      }

      if (field441 == null || field441.length() <= 0) {
         if (class141.field1307.method1631() != null) {
            field441 = class141.field1307.method1631();
            Client.field1483 = true;
         } else {
            Client.field1483 = false;
         }
      }

      method7296();
   }

   static void method1467() {
      field441 = field441.trim();
      if (field441.length() == 0) {
         method2098(class364.field4282, class364.field4242, class364.field4218);
      } else {
         long var2;
         try {
            URL var4 = new URL(Client.method2209("services", false) + "m=accountappeal/login.ws");
            URLConnection var5 = var4.openConnection();
            var5.setRequestProperty("connection", "close");
            var5.setDoInput(true);
            var5.setDoOutput(true);
            var5.setConnectTimeout(5000);
            OutputStreamWriter var6 = new OutputStreamWriter(var5.getOutputStream());
            var6.write("data1=req");
            var6.flush();
            InputStream var7 = var5.getInputStream();
            class519 var8 = new class519(new byte[1000]);

            while(true) {
               int var9 = var7.read(var8.field5127, var8.field5129, 1000 - var8.field5129);
               if (var9 == -1) {
                  var8.field5129 = 0;
                  long var29 = var8.method8755();
                  var2 = var29;
                  break;
               }

               var8.field5129 += var9;
               if (var8.field5129 >= 1000) {
                  var2 = 0L;
                  break;
               }
            }
         } catch (Exception var25) {
            var2 = 0L;
         }

         byte var1;
         if (var2 == 0L) {
            var1 = 5;
         } else {
            String var27 = field441;
            Random var28 = new Random();
            class519 var30 = new class519(128);
            class519 var10 = new class519(128);
            int[] var11 = new int[]{var28.nextInt(), var28.nextInt(), (int)(var2 >> 32), (int)var2};
            var30.method8731(10);

            int var12;
            for(var12 = 0; var12 < 4; ++var12) {
               var30.method8734(var28.nextInt());
            }

            var30.method8734(var11[0]);
            var30.method8734(var11[1]);
            var30.method8736(var2);
            var30.method8736(0L);

            for(var12 = 0; var12 < 4; ++var12) {
               var30.method8734(var28.nextInt());
            }

            var30.method8830(class68.field530, class68.field531);
            var10.method8731(10);

            for(var12 = 0; var12 < 3; ++var12) {
               var10.method8734(var28.nextInt());
            }

            var10.method8736(var28.nextLong());
            var10.method8735(var28.nextLong());
            Client.method4735(var10);
            var10.method8736(var28.nextLong());
            var10.method8830(class68.field530, class68.field531);
            var12 = class519.method8713(var27);
            if (var12 % 8 != 0) {
               var12 += 8 - var12 % 8;
            }

            class519 var13 = new class519(var12);
            var13.method8738(var27);
            var13.field5129 = var12;
            var13.method8771(var11);
            class519 var14 = new class519(var10.field5129 + var30.field5129 + 5 + var13.field5129);
            var14.method8731(2);
            var14.method8731(var30.field5129);
            var14.method8741(var30.field5127, 0, var30.field5129);
            var14.method8731(var10.field5129);
            var14.method8741(var10.field5127, 0, var10.field5129);
            var14.method8732(var13.field5129);
            var14.method8741(var13.field5127, 0, var13.field5129);
            String var15 = class379.method6576(var14.field5127);

            byte var26;
            try {
               URL var16 = new URL(Client.method2209("services", false) + "m=accountappeal/login.ws");
               URLConnection var17 = var16.openConnection();
               var17.setDoInput(true);
               var17.setDoOutput(true);
               var17.setConnectTimeout(5000);
               OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
               var18.write("data2=" + class532.method8695(var15) + "&dest=" + class532.method8695("passwordchoice.ws"));
               var18.flush();
               InputStream var19 = var17.getInputStream();
               var14 = new class519(new byte[1000]);

               while(true) {
                  int var20 = var19.read(var14.field5127, var14.field5129, 1000 - var14.field5129);
                  if (var20 == -1) {
                     var18.close();
                     var19.close();
                     String var31 = new String(var14.field5127);
                     if (var31.startsWith("OFFLINE")) {
                        var26 = 4;
                     } else if (var31.startsWith("WRONG")) {
                        var26 = 7;
                     } else if (var31.startsWith("RELOAD")) {
                        var26 = 3;
                     } else if (var31.startsWith("Not permitted for social network accounts.")) {
                        var26 = 6;
                     } else {
                        var14.method8834(var11);

                        while(var14.field5129 > 0 && var14.field5127[var14.field5129 - 1] == 0) {
                           --var14.field5129;
                        }

                        var31 = new String(var14.field5127, 0, var14.field5129);
                        boolean var21;
                        if (var31 == null) {
                           var21 = false;
                        } else {
                           label100: {
                              try {
                                 new URL(var31);
                              } catch (MalformedURLException var23) {
                                 var21 = false;
                                 break label100;
                              }

                              var21 = true;
                           }
                        }

                        if (var21) {
                           class45.method1843(var31, true, false);
                           var26 = 2;
                        } else {
                           var26 = 5;
                        }
                     }
                     break;
                  }

                  var14.field5129 += var20;
                  if (var14.field5129 >= 1000) {
                     var26 = 5;
                     break;
                  }
               }
            } catch (Throwable var24) {
               var24.printStackTrace();
               var26 = 5;
            }

            var1 = var26;
         }

         switch (var1) {
            case 2:
               method2098(class364.field4031, class364.field4286, class364.field4157);
               method6370(6);
               break;
            case 3:
               method2098(class364.field4288, class364.field4289, class364.field4290);
               break;
            case 4:
               method2098(class364.field4235, class364.field4219, class364.field4303);
               break;
            case 5:
               method2098(class364.field4294, class364.field4295, class364.field4296);
               break;
            case 6:
               method2098(class364.field4297, class364.field4298, class364.field4299);
               break;
            case 7:
               method2098(class364.field4300, class364.field4184, class364.field4302);
         }

      }
   }

   static void method7420(class393 var0, class393 var1, class393 var2) {
      field447 = (class343.field3838 - 765) / 2;
      field434 = field447 + 202;
      class81.field718 = field434 + 180;
      if (field457) {
         method4751(var0, var1);
      } else {
         class406.field4516.method9034(field447, 0);
         class53.field390.method9034(field447 + 382, 0);
         field465.method9316(field447 + 382 - field465.field5216 / 2, 18);
         int var4;
         int var5;
         if (0 == Client.field1728 || Client.field1728 == 5) {
            var4 = 20;
            var0.method7166(class364.field4199, field434 + 180, 245 - var4, 16777215, -1);
            var5 = 253 - var4;
            class535.method9223(field434 + 180 - 152, var5, 304, 34, 9179409);
            class535.method9223(180 + field434 - 151, var5 + 1, 302, 32, 0);
            class535.method9231(180 + field434 - 150, var5 + 2, field450 * 3, 30, 9179409);
            class535.method9231(field450 * 3 + (field434 + 180 - 150), var5 + 2, 300 - field450 * 3, 30, 0);
            var0.method7166(field436, field434 + 180, 276 - var4, 16777215, -1);
         }

         String var6;
         String var8;
         String var9;
         int var10;
         char[] var11;
         int var12;
         short var14;
         if (20 == Client.field1728) {
            field430.method9316(180 + field434 - field430.field5216 / 2, 271 - field430.field5214 / 2);
            var4 = 201;
            var0.method7166(field454, field434 + 180, var4, 16776960, 0);
            var4 += 15;
            var0.method7166(field435, 180 + field434, var4, 16776960, 0);
            var4 += 15;
            var0.method7166(field443, field434 + 180, var4, 16776960, 0);
            var4 += 15;
            var4 += 7;
            if (field439 != 4 && field439 != 10) {
               var0.method7163(class364.field4257, field434 + 180 - 110, var4, 16777215, 0);
               var14 = 200;

               for(var6 = method6(); var0.method7225(var6) > var14; var6 = var6.substring(0, var6.length() - 1)) {
               }

               var0.method7163(class407.method7161(var6), 180 + field434 - 70, var4, 16777215, 0);
               var4 += 15;
               var8 = field445;
               var10 = var8.length();
               var11 = new char[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var11[var12] = '*';
               }

               var9 = new String(var11);

               for(var9 = var9; var0.method7225(var9) > var14; var9 = var9.substring(1)) {
               }

               var0.method7163(class364.field4258 + var9, 180 + field434 - 108, var4, 16777215, 0);
               var4 += 15;
            }
         }

         if (Client.field1728 == 10 || Client.field1728 == 11 || 50 == Client.field1728) {
            field430.method9316(field434, 171);
            short var15;
            int var16;
            if (0 == field439) {
               var15 = 251;
               var0.method7166(class364.field4260, field434 + 180, var15, 16776960, 0);
               var4 = var15 + 30;
               var5 = field434 + 180 - 80;
               var16 = 291;
               field431.method9316(var5 - 73, var16 - 20);
               var0.method7238(class364.field4261, var5 - 73, var16 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var5 = 180 + field434 + 80;
               field431.method9316(var5 - 73, var16 - 20);
               var0.method7238(class364.field4262, var5 - 73, var16 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (1 == field439) {
               var0.method7166(field440, 180 + field434, 201, 16776960, 0);
               var15 = 236;
               var0.method7166(field454, field434 + 180, var15, 16777215, 0);
               var4 = var15 + 15;
               var0.method7166(field435, 180 + field434, var4, 16777215, 0);
               var4 += 15;
               var0.method7166(field443, 180 + field434, var4, 16777215, 0);
               var4 += 15;
               var5 = field434 + 180 - 80;
               var16 = 321;
               field431.method9316(var5 - 73, var16 - 20);
               var0.method7166(class364.field4227, var5, var16 + 5, 16777215, 0);
               var5 = 80 + field434 + 180;
               field431.method9316(var5 - 73, var16 - 20);
               var0.method7166(class364.field4177, var5, var16 + 5, 16777215, 0);
            } else {
               short var13;
               class537 var23;
               if (2 == field439) {
                  var15 = 201;
                  var0.method7166(field454, class81.field718, var15, 16776960, 0);
                  var4 = var15 + 15;
                  var0.method7166(field435, class81.field718, var4, 16776960, 0);
                  var4 += 15;
                  var0.method7166(field443, class81.field718, var4, 16776960, 0);
                  var4 += 15;
                  var4 += 7;
                  var0.method7163(class364.field4257, class81.field718 - 110, var4, 16777215, 0);
                  var14 = 200;

                  for(var6 = method6(); var0.method7225(var6) > var14; var6 = var6.substring(1)) {
                  }

                  var0.method7163(class407.method7161(var6) + (0 == field452 & Client.field1445 % 40 < 20 ? class90.method5890(16776960) + class90.field832 : ""), class81.field718 - 70, var4, 16777215, 0);
                  var4 += 15;
                  var8 = field445;
                  var10 = var8.length();
                  var11 = new char[var10];

                  for(var12 = 0; var12 < var10; ++var12) {
                     var11[var12] = '*';
                  }

                  var9 = new String(var11);

                  for(var9 = var9; var0.method7225(var9) > var14; var9 = var9.substring(1)) {
                  }

                  var0.method7163(class364.field4258 + var9 + (field452 == 1 & Client.field1445 % 40 < 20 ? class90.method5890(16776960) + class90.field832 : ""), class81.field718 - 108, var4, 16777215, 0);
                  var4 += 15;
                  var15 = 277;
                  var10 = class81.field718 + -117;
                  var23 = method529(Client.field1483, field463);
                  var23.method9316(var10, var15);
                  var10 += var23.field5216 + 5;
                  var1.method7163(class364.field4265, var10, var15 + 13, 16776960, 0);
                  var10 = 24 + class81.field718;
                  var23 = method529(class141.field1307.method1615(), field455);
                  var23.method9316(var10, var15);
                  var10 += var23.field5216 + 5;
                  var1.method7163(class364.field4266, var10, var15 + 13, 16776960, 0);
                  var4 = var15 + 15;
                  var12 = class81.field718 - 80;
                  var13 = 321;
                  field431.method9316(var12 - 73, var13 - 20);
                  var0.method7166(class364.field4263, var12, var13 + 5, 16777215, 0);
                  var12 = class81.field718 + 80;
                  field431.method9316(var12 - 73, var13 - 20);
                  var0.method7166(class364.field4177, var12, var13 + 5, 16777215, 0);
                  var15 = 357;
                  switch (field438) {
                     case 2:
                        class41.field239 = class364.field4278;
                        break;
                     default:
                        class41.field239 = class364.field4276;
                  }

                  class360.field3976 = new class453(class81.field718, var15, var1.method7225(class41.field239), 11);
                  class318.field3508 = new class453(class81.field718, var15, var1.method7225(class364.field4197), 11);
                  var1.method7166(class41.field239, class81.field718, var15, 16777215, 0);
               } else if (3 == field439) {
                  var15 = 201;
                  var0.method7166(class364.field4038, 180 + field434, var15, 16776960, 0);
                  var4 = var15 + 20;
                  var1.method7166(class364.field4268, field434 + 180, var4, 16776960, 0);
                  var4 += 20;
                  var1.method7166(class364.field4165, 180 + field434, var4, 16776960, 0);
                  var4 += 15;
                  var5 = field434 + 180;
                  var16 = 276;
                  field431.method9316(var5 - 73, var16 - 20);
                  var2.method7166(class364.field4270, var5, var16 + 5, 16777215, 0);
                  var5 = field434 + 180;
                  var16 = 326;
                  field431.method9316(var5 - 73, var16 - 20);
                  var2.method7166(class364.field4220, var5, var16 + 5, 16777215, 0);
               } else if (field439 == 4) {
                  var0.method7166(class364.field4246, field434 + 180, 201, 16776960, 0);
                  var15 = 236;
                  var0.method7166(field454, 180 + field434, var15, 16777215, 0);
                  var4 = var15 + 15;
                  var0.method7166(field435, 180 + field434, var4, 16777215, 0);
                  var4 += 15;
                  var0.method7166(field443, field434 + 180, var4, 16777215, 0);
                  var4 += 15;
                  var6 = class364.field4149;
                  var8 = field466;
                  var10 = var8.length();
                  var11 = new char[var10];

                  for(var12 = 0; var12 < var10; ++var12) {
                     var11[var12] = '*';
                  }

                  var9 = new String(var11);
                  var0.method7163(var6 + var9 + (Client.field1445 % 40 < 20 ? class90.method5890(16776960) + class90.field832 : ""), 180 + field434 - 108, var4, 16777215, 0);
                  var4 -= 8;
                  var0.method7163(class364.field4144, 180 + field434 - 9, var4, 16776960, 0);
                  var4 += 15;
                  var0.method7163(class364.field4103, 180 + field434 - 9, var4, 16776960, 0);
                  int var22 = field434 + 180 - 9 + var0.method7225(class364.field4103) + 15;
                  var10 = var4 - var0.field4527;
                  if (field451) {
                     var23 = class20.field112;
                  } else {
                     var23 = class244.field2693;
                  }

                  var23.method9316(var22, var10);
                  var4 += 15;
                  var12 = field434 + 180 - 80;
                  var13 = 321;
                  field431.method9316(var12 - 73, var13 - 20);
                  var0.method7166(class364.field4227, var12, var13 + 5, 16777215, 0);
                  var12 = 80 + 180 + field434;
                  field431.method9316(var12 - 73, var13 - 20);
                  var0.method7166(class364.field4177, var12, var13 + 5, 16777215, 0);
                  var1.method7166(class364.field4202, field434 + 180, var13 + 36, 255, 0);
               } else {
                  int var20;
                  if (5 == field439) {
                     var0.method7166(class364.field4272, 180 + field434, 201, 16776960, 0);
                     var15 = 221;
                     var2.method7166(field454, 180 + field434, var15, 16776960, 0);
                     var4 = var15 + 15;
                     var2.method7166(field435, 180 + field434, var4, 16776960, 0);
                     var4 += 15;
                     var2.method7166(field443, field434 + 180, var4, 16776960, 0);
                     var4 += 15;
                     var4 += 14;
                     var0.method7163(class364.field4273, field434 + 180 - 145, var4, 16777215, 0);
                     var14 = 174;

                     for(var6 = method6(); var0.method7225(var6) > var14; var6 = var6.substring(1)) {
                     }

                     var0.method7163(class407.method7161(var6) + (Client.field1445 % 40 < 20 ? class90.method5890(16776960) + class90.field832 : ""), field434 + 180 - 34, var4, 16777215, 0);
                     var4 += 15;
                     int var7 = 180 + field434 - 80;
                     var20 = 321;
                     field431.method9316(var7 - 73, var20 - 20);
                     var0.method7166(class364.field4274, var7, var20 + 5, 16777215, 0);
                     var7 = 80 + field434 + 180;
                     field431.method9316(var7 - 73, var20 - 20);
                     var0.method7166(class364.field4275, var7, var20 + 5, 16777215, 0);
                     var20 = 356;
                     var1.method7166(class364.field4197, class81.field718, var20, 268435455, 0);
                  } else if (6 == field439) {
                     var15 = 201;
                     var0.method7166(field454, 180 + field434, var15, 16776960, 0);
                     var4 = var15 + 15;
                     var0.method7166(field435, 180 + field434, var4, 16776960, 0);
                     var4 += 15;
                     var0.method7166(field443, 180 + field434, var4, 16776960, 0);
                     var4 += 15;
                     var5 = field434 + 180;
                     var16 = 321;
                     field431.method9316(var5 - 73, var16 - 20);
                     var0.method7166(class364.field4275, var5, var16 + 5, 16777215, 0);
                  } else if (7 == field439) {
                     if (class76.field635 && !Client.field1440) {
                        var15 = 201;
                        var0.method7166(field454, class81.field718, var15, 16776960, 0);
                        var4 = var15 + 15;
                        var0.method7166(field435, class81.field718, var4, 16776960, 0);
                        var4 += 15;
                        var0.method7166(field443, class81.field718, var4, 16776960, 0);
                        var5 = class81.field718 - 150;
                        var4 += 10;

                        for(var16 = 0; var16 < 8; ++var16) {
                           field431.method9326(var5, var4, 30, 40);
                           boolean var17 = field446 == var16 & Client.field1445 % 40 < 20;
                           var0.method7163((field461[var16] == null ? "" : field461[var16]) + (var17 ? class90.method5890(16776960) + class90.field832 : ""), var5 + 10, var4 + 27, 16777215, 0);
                           if (var16 != 1 && var16 != 3) {
                              var5 += 35;
                           } else {
                              var5 += 50;
                              var0.method7163(class407.method7161("/"), var5 - 13, var4 + 27, 16777215, 0);
                           }
                        }

                        var16 = class81.field718 - 80;
                        short var18 = 321;
                        field431.method9316(var16 - 73, var18 - 20);
                        var0.method7166("Submit", var16, var18 + 5, 16777215, 0);
                        var16 = 80 + class81.field718;
                        field431.method9316(var16 - 73, var18 - 20);
                        var0.method7166(class364.field4177, var16, var18 + 5, 16777215, 0);
                     } else {
                        var15 = 216;
                        var0.method7166(class364.field4041, 180 + field434, var15, 16776960, 0);
                        var4 = var15 + 15;
                        var2.method7166(class364.field4304, field434 + 180, var4, 16776960, 0);
                        var4 += 15;
                        var2.method7166(class364.field4305, 180 + field434, var4, 16776960, 0);
                        var4 += 15;
                        var5 = field434 + 180 - 80;
                        var16 = 321;
                        field431.method9316(var5 - 73, var16 - 20);
                        var0.method7166(class364.field4109, var5, var16 + 5, 16777215, 0);
                        var5 = field434 + 180 + 80;
                        field431.method9316(var5 - 73, var16 - 20);
                        var0.method7166(class364.field4275, var5, var16 + 5, 16777215, 0);
                     }
                  } else {
                     short var24;
                     if (8 == field439) {
                        var15 = 216;
                        var0.method7166(class364.field4159, 180 + field434, var15, 16776960, 0);
                        var4 = var15 + 15;
                        var2.method7166(class364.field4160, 180 + field434, var4, 16776960, 0);
                        var4 += 15;
                        var2.method7166(class364.field4161, field434 + 180, var4, 16776960, 0);
                        var4 += 15;
                        var5 = 180 + field434 - 80;
                        var24 = 321;
                        field431.method9316(var5 - 73, var24 - 20);
                        var0.method7166(class364.field4183, var5, var24 + 5, 16777215, 0);
                        var5 = 80 + 180 + field434;
                        field431.method9316(var5 - 73, var24 - 20);
                        var0.method7166(class364.field4275, var5, var24 + 5, 16777215, 0);
                     } else if (9 == field439) {
                        var15 = 221;
                        var0.method7166(field454, 180 + field434, var15, 16776960, 0);
                        var4 = var15 + 25;
                        var0.method7166(field435, 180 + field434, var4, 16776960, 0);
                        var4 += 25;
                        var0.method7166(field443, field434 + 180, var4, 16776960, 0);
                        var5 = 180 + field434;
                        var24 = 311;
                        field431.method9316(var5 - 73, var24 - 20);
                        var0.method7166(class364.field4270, var5, var24 + 5, 16777215, 0);
                     } else if (10 == field439) {
                        var4 = 180 + field434;
                        var14 = 209;
                        var0.method7166(class364.field4260, field434 + 180, var14, 16776960, 0);
                        var5 = var14 + 20;
                        field432.method9316(var4 - 109, var5);
                        if (field448.isEmpty()) {
                           class354.field3917.method9316(var4 - 48, var5 + 18);
                        } else {
                           class354.field3917.method9316(var4 - 48, var5 + 5);
                           var0.method7166(field448, var4, var5 + 68 - 15, 16776960, 0);
                        }
                     } else if (field439 == 12) {
                        var4 = class81.field718;
                        var14 = 216;
                        var2.method7166(class364.field4310, var4, var14, 16777215, 0);
                        var5 = var14 + 17;
                        var2.method7166(class364.field4311, var4, var5, 16777215, 0);
                        var5 += 17;
                        var2.method7166(class364.field4312, var4, var5, 16777215, 0);
                        var5 += 17;
                        var2.method7166(class364.field4313, var4, var5, 16777215, 0);
                        var4 = class81.field718 - 80;
                        var14 = 311;
                        field431.method9316(var4 - 73, var14 - 20);
                        var0.method7166(class364.field4207, var4, var14 + 5, 16777215, 0);
                        var4 = 80 + class81.field718;
                        field431.method9316(var4 - 73, var14 - 20);
                        var0.method7166(class364.field4317, var4, var14 + 5, 16777215, 0);
                     } else if (field439 == 13) {
                        var15 = 231;
                        var2.method7166(class364.field4314, field434 + 180, var15, 16777215, 0);
                        var4 = var15 + 20;
                        var2.method7166(class364.field4315, 180 + field434, var4, 16777215, 0);
                        var5 = field434 + 180;
                        var15 = 311;
                        field431.method9316(var5 - 73, var15 - 20);
                        var0.method7166(class364.field4275, var5, var15 + 5, 16777215, 0);
                     } else if (field439 == 14) {
                        var15 = 201;
                        String var26 = "";
                        var6 = "";
                        String var19 = "";
                        switch (field437) {
                           case 0:
                              var26 = class364.field4075;
                              var6 = class364.field4267;
                              var19 = class364.field4077;
                              break;
                           case 1:
                              var26 = class364.field4114;
                              var6 = class364.field4022;
                              var19 = class364.field4116;
                              break;
                           case 2:
                              var26 = class364.field4030;
                              var6 = class364.field4085;
                              var19 = class364.field4269;
                              break;
                           default:
                              class314.method5805(false);
                        }

                        var0.method7166(var26, 180 + field434, var15, 16776960, 0);
                        var4 = var15 + 20;
                        var0.method7166(var6, 180 + field434, var4, 16776960, 0);
                        var4 += 20;
                        var0.method7166(var19, 180 + field434, var4, 16776960, 0);
                        var20 = 180 + field434;
                        short var25 = 276;
                        field431.method9316(var20 - 73, var25 - 20);
                        if (field437 == 1) {
                           var0.method7166(class364.field4059, var20, var25 + 5, 16777215, 0);
                        } else {
                           var0.method7166(class364.field4214, var20, var25 + 5, 16777215, 0);
                        }

                        var20 = field434 + 180;
                        var25 = 326;
                        field431.method9316(var20 - 73, var25 - 20);
                        var0.method7166(class364.field4275, var20, var25 + 5, 16777215, 0);
                     } else if (field439 == 24) {
                        var15 = 221;
                        var0.method7166(field454, field434 + 180, var15, 16777215, 0);
                        var4 = var15 + 15;
                        var0.method7166(field435, 180 + field434, var4, 16777215, 0);
                        var4 += 15;
                        var0.method7166(field443, 180 + field434, var4, 16777215, 0);
                        var4 += 15;
                        var5 = 180 + field434;
                        var24 = 301;
                        field431.method9316(var5 - 73, var24 - 20);
                        var0.method7166(class364.field4239, var5, var24 + 5, 16777215, 0);
                     } else if (32 == field439) {
                        var15 = 216;
                        var0.method7166(class364.field4041, field434 + 180, var15, 16776960, 0);
                        var4 = var15 + 15;
                        var2.method7166(class364.field4304, field434 + 180, var4, 16776960, 0);
                        var4 += 15;
                        var2.method7166(class364.field4305, 180 + field434, var4, 16776960, 0);
                        var4 += 15;
                        var5 = 180 + field434 - 80;
                        var24 = 321;
                        field431.method9316(var5 - 73, var24 - 20);
                        var0.method7166(class364.field4109, var5, var24 + 5, 16777215, 0);
                        var5 = field434 + 180 + 80;
                        field431.method9316(var5 - 73, var24 - 20);
                        var0.method7166(class364.field4275, var5, var24 + 5, 16777215, 0);
                     } else if (33 == field439) {
                        var15 = 201;
                        var0.method7166(field454, field434 + 180, var15, 16776960, 0);
                        var4 = var15 + 20;
                        var1.method7166(field435, field434 + 180, var4, 16776960, 0);
                        var4 += 20;
                        var1.method7166(field443, field434 + 180, var4, 16776960, 0);
                        var4 += 15;
                        var5 = field434 + 180;
                        var24 = 276;
                        field431.method9316(var5 - 73, var24 - 20);
                        var2.method7166(class364.field4329, var5, var24 + 5, 16777215, 0);
                        var5 = field434 + 180;
                        var24 = 326;
                        field431.method9316(var5 - 73, var24 - 20);
                        var2.method7166(class364.field4275, var5, var24 + 5, 16777215, 0);
                     }
                  }
               }
            }
         }

         if (Client.field1728 >= 10) {
            int[] var28 = new int[4];
            class535.method9240(var28);
            class535.method9304(field447, 0, 765 + field447, class488.field4948);
            class169.field1805.method2029(field447 - 22, Client.field1445);
            class169.field1805.method2029(765 + field447 + 22 - 128, Client.field1445);
            class535.method9226(var28);
         }

         class311.field3469[class141.field1307.method1617() ? 1 : 0].method9316(765 + field447 - 40, 463);
         if (Client.field1728 > 5 && class384.field4403 == class63.field496) {
            if (null != class467.field4793) {
               var4 = 5 + field447;
               var14 = 463;
               byte var27 = 100;
               byte var21 = 35;
               class467.field4793.method9316(var4, var14);
               var0.method7166(class364.field4058 + " " + Client.field1432, var4 + var27 / 2, var21 / 2 + var14 - 2, 16777215, 0);
               if (class70.field563 != null) {
                  var1.method7166(class364.field4034, var4 + var27 / 2, 12 + var14 + var21 / 2, 16777215, 0);
               } else {
                  var1.method7166(class364.field4328, var27 / 2 + var4, 12 + var21 / 2 + var14, 16777215, 0);
               }
            } else {
               class467.field4793 = class538.method8011(class379.field4382, "sl_button", "");
            }
         }

      }
   }

   static void method2098(String var0, String var1, String var2) {
      field454 = var0;
      field435 = var1;
      field443 = var2;
   }

   static void method4751(class393 var0, class393 var1) {
      int var5;
      int var6;
      if (null == class131.field1229) {
         class363 var4 = class379.field4382;
         class523[] var3;
         if (!var4.method6401("sl_back", "")) {
            var3 = null;
         } else {
            var5 = var4.method6395("sl_back");
            var6 = var4.method6400(var5, "");
            var3 = class538.method8028(var4, var5, var6);
         }

         class131.field1229 = var3;
      }

      if (class307.field3350 == null) {
         class307.field3350 = class538.method8431(class379.field4382, "sl_flags", "");
      }

      if (class32.field158 == null) {
         class32.field158 = class538.method8431(class379.field4382, "sl_arrows", "");
      }

      if (null == class223.field2455) {
         class223.field2455 = class538.method8431(class379.field4382, "sl_stars", "");
      }

      if (class38.field207 == null) {
         class38.field207 = class538.method8011(class379.field4382, "leftarrow", "");
      }

      if (class475.field4843 == null) {
         class475.field4843 = class538.method8011(class379.field4382, "rightarrow", "");
      }

      class535.method9231(field447, 23, 765, 480, 0);
      class535.method9225(field447, 0, 125, 23, 12425273, 9135624);
      class535.method9225(125 + field447, 0, 640, 23, 5197647, 2697513);
      var0.method7166(class364.field4225, 62 + field447, 15, 0, -1);
      if (null != class223.field2455) {
         class223.field2455[1].method9316(field447 + 140, 1);
         var1.method7163(class364.field4176, 152 + field447, 10, 16777215, -1);
         class223.field2455[0].method9316(field447 + 140, 12);
         var1.method7163(class364.field4320, 152 + field447, 21, 16777215, -1);
      }

      if (class32.field158 != null) {
         int var23 = field447 + 280;
         if (class70.field566[0] == 0 && 0 == class70.field578[0]) {
            class32.field158[2].method9316(var23, 4);
         } else {
            class32.field158[0].method9316(var23, 4);
         }

         if (class70.field566[0] == 0 && 1 == class70.field578[0]) {
            class32.field158[3].method9316(var23 + 15, 4);
         } else {
            class32.field158[1].method9316(var23 + 15, 4);
         }

         var0.method7163(class364.field4321, var23 + 32, 17, 16777215, -1);
         int var25 = 390 + field447;
         if (class70.field566[0] == 1 && class70.field578[0] == 0) {
            class32.field158[2].method9316(var25, 4);
         } else {
            class32.field158[0].method9316(var25, 4);
         }

         if (class70.field566[0] == 1 && class70.field578[0] == 1) {
            class32.field158[3].method9316(var25 + 15, 4);
         } else {
            class32.field158[1].method9316(var25 + 15, 4);
         }

         var0.method7163(class364.field4322, var25 + 32, 17, 16777215, -1);
         var5 = 500 + field447;
         if (class70.field566[0] == 2 && 0 == class70.field578[0]) {
            class32.field158[2].method9316(var5, 4);
         } else {
            class32.field158[0].method9316(var5, 4);
         }

         if (class70.field566[0] == 2 && 1 == class70.field578[0]) {
            class32.field158[3].method9316(var5 + 15, 4);
         } else {
            class32.field158[1].method9316(var5 + 15, 4);
         }

         var0.method7163(class364.field4323, var5 + 32, 17, 16777215, -1);
         var6 = field447 + 610;
         if (class70.field566[0] == 3 && class70.field578[0] == 0) {
            class32.field158[2].method9316(var6, 4);
         } else {
            class32.field158[0].method9316(var6, 4);
         }

         if (class70.field566[0] == 3 && 1 == class70.field578[0]) {
            class32.field158[3].method9316(var6 + 15, 4);
         } else {
            class32.field158[1].method9316(var6 + 15, 4);
         }

         var0.method7163(class364.field4020, var6 + 32, 17, 16777215, -1);
      }

      class535.method9231(708 + field447, 4, 50, 16, 0);
      var1.method7166(class364.field4177, field447 + 708 + 25, 16, 16777215, -1);
      field456 = -1;
      if (class131.field1229 != null) {
         byte var24 = 88;
         byte var26 = 19;
         var5 = 765 / (var24 + 1) - 1;
         var6 = 480 / (var26 + 1);

         int var7;
         int var8;
         do {
            var7 = var6;
            var8 = var5;
            if (var6 * (var5 - 1) >= class70.field569) {
               --var5;
            }

            if ((var6 - 1) * var5 >= class70.field569) {
               --var6;
            }

            if ((var6 - 1) * var5 >= class70.field569) {
               --var6;
            }
         } while(var6 != var7 || var5 != var8);

         var7 = (765 - var24 * var5) / (var5 + 1);
         if (var7 > 5) {
            var7 = 5;
         }

         var8 = (480 - var26 * var6) / (var6 + 1);
         if (var8 > 5) {
            var8 = 5;
         }

         int var9 = (765 - var24 * var5 - (var5 - 1) * var7) / 2;
         int var10 = (480 - var26 * var6 - (var6 - 1) * var8) / 2;
         int var11 = (var6 + class70.field569 - 1) / var6;
         field458 = var11 - var5;
         if (null != class38.field207 && field449 > 0) {
            class38.field207.method9316(8, class488.field4948 / 2 - class38.field207.field5214 / 2);
         }

         if (class475.field4843 != null && field449 < field458) {
            class475.field4843.method9316(class343.field3838 - class475.field4843.field5216 - 8, class488.field4948 / 2 - class475.field4843.field5214 / 2);
         }

         int var12 = var10 + 23;
         int var13 = field447 + var9;
         int var14 = 0;
         boolean var15 = false;
         int var16 = field449;

         int var17;
         for(var17 = var16 * var6; var17 < class70.field569 && var16 - field449 < var5; ++var17) {
            class70 var18 = class380.field4385[var17];
            boolean var19 = true;
            String var20 = Integer.toString(var18.field562);
            if (-1 == var18.field562) {
               var20 = class364.field4078;
               var19 = false;
            } else if (var18.field562 > 1980) {
               var20 = class364.field4143;
               var19 = false;
            }

            class122 var21 = null;
            int var22 = 0;
            if (var18.method1437()) {
               var21 = var18.method1474() ? class122.field1160 : class122.field1165;
            } else if (var18.method1432()) {
               var21 = var18.method1474() ? class122.field1162 : class122.field1167;
            } else if (var18.method1469()) {
               var22 = 16711680;
               var21 = var18.method1474() ? class122.field1158 : class122.field1168;
            } else if (var18.method1438()) {
               var21 = var18.method1474() ? class122.field1157 : class122.field1161;
            } else if (var18.method1459()) {
               var21 = var18.method1474() ? class122.field1156 : class122.field1155;
            } else if (var18.method1439()) {
               var21 = var18.method1474() ? class122.field1169 : class122.field1163;
            } else if (var18.method1440()) {
               var21 = var18.method1474() ? class122.field1166 : class122.field1153;
            }

            if (var21 == null || var21.field1164 >= class131.field1229.length) {
               var21 = var18.method1474() ? class122.field1154 : class122.field1159;
            }

            if (class41.field249 >= var13 && class41.field250 >= var12 && class41.field249 < var24 + var13 && class41.field250 < var12 + var26 && var19) {
               field456 = var17;
               class131.field1229[var21.field1164].method9040(var13, var12, 128, 16777215);
               var15 = true;
            } else {
               class131.field1229[var21.field1164].method9034(var13, var12);
            }

            if (class307.field3350 != null) {
               class307.field3350[(var18.method1474() ? 8 : 0) + var18.field573].method9316(var13 + 29, var12);
            }

            var0.method7166(Integer.toString(var18.field565), var13 + 15, 5 + var26 / 2 + var12, var22, -1);
            var1.method7166(var20, var13 + 60, var12 + var26 / 2 + 5, 268435455, -1);
            var12 += var26 + var8;
            ++var14;
            if (var14 >= var6) {
               var12 = var10 + 23;
               var13 += var24 + var7;
               var14 = 0;
               ++var16;
            }
         }

         if (var15) {
            var17 = var1.method7225(class380.field4385[field456].field572) + 6;
            int var27 = var1.field4527 + 8;
            int var28 = class41.field250 + 25;
            if (var28 + var27 > 480) {
               var28 = class41.field250 - 25 - var27;
            }

            class535.method9231(class41.field249 - var17 / 2, var28, var17, var27, 16777120);
            class535.method9223(class41.field249 - var17 / 2, var28, var17, var27, 0);
            var1.method7166(class380.field4385[field456].field572, class41.field249, var1.field4527 + var28 + 4, 0, -1);
         }
      }

      class159.field1749.method9186(0, 0);
   }

   static void method59(class43 var0) {
      class216 var2 = Client.method4736();

      while(var2.method4109()) {
         if (var2.field2371 == 13) {
            field457 = false;
            class406.field4516.method9034(field447, 0);
            class53.field390.method9034(field447 + 382, 0);
            field465.method9316(field447 + 382 - field465.field5216 / 2, 18);
            return;
         }

         if (var2.field2371 == 96) {
            if (field449 > 0 && null != class38.field207) {
               --field449;
            }
         } else if (97 == var2.field2371 && field449 < field458 && null != class475.field4843) {
            ++field449;
         }
      }

      if (1 == class41.field256 || !class40.field238 && class41.field256 == 4) {
         int var3 = field447 + 280;
         if (class41.field257 >= var3 && class41.field257 <= var3 + 14 && class41.field258 >= 4 && class41.field258 <= 18) {
            class70.method5695(0, 0);
            return;
         }

         if (class41.field257 >= var3 + 15 && class41.field257 <= var3 + 80 && class41.field258 >= 4 && class41.field258 <= 18) {
            class70.method5695(0, 1);
            return;
         }

         int var4 = 390 + field447;
         if (class41.field257 >= var4 && class41.field257 <= var4 + 14 && class41.field258 >= 4 && class41.field258 <= 18) {
            class70.method5695(1, 0);
            return;
         }

         if (class41.field257 >= var4 + 15 && class41.field257 <= var4 + 80 && class41.field258 >= 4 && class41.field258 <= 18) {
            class70.method5695(1, 1);
            return;
         }

         int var5 = 500 + field447;
         if (class41.field257 >= var5 && class41.field257 <= var5 + 14 && class41.field258 >= 4 && class41.field258 <= 18) {
            class70.method5695(2, 0);
            return;
         }

         if (class41.field257 >= var5 + 15 && class41.field257 <= var5 + 80 && class41.field258 >= 4 && class41.field258 <= 18) {
            class70.method5695(2, 1);
            return;
         }

         int var6 = 610 + field447;
         if (class41.field257 >= var6 && class41.field257 <= var6 + 14 && class41.field258 >= 4 && class41.field258 <= 18) {
            class70.method5695(3, 0);
            return;
         }

         if (class41.field257 >= var6 + 15 && class41.field257 <= var6 + 80 && class41.field258 >= 4 && class41.field258 <= 18) {
            class70.method5695(3, 1);
            return;
         }

         if (class41.field257 >= field447 + 708 && class41.field258 >= 4 && class41.field257 <= 50 + 708 + field447 && class41.field258 <= 20) {
            field457 = false;
            class406.field4516.method9034(field447, 0);
            class53.field390.method9034(field447 + 382, 0);
            field465.method9316(field447 + 382 - field465.field5216 / 2, 18);
            return;
         }

         if (field456 != -1) {
            class70 var7 = class380.field4385[field456];
            if (var7.method1432()) {
               var7.field564 = "beta";
            }

            boolean var8 = false;
            if (var7.field568 != Client.field1433) {
               boolean var9 = 0 != (Client.field1433 & 65536);
               boolean var10 = var7.method1432();
               if (var9 && !var10 || !var9 && var10) {
                  var8 = true;
               }
            }

            method2662(var7);
            field457 = false;
            class406.field4516.method9034(field447, 0);
            class53.field390.method9034(382 + field447, 0);
            field465.method9316(382 + field447 - field465.field5216 / 2, 18);
            if (var8) {
               Client.method1974();
            }

            return;
         }

         if (field449 > 0 && class38.field207 != null && class41.field257 >= 0 && class41.field257 <= class38.field207.field5216 && class41.field258 >= class488.field4948 / 2 - 50 && class41.field258 <= class488.field4948 / 2 + 50) {
            --field449;
         }

         if (field449 < field458 && null != class475.field4843 && class41.field257 >= class343.field3838 - class475.field4843.field5216 - 5 && class41.field257 <= class343.field3838 && class41.field258 >= class488.field4948 / 2 - 50 && class41.field258 <= 50 + class488.field4948 / 2) {
            ++field449;
         }
      }

   }

   static void method2662(class70 var0) {
      if (var0.method1474() != Client.field1435) {
         Client.field1435 = var0.method1474();
         class185.method2117(var0.method1474());
      }

      if (var0.field568 != Client.field1433) {
         class434.method7715(class379.field4382, var0.field568);
      }

      class196.field2146 = var0.field571;
      Client.field1432 = var0.field565;
      Client.field1433 = var0.field568;
      class189.field2035 = var0.field564;
      field433 = 0 == Client.field1434 ? '\uaa4a' : var0.field565 + '\u9c40';
      class20.field108 = 0 == Client.field1434 ? 443 : '\uc350' + var0.field565;
      class329.field3580 = field433;
   }

   static void method6370(int var0) {
      if (field439 != var0) {
         field439 = var0;
      }
   }

   static int method2044() {
      return field439;
   }
}
