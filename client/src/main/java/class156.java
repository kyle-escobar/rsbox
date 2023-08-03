import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public class class156 extends class476 {
   boolean field1428;
   class143[][] field1426 = (class143[][])null;
   int field1423;
   int field1427 = 0;
   List field1430;
   Future field1429;
   public class143[][] field1424 = (class143[][])null;
   public class219 field1425;

   public class156(class342 var1, class342 var2, int var3, boolean var4) {
      this.field1423 = var3;
      byte[] var5 = var1.method6381(this.field1423 >> 16 & '\uffff', this.field1423 & '\uffff');
      PacketBuffer var6 = new PacketBuffer(var5);
      int var7 = var6.readUnsignedByte();
      int var8 = var6.readUnsignedShort();
      byte[] var9;
      if (var4) {
         var9 = var2.method6389(0, var8);
      } else {
         var9 = var2.method6389(var8, 0);
      }

      this.field1425 = new class219(var8, var9);
      this.field1430 = new ArrayList();
      this.field1429 = class34.field173.submit(new class155(this, var6, var7));
   }

   void method2659(PacketBuffer var1, int var2) {
      var1.readUnsignedShort();
      var1.readUnsignedShort();
      this.field1427 = var1.readUnsignedByte();
      int var4 = var1.readUnsignedShort();
      this.field1426 = new class143[this.field1425.method4198().method4367()][];
      this.field1424 = new class143[this.field1425.method4203()][];
      class120[] var5 = new class120[var4];

      int var6;
      int var8;
      int var19;
      for(var6 = 0; var6 < var4; ++var6) {
         var8 = var1.readUnsignedByte();
         class131[] var9 = new class131[]{class131.field1227, class131.field1228, class131.field1231, class131.field1230, class131.field1233, class131.field1232};
         class131 var10 = (class131)class373.method1724(var9, var8);
         if (null == var10) {
            var10 = class131.field1227;
         }

         var19 = var1.readSmartByteShort();
         int var12 = var1.readUnsignedByte();
         class137 var13 = (class137)class373.method1724(class137.method1197(), var12);
         if (var13 == null) {
            var13 = class137.field1266;
         }

         class143 var14 = new class143();
         var14.method2521(var1, var2);
         var5[var6] = new class120(this, var14, var10, var13, var19);
         int var15 = var10.method2443();
         class143[][] var16;
         if (var10 == class131.field1228) {
            var16 = this.field1426;
         } else {
            var16 = this.field1424;
         }

         if (null == var16[var19]) {
            var16[var19] = new class143[var15];
         }

         if (class131.field1233 == var10) {
            this.field1428 = true;
         }
      }

      var6 = var4 / class118.field1132;
      int var17 = var4 % class118.field1132;
      int var18 = 0;

      for(var19 = 0; var19 < class118.field1132; ++var19) {
         var8 = var18;
         var18 += var6;
         if (var17 > 0) {
            ++var18;
            --var17;
         }

         if (var8 == var18) {
            break;
         }

         this.field1430.add(class34.field173.submit(new class146(this, var8, var18, var5)));
      }

   }

   public boolean method2660() {
      if (null == this.field1429 && this.field1430 == null) {
         return true;
      } else {
         if (this.field1429 != null) {
            if (!this.field1429.isDone()) {
               return false;
            }

            this.field1429 = null;
         }

         boolean var2 = true;

         for(int var3 = 0; var3 < this.field1430.size(); ++var3) {
            if (!((Future)this.field1430.get(var3)).isDone()) {
               var2 = false;
            } else {
               this.field1430.remove(var3);
               --var3;
            }
         }

         if (!var2) {
            return false;
         } else {
            this.field1430 = null;
            return true;
         }
      }
   }

   public int method2686() {
      return this.field1427;
   }

   public boolean method2677() {
      return this.field1428;
   }

   public void method2663(int var1, class115 var2, int var3, int var4) {
      class455 var6 = class455.method2516();
      this.method2664(var6, var3, var2, var1);
      this.method2679(var6, var3, var2, var1);
      this.method2665(var6, var3, var2, var1);
      var2.method2264(var6);
      var6.method7978();
   }

   void method2664(class455 var1, int var2, class115 var3, int var4) {
      float[] var6 = var3.method2241(this.field1427);
      float var7 = var6[0];
      float var8 = var6[1];
      float var9 = var6[2];
      if (null != this.field1426[var2]) {
         class143 var10 = this.field1426[var2][0];
         class143 var11 = this.field1426[var2][1];
         class143 var12 = this.field1426[var2][2];
         if (null != var10) {
            var7 = var10.method2523(var4);
         }

         if (var11 != null) {
            var8 = var11.method2523(var4);
         }

         if (var12 != null) {
            var9 = var12.method2523(var4);
         }
      }

      class452 var15 = class452.method4916();
      var15.method7892(1.0F, 0.0F, 0.0F, var7);
      class452 var16 = class452.method4916();
      var16.method7892(0.0F, 1.0F, 0.0F, var8);
      class452 var17 = class452.method4916();
      var17.method7892(0.0F, 0.0F, 1.0F, var9);
      class452 var13 = class452.method4916();
      var13.method7898(var17);
      var13.method7898(var15);
      var13.method7898(var16);
      class455 var14 = class455.method2516();
      var14.method7954(var13);
      var1.method7984(var14);
      var15.method7894();
      var16.method7894();
      var17.method7894();
      var13.method7894();
      var14.method7978();
   }

   void method2665(class455 var1, int var2, class115 var3, int var4) {
      float[] var6 = var3.method2242(this.field1427);
      float var7 = var6[0];
      float var8 = var6[1];
      float var9 = var6[2];
      if (null != this.field1426[var2]) {
         class143 var10 = this.field1426[var2][3];
         class143 var11 = this.field1426[var2][4];
         class143 var12 = this.field1426[var2][5];
         if (var10 != null) {
            var7 = var10.method2523(var4);
         }

         if (var11 != null) {
            var8 = var11.method2523(var4);
         }

         if (null != var12) {
            var9 = var12.method2523(var4);
         }
      }

      var1.field4749[12] = var7;
      var1.field4749[13] = var8;
      var1.field4749[14] = var9;
   }

   void method2679(class455 var1, int var2, class115 var3, int var4) {
      float[] var6 = var3.method2243(this.field1427);
      float var7 = var6[0];
      float var8 = var6[1];
      float var9 = var6[2];
      if (null != this.field1426[var2]) {
         class143 var10 = this.field1426[var2][6];
         class143 var11 = this.field1426[var2][7];
         class143 var12 = this.field1426[var2][8];
         if (null != var10) {
            var7 = var10.method2523(var4);
         }

         if (null != var11) {
            var8 = var11.method2523(var4);
         }

         if (var12 != null) {
            var9 = var12.method2523(var4);
         }
      }

      class455 var13 = class455.method2516();
      var13.method7965(var7, var8, var9);
      var1.method7984(var13);
      var13.method7978();
   }
}
