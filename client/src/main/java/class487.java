public class class487 extends class479 {
   int field4941 = 0;
   int field4942 = 0;

   public class487(int var1, int var2, int var3, int var4) {
      super(var3, var4);
      this.field4941 = var1;
      this.field4942 = var2;
   }

   public int method8410() {
      double var2 = this.method8168();
      return (int)Math.round(var2 * (double)(this.field4942 - this.field4941) + (double)this.field4941);
   }
}
