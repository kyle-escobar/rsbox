import java.util.Date;

public class class56 {
   int field403 = 0;
   final class477 field400;
   public final class429 field402;
   public final class432 field401;

   class56(class477 var1) {
      this.field400 = var1;
      this.field401 = new class432(var1);
      this.field402 = new class429(var1);
   }

   static final void method4207(String var0) {
      class119.method7274(30, "", var0);
   }

   static final void method5206(String var0) {
      method4207(var0 + class364.field4201);
   }

   static final void method3946() {
      method4207(class364.field4152);
   }

   static final void method100(String var0) {
      class308 var2 = class308.method8607(class309.field3410, Client.serverConnection.field1046);
      var2.packet.writeByte(Buffer.getJagStringSize(var0));
      var2.packet.writeString(var0);
      Client.serverConnection.method2148(var2);
   }

   static final void method2170() {
      method4207(class364.field4188);
   }

   static final void method6360(String var0) {
      method4207(var0 + class364.field4203);
   }

   static final void method1985(String var0) {
      class308 var2 = class308.method8607(class309.field3435, Client.serverConnection.field1046);
      var2.packet.writeByte(Buffer.getJagStringSize(var0));
      var2.packet.writeString(var0);
      Client.serverConnection.method2148(var2);
   }

   static final void method4752(String var0, int var1) {
      class308 var3 = class308.method8607(class309.field3439, Client.serverConnection.field1046);
      var3.packet.writeByte(Buffer.getJagStringSize(var0) + 1);
      var3.packet.writeString(var0);
      var3.packet.writeByteSub(var1);
      Client.serverConnection.method2148(var3);
   }

