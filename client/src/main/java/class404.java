public class class404 extends class406 {
   static class332 field4504;
   boolean field4501 = false;
   int field4502;
   long field4503;

   public class404(class406 var1, int var2) {
      super(var1);
      this.field4502 = var2;
      super.field4513 = "DelayFadeTask";
   }

   public boolean method7131(int var1) {
      if (!this.field4501) {
         this.field4503 = (long)var1;
         this.field4501 = true;
      }

      return (long)var1 >= this.field4503 + (long)this.field4502;
   }
}
