public class class328 extends class470 {
   byte[] field3574;
   class481 field3573 = new class481(16);

   class328(PacketBuffer var1) {
      var1.offset = var1.data.length - 3;
      int var2 = var1.readUnsignedByte();
      int var3 = var1.readUnsignedShort();
      int var4 = 14 + var2 * 10;
      var1.offset = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;

      int var14;
      int var15;
      label280:
      while(var13 < var2) {
         var14 = -1;

         while(true) {
            var15 = var1.readUnsignedByte();
            if (var15 != var14) {
               ++var4;
            }

            var14 = var15 & 15;
            if (var15 == 7) {
               ++var13;
               break;
            }

            if (var15 == 23) {
               ++var5;
            } else if (var14 == 0) {
               ++var7;
            } else if (var14 == 1) {
               ++var8;
            } else if (var14 == 2) {
               ++var6;
            } else if (var14 == 3) {
               ++var9;
            } else if (var14 == 4) {
               ++var10;
            } else if (var14 == 5) {
               ++var11;
            } else {
               if (var14 != 6) {
                  break label280;
               }

               ++var12;
            }
         }
      }

      var4 += var5 * 5;
      var4 += 2 * (var7 + var8 + var6 + var9 + var11);
      var4 += var10 + var12;
      var13 = var1.offset;
      var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for(var15 = 0; var15 < var14; ++var15) {
         var1.readVarInt();
      }

      var4 += var1.offset - var13;
      var15 = var1.offset;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28 = 0;

      int var29;
      for(var29 = 0; var29 < var6; ++var29) {
         var28 = var28 + var1.readUnsignedByte() & 127;
         if (var28 != 0 && var28 != 32) {
            if (var28 == 1) {
               ++var16;
            } else if (var28 == 33) {
               ++var17;
            } else if (var28 == 7) {
               ++var18;
            } else if (var28 == 39) {
               ++var19;
            } else if (var28 == 10) {
               ++var20;
            } else if (var28 == 42) {
               ++var21;
            } else if (var28 == 99) {
               ++var22;
            } else if (var28 == 98) {
               ++var23;
            } else if (var28 == 101) {
               ++var24;
            } else if (var28 == 100) {
               ++var25;
            } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
               ++var27;
            } else {
               ++var26;
            }
         } else {
            ++var12;
         }
      }

      var29 = 0;
      int var30 = var1.offset;
      var1.offset += var26;
      int var31 = var1.offset;
      var1.offset += var11;
      int var32 = var1.offset;
      var1.offset += var10;
      int var33 = var1.offset;
      var1.offset += var9;
      int var34 = var1.offset;
      var1.offset += var16;
      int var35 = var1.offset;
      var1.offset += var18;
      int var36 = var1.offset;
      var1.offset += var20;
      int var37 = var1.offset;
      var1.offset += var7 + var8 + var11;
      int var38 = var1.offset;
      var1.offset += var7;
      int var39 = var1.offset;
      var1.offset += var27;
      int var40 = var1.offset;
      var1.offset += var8;
      int var41 = var1.offset;
      var1.offset += var17;
      int var42 = var1.offset;
      var1.offset += var19;
      int var43 = var1.offset;
      var1.offset += var21;
      int var44 = var1.offset;
      var1.offset += var12;
      int var45 = var1.offset;
      var1.offset += var9;
      int var46 = var1.offset;
      var1.offset += var22;
      int var47 = var1.offset;
      var1.offset += var23;
      int var48 = var1.offset;
      var1.offset += var24;
      int var49 = var1.offset;
      var1.offset += var25;
      int var50 = var1.offset;
      var1.offset += var5 * 3;
      this.field3574 = new byte[var4];
      PacketBuffer var51 = new PacketBuffer(this.field3574);
      var51.writeInt(1297377380);
      var51.writeInt(6);
      var51.writeShort(var2 > 1 ? 1 : 0);
      var51.writeShort(var2);
      var51.writeShort(var3);
      var1.offset = var13;
      int var52 = 0;
      int var53 = 0;
      int var54 = 0;
      int var55 = 0;
      int var56 = 0;
      int var57 = 0;
      int var58 = 0;
      int[] var59 = new int[128];
      var28 = 0;
      int[] var60 = new int[16];
      int[] var61 = new int[16];
      var61[9] = 128;
      var60[9] = 128;
      int var63 = 0;

