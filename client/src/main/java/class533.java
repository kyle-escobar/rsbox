public class class533 {
   static int field5189;
   static final int[] field5190 = new int[]{16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472};

   class533() throws Throwable {
   }

   public static class308 method7051(int var0, String var1, class384 var2, int var3) {
      class308 var5 = class308.method8607(ClientPacket.field3380, Client.serverConnection.field1046);
      var5.packet.writeByte(0);
      int var6 = var5.packet.offset;
      var5.packet.writeByte(var0);
      String var7 = var1.toLowerCase();
      int var8 = 0;
      byte[] var9 = null;
      if (var7.startsWith(class364.field4210)) {
         var8 = 0;
         var1 = var1.substring(class364.field4210.length());
      } else if (var7.startsWith(class364.field4211)) {
         var8 = 1;
         var1 = var1.substring(class364.field4211.length());
      } else if (var7.startsWith(class364.field4212)) {
         var8 = 2;
         var1 = var1.substring(class364.field4212.length());
      } else if (var7.startsWith(class364.field4213)) {
         var8 = 3;
         var1 = var1.substring(class364.field4213.length());
      } else if (var7.startsWith(class364.field4309)) {
         var8 = 4;
         var1 = var1.substring(class364.field4309.length());
      } else if (var7.startsWith(class364.field4215)) {
         var8 = 5;
         var1 = var1.substring(class364.field4215.length());
      } else if (var7.startsWith(class364.field4216)) {
         var8 = 6;
         var1 = var1.substring(class364.field4216.length());
      } else if (var7.startsWith(class364.field4029)) {
         var8 = 7;
         var1 = var1.substring(class364.field4029.length());
      } else if (var7.startsWith(class364.field4264)) {
         var8 = 8;
         var1 = var1.substring(class364.field4264.length());
      } else if (var7.startsWith(class364.field4271)) {
         var8 = 9;
         var1 = var1.substring(class364.field4271.length());
      } else if (var7.startsWith(class364.field4076)) {
         var8 = 10;
         var1 = var1.substring(class364.field4076.length());
      } else if (var7.startsWith(class364.field4221)) {
         var8 = 11;
         var1 = var1.substring(class364.field4221.length());
      } else if (var7.startsWith(class364.field4222)) {
         var8 = 12;
         var1 = var1.substring(class364.field4222.length());
      } else if (var7.startsWith(class364.field4223)) {
         boolean var11 = true;
         boolean var12 = true;
         int var13 = class364.field4223.length();
         int var14 = 0;
         byte[] var15 = new byte[8];

         byte[] var10;
         while(true) {
            int var16 = var13 + var14;
            if (var16 >= var7.length()) {
               var10 = null;
               break;
            }

            char var17 = var7.charAt(var16);
            if (var17 == ':') {
               if (var14 == 0) {
                  var10 = null;
               } else {
                  byte[] var20 = new byte[var14];
                  System.arraycopy(var15, 0, var20, 0, var14);
                  var10 = var20;
               }
               break;
            }

            if (var15.length == var14) {
               var10 = null;
               break;
            }

            if (var17 >= '0' && var17 <= '9') {
               var17 = (char)(var17 - 48);
            } else {
               if (var17 < 'a' || var17 > 'z') {
                  var10 = null;
                  break;
               }

               var17 = (char)(var17 - 87);
            }

            var15[var14++] = (byte)var17;
         }

         var9 = var10;
         if (null != var10) {
            var8 = 12 + var10.length;
            var1 = var1.substring(class364.field4223.length() + var10.length + 1);
         }
      }

      var7 = var1.toLowerCase();
      byte var19 = 0;
      if (var7.startsWith(class364.field4110)) {
         var19 = 1;
         var1 = var1.substring(class364.field4110.length());
      } else if (var7.startsWith(class364.field4096)) {
         var19 = 2;
         var1 = var1.substring(class364.field4096.length());
      } else if (var7.startsWith(class364.field4206)) {
         var19 = 3;
         var1 = var1.substring(class364.field4206.length());
      } else if (var7.startsWith(class364.field4237)) {
         var19 = 4;
         var1 = var1.substring(class364.field4237.length());
      } else if (var7.startsWith(class364.field4118)) {
         var19 = 5;
         var1 = var1.substring(class364.field4118.length());
      }

      var5.packet.writeByte(var8);
      var5.packet.writeByte(var19);
      if (null != var9 && Client.revision >= 214) {
         for(int var18 = 0; var18 < var9.length; ++var18) {
            var5.packet.writeByte(var9[var18]);
         }
      }

      class324.method86(var5.packet, var1);
      if (var0 == class340.field3810.serialId()) {
         var5.packet.writeByte(var3);
      }

      var5.packet.writeLengthByte(var5.packet.offset - var6);
      return var5;
   }

   public static int[] method7678(byte[] var0) {
      if (null != var0 && var0.length != 0 && var0.length <= 8) {
         int[] var2 = new int[var0.length];

         for(int var3 = 0; var3 < var0.length; ++var3) {
            if (var0[var3] < 0 || var0[var3] > field5190.length) {
               return null;
            }

            var2[var3] = field5190[var0[var3]];
         }

         return var2;
      } else {
         return null;
      }
   }
}
