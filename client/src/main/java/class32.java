import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class class32 {
   static class537[] field158;

   static {
      ImageIO.setUseCache(false);
   }

   class32() throws Throwable {
   }

   public static final class523 method2580(byte[] var0) {
      BufferedImage var2 = null;

      try {
         Class var3 = ImageIO.class;
         synchronized(ImageIO.class) {
            var2 = ImageIO.read(new ByteArrayInputStream(var0));
         }

         int var10 = var2.getWidth();
         int var4 = var2.getHeight();
         int[] var5 = new int[var4 * var10];
         PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var10, var4, var5, 0, var10);
         var6.grabPixels();
         return new class523(var5, var10, var4);
      } catch (IOException var8) {
      } catch (InterruptedException var9) {
      }

      return new class523(0, 0);
   }

   static final void method497(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var5 = Client.method7749(var5, var6);
      int var8 = 2048 - var3 & 2047;
      int var9 = 2048 - var4 & 2047;
      int var10 = 0;
      int var11 = 0;
      int var12 = var5;
      int var13;
      int var14;
      int var15;
      if (var8 != 0) {
         var13 = class229.field2511[var8];
         var14 = class229.field2512[var8];
         var15 = var14 * var11 - var13 * var5 >> 16;
         var12 = var13 * var11 + var14 * var5 >> 16;
         var11 = var15;
      }

      if (var9 != 0) {
         var13 = class229.field2511[var9];
         var14 = class229.field2512[var9];
         var15 = var13 * var12 + var14 * var10 >> 16;
         var12 = var12 * var14 - var10 * var13 >> 16;
         var10 = var15;
      }

      if (Client.field1689) {
         class437.field4665 = var0 - var10;
         class392.field4450 = var1 - var11;
         class388.field4442 = var2 - var12;
         class169.field1810 = var3;
         class19.field102 = var4;
      } else {
         class172.field1822 = var0 - var10;
         class372.field4350 = var1 - var11;
         class50.field362 = var2 - var12;
         class15.field74 = var3;
         class456.field4751 = var4;
      }

      if (1 == Client.field1521 && Client.privilege >= 2 && Client.field1445 % 50 == 0 && (class146.field1362.field949 >> 7 != class468.field4805 >> 7 || class44.field302 >> 7 != class146.field1362.field963 >> 7)) {
         var13 = class146.field1362.field759;
         var14 = class342.field3837 + (class468.field4805 >> 7);
         var15 = (class44.field302 >> 7) + class144.field1352;
         class308 var16 = class308.method8607(ClientPacket.field3432, Client.serverConnection.field1046);
         var16.packet.writeIntME(Client.field1540);
         var16.packet.writeShortLEAdd(var14);
         var16.packet.writeByteAdd(var13);
         var16.packet.writeShortAdd(var15);
         Client.serverConnection.method2148(var16);
      }

   }
}
