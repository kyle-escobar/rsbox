public class class31 extends class51 {
   class368 field155 = new class368();
   class368 field156 = new class368();
   int field154 = 0;
   int field157 = -1;

   public final synchronized void method449(class51 var1) {
      this.field156.method6681(var1);
   }

   public final synchronized void method468(class51 var1) {
      var1.method8116();
   }

   void method474() {
      if (this.field154 > 0) {
         for(class71 var1 = (class71)this.field155.method6706(); var1 != null; var1 = (class71)this.field155.method6687()) {
            var1.field580 -= this.field154;
         }

         this.field157 -= this.field154;
         this.field154 = 0;
      }

   }

   void method487(class470 var1, class71 var2) {
      while(var1 != this.field155.field4344 && ((class71)var1).field580 <= var2.field580) {
         var1 = var1.field4817;
      }

      class368.method6682(var2, var1);
      this.field157 = ((class71)this.field155.field4344.field4817).field580;
   }

   void method464(class71 var1) {
      var1.method8116();
      var1.method1486();
      class470 var2 = this.field155.field4344.field4817;
      if (var2 == this.field155.field4344) {
         this.field157 = -1;
      } else {
         this.field157 = ((class71)var2).field580;
      }

   }

   protected class51 method1040() {
      return (class51)this.field156.method6706();
   }

   protected class51 method1043() {
      return (class51)this.field156.method6687();
   }

   protected int method1042() {
      return 0;
   }

   public final synchronized void method1044(int[] var1, int var2, int var3) {
      do {
         if (this.field157 < 0) {
            this.method453(var1, var2, var3);
            return;
         }

         if (this.field154 + var3 < this.field157) {
            this.field154 += var3;
            this.method453(var1, var2, var3);
            return;
         }

         int var4 = this.field157 - this.field154;
         this.method453(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field154 += var4;
         this.method474();
         class71 var5 = (class71)this.field155.method6706();
         synchronized(var5) {
            int var7 = var5.method1490(this);
            if (var7 < 0) {
               var5.field580 = 0;
               this.method464(var5);
            } else {
               var5.field580 = var7;
               this.method487(var5.field4817, var5);
            }
         }
      } while(var3 != 0);

   }

   void method453(int[] var1, int var2, int var3) {
      for(class51 var4 = (class51)this.field156.method6706(); var4 != null; var4 = (class51)this.field156.method6687()) {
         var4.method1052(var1, var2, var3);
      }

   }

   public final synchronized void method1045(int var1) {
      do {
         if (this.field157 < 0) {
            this.method460(var1);
            return;
         }

         if (this.field154 + var1 < this.field157) {
            this.field154 += var1;
            this.method460(var1);
            return;
         }

         int var2 = this.field157 - this.field154;
         this.method460(var2);
         var1 -= var2;
         this.field154 += var2;
         this.method474();
         class71 var3 = (class71)this.field155.method6706();
         synchronized(var3) {
            int var5 = var3.method1490(this);
            if (var5 < 0) {
               var3.field580 = 0;
               this.method464(var3);
            } else {
               var3.field580 = var5;
               this.method487(var3.field4817, var3);
            }
         }
      } while(var1 != 0);

   }

   void method460(int var1) {
      for(class51 var2 = (class51)this.field156.method6706(); var2 != null; var2 = (class51)this.field156.method6687()) {
         var2.method1045(var1);
      }

   }
}
