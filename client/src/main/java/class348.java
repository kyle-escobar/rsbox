import java.util.Comparator;

final class class348 implements Comparator {
   static void method6500(int var0) {
      class93 var2 = (class93)class93.field858.get((long)var0);
      if (null != var2) {
         for(int var3 = 0; var3 < var2.field860.length; ++var3) {
            var2.field860[var3] = -1;
            var2.field857[var3] = 0;
         }

      }
   }

   static void readPlayerUpdate(PacketBuffer buf, int index) {
      boolean var3 = buf.readBits(1) == 1;
      if (var3) {
         class116.pendingPlayerUpdateIndexes[++class116.pendingUpdateCount - 1] = index;
      }

      int var4 = buf.readBits(2);
      Player player = Client.players[index];
      if (var4 == 0) {
         if (var3) {
            player.teleporting = false;
         } else if (Client.localPlayerIndex == index) {
            throw new RuntimeException();
         } else {
            class116.playerRegions[index] = (player.plane << 28) + (player.pathX[0] + class342.baseX >> 13 << 14) + (player.pathY[0] + class144.baseY >> 13);
            if (player.field977 != -1) {
               class116.field1122[index] = player.field977;
            } else {
               class116.field1122[index] = player.field1007;
            }

            class116.targetIndexes[index] = player.targetIndex;
            Client.players[index] = null;
            if (buf.readBits(1) != 0) {
               class116.readExternalPlayerUpdate(buf, index);
            }

         }
      } else {
         int var6;
         int var7;
         int var8;
         if (var4 == 1) {
            var6 = buf.readBits(3);
            var7 = player.pathX[0];
            var8 = player.pathY[0];
            if (var6 == 0) {
               --var7;
               --var8;
            } else if (var6 == 1) {
               --var8;
            } else if (var6 == 2) {
               ++var7;
               --var8;
            } else if (var6 == 3) {
               --var7;
            } else if (var6 == 4) {
               ++var7;
            } else if (var6 == 5) {
               --var7;
               ++var8;
            } else if (var6 == 6) {
               ++var8;
            } else if (var6 == 7) {
               ++var7;
               ++var8;
            }

            if (index != Client.localPlayerIndex || player.field949 >= 1536 && player.field963 >= 1536 && player.field949 < 11776 && player.field963 < 11776) {
               if (var3) {
                  player.teleporting = true;
                  player.field758 = var7;
                  player.field766 = var8;
               } else {
                  player.teleporting = false;
                  player.method1786(var7, var8, class116.movementTypeCache[index]);
               }
            } else {
               player.method1795(var7, var8);
               player.teleporting = false;
            }

         } else if (var4 == 2) {
            var6 = buf.readBits(4);
            var7 = player.pathX[0];
            var8 = player.pathY[0];
            if (var6 == 0) {
               var7 -= 2;
               var8 -= 2;
            } else if (var6 == 1) {
               --var7;
               var8 -= 2;
            } else if (var6 == 2) {
               var8 -= 2;
            } else if (var6 == 3) {
               ++var7;
               var8 -= 2;
            } else if (var6 == 4) {
               var7 += 2;
               var8 -= 2;
            } else if (var6 == 5) {
               var7 -= 2;
               --var8;
            } else if (var6 == 6) {
               var7 += 2;
               --var8;
            } else if (var6 == 7) {
               var7 -= 2;
            } else if (var6 == 8) {
               var7 += 2;
            } else if (var6 == 9) {
               var7 -= 2;
               ++var8;
            } else if (var6 == 10) {
               var7 += 2;
               ++var8;
            } else if (var6 == 11) {
               var7 -= 2;
               var8 += 2;
            } else if (var6 == 12) {
               --var7;
               var8 += 2;
            } else if (var6 == 13) {
               var8 += 2;
            } else if (var6 == 14) {
               ++var7;
               var8 += 2;
            } else if (var6 == 15) {
               var7 += 2;
               var8 += 2;
            }

            if (Client.localPlayerIndex != index || player.field949 >= 1536 && player.field963 >= 1536 && player.field949 < 11776 && player.field963 < 11776) {
               if (var3) {
                  player.teleporting = true;
                  player.field758 = var7;
                  player.field766 = var8;
               } else {
                  player.teleporting = false;
                  player.method1786(var7, var8, class116.movementTypeCache[index]);
               }
            } else {
               player.method1795(var7, var8);
               player.teleporting = false;
            }

         } else {
            var6 = buf.readBits(1);
            int var9;
            int var10;
            int var11;
            int var12;
            if (var6 == 0) {
               var7 = buf.readBits(12);
               var8 = var7 >> 10;
               var9 = var7 >> 5 & 31;
               if (var9 > 15) {
                  var9 -= 32;
               }

               var10 = var7 & 31;
               if (var10 > 15) {
                  var10 -= 32;
               }

               var11 = player.pathX[0] + var9;
               var12 = player.pathY[0] + var10;
               if (index != Client.localPlayerIndex || player.field949 >= 1536 && player.field963 >= 1536 && player.field949 < 11776 && player.field963 < 11776) {
                  if (var3) {
                     player.teleporting = true;
                     player.field758 = var11;
                     player.field766 = var12;
                  } else {
                     player.teleporting = false;
                     player.method1786(var11, var12, class116.movementTypeCache[index]);
                  }
               } else {
                  player.method1795(var11, var12);
                  player.teleporting = false;
               }

               player.plane = (byte)(var8 + player.plane & 3);
               if (index == Client.localPlayerIndex) {
                  class44.field306 = player.plane;
               }

            } else {
               var7 = buf.readBits(30);
               var8 = var7 >> 28;
               var9 = var7 >> 14 & 16383;
               var10 = var7 & 16383;
               var11 = (class342.baseX + player.pathX[0] + var9 & 16383) - class342.baseX;
               var12 = (var10 + player.pathY[0] + class144.baseY & 16383) - class144.baseY;
               if (Client.localPlayerIndex != index || player.field949 >= 1536 && player.field963 >= 1536 && player.field949 < 11776 && player.field963 < 11776) {
                  if (var3) {
                     player.teleporting = true;
                     player.field758 = var11;
                     player.field766 = var12;
                  } else {
                     player.teleporting = false;
                     player.method1786(var11, var12, class116.movementTypeCache[index]);
                  }
               } else {
                  player.method1795(var11, var12);
                  player.teleporting = false;
               }

               player.plane = (byte)(player.plane + var8 & 3);
               if (index == Client.localPlayerIndex) {
                  class44.field306 = player.plane;
               }

            }
         }
      }
   }

