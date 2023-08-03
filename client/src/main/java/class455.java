import java.util.Arrays;

public final class class455 {
   public static final class455 field4745;
   static class455[] field4750 = new class455[0];
   static int field4746 = 100;
   static int field4748;
   public float[] field4749 = new float[16];

   static {
      field4750 = new class455[100];
      field4748 = 0;
      field4745 = new class455();
   }

   public class455() {
      this.method7948();
   }

   public class455(class455 var1) {
      this.method7988(var1);
   }

   public class455(Buffer var1, boolean var2) {
      this.method7945(var1, var2);
   }

   public static class455 method2516() {
      synchronized(field4750) {
         if (0 == field4748) {
            return new class455();
         } else {
            field4750[--field4748].method7948();
            return field4750[field4748];
         }
      }
   }

   public void method7978() {
      synchronized(field4750) {
         if (field4748 < field4746 - 1) {
            field4750[++field4748 - 1] = this;
         }

      }
   }

   void method7945(Buffer var1, boolean var2) {
      if (var2) {
         class464 var4 = new class464();
         int var7 = var1.readShort();
         var7 &= 16383;
         float var6 = (float)(6.283185307179586 * (double)((float)var7 / 16384.0F));
         var4.method8053(var6);
         int var10 = var1.readShort();
         var10 &= 16383;
         float var9 = (float)((double)((float)var10 / 16384.0F) * 6.283185307179586);
         var4.method8054(var9);
         int var13 = var1.readShort();
         var13 &= 16383;
         float var12 = (float)((double)((float)var13 / 16384.0F) * 6.283185307179586);
         var4.method8067(var12);
         var4.method8056((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
         this.method7947(var4);
      } else {
         for(int var14 = 0; var14 < 16; ++var14) {
            this.field4749[var14] = var1.readFloat();
         }
      }

   }

   float[] method7946() {
      float[] var2 = new float[3];
      if ((double)this.field4749[2] < 0.999 && (double)this.field4749[2] > -0.999) {
         var2[1] = (float)(-Math.asin((double)this.field4749[2]));
         double var3 = Math.cos((double)var2[1]);
         var2[0] = (float)Math.atan2((double)this.field4749[6] / var3, (double)this.field4749[10] / var3);
         var2[2] = (float)Math.atan2((double)this.field4749[1] / var3, (double)this.field4749[0] / var3);
      } else {
         var2[0] = 0.0F;
         var2[1] = (float)Math.atan2((double)this.field4749[2], 0.0);
         var2[2] = (float)Math.atan2((double)(-this.field4749[9]), (double)this.field4749[5]);
      }

      return var2;
   }

   public float[] method7956() {
      float[] var2 = new float[]{(float)(-Math.asin((double)this.field4749[6])), 0.0F, 0.0F};
      double var3 = Math.cos((double)var2[0]);
      double var5;
      double var7;
      if (Math.abs(var3) > 0.005) {
         var5 = (double)this.field4749[2];
         var7 = (double)this.field4749[10];
         double var9 = (double)this.field4749[4];
         double var11 = (double)this.field4749[5];
         var2[1] = (float)Math.atan2(var5, var7);
         var2[2] = (float)Math.atan2(var9, var11);
      } else {
         var5 = (double)this.field4749[1];
         var7 = (double)this.field4749[0];
         if (this.field4749[6] < 0.0F) {
            var2[1] = (float)Math.atan2(var5, var7);
         } else {
            var2[1] = (float)(-Math.atan2(var5, var7));
         }

         var2[2] = 0.0F;
      }

      return var2;
   }

   void method7948() {
      this.field4749[0] = 1.0F;
      this.field4749[1] = 0.0F;
      this.field4749[2] = 0.0F;
      this.field4749[3] = 0.0F;
      this.field4749[4] = 0.0F;
      this.field4749[5] = 1.0F;
      this.field4749[6] = 0.0F;
      this.field4749[7] = 0.0F;
      this.field4749[8] = 0.0F;
      this.field4749[9] = 0.0F;
      this.field4749[10] = 1.0F;
      this.field4749[11] = 0.0F;
      this.field4749[12] = 0.0F;
      this.field4749[13] = 0.0F;
      this.field4749[14] = 0.0F;
      this.field4749[15] = 1.0F;
   }

   public void method7949() {
      this.field4749[0] = 0.0F;
      this.field4749[1] = 0.0F;
      this.field4749[2] = 0.0F;
      this.field4749[3] = 0.0F;
      this.field4749[4] = 0.0F;
      this.field4749[5] = 0.0F;
      this.field4749[6] = 0.0F;
      this.field4749[7] = 0.0F;
      this.field4749[8] = 0.0F;
      this.field4749[9] = 0.0F;
      this.field4749[10] = 0.0F;
      this.field4749[11] = 0.0F;
      this.field4749[12] = 0.0F;
      this.field4749[13] = 0.0F;
      this.field4749[14] = 0.0F;
      this.field4749[15] = 0.0F;
   }

   public void method7988(class455 var1) {
      System.arraycopy(var1.field4749, 0, this.field4749, 0, 16);
   }

   public void method7951(float var1) {
      this.method7965(var1, var1, var1);
   }

   public void method7965(float var1, float var2, float var3) {
      this.method7948();
      this.field4749[0] = var1;
      this.field4749[5] = var2;
      this.field4749[10] = var3;
   }

   public void method7953(class455 var1) {
      for(int var3 = 0; var3 < this.field4749.length; ++var3) {
         float[] var10000 = this.field4749;
         var10000[var3] += var1.field4749[var3];
      }

   }

   public void method7984(class455 var1) {
      float var3 = var1.field4749[12] * this.field4749[3] + this.field4749[0] * var1.field4749[0] + this.field4749[1] * var1.field4749[4] + this.field4749[2] * var1.field4749[8];
      float var4 = var1.field4749[13] * this.field4749[3] + this.field4749[2] * var1.field4749[9] + var1.field4749[5] * this.field4749[1] + var1.field4749[1] * this.field4749[0];
      float var5 = this.field4749[2] * var1.field4749[10] + this.field4749[0] * var1.field4749[2] + var1.field4749[6] * this.field4749[1] + var1.field4749[14] * this.field4749[3];
      float var6 = this.field4749[0] * var1.field4749[3] + var1.field4749[7] * this.field4749[1] + this.field4749[2] * var1.field4749[11] + this.field4749[3] * var1.field4749[15];
      float var7 = this.field4749[7] * var1.field4749[12] + var1.field4749[8] * this.field4749[6] + this.field4749[4] * var1.field4749[0] + var1.field4749[4] * this.field4749[5];
      float var8 = var1.field4749[1] * this.field4749[4] + this.field4749[5] * var1.field4749[5] + this.field4749[6] * var1.field4749[9] + this.field4749[7] * var1.field4749[13];
      float var9 = this.field4749[7] * var1.field4749[14] + this.field4749[4] * var1.field4749[2] + this.field4749[5] * var1.field4749[6] + this.field4749[6] * var1.field4749[10];
      float var10 = this.field4749[7] * var1.field4749[15] + this.field4749[6] * var1.field4749[11] + var1.field4749[7] * this.field4749[5] + var1.field4749[3] * this.field4749[4];
      float var11 = var1.field4749[12] * this.field4749[11] + this.field4749[10] * var1.field4749[8] + var1.field4749[4] * this.field4749[9] + this.field4749[8] * var1.field4749[0];
      float var12 = this.field4749[8] * var1.field4749[1] + var1.field4749[5] * this.field4749[9] + var1.field4749[9] * this.field4749[10] + var1.field4749[13] * this.field4749[11];
      float var13 = this.field4749[8] * var1.field4749[2] + var1.field4749[6] * this.field4749[9] + this.field4749[10] * var1.field4749[10] + this.field4749[11] * var1.field4749[14];
      float var14 = this.field4749[10] * var1.field4749[11] + var1.field4749[3] * this.field4749[8] + this.field4749[9] * var1.field4749[7] + this.field4749[11] * var1.field4749[15];
      float var15 = this.field4749[15] * var1.field4749[12] + this.field4749[13] * var1.field4749[4] + this.field4749[12] * var1.field4749[0] + this.field4749[14] * var1.field4749[8];
      float var16 = var1.field4749[13] * this.field4749[15] + var1.field4749[9] * this.field4749[14] + this.field4749[13] * var1.field4749[5] + this.field4749[12] * var1.field4749[1];
      float var17 = this.field4749[12] * var1.field4749[2] + var1.field4749[6] * this.field4749[13] + var1.field4749[10] * this.field4749[14] + var1.field4749[14] * this.field4749[15];
      float var18 = var1.field4749[11] * this.field4749[14] + this.field4749[13] * var1.field4749[7] + var1.field4749[3] * this.field4749[12] + var1.field4749[15] * this.field4749[15];
      this.field4749[0] = var3;
      this.field4749[1] = var4;
      this.field4749[2] = var5;
      this.field4749[3] = var6;
      this.field4749[4] = var7;
      this.field4749[5] = var8;
      this.field4749[6] = var9;
      this.field4749[7] = var10;
      this.field4749[8] = var11;
      this.field4749[9] = var12;
      this.field4749[10] = var13;
      this.field4749[11] = var14;
      this.field4749[12] = var15;
      this.field4749[13] = var16;
      this.field4749[14] = var17;
      this.field4749[15] = var18;
   }

   public void method7954(class452 var1) {
      float var3 = var1.field4733 * var1.field4733;
      float var4 = var1.field4734 * var1.field4733;
      float var5 = var1.field4731 * var1.field4733;
      float var6 = var1.field4733 * var1.field4735;
      float var7 = var1.field4734 * var1.field4734;
      float var8 = var1.field4734 * var1.field4731;
      float var9 = var1.field4735 * var1.field4734;
      float var10 = var1.field4731 * var1.field4731;
      float var11 = var1.field4731 * var1.field4735;
      float var12 = var1.field4735 * var1.field4735;
      this.field4749[0] = var3 + var7 - var12 - var10;
      this.field4749[1] = var6 + var6 + var8 + var8;
      this.field4749[2] = var9 + (var9 - var5 - var5);
      this.field4749[4] = var8 + (var8 - var6 - var6);
      this.field4749[5] = var10 + var3 - var7 - var12;
      this.field4749[6] = var4 + var11 + var11 + var4;
      this.field4749[8] = var9 + var9 + var5 + var5;
      this.field4749[9] = var11 - var4 - var4 + var11;
      this.field4749[10] = var3 + var12 - var10 - var7;
   }

   void method7947(class464 var1) {
      this.field4749[0] = var1.field4783;
      this.field4749[1] = var1.field4779;
      this.field4749[2] = var1.field4780;
      this.field4749[3] = 0.0F;
      this.field4749[4] = var1.field4787;
      this.field4749[5] = var1.field4781;
      this.field4749[6] = var1.field4782;
      this.field4749[7] = 0.0F;
      this.field4749[8] = var1.field4785;
      this.field4749[9] = var1.field4778;
      this.field4749[10] = var1.field4786;
      this.field4749[11] = 0.0F;
      this.field4749[12] = var1.field4784;
      this.field4749[13] = var1.field4788;
      this.field4749[14] = var1.field4789;
      this.field4749[15] = 1.0F;
   }

   float method7957() {
      return this.field4749[12] * this.field4749[3] * this.field4749[6] * this.field4749[9] + (this.field4749[14] * this.field4749[5] * this.field4749[3] * this.field4749[8] + this.field4749[13] * this.field4749[10] * this.field4749[4] * this.field4749[3] + (this.field4749[8] * this.field4749[2] * this.field4749[7] * this.field4749[13] + this.field4749[2] * this.field4749[5] * this.field4749[11] * this.field4749[12] + (this.field4749[4] * this.field4749[2] * this.field4749[9] * this.field4749[15] + this.field4749[14] * this.field4749[9] * this.field4749[7] * this.field4749[0] + this.field4749[15] * this.field4749[10] * this.field4749[5] * this.field4749[0] - this.field4749[11] * this.field4749[0] * this.field4749[5] * this.field4749[14] - this.field4749[15] * this.field4749[9] * this.field4749[0] * this.field4749[6] + this.field4749[13] * this.field4749[0] * this.field4749[6] * this.field4749[11] - this.field4749[13] * this.field4749[0] * this.field4749[7] * this.field4749[10] - this.field4749[15] * this.field4749[10] * this.field4749[1] * this.field4749[4] + this.field4749[14] * this.field4749[11] * this.field4749[1] * this.field4749[4] + this.field4749[8] * this.field4749[1] * this.field4749[6] * this.field4749[15] - this.field4749[1] * this.field4749[6] * this.field4749[11] * this.field4749[12] - this.field4749[8] * this.field4749[1] * this.field4749[7] * this.field4749[14] + this.field4749[12] * this.field4749[10] * this.field4749[7] * this.field4749[1] - this.field4749[11] * this.field4749[2] * this.field4749[4] * this.field4749[13] - this.field4749[15] * this.field4749[8] * this.field4749[2] * this.field4749[5]) - this.field4749[12] * this.field4749[9] * this.field4749[7] * this.field4749[2] - this.field4749[9] * this.field4749[4] * this.field4749[3] * this.field4749[14]) - this.field4749[12] * this.field4749[10] * this.field4749[3] * this.field4749[5] - this.field4749[13] * this.field4749[3] * this.field4749[6] * this.field4749[8]);
   }

   public void method7958() {
      float var2 = 1.0F / this.method7957();
      float var3 = (this.field4749[7] * this.field4749[9] * this.field4749[14] + this.field4749[15] * this.field4749[5] * this.field4749[10] - this.field4749[11] * this.field4749[5] * this.field4749[14] - this.field4749[9] * this.field4749[6] * this.field4749[15] + this.field4749[13] * this.field4749[6] * this.field4749[11] - this.field4749[7] * this.field4749[10] * this.field4749[13]) * var2;
      float var4 = var2 * (this.field4749[9] * this.field4749[2] * this.field4749[15] + this.field4749[14] * this.field4749[11] * this.field4749[1] + this.field4749[15] * -this.field4749[1] * this.field4749[10] - this.field4749[11] * this.field4749[2] * this.field4749[13] - this.field4749[3] * this.field4749[9] * this.field4749[14] + this.field4749[13] * this.field4749[10] * this.field4749[3]);
      float var5 = var2 * (this.field4749[3] * this.field4749[5] * this.field4749[14] + this.field4749[13] * this.field4749[2] * this.field4749[7] + (this.field4749[1] * this.field4749[6] * this.field4749[15] - this.field4749[7] * this.field4749[1] * this.field4749[14] - this.field4749[2] * this.field4749[5] * this.field4749[15]) - this.field4749[13] * this.field4749[3] * this.field4749[6]);
      float var6 = (this.field4749[9] * this.field4749[6] * this.field4749[3] + (this.field4749[10] * this.field4749[1] * this.field4749[7] + this.field4749[11] * this.field4749[6] * -this.field4749[1] + this.field4749[5] * this.field4749[2] * this.field4749[11] - this.field4749[2] * this.field4749[7] * this.field4749[9] - this.field4749[10] * this.field4749[5] * this.field4749[3])) * var2;
      float var7 = var2 * (this.field4749[10] * this.field4749[7] * this.field4749[12] + (this.field4749[6] * this.field4749[8] * this.field4749[15] + this.field4749[15] * this.field4749[10] * -this.field4749[4] + this.field4749[11] * this.field4749[4] * this.field4749[14] - this.field4749[6] * this.field4749[11] * this.field4749[12] - this.field4749[14] * this.field4749[8] * this.field4749[7]));
      float var8 = (this.field4749[3] * this.field4749[8] * this.field4749[14] + this.field4749[15] * this.field4749[10] * this.field4749[0] - this.field4749[14] * this.field4749[0] * this.field4749[11] - this.field4749[15] * this.field4749[8] * this.field4749[2] + this.field4749[2] * this.field4749[11] * this.field4749[12] - this.field4749[3] * this.field4749[10] * this.field4749[12]) * var2;
      float var9 = (this.field4749[12] * this.field4749[3] * this.field4749[6] + (this.field4749[6] * -this.field4749[0] * this.field4749[15] + this.field4749[14] * this.field4749[0] * this.field4749[7] + this.field4749[15] * this.field4749[2] * this.field4749[4] - this.field4749[12] * this.field4749[7] * this.field4749[2] - this.field4749[14] * this.field4749[4] * this.field4749[3])) * var2;
      float var10 = var2 * (this.field4749[0] * this.field4749[6] * this.field4749[11] - this.field4749[10] * this.field4749[7] * this.field4749[0] - this.field4749[11] * this.field4749[4] * this.field4749[2] + this.field4749[7] * this.field4749[2] * this.field4749[8] + this.field4749[4] * this.field4749[3] * this.field4749[10] - this.field4749[3] * this.field4749[6] * this.field4749[8]);
      float var11 = var2 * (this.field4749[13] * this.field4749[7] * this.field4749[8] + this.field4749[15] * this.field4749[4] * this.field4749[9] - this.field4749[13] * this.field4749[11] * this.field4749[4] - this.field4749[15] * this.field4749[8] * this.field4749[5] + this.field4749[12] * this.field4749[11] * this.field4749[5] - this.field4749[7] * this.field4749[9] * this.field4749[12]);
      float var12 = var2 * (this.field4749[9] * this.field4749[3] * this.field4749[12] + (this.field4749[15] * this.field4749[8] * this.field4749[1] + this.field4749[11] * this.field4749[0] * this.field4749[13] + this.field4749[15] * this.field4749[9] * -this.field4749[0] - this.field4749[12] * this.field4749[1] * this.field4749[11] - this.field4749[3] * this.field4749[8] * this.field4749[13]));
      float var13 = (this.field4749[4] * this.field4749[3] * this.field4749[13] + this.field4749[7] * this.field4749[1] * this.field4749[12] + (this.field4749[15] * this.field4749[5] * this.field4749[0] - this.field4749[0] * this.field4749[7] * this.field4749[13] - this.field4749[15] * this.field4749[1] * this.field4749[4]) - this.field4749[12] * this.field4749[5] * this.field4749[3]) * var2;
      float var14 = (this.field4749[8] * this.field4749[3] * this.field4749[5] + (this.field4749[4] * this.field4749[1] * this.field4749[11] + this.field4749[5] * -this.field4749[0] * this.field4749[11] + this.field4749[7] * this.field4749[0] * this.field4749[9] - this.field4749[7] * this.field4749[1] * this.field4749[8] - this.field4749[4] * this.field4749[3] * this.field4749[9])) * var2;
      float var15 = (this.field4749[9] * this.field4749[6] * this.field4749[12] + (this.field4749[14] * this.field4749[8] * this.field4749[5] + this.field4749[13] * this.field4749[10] * this.field4749[4] + this.field4749[14] * -this.field4749[4] * this.field4749[9] - this.field4749[12] * this.field4749[10] * this.field4749[5] - this.field4749[6] * this.field4749[8] * this.field4749[13])) * var2;
      float var16 = var2 * (this.field4749[1] * this.field4749[10] * this.field4749[12] + (this.field4749[14] * this.field4749[9] * this.field4749[0] - this.field4749[0] * this.field4749[10] * this.field4749[13] - this.field4749[14] * this.field4749[1] * this.field4749[8]) + this.field4749[13] * this.field4749[8] * this.field4749[2] - this.field4749[9] * this.field4749[2] * this.field4749[12]);
      float var17 = var2 * (this.field4749[12] * this.field4749[2] * this.field4749[5] + (this.field4749[13] * this.field4749[6] * this.field4749[0] + -this.field4749[0] * this.field4749[5] * this.field4749[14] + this.field4749[4] * this.field4749[1] * this.field4749[14] - this.field4749[12] * this.field4749[1] * this.field4749[6] - this.field4749[13] * this.field4749[4] * this.field4749[2]));
      float var18 = (this.field4749[9] * this.field4749[2] * this.field4749[4] + this.field4749[5] * this.field4749[0] * this.field4749[10] - this.field4749[9] * this.field4749[6] * this.field4749[0] - this.field4749[1] * this.field4749[4] * this.field4749[10] + this.field4749[6] * this.field4749[1] * this.field4749[8] - this.field4749[8] * this.field4749[2] * this.field4749[5]) * var2;
      this.field4749[0] = var3;
      this.field4749[1] = var4;
      this.field4749[2] = var5;
      this.field4749[3] = var6;
      this.field4749[4] = var7;
      this.field4749[5] = var8;
      this.field4749[6] = var9;
      this.field4749[7] = var10;
      this.field4749[8] = var11;
      this.field4749[9] = var12;
      this.field4749[10] = var13;
      this.field4749[11] = var14;
      this.field4749[12] = var15;
      this.field4749[13] = var16;
      this.field4749[14] = var17;
      this.field4749[15] = var18;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      this.method7956();
      this.method7946();

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.field4749[var2 * 4 + var3];
            if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   public int hashCode() {
      boolean var1 = true;
      int var2 = 1;
      var2 = var2 * 31 + Arrays.hashCode(this.field4749);
      return var2;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class455)) {
         return false;
      } else {
         class455 var2 = (class455)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if (this.field4749[var3] != var2.field4749[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   public float[] method7952() {
      float[] var2 = new float[3];
      class451 var3 = new class451(this.field4749[0], this.field4749[1], this.field4749[2]);
      class451 var4 = new class451(this.field4749[4], this.field4749[5], this.field4749[6]);
      class451 var5 = new class451(this.field4749[8], this.field4749[9], this.field4749[10]);
      var2[0] = var3.method7884();
      var2[1] = var4.method7884();
      var2[2] = var5.method7884();
      return var2;
   }
}
