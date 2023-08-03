import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class class79 {
   boolean field690 = false;
   boolean field691;
   boolean field698 = false;
   boolean field700;
   double field694 = 0.8;
   int field687;
   int field689 = -1;
   int field692 = 127;
   int field695 = 127;
   int field696 = 127;
   int field697 = 1;
   String field699 = null;
   final Map field701 = new LinkedHashMap();

   class79() {
      this.method1610(true);
   }

   class79(PacketBuffer var1) {
      if (var1 != null && var1.data != null) {
         int var2 = var1.readUnsignedByte();
         if (var2 >= 0 && var2 <= 10) {
            if (var1.readUnsignedByte() == 1) {
               this.field700 = true;
            }

            if (var2 > 1) {
               this.field691 = var1.readUnsignedByte() == 1;
            }

            if (var2 > 3) {
               this.field697 = var1.readUnsignedByte();
            }

            if (var2 > 2) {
               int var3 = var1.readUnsignedByte();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.readInt();
                  int var6 = var1.readInt();
                  this.field701.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.field699 = var1.method8758();
            }

            if (var2 > 5) {
               this.field690 = var1.readBoolean();
            }

            if (var2 > 6) {
               this.field694 = (double)var1.readUnsignedByte() / 100.0;
               this.field695 = var1.readUnsignedByte();
               this.field692 = var1.readUnsignedByte();
               this.field696 = var1.readUnsignedByte();
            }

            if (var2 > 7) {
               this.field689 = var1.readUnsignedByte();
            }

            if (var2 > 8) {
               this.field698 = var1.readUnsignedByte() == 1;
            }

            if (var2 > 9) {
               this.field687 = var1.readInt();
            }
         } else {
            this.method1610(true);
         }
      } else {
         this.method1610(true);
      }

   }

   static class79 method2441() {
      class508 var1 = null;
      class79 var2 = new class79();

      try {
         var1 = class160.method1257("", class12.field65.field3968, false);
         byte[] var3 = new byte[(int)var1.method8613()];

         int var5;
         for(int var4 = 0; var4 < var3.length; var4 += var5) {
            var5 = var1.method8615(var3, var4, var3.length - var4);
            if (var5 == -1) {
               throw new IOException();
            }
         }

         var2 = new class79(new PacketBuffer(var3));
      } catch (Exception var7) {
      }

      try {
         if (var1 != null) {
            var1.method8611();
         }
      } catch (Exception var6) {
      }

      return var2;
   }

   static void method6485() {
      class508 var1 = null;

      try {
         var1 = class160.method1257("", class12.field65.field3968, true);
         PacketBuffer var2 = class141.field1307.method1611();
         var1.method8610(var2.data, 0, var2.offset);
      } catch (Exception var4) {
      }

      try {
         if (null != var1) {
            var1.method8624(true);
         }
      } catch (Exception var3) {
      }

   }

   void method1610(boolean var1) {
   }

   PacketBuffer method1611() {
      PacketBuffer var2 = new PacketBuffer(417, true);
      var2.writeByte(10);
      var2.writeByte(this.field700 ? 1 : 0);
      var2.writeByte(this.field691 ? 1 : 0);
      var2.writeByte(this.field697);
      var2.writeByte(this.field701.size());
      Iterator var3 = this.field701.entrySet().iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         var2.writeInt((Integer)var4.getKey());
         var2.writeInt((Integer)var4.getValue());
      }

      var2.writeString(null != this.field699 ? this.field699 : "");
      var2.writeBoolean(this.field690);
      var2.writeByte((int)(this.field694 * 100.0));
      var2.writeByte(this.field695);
      var2.writeByte(this.field692);
      var2.writeByte(this.field696);
      var2.writeByte(this.field689);
      var2.writeByte(this.field698 ? 1 : 0);
      var2.writeInt(this.field687);
      return var2;
   }

   void method1612(boolean var1) {
      this.field700 = var1;
      method6485();
   }

   boolean method1613() {
      return this.field700;
   }

   void method1677(boolean var1) {
      this.field690 = var1;
      method6485();
   }

   boolean method1615() {
      return this.field690;
   }

   void method1616(boolean var1) {
      this.field691 = var1;
      method6485();
   }

   boolean method1617() {
      return this.field691;
   }

   void method1667(boolean var1) {
      this.field698 = var1;
      method6485();
   }

   void method1649() {
      this.method1667(!this.field698);
   }

   boolean method1694() {
      return this.field698;
   }

   void method1621(int var1) {
      this.field687 = var1;
      method6485();
   }

   int method1609() {
      return this.field687;
   }

   void method1623(double var1) {
      this.field694 = var1;
      method6485();
   }

   double method1624() {
      return this.field694;
   }

   void method1676(int var1) {
      this.field695 = var1;
      method6485();
   }

   int method1626() {
      return this.field695;
   }

   void method1627(int var1) {
      this.field692 = var1;
      method6485();
   }

   int method1628() {
      return this.field692;
   }

   void method1704(int var1) {
      this.field696 = var1;
      method6485();
   }

   int method1629() {
      return this.field696;
   }

   void method1630(String var1) {
      this.field699 = var1;
      method6485();
   }

   String method1631() {
      return this.field699;
   }

   void method1632(int var1) {
      this.field689 = var1;
      method6485();
   }

   int method1687() {
      return this.field689;
   }

   void method1720(int var1) {
      this.field697 = var1;
      method6485();
   }

   int method1635() {
      return this.field697;
   }

   void method1636(String var1, int var2) {
      int var4 = this.method1639(var1);
      if (this.field701.size() >= 10 && !this.field701.containsKey(var4)) {
         Iterator var5 = this.field701.entrySet().iterator();
         var5.next();
         var5.remove();
      }

      this.field701.put(var4, var2);
      method6485();
   }

   boolean method1688(String var1) {
      int var3 = this.method1639(var1);
      return this.field701.containsKey(var3);
   }

   int method1638(String var1) {
      int var3 = this.method1639(var1);
      return !this.field701.containsKey(var3) ? 0 : (Integer)this.field701.get(var3);
   }

   int method1639(String var1) {
      return class380.method4401(var1.toLowerCase());
   }
}
