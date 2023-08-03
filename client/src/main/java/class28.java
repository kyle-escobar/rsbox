import java.util.Arrays;

public class class28 {
   int[] field144 = new int[112];
   int[] field145 = new int[192];

   public class28() {
      Arrays.fill(this.field144, 3);
      Arrays.fill(this.field145, 3);
   }

   static final void method412(class301 var0) {
      PacketBuffer var2 = Client.serverConnection.buffer;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      if (class301.field3177 == var0) {
         var3 = var2.readUnsignedByteNeg();
         var4 = var3 >> 4 & 15;
         var5 = var3 & 7;
         var6 = var2.readUnsignedByteAdd();
         var7 = var2.readUnsignedByteSub();
         var8 = class265.field2959 + (var7 >> 4 & 7);
         var9 = class380.field4386 + (var7 & 7);
         var10 = var2.method8749();
         if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
            var11 = var4 + 1;
            if (class146.field1362.field945[0] >= var8 - var11 && class146.field1362.field945[0] <= var8 + var11 && class146.field1362.field1012[0] >= var9 - var11 && class146.field1362.field1012[0] <= var11 + var9 && class141.field1307.method1629() != 0 && var5 > 0 && Client.field1632 < 50) {
               Client.field1684[Client.field1632] = var10;
               Client.field1685[Client.field1632] = var5;
               Client.field1686[Client.field1632] = var6;
               Client.field1727[Client.field1632] = null;
               Client.field1501[Client.field1632] = (var9 << 8) + (var8 << 16) + var4;
               ++Client.field1632;
            }
         }
      }