   static void method6499(Player var0, boolean var1) {
      if (var0 != null && var0.method2065() && !var0.field760) {
         var0.field756 = false;
         if ((Client.isLowDetail && class116.localPlayerCount > 50 || class116.localPlayerCount > 200) && var1 && var0.field989 == var0.field1013) {
            var0.field756 = true;
         }

         int var3 = var0.field949 >> 7;
         int var4 = var0.field963 >> 7;
         if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
            long var5 = class252.method7702(0, 0, 0, false, var0.field755);
            if (null != var0.field751 && Client.field1445 >= var0.field737 && Client.field1445 < var0.field747) {
               var0.field756 = false;
               var0.field765 = Client.method5733(var0.field949, var0.field963, class44.field306);
               var0.field985 = Client.field1445;
               class109.field1065.method4417(class44.field306, var0.field949, var0.field963, var0.field765, 60, var0, var0.field942, var5, var0.field750, var0.field753, var0.field754, var0.field763);
            } else {
               if ((var0.field949 & 127) == 64 && (var0.field963 & 127) == 64) {
                  if (Client.field1545 == Client.field1544[var3][var4]) {
                     return;
                  }

                  Client.field1544[var3][var4] = Client.field1545;
               }

               var0.field765 = Client.method5733(var0.field949, var0.field963, class44.field306);
               var0.field985 = Client.field1445;
               class109.field1065.method4452(class44.field306, var0.field949, var0.field963, var0.field765, 60, var0, var0.field942, var5, var0.field974);
            }
         }
      }

   }

   int method6492(class376 var1, class376 var2) {
      return var1.method6742().compareTo(var2.method6742());
   }

   public int compare(Object var1, Object var2) {
      return this.method6492((class376)var1, (class376)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