      label219:
      while(var63 < var2) {
         var51.writeInt(1297379947);
         var51.offset += 4;
         int var64 = var51.offset;
         int var65 = var64;
         int var66 = -1;

         while(true) {
            while(true) {
               int var67 = var1.readVarInt();
               var51.writeVarInt(var67);
               var65 += var67;
               int var68 = var1.data[var29++] & 255;
               boolean var69 = var68 != var66;
               var66 = var68 & 15;
               if (var68 == 7) {
                  if (var69) {
                     var51.writeByte(255);
                  }

                  var51.writeByte(47);
                  var51.writeByte(0);
                  var51.writeLengthInt(var51.offset - var64);
                  ++var63;
                  continue label219;
               }

               if (var68 == 23) {
                  if (var69) {
                     var51.writeByte(255);
                  }

                  var51.writeByte(81);
                  var51.writeByte(3);
                  var51.writeByte(var1.data[var50++]);
                  var51.writeByte(var1.data[var50++]);
                  var51.writeByte(var1.data[var50++]);
               } else {
                  var52 ^= var68 >> 4;
                  int var70;
                  int var71;
                  if (var66 == 0) {
                     if (var69) {
                        var51.writeByte(var52 + 144);
                     }

                     var53 += var1.data[var37++];
                     var54 += var1.data[var38++];
                     var70 = var53 & 127;
                     var71 = var54 & 127;
                     var51.writeByte(var70);
                     var51.writeByte(var71);
                     if (var71 > 0) {
                        int var72 = var61[var52];
                        class336 var73 = (class336)this.field3573.method8184((long)var72);
                        if (var73 == null) {
                           var73 = new class336(var65);
                           this.field3573.method8193(var73, (long)var72);
                        }

                        var73.field3779.set(var70);
                     }
                  } else if (var66 == 1) {
                     if (var69) {
                        var51.writeByte(var52 + 128);
                     }

                     var53 += var1.data[var37++];
                     var55 += var1.data[var40++];
                     var51.writeByte(var53 & 127);
                     var51.writeByte(var55 & 127);
                  } else if (var66 == 2) {
                     if (var69) {
                        var51.writeByte(var52 + 176);
                     }

                     var28 = var28 + var1.data[var15++] & 127;
                     var51.writeByte(var28);
                     if (var28 != 0 && var28 != 32) {
                        if (var28 == 1) {
                           var70 = var1.data[var34++];
                        } else if (var28 == 33) {
                           var70 = var1.data[var41++];
                        } else if (var28 == 7) {
                           var70 = var1.data[var35++];
                        } else if (var28 == 39) {
                           var70 = var1.data[var42++];
                        } else if (var28 == 10) {
                           var70 = var1.data[var36++];
                        } else if (var28 == 42) {
                           var70 = var1.data[var43++];
                        } else if (var28 == 99) {
                           var70 = var1.data[var46++];
                        } else if (var28 == 98) {
                           var70 = var1.data[var47++];
                        } else if (var28 == 101) {
                           var70 = var1.data[var48++];
                        } else if (var28 == 100) {
                           var70 = var1.data[var49++];
                        } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
                           var70 = var1.data[var39++];
                        } else {
                           var70 = var1.data[var30++];
                        }
                     } else {
                        var70 = var1.data[var44++];
                     }

                     var70 += var59[var28];
                     var59[var28] = var70;
                     var71 = var70 & 127;
                     var51.writeByte(var71);
                     if (var28 == 0) {
                        var60[var52] = (var60[var52] & -2080769) + (var71 << 14);
                     }

                     if (var28 == 32) {
                        var60[var52] = (var60[var52] & -16257) + (var71 << 7);
                     }
                  } else if (var66 == 3) {
                     if (var69) {
                        var51.writeByte(var52 + 224);
                     }

                     var56 += var1.data[var45++];
                     var56 += var1.data[var33++] << 7;
                     var51.writeByte(var56 & 127);
                     var51.writeByte(var56 >> 7 & 127);
                  } else if (var66 == 4) {
                     if (var69) {
                        var51.writeByte(var52 + 208);
                     }

                     var57 += var1.data[var32++];
                     var51.writeByte(var57 & 127);
                  } else if (var66 == 5) {
                     if (var69) {
                        var51.writeByte(var52 + 160);
                     }

                     var53 += var1.data[var37++];
                     var58 += var1.data[var31++];
                     var51.writeByte(var53 & 127);
                     var51.writeByte(var58 & 127);
                  } else {
                     if (var66 != 6) {
                        return;
                     }

                     if (var69) {
                        var51.writeByte(var52 + 192);
                     }

                     var70 = var1.data[var44++];
                     var61[var52] = var60[var52] + var70;
                     var51.writeByte(var70);
                  }
               }
            }
         }
      }

   }

   public static class328 method6179(class342 var0, int var1, int var2) {
      byte[] var3 = var0.method6381(var1, var2);
      return var3 == null ? null : new class328(new PacketBuffer(var3));
   }
}
