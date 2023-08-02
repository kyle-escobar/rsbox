public class class308 extends class470 {
   static class154 field3359;
   static class308[] field3355 = new class308[300];
   static int field3354 = 0;
   public class309 field3360;
   public class497 field3351;
   public int field3352;
   public int field3353;

   class308() {
   }

   public static class308 method2535() {
      return 0 == field3354 ? new class308() : field3355[--field3354];
   }

   public static class308 method8607(class309 var0, class540 var1) {
      class308 var3 = method2535();
      var3.field3360 = var0;
      var3.field3352 = var0.field3375;
      if (-1 == var3.field3352) {
         var3.field3351 = new class497(260);
      } else if (-2 == var3.field3352) {
         var3.field3351 = new class497(10000);
      } else if (var3.field3352 <= 18) {
         var3.field3351 = new class497(20);
      } else if (var3.field3352 <= 98) {
         var3.field3351 = new class497(100);
      } else {
         var3.field3351 = new class497(260);
      }

      var3.field3351.method8474(var1);
      var3.field3351.method8477(var3.field3360.field3424);
      var3.field3353 = 0;
      return var3;
   }

   public void method5744() {
      if (field3354 < field3355.length) {
         field3355[++field3354 - 1] = this;
      }
   }
}