   static int method1160(int var0, class81 var1, boolean var2) {
      String var4;
      int var10;
      if (var0 == 4100) {
         var4 = class63.field484[--class63.field486];
         var10 = class63.field483[--class63.field479];
         class63.field484[++class63.field486 - 1] = var4 + var10;
         return 1;
      } else {
         String var5;
         if (var0 == 4101) {
            class63.field486 -= 2;
            var4 = class63.field484[class63.field486];
            var5 = class63.field484[1 + class63.field486];
            class63.field484[++class63.field486 - 1] = var4 + var5;
            return 1;
         } else if (var0 == 4102) {
            var4 = class63.field484[--class63.field486];
            var10 = class63.field483[--class63.field479];
            class63.field484[++class63.field486 - 1] = var4 + class380.method8645(var10, true);
            return 1;
         } else if (var0 == 4103) {
            var4 = class63.field484[--class63.field486];
            class63.field484[++class63.field486 - 1] = var4.toLowerCase();
            return 1;
         } else {
            int var7;
            int var8;
            int var13;
            if (var0 == 4104) {
               var13 = class63.field483[--class63.field479];
               long var16 = (11745L + (long)var13) * 86400000L;
               class63.field499.setTime(new Date(var16));
               var7 = class63.field499.get(5);
               var8 = class63.field499.get(2);
               int var9 = class63.field499.get(1);
               class63.field484[++class63.field486 - 1] = var7 + "-" + class63.field492[var8] + "-" + var9;
               return 1;
            } else if (var0 != 4105) {
               if (var0 == 4106) {
                  var13 = class63.field483[--class63.field479];
                  class63.field484[++class63.field486 - 1] = Integer.toString(var13);
                  return 1;
               } else if (var0 == 4107) {
                  class63.field486 -= 2;
                  class63.field483[++class63.field479 - 1] = class380.method6478(class209.method3916(class63.field484[class63.field486], class63.field484[1 + class63.field486], class63.field496));
                  return 1;
               } else {
                  int var12;
                  byte[] var15;
                  class393 var17;
                  if (var0 == 4108) {
                     var4 = class63.field484[--class63.field486];
                     class63.field479 -= 2;
                     var10 = class63.field483[class63.field479];
                     var12 = class63.field483[1 + class63.field479];
                     var15 = class475.field4839.method6381(var12, 0);
                     var17 = new class393(var15);
                     class63.field483[++class63.field479 - 1] = var17.method7160(var4, var10);
                     return 1;
                  } else if (var0 == 4109) {
                     var4 = class63.field484[--class63.field486];
                     class63.field479 -= 2;
                     var10 = class63.field483[class63.field479];
                     var12 = class63.field483[class63.field479 + 1];
                     var15 = class475.field4839.method6381(var12, 0);
                     var17 = new class393(var15);
                     class63.field483[++class63.field479 - 1] = var17.method7263(var4, var10);
                     return 1;
                  } else if (var0 == 4110) {
                     class63.field486 -= 2;
                     var4 = class63.field484[class63.field486];
                     var5 = class63.field484[class63.field486 + 1];
                     if (class63.field483[--class63.field479] == 1) {
                        class63.field484[++class63.field486 - 1] = var4;
                     } else {
                        class63.field484[++class63.field486 - 1] = var5;
                     }

                     return 1;
                  } else if (var0 == 4111) {
                     var4 = class63.field484[--class63.field486];
                     class63.field484[++class63.field486 - 1] = class407.method7161(var4);
                     return 1;
                  } else if (var0 == 4112) {
                     var4 = class63.field484[--class63.field486];
                     var10 = class63.field483[--class63.field479];
                     class63.field484[++class63.field486 - 1] = var4 + (char)var10;
                     return 1;
                  } else if (var0 == 4113) {
                     var13 = class63.field483[--class63.field479];
                     class63.field483[++class63.field479 - 1] = class380.method1833((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4114) {
                     var13 = class63.field483[--class63.field479];
                     class63.field483[++class63.field479 - 1] = class380.method2440((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4115) {
                     var13 = class63.field483[--class63.field479];
                     class63.field483[++class63.field479 - 1] = class380.method102((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4116) {
                     var13 = class63.field483[--class63.field479];
                     class63.field483[++class63.field479 - 1] = class380.method3292((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4117) {
                     var4 = class63.field484[--class63.field486];
                     if (var4 != null) {
                        class63.field483[++class63.field479 - 1] = var4.length();
                     } else {
                        class63.field483[++class63.field479 - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == 4118) {
                     var4 = class63.field484[--class63.field486];
                     class63.field479 -= 2;
                     var10 = class63.field483[class63.field479];
                     var12 = class63.field483[class63.field479 + 1];
                     class63.field484[++class63.field486 - 1] = var4.substring(var10, var12);
                     return 1;
                  } else if (var0 == 4119) {
                     var4 = class63.field484[--class63.field486];
                     StringBuilder var11 = new StringBuilder(var4.length());
                     boolean var14 = false;

                     for(var7 = 0; var7 < var4.length(); ++var7) {
                        var8 = var4.charAt(var7);
                        if (var8 == 60) {
                           var14 = true;
                        } else if (var8 == 62) {
                           var14 = false;
                        } else if (!var14) {
                           var11.append((char)var8);
                        }
                     }

                     class63.field484[++class63.field486 - 1] = var11.toString();
                     return 1;
                  } else if (var0 == 4120) {
                     var4 = class63.field484[--class63.field486];
                     var10 = class63.field483[--class63.field479];
                     class63.field483[++class63.field479 - 1] = var4.indexOf(var10);
                     return 1;
                  } else if (var0 == 4121) {
                     class63.field486 -= 2;
                     var4 = class63.field484[class63.field486];
                     var5 = class63.field484[1 + class63.field486];
                     var12 = class63.field483[--class63.field479];
                     class63.field483[++class63.field479 - 1] = var4.indexOf(var5, var12);
                     return 1;
                  } else if (var0 == 4122) {
                     var4 = class63.field484[--class63.field486];
                     class63.field484[++class63.field486 - 1] = var4.toUpperCase();
                     return 1;
                  } else if (var0 == 4123) {
                     class63.field486 -= 3;
                     var4 = class63.field484[class63.field486];
                     var5 = class63.field484[1 + class63.field486];
                     String var6 = class63.field484[2 + class63.field486];
                     if (null == class146.field1362.field764) {
                        class63.field484[++class63.field486 - 1] = var6;
                        return 1;
                     } else {
                        switch (class146.field1362.field764.field3487) {
                           case 0:
                              class63.field484[++class63.field486 - 1] = var4;
                              break;
                           case 1:
                              class63.field484[++class63.field486 - 1] = var5;
                              break;
                           case 2:
                           default:
                              class63.field484[++class63.field486 - 1] = var6;
                        }

                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            } else {
               class63.field486 -= 2;
               var4 = class63.field484[class63.field486];
               var5 = class63.field484[class63.field486 + 1];
               if (class146.field1362.field764 != null && 0 != class146.field1362.field764.field3486) {
                  class63.field484[++class63.field486 - 1] = var5;
               } else {
                  class63.field484[++class63.field486 - 1] = var4;
               }

               return 1;
            }
         }
      }
   }

   static void method1161(class332 var0, int var1, int var2, boolean var3) {
      int var5 = var0.field3598;
      int var6 = var0.field3622;
      if (var0.field3592 == 0) {
         var0.field3598 = var0.field3732;
      } else if (1 == var0.field3592) {
         var0.field3598 = var1 - var0.field3732;
      } else if (var0.field3592 == 2) {
         var0.field3598 = var0.field3732 * var1 >> 14;
      }

      if (var0.field3614 == 0) {
         var0.field3622 = var0.field3740;
      } else if (1 == var0.field3614) {
         var0.field3622 = var2 - var0.field3740;
      } else if (var0.field3614 == 2) {
         var0.field3622 = var2 * var0.field3740 >> 14;
      }

      if (4 == var0.field3592) {
         var0.field3598 = var0.field3622 * var0.field3655 / var0.field3624;
      }

      if (var0.field3614 == 4) {
         var0.field3622 = var0.field3598 * var0.field3624 / var0.field3655;
      }

      if (var0.field3631 == 1337) {
         Client.field1611 = var0;
      }

      if (var0.field3608 == 12) {
         var0.method6277().method5907(var0.field3598, var0.field3622);
      }

      if (var3 && null != var0.field3597 && (var0.field3598 != var5 || var6 != var0.field3622)) {
         class87 var7 = new class87();
         var7.field786 = var0;
         var7.field790 = var0.field3597;
         Client.field1643.method6680(var7);
      }

   }

   boolean method1130() {
      return this.field403 == 2;
   }

   final void method1091() {
      this.field403 = 1;
   }

   final void method1137(Buffer var1, int var2) {
      this.field401.method7691(var1, var2);
      this.field403 = 2;

      for(int var4 = 0; var4 < class116.field1116; ++var4) {
         class84 var5 = Client.field1527[class116.field1120[var4]];
         var5.method1812();
      }

      class119.method2159();
      if (null != class6.field42) {
         class6.field42.method7620();
      }

   }

   final void method1090() {
      for(class436 var2 = (class436)this.field401.field4642.method6748(); null != var2; var2 = (class436)this.field401.field4642.method6749()) {
         if ((long)var2.field4660 < class302.safeTime() / 1000L - 5L) {
            if (var2.field4662 > 0) {
               class119.method7274(5, "", var2.field4661 + class364.field4181);
            }

            if (var2.field4662 == 0) {
               class119.method7274(5, "", var2.field4661 + class364.field4182);
            }

            var2.method8201();
         }
      }

   }

   final void method1094() {
      this.field403 = 0;
      this.field401.method7785();
      this.field402.method7785();
   }

   final boolean method1138(class526 var1, boolean var2) {
      if (null == var1) {
         return false;
      } else if (var1.equals(class146.field1362.field740)) {
         return true;
      } else {
         return this.field401.method7690(var1, var2);
      }
   }

   final boolean method1096(class526 var1) {
      if (null == var1) {
         return false;
      } else {
         return this.field402.method7720(var1);
      }
   }

   final void method1097(String var1) {
      if (null != var1) {
         class526 var3 = new class526(var1, this.field400);
         if (var3.method9157()) {
            if (this.method1098()) {
               method4207(class364.field4200);
            } else if (class146.field1362.field740.equals(var3)) {
               method3946();
            } else if (this.method1138(var3, false)) {
               method5206(var1);
            } else if (this.method1096(var3)) {
               method4207(class364.field4153 + var1 + class364.field4070);
            } else {
               method100(var1);
            }
         }
      }
   }

   final boolean method1098() {
      return this.field401.method7719() || this.field401.method7770() >= 200 && Client.field1557 != 1;
   }

   final void method1147(String var1) {
      if (null != var1) {
         class526 var3 = new class526(var1, this.field400);
         if (var3.method9157()) {
            if (this.method1092()) {
               method2170();
            } else if (class146.field1362.field740.equals(var3)) {
               method4207(class364.field4318);
            } else if (this.method1096(var3)) {
               method6360(var1);
            } else if (this.method1138(var3, false)) {
               method4207(class364.field4208 + var1 + class364.field4209);
            } else {
               method1985(var1);
            }
         }
      }
   }

   final boolean method1092() {
      return this.field402.method7719() || this.field402.method7770() >= 100 && 1 != Client.field1557;
   }

   final void method1101(String var1) {
      if (var1 != null) {
         class526 var3 = new class526(var1, this.field400);
         if (var3.method9157()) {
            if (this.field401.method7724(var3)) {
               Client.field1679 = Client.field1624;
               class308 var4 = class308.method8607(class309.field3381, Client.serverConnection.field1046);
               var4.packet.writeByte(Buffer.getJagStringSize(var1));
               var4.packet.writeString(var1);
               Client.serverConnection.method2148(var4);
            }

            for(int var6 = 0; var6 < class116.field1116; ++var6) {
               class84 var5 = Client.field1527[class116.field1120[var6]];
               var5.method1812();
            }

            class119.method2159();
            if (class6.field42 != null) {
               class6.field42.method7620();
            }

         }
      }
   }

   public final void method1093(String var1, boolean var2) {
      if (null != var1) {
         class526 var4 = new class526(var1, this.field400);
         if (var4.method9157()) {
            if (this.field402.method7724(var4)) {
               Client.field1679 = Client.field1624;
               if (var2) {
                  class308 var5 = class308.method8607(class309.field3422, Client.serverConnection.field1046);
                  var5.packet.writeByte(Buffer.getJagStringSize(var1));
                  var5.packet.writeString(var1);
                  Client.serverConnection.method2148(var5);
               }
            }

            Client.method6488();
         }
      }
   }

   final boolean method1103(class526 var1) {
      class425 var3 = (class425)this.field401.method7721(var1);
      return null != var3 && var3.method7464();
   }
}
