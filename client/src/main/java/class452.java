public final class class452 {
   static class452[] field4732 = new class452[0];
   static int field4736;
   float field4731;
   float field4733;
   float field4734;
   float field4735;

   static {
      method4634(100);
      new class452();
   }

   class452() {
      this.method7893();
   }

   static void method4634(int var0) {
      field4736 = var0;
      field4732 = new class452[var0];
      class339.field3804 = 0;
   }

   public static class452 method4916() {
      synchronized(field4732) {
         if (class339.field3804 == 0) {
            return new class452();
         } else {
            field4732[--class339.field3804].method7893();
            return field4732[class339.field3804];
         }
      }
   }

   public void method7894() {
      synchronized(field4732) {
         if (class339.field3804 < field4736 - 1) {
            field4732[++class339.field3804 - 1] = this;
         }

      }
   }

   void method7891(float var1, float var2, float var3, float var4) {
      this.field4734 = var1;
      this.field4731 = var2;
      this.field4735 = var3;
      this.field4733 = var4;
   }

   public void method7892(float var1, float var2, float var3, float var4) {
      float var6 = (float)Math.sin((double)(var4 * 0.5F));
      float var7 = (float)Math.cos((double)(var4 * 0.5F));
      this.field4734 = var6 * var1;
      this.field4731 = var2 * var6;
      this.field4735 = var3 * var6;
      this.field4733 = var7;
   }

   final void method7893() {
      this.field4735 = 0.0F;
      this.field4731 = 0.0F;
      this.field4734 = 0.0F;
      this.field4733 = 1.0F;
   }

   public final void method7898(class452 var1) {
      this.method7891(this.field4734 * var1.field4733 + this.field4733 * var1.field4734 + var1.field4731 * this.field4735 - this.field4731 * var1.field4735, this.field4733 * var1.field4731 + (var1.field4733 * this.field4731 - var1.field4734 * this.field4735) + this.field4734 * var1.field4735, var1.field4734 * this.field4731 + this.field4735 * var1.field4733 - var1.field4731 * this.field4734 + var1.field4735 * this.field4733, var1.field4733 * this.field4733 - this.field4734 * var1.field4734 - this.field4731 * var1.field4731 - this.field4735 * var1.field4735);
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class452)) {
         return false;
      } else {
         class452 var2 = (class452)var1;
         return var2.field4734 == this.field4734 && this.field4731 == var2.field4731 && var2.field4735 == this.field4735 && var2.field4733 == this.field4733;
      }
   }

   public int hashCode() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = this.field4734 + var2 * 31.0F;
      var2 = this.field4731 + var2 * 31.0F;
      var2 = this.field4735 + var2 * 31.0F;
      var2 = var2 * 31.0F + this.field4733;
      return (int)var2;
   }

   public String toString() {
      return this.field4734 + "," + this.field4731 + "," + this.field4735 + "," + this.field4733;
   }
}
