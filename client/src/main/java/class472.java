public class class472 extends class480 {
   int field4825 = 0;
   int field4826 = 0;
   int field4827 = 0;
   int field4828 = 0;
   int field4829 = 0;
   int field4830 = 0;

   public class472(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super(var7, var8);
      this.field4826 = var1;
      this.field4830 = var2;
      this.field4827 = var3;
      this.field4828 = var4;
      this.field4829 = var5;
      this.field4825 = var6;
   }

   public int method8178() {
      double var2 = this.method8168();
      return (int)Math.round((double)this.field4826 + (double)(this.field4828 - this.field4826) * var2);
   }

   public int method8175() {
      double var2 = this.method8168();
      return (int)Math.round(var2 * (double)(this.field4829 - this.field4830) + (double)this.field4830);
   }

   public int method8176() {
      double var2 = this.method8168();
      return (int)Math.round(var2 * (double)(this.field4825 - this.field4827) + (double)this.field4827);
   }
}