      class124 var35;
      if (class301.field3176 == var0) {
         var3 = var2.method8998();
         var4 = var2.readUnsignedByteSub();
         var2.readUnsignedShort();
         var2.readUnsignedByteNeg();
         var5 = var2.readUnsignedShort();
         var6 = var2.readUnsignedByte();
         var7 = class265.field2959 + (var6 >> 4 & 7);
         var8 = (var6 & 7) + class380.field4386;
         var2.readUnsignedByte();
         var2.method8778();
         if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
            var35 = new class124();
            var35.field1174 = var5;
            var35.field1178 = var3;
            var35.method2340(var4);
            if (Client.field1568[class44.field306][var7][var8] == null) {
               Client.field1568[class44.field306][var7][var8] = new class368();
            }

            Client.field1568[class44.field306][var7][var8].method6680(var35);
            Client.method6371(var7, var8);
         }

      } else {
         int var12;
         if (class301.field3175 == var0) {
            var3 = var2.method8749();
            var4 = var2.readUnsignedByte();
            var5 = (var4 >> 4 & 7) + class265.field2959;
            var6 = (var4 & 7) + class380.field4386;
            var7 = var2.readUnsignedByteSub();
            var8 = var7 >> 2;
            var9 = var7 & 3;
            var10 = Client.field1507[var8];
            if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
               if (var10 == 0) {
                  class239 var40 = class109.field1065.method4427(class44.field306, var5, var6);
                  if (var40 != null) {
                     var12 = class252.method7841(var40.field2654);
                     if (var8 == 2) {
                        var40.field2647 = new class95(var12, 2, var9 + 4, class44.field306, var5, var6, var3, false, var40.field2647);
                        var40.field2653 = new class95(var12, 2, var9 + 1 & 3, class44.field306, var5, var6, var3, false, var40.field2653);
                     } else {
                        var40.field2647 = new class95(var12, var8, var9, class44.field306, var5, var6, var3, false, var40.field2647);
                     }

                     return;
                  }
               }

               if (var10 == 1) {
                  class254 var41 = class109.field1065.method4462(class44.field306, var5, var6);
                  if (var41 != null) {
                     var12 = class252.method7841(var41.field2869);
                     if (var8 != 4 && var8 != 5) {
                        if (var8 == 6) {
                           var41.field2867 = new class95(var12, 4, var9 + 4, class44.field306, var5, var6, var3, false, var41.field2867);
                        } else if (var8 == 7) {
                           var41.field2867 = new class95(var12, 4, 4 + (var9 + 2 & 3), class44.field306, var5, var6, var3, false, var41.field2867);
                        } else if (var8 == 8) {
                           var41.field2867 = new class95(var12, 4, var9 + 4, class44.field306, var5, var6, var3, false, var41.field2867);
                           var41.field2862 = new class95(var12, 4, (var9 + 2 & 3) + 4, class44.field306, var5, var6, var3, false, var41.field2862);
                        }
                     } else {
                        var41.field2867 = new class95(var12, 4, var9, class44.field306, var5, var6, var3, false, var41.field2867);
                     }

                     return;
                  }
               }

               if (var10 == 2) {
                  class237 var43 = class109.field1065.method4429(class44.field306, var5, var6);
                  if (var8 == 11) {
                     var8 = 10;
                  }

                  if (var43 != null) {
                     var43.field2627 = new class95(class252.method7841(var43.field2639), var8, var9, class44.field306, var5, var6, var3, false, var43.field2627);
                     return;
                  }
               }

               if (var10 == 3) {
                  class224 var44 = class109.field1065.method4430(class44.field306, var5, var6);
                  if (var44 != null) {
                     var44.field2461 = new class95(class252.method7841(var44.field2464), 22, var9, class44.field306, var5, var6, var3, false, var44.field2461);
                     return;
                  }
               }

               class214.method4047(class44.field306, var5, var6, var10, var3);
            }

         } else if (class301.field3184 == var0) {
            var3 = var2.readUnsignedByteSub();
            var4 = var2.readUnsignedByte();
            var5 = (var4 >> 4 & 7) + class265.field2959;
            var6 = class380.field4386 + (var4 & 7);
            var7 = var2.readUnsignedShort();
            var8 = var2.method8778();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
               var5 = var5 * 128 + 64;
               var6 = 64 + var6 * 128;
               class64 var39 = new class64(var7, class44.field306, var5, var6, Client.method5733(var5, var6, class44.field306) - var3, var8, Client.field1445);
               Client.field1571.method6680(var39);
            }

         } else if (class301.field3179 == var0) {
            var3 = var2.readUnsignedByteAdd();
            var4 = (var3 >> 4 & 7) + class265.field2959;
            var5 = class380.field4386 + (var3 & 7);
            var6 = var2.readUnsignedShort();
            var7 = var2.method8804();
            var8 = var2.method8804();
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
               class368 var38 = Client.field1568[class44.field306][var4][var5];
               if (null != var38) {
                  for(class124 var36 = (class124)var38.method6706(); var36 != null; var36 = (class124)var38.method6687()) {
                     if ((var6 & 32767) == var36.field1174 && var7 == var36.field1178) {
                        var36.field1178 = var8;
                        break;
                     }
                  }

                  Client.method6371(var4, var5);
               }
            }

         } else {
            class368 var34;
            if (class301.field3180 == var0) {
               var3 = var2.readUnsignedByte();
               var4 = var2.readUnsignedByte();
               var5 = (var4 >> 4 & 7) + class265.field2959;
               var6 = class380.field4386 + (var4 & 7);
               var7 = var2.readUnsignedShort();
               if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                  var34 = Client.field1568[class44.field306][var5][var6];
                  if (var34 != null) {
                     for(var35 = (class124)var34.method6706(); var35 != null; var35 = (class124)var34.method6687()) {
                        if (var35.field1174 == (var7 & 32767)) {
                           var35.method2340(var3);
                           break;
                        }
                     }
                  }
               }

            } else if (class301.field3182 == var0) {
               var3 = var2.readUnsignedByteSub();
               var4 = class265.field2959 + (var3 >> 4 & 7);
               var5 = (var3 & 7) + class380.field4386;
               var6 = var2.readUnsignedByteAdd();
               var7 = var2.method8749();
               var8 = var2.readUnsignedByte();
               var9 = var8 >> 2;
               var10 = var8 & 3;
               var11 = Client.field1507[var9];
               if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                  Client.method5397(class44.field306, var4, var5, var11, var7, var9, var10, var6, 0, -1);
               }

            } else {
               int var13;
               int var14;
               int var15;
               if (var0 == class301.field3185) {
                  byte var32 = var2.readByteAdd();
                  var4 = var2.readUnsignedByteAdd();
                  var5 = class265.field2959 + (var4 >> 4 & 7);
                  var6 = (var4 & 7) + class380.field4386;
                  var7 = var2.method8778();
                  var8 = var2.method8749();
                  var9 = var2.readUnsignedShort();
                  var10 = var2.method8778();
                  byte var37 = var2.readByte();
                  var12 = var2.readUnsignedByte();
                  var13 = var12 >> 2;
                  var14 = var12 & 3;
                  var15 = Client.field1507[var13];
                  byte var16 = var2.readByteAdd();
                  byte var17 = var2.readByte();
                  class84 var18;
                  if (var7 == Client.field1716) {
                     var18 = class146.field1362;
                  } else {
                     var18 = Client.field1527[var7];
                  }

                  if (var18 != null) {
                     class184 var19 = class98.method2042(var8);
                     int var20;
                     int var21;
                     if (var14 != 1 && var14 != 3) {
                        var20 = var19.field1940;
                        var21 = var19.field1944;
                     } else {
                        var20 = var19.field1944;
                        var21 = var19.field1940;
                     }

                     int var22 = var5 + (var20 >> 1);
                     int var23 = var5 + (var20 + 1 >> 1);
                     int var24 = (var21 >> 1) + var6;
                     int var25 = var6 + (var21 + 1 >> 1);
                     int[][] var26 = class88.field797[class44.field306];
                     int var27 = var26[var22][var24] + var26[var23][var24] + var26[var22][var25] + var26[var23][var25] >> 2;
                     int var28 = (var20 << 6) + (var5 << 7);
                     int var29 = (var6 << 7) + (var21 << 6);
                     class249 var30 = var19.method3449(var13, var14, var26, var28, var27, var29);
                     if (null != var30) {
                        Client.method5397(class44.field306, var5, var6, var15, -1, 0, 0, 31, var10 + 1, var9 + 1);
                        var18.field737 = var10 + Client.field1445;
                        var18.field747 = Client.field1445 + var9;
                        var18.field751 = var30;
                        var18.field748 = var20 * 64 + var5 * 128;
                        var18.field745 = var21 * 64 + var6 * 128;
                        var18.field749 = var27;
                        byte var31;
                        if (var32 > var17) {
                           var31 = var32;
                           var32 = var17;
                           var17 = var31;
                        }

                        if (var37 > var16) {
                           var31 = var37;
                           var37 = var16;
                           var16 = var31;
                        }

                        var18.field750 = var5 + var32;
                        var18.field754 = var5 + var17;
                        var18.field753 = var6 + var37;
                        var18.field763 = var6 + var16;
                     }
                  }
               }

               if (class301.field3183 == var0) {
                  var3 = var2.readUnsignedShort();
                  var4 = var2.method8798();
                  var5 = var2.readUnsignedByteNeg();
                  byte var33 = var2.readByteSub();
                  var7 = var2.readUnsignedByteNeg();
                  var8 = class265.field2959 + (var7 >> 4 & 7);
                  var9 = class380.field4386 + (var7 & 7);
                  var10 = var2.readUnsignedByteAdd();
                  var11 = var2.method8778();
                  var12 = var2.method8778();
                  byte var42 = var2.readByteAdd();
                  var14 = var2.readUnsignedByteAdd() * 4;
                  var15 = var2.readUnsignedByteNeg() * 4;
                  var6 = var33 + var8;
                  var13 = var42 + var9;
                  if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var6 >= 0 && var13 >= 0 && var6 < 104 && var13 < 104 && var12 != 65535) {
                     var8 = 64 + var8 * 128;
                     var9 = var9 * 128 + 64;
                     var6 = var6 * 128 + 64;
                     var13 = 64 + var13 * 128;
                     class74 var45 = new class74(var12, class44.field306, var8, var9, Client.method5733(var8, var9, class44.field306) - var15, var3 + Client.field1445, Client.field1445 + var11, var10, var5, var4, var14);
                     var45.method1518(var6, var13, Client.method5733(var6, var13, class44.field306) - var14, var3 + Client.field1445);
                     Client.field1439.method6680(var45);
                  }

               } else if (class301.field3178 != var0) {
                  if (var0 == class301.field3181) {
                     var3 = var2.readUnsignedByteSub();
                     var4 = (var3 >> 4 & 7) + class265.field2959;
                     var5 = class380.field4386 + (var3 & 7);
                     var6 = var2.readUnsignedByte();
                     var7 = var6 >> 2;
                     var8 = var6 & 3;
                     var9 = Client.field1507[var7];
                     if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                        Client.method5397(class44.field306, var4, var5, var9, -1, var7, var8, 31, 0, -1);
                     }

                  }
               } else {
                  var3 = var2.method8998();
                  var4 = var2.readUnsignedShort();
                  var5 = var2.readUnsignedByteNeg();
                  var6 = (var5 >> 4 & 7) + class265.field2959;
                  var7 = (var5 & 7) + class380.field4386;
                  if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                     var34 = Client.field1568[class44.field306][var6][var7];
                     if (null != var34) {
                        for(var35 = (class124)var34.method6706(); null != var35; var35 = (class124)var34.method6687()) {
                           if (var35.field1174 == (var4 & 32767) && var35.field1178 == var3) {
                              var35.method8116();
                              break;
                           }
                        }

                        if (var34.method6706() == null) {
                           Client.field1568[class44.field306][var6][var7] = null;
                        }

                        Client.method6371(var6, var7);
                     }
                  }

               }
            }
         }
      }
   }

   public void method393(int var1, int var2) {
      if (this.method401(var1) && this.method403(var2)) {
         this.field144[var1] = var2;
      }

   }

   public void method394(char var1, int var2) {
      if (this.method413(var1) && this.method403(var2)) {
         this.field145[var1] = var2;
      }

   }

   public int method395(int var1) {
      return this.method401(var1) ? this.field144[var1] : 0;
   }

   public int method392(char var1) {
      return this.method413(var1) ? this.field145[var1] : 0;
   }

   public boolean method397(int var1) {
      return this.method401(var1) && (this.field144[var1] == 1 || this.field144[var1] == 3);
   }

   public boolean method398(char var1) {
      return this.method413(var1) && (1 == this.field145[var1] || this.field145[var1] == 3);
   }

   public boolean method400(int var1) {
      return this.method401(var1) && (2 == this.field144[var1] || this.field144[var1] == 3);
   }

   public boolean method408(char var1) {
      return this.method413(var1) && (this.field145[var1] == 2 || 3 == this.field145[var1]);
   }

   boolean method401(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   boolean method413(char var1) {
      if (var1 >= 0 && var1 < 192) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   boolean method403(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }
}
