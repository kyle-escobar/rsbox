public class class23 implements class13 {
   class23() {
   }

   public Buffer method253(Buffer var1) {
      Buffer var2 = new Buffer(100);
      this.method344(var1, var2);
      return var2;
   }

   void method344(Buffer var1, Buffer var2) {
      class22 var3 = new class22(var1);
      class10 var4 = new class10(var3);

      long var5;
      for(var5 = 0L; !var4.method191(var3.method339(), var3.method340(), var5); ++var5) {
      }

      var2.writeLong(var5);
   }
}
