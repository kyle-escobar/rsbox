public class class116 {
   static byte[] skipFlags = new byte[2048];
   static MovementType[] movementTypeCache = new MovementType[2048];
   static Buffer field1125 = new Buffer(new byte[5000]);
   static Buffer[] playerAppearances = new Buffer[2048];
   static int localPlayerCount = 0;
   static int field1118 = 0;
   static int pendingUpdateCount = 0;
   static int[] playerRegions = new int[2048];
   static int[] field1119 = new int[2048];
   static int[] localPlayerIndexes = new int[2048];
   static int[] field1122 = new int[2048];
   static int[] targetIndexes = new int[2048];
   static int[] pendingPlayerUpdateIndexes = new int[2048];

   class116() throws Throwable {
   }

   static final void method3290(PacketBuffer var0) {
      var0.switchBitMode();
      int var2 = Client.localPlayerIndex;
      Player var3 = class146.field1362 = Client.players[var2] = new Player();
      var3.field755 = var2;
      int var4 = var0.readBits(30);
      byte var5 = (byte)(var4 >> 28);
      int var6 = var4 >> 14 & 16383;
      int var7 = var4 & 16383;
      var3.pathX[0] = var6 - class342.baseX;
      var3.field949 = (var3.pathX[0] << 7) + (var3.method1788() << 6);
      var3.pathY[0] = var7 - class144.baseY;
      var3.field963 = (var3.pathY[0] << 7) + (var3.method1788() << 6);
      class44.field306 = var3.plane = var5;
      if (playerAppearances[var2] != null) {
         var3.updateAppearance(playerAppearances[var2]);
      }

      localPlayerCount = 0;
      localPlayerIndexes[++localPlayerCount - 1] = var2;
      skipFlags[var2] = 0;
      field1118 = 0;

      for(int var8 = 1; var8 < 2048; ++var8) {
         if (var8 != var2) {
            int var9 = var0.readBits(18);
            int var10 = var9 >> 16;
            int var11 = var9 >> 8 & 597;
            int var12 = var9 & 597;
            playerRegions[var8] = var12 + (var10 << 28) + (var11 << 14);
            field1122[var8] = 0;
            targetIndexes[var8] = -1;
            field1119[++field1118 - 1] = var8;
            skipFlags[var8] = 0;
         }
      }

      var0.switchByteMode();
   }

   static final void readPlayerUpdates(PacketBuffer buf, int var1) {
      int var3 = buf.offset;
      pendingUpdateCount = 0;
      int skipCount = 0;
      buf.switchBitMode();

      byte[] _skipFlags;
      int i;
      int playerIndex;
      int var7;
      for(i = 0; i < localPlayerCount; ++i) {
         playerIndex = localPlayerIndexes[i];
         if ((skipFlags[playerIndex] & 1) == 0) {
            if (skipCount > 0) {
               --skipCount;
               _skipFlags = skipFlags;
               _skipFlags[playerIndex] = (byte)(_skipFlags[playerIndex] | 2);
            } else {
               var7 = buf.readBits(1);
               if (var7 == 0) {
                  skipCount = class134.method2468(buf);
                  _skipFlags = skipFlags;
                  _skipFlags[playerIndex] = (byte)(_skipFlags[playerIndex] | 2);
               } else {
                  class348.readPlayerUpdate(buf, playerIndex);
               }
            }
         }
      }

      buf.switchByteMode();
      if (skipCount != 0) {
         throw new RuntimeException();
      } else {
         buf.switchBitMode();

         for(i = 0; i < localPlayerCount; ++i) {
            playerIndex = localPlayerIndexes[i];
            if (0 != (skipFlags[playerIndex] & 1)) {
               if (skipCount > 0) {
                  --skipCount;
                  _skipFlags = skipFlags;
                  _skipFlags[playerIndex] = (byte)(_skipFlags[playerIndex] | 2);
               } else {
                  var7 = buf.readBits(1);
                  if (var7 == 0) {
                     skipCount = class134.method2468(buf);
                     _skipFlags = skipFlags;
                     _skipFlags[playerIndex] = (byte)(_skipFlags[playerIndex] | 2);
                  } else {
                     class348.readPlayerUpdate(buf, playerIndex);
                  }
               }
            }
         }

         buf.switchByteMode();
         if (skipCount != 0) {
            throw new RuntimeException();
         } else {
            buf.switchBitMode();

            for(i = 0; i < field1118; ++i) {
               playerIndex = field1119[i];
               if ((skipFlags[playerIndex] & 1) != 0) {
                  if (skipCount > 0) {
                     --skipCount;
                     _skipFlags = skipFlags;
                     _skipFlags[playerIndex] = (byte)(_skipFlags[playerIndex] | 2);
                  } else {
                     var7 = buf.readBits(1);
                     if (var7 == 0) {
                        skipCount = class134.method2468(buf);
                        _skipFlags = skipFlags;
                        _skipFlags[playerIndex] = (byte)(_skipFlags[playerIndex] | 2);
                     } else if (readExternalPlayerUpdate(buf, playerIndex)) {
                        _skipFlags = skipFlags;
                        _skipFlags[playerIndex] = (byte)(_skipFlags[playerIndex] | 2);
                     }
                  }
               }
            }

            buf.switchByteMode();
            if (skipCount != 0) {
               throw new RuntimeException();
            } else {
               buf.switchBitMode();

               for(i = 0; i < field1118; ++i) {
                  playerIndex = field1119[i];
                  if (0 == (skipFlags[playerIndex] & 1)) {
                     if (skipCount > 0) {
                        --skipCount;
                        _skipFlags = skipFlags;
                        _skipFlags[playerIndex] = (byte)(_skipFlags[playerIndex] | 2);
                     } else {
                        var7 = buf.readBits(1);
                        if (var7 == 0) {
                           skipCount = class134.method2468(buf);
                           _skipFlags = skipFlags;
                           _skipFlags[playerIndex] = (byte)(_skipFlags[playerIndex] | 2);
                        } else if (readExternalPlayerUpdate(buf, playerIndex)) {
                           _skipFlags = skipFlags;
                           _skipFlags[playerIndex] = (byte)(_skipFlags[playerIndex] | 2);
                        }
                     }
                  }
               }

               buf.switchByteMode();
               if (skipCount != 0) {
                  throw new RuntimeException();
               } else {
                  localPlayerCount = 0;
                  field1118 = 0;

                  for(i = 1; i < 2048; ++i) {
                     _skipFlags = skipFlags;
                     _skipFlags[i] = (byte)(_skipFlags[i] >> 1);
                     Player var8 = Client.players[i];
                     if (null != var8) {
                        localPlayerIndexes[++localPlayerCount - 1] = i;
                     } else {
                        field1119[++field1118 - 1] = i;
                     }
                  }

                  readUpdateFlags(buf);
                  if (buf.offset - var3 != var1) {
                     throw new RuntimeException(buf.offset - var3 + " " + var1);
                  }
               }
            }
         }
      }
   }

   static boolean readExternalPlayerUpdate(PacketBuffer var0, int var1) {
      int var3 = var0.readBits(2);
      int var4;
      int var5;
      int var8;
      int var9;
      int var10;
      int var11;
      if (var3 == 0) {
         if (var0.readBits(1) != 0) {
            readExternalPlayerUpdate(var0, var1);
         }

         var4 = var0.readBits(13);
         var5 = var0.readBits(13);
         boolean var12 = var0.readBits(1) == 1;
         if (var12) {
            pendingPlayerUpdateIndexes[++pendingUpdateCount - 1] = var1;
         }

         if (Client.players[var1] != null) {
            throw new RuntimeException();
         } else {
            Player var13 = Client.players[var1] = new Player();
            var13.field755 = var1;
            if (playerAppearances[var1] != null) {
               var13.updateAppearance(playerAppearances[var1]);
            }

            var13.field1007 = field1122[var1];
            var13.targetIndex = targetIndexes[var1];
            var8 = playerRegions[var1];
            var9 = var8 >> 28;
            var10 = var8 >> 14 & 255;
            var11 = var8 & 255;
            var13.field998[0] = movementTypeCache[var1];
            var13.plane = (byte)var9;
            var13.method1795((var10 << 13) + var4 - class342.baseX, var5 + (var11 << 13) - class144.baseY);
            var13.teleporting = false;
            return true;
         }
      } else if (var3 == 1) {
         var4 = var0.readBits(2);
         var5 = playerRegions[var1];
         playerRegions[var1] = (var5 & 268435455) + (((var5 >> 28) + var4 & 3) << 28);
         return false;
      } else {
         int var6;
         int var7;
         if (var3 == 2) {
            var4 = var0.readBits(5);
            var5 = var4 >> 3;
            var6 = var4 & 7;
            var7 = playerRegions[var1];
            var8 = (var7 >> 28) + var5 & 3;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            if (var6 == 0) {
               --var9;
               --var10;
            }

            if (var6 == 1) {
               --var10;
            }

            if (var6 == 2) {
               ++var9;
               --var10;
            }

            if (var6 == 3) {
               --var9;
            }

            if (var6 == 4) {
               ++var9;
            }

            if (var6 == 5) {
               --var9;
               ++var10;
            }

            if (var6 == 6) {
               ++var10;
            }

            if (var6 == 7) {
               ++var9;
               ++var10;
            }

            playerRegions[var1] = (var8 << 28) + (var9 << 14) + var10;
            return false;
         } else {
            var4 = var0.readBits(18);
            var5 = var4 >> 16;
            var6 = var4 >> 8 & 255;
            var7 = var4 & 255;
            var8 = playerRegions[var1];
            var9 = var5 + (var8 >> 28) & 3;
            var10 = var6 + (var8 >> 14) & 255;
            var11 = var7 + var8 & 255;
            playerRegions[var1] = var11 + (var10 << 14) + (var9 << 28);
            return false;
         }
      }
   }

   static final void readUpdateFlags(PacketBuffer maskBuf) {
      for(int i = 0; i < pendingUpdateCount; ++i) {
         int index = pendingPlayerUpdateIndexes[i];
         Player player = Client.players[index];
         int mask = maskBuf.readUnsignedByte();
         if ((mask & 0x4) != 0) {
            mask += maskBuf.readUnsignedByte() << 8;
         }

         // Unknown : 1
         if (0 != (mask & 0x4000)) {
            mask += maskBuf.readUnsignedByte() << 16;
         }

         // : 2
         byte movementType = MovementType.NONE.id;
         if (0 != (mask & 512)) {
            MovementType[] var7 = movementTypeCache;
            MovementType[] var9 = new MovementType[]{MovementType.NONE, MovementType.field2457, MovementType.field2451, MovementType.field2450};
            var7[index] = (MovementType)class373.method1724(var9, maskBuf.readByteAdd());
         }

         // 3
         int length;
         if ((mask & 32) != 0) {
            player.targetIndex = maskBuf.readUnsignedShortLEAdd();
            player.targetIndex += maskBuf.readUnsignedByte() << 16;
            length = 16777215;
            if (player.targetIndex == length) {
               player.targetIndex = -1;
            }
         }

         // 4
         int var8;
         if ((mask & 2) != 0) {
            length = maskBuf.readUnsignedShortLE();
            if (length == 65535) {
               length = -1;
            }

            var8 = maskBuf.readUnsignedByteAdd();
            class265.method5208(player, length, var8);
         }

         // : 5
         int var10;
         int var11;
         int var14;
         if ((mask & 16) != 0) {
            length = maskBuf.readUnsignedShort();
            class361 var19 = (class361)class373.method1724(class361.method2121(), maskBuf.readUnsignedByteNeg());
            boolean var20 = maskBuf.readUnsignedByte() == 1;
            var10 = maskBuf.readUnsignedByteSub();
            var11 = maskBuf.offset;
            if (null != player.field740 && null != player.field764) {
               boolean var12 = false;
               if (var19.field3997 && class165.field1782.method1096(player.field740)) {
                  var12 = true;
               }

               if (!var12 && Client.field1553 == 0 && !player.field760) {
                  field1125.offset = 0;
                  maskBuf.readBytesReversedAdd(field1125.data, 0, var10);
                  field1125.offset = 0;
                  String var13 = class407.method7161(class380.method2549(class307.method5741(field1125)));
                  player.field971 = var13.trim();
                  player.field965 = length >> 8;
                  player.field966 = length & 255;
                  player.field940 = 150;
                  player.field947 = null;
                  player.field962 = var20;
                  player.field950 = player != class146.field1362 && var19.field3997 && !Client.field1663.isEmpty() && var13.toLowerCase().indexOf(Client.field1663) == -1;
                  if (var19.field3996) {
                     var14 = var20 ? 91 : 1;
                  } else {
                     var14 = var20 ? 90 : 2;
                  }

                  if (-1 != var19.field3995) {
                     class119.method7274(var14, class90.method2108(var19.field3995) + player.field740.method9155(), var13);
                  } else {
                     class119.method7274(var14, player.field740.method9155(), var13);
                  }
               }
            }

            maskBuf.offset = var11 + var10;
         }

         // : 6
         if ((mask & 8192) != 0) {
            for(length = 0; length < 3; ++length) {
               player.field742[length] = maskBuf.readString();
            }
         }

         // : 7
         if (0 != (mask & 4096)) {
            player.field992 = maskBuf.readByteSub();
            player.field994 = maskBuf.readByteAdd();
            player.field954 = maskBuf.readByteAdd();
            player.field982 = maskBuf.readByteSub();
            player.field964 = maskBuf.readUnsignedShortAdd() + Client.field1445;
            player.field997 = maskBuf.readUnsignedShortLEAdd() + Client.field1445;
            player.field990 = maskBuf.readUnsignedShortLEAdd();
            if (player.teleporting) {
               player.field992 += player.field758;
               player.field994 += player.field766;
               player.field954 += player.field758;
               player.field982 += player.field766;
               player.field1010 = 0;
            } else {
               player.field992 += player.pathX[0];
               player.field994 += player.pathY[0];
               player.field954 += player.pathX[0];
               player.field982 += player.pathY[0];
               player.field1010 = 1;
            }

            player.field1015 = 0;
         }

         // : 8
         if (0 != (mask & 0x40)) {
            player.field971 = maskBuf.readString();
            if (player.field971.charAt(0) == '~') {
               player.field971 = player.field971.substring(1);
               class119.method7274(2, player.field740.method9155(), player.field971);
            } else if (player == class146.field1362) {
               class119.method7274(2, player.field740.method9155(), player.field971);
            }

            player.field962 = false;
            player.field965 = 0;
            player.field966 = 0;
            player.field940 = 150;
         }

         // : 9
         if ((mask & 0x8000) != 0) {
            movementType = maskBuf.readByteSub();
         }

         // : 9
         int var21;
         int var28;
         int var29;
         if ((mask & 2048) != 0) {
            length = maskBuf.readUnsignedShortLEAdd();
            var8 = length >> 8;
            var21 = var8 >= 13 && var8 <= 20 ? var8 - 12 : 0;
            class361 var22 = (class361)class373.method1724(class361.method2121(), maskBuf.readUnsignedByteAdd());
            boolean var26 = maskBuf.readUnsignedByteAdd() == 1;
            var28 = maskBuf.readUnsignedByteAdd();
            var29 = maskBuf.offset;
            if (player.field740 != null && player.field764 != null) {
               boolean var30 = false;
               if (var22.field3997 && class165.field1782.method1096(player.field740)) {
                  var30 = true;
               }

               if (!var30 && Client.field1553 == 0 && !player.field760) {
                  field1125.offset = 0;
                  maskBuf.readBytesReversed(field1125.data, 0, var28);
                  field1125.offset = 0;
                  String var15 = class407.method7161(class380.method2549(class307.method5741(field1125)));
                  player.field971 = var15.trim();
                  player.field965 = length >> 8;
                  player.field966 = length & 255;
                  player.field940 = 150;
                  byte[] var16 = null;
                  int var17;
                  if (var21 > 0 && var21 <= 8) {
                     var16 = new byte[var21];

                     for(var17 = 0; var17 < var21; ++var17) {
                        var16[var17] = maskBuf.readByteNeg();
                     }
                  }

                  player.field947 = class533.method7678(var16);
                  player.field962 = var26;
                  player.field950 = class146.field1362 != player && var22.field3997 && !Client.field1663.isEmpty() && var15.toLowerCase().indexOf(Client.field1663) == -1;
                  if (var22.field3996) {
                     var17 = var26 ? 91 : 1;
                  } else {
                     var17 = var26 ? 90 : 2;
                  }

                  if (-1 != var22.field3995) {
                     class119.method7274(var17, class90.method2108(var22.field3995) + player.field740.method9155(), var15);
                  } else {
                     class119.method7274(var17, player.field740.method9155(), var15);
                  }
               }
            }

            maskBuf.offset = var21 + var29 + var28;
         }

         // : 10
         if (0 != (mask & 65536)) {
            length = maskBuf.readUnsignedByteAdd();

            for(var8 = 0; var8 < length; ++var8) {
               var21 = maskBuf.readUnsignedByteSub();
               var10 = maskBuf.readUnsignedShort();
               var11 = maskBuf.readIntIME();
               player.method2080(var21, var10, var11 >> 16, var11 & '\uffff');
            }
         }

         // : 11
         if (0 != (mask & 8)) {
            length = maskBuf.readUnsignedByteAdd();
            if (length > 0) {
               for(var8 = 0; var8 < length; ++var8) {
                  var10 = -1;
                  var11 = -1;
                  var28 = -1;
                  var21 = maskBuf.readUnsignedSmartByteShort();
                  if (var21 == 32767) {
                     var21 = maskBuf.readUnsignedSmartByteShort();
                     var11 = maskBuf.readUnsignedSmartByteShort();
                     var10 = maskBuf.readUnsignedSmartByteShort();
                     var28 = maskBuf.readUnsignedSmartByteShort();
                  } else if (var21 != 32766) {
                     var11 = maskBuf.readUnsignedSmartByteShort();
                  } else {
                     var21 = -1;
                  }

                  var29 = maskBuf.readUnsignedSmartByteShort();
                  player.method2066(var21, var11, var10, var28, Client.field1445, var29);
               }
            }

            var8 = maskBuf.readUnsignedByteNeg();
            if (var8 > 0) {
               for(var21 = 0; var21 < var8; ++var21) {
                  var10 = maskBuf.readUnsignedSmartByteShort();
                  var11 = maskBuf.readUnsignedSmartByteShort();
                  if (var11 != 32767) {
                     var28 = maskBuf.readUnsignedSmartByteShort();
                     var29 = maskBuf.readUnsignedByte();
                     var14 = var11 > 0 ? maskBuf.readUnsignedByteNeg() : var29;
                     player.method2067(var10, Client.field1445, var11, var28, var29, var14);
                  } else {
                     player.method2068(var10);
                  }
               }
            }
         }

         // : 12
         if ((mask & 128) != 0) {
            player.field977 = maskBuf.readUnsignedShortAdd();
            if (player.field1010 == 0) {
               player.field1007 = player.field977;
               player.method2073();
            }
         }

         // : 13
         if (0 != (mask & 256)) {
            player.field941 = Client.field1445 + maskBuf.readUnsignedShort();
            player.field1002 = Client.field1445 + maskBuf.readUnsignedShortLEAdd();
            player.field1003 = maskBuf.readByteSub();
            player.field996 = maskBuf.readByteNeg();
            player.field1005 = maskBuf.readByte();
            player.field1006 = (byte)maskBuf.readUnsignedByte();
         }

         // APPEARANCE : 14
         if ((mask & 0x1) != 0) {
            length = maskBuf.readUnsignedByte();
            byte[] data = new byte[length];
            Buffer appearanceBuf = new Buffer(data);
            maskBuf.readBytesReversed(data, 0, length);
            playerAppearances[index] = appearanceBuf;
            player.updateAppearance(appearanceBuf);
         }

         if (player.teleporting) {
            if (movementType == 127) {
               player.method1795(player.field758, player.field766);
            } else {
               MovementType var24;
               if (movementType != MovementType.NONE.id) {
                  MovementType[] var25 = new MovementType[]{MovementType.NONE, MovementType.field2457, MovementType.field2451, MovementType.field2450};
                  var24 = (MovementType)class373.method1724(var25, movementType);
               } else {
                  var24 = movementTypeCache[index];
               }

               player.method1786(player.field758, player.field766, var24);
            }
         }
      }

   }

   static void method4187() {
      localPlayerCount = 0;

      for(int var1 = 0; var1 < 2048; ++var1) {
         playerAppearances[var1] = null;
         movementTypeCache[var1] = MovementType.field2457;
      }

   }
}
