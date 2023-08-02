public class class115 {
   static class485 field1095;
   boolean field1100 = true;
   boolean field1102 = true;
   class455 field1103 = new class455();
   class455 field1104 = new class455();
   class455 field1106 = new class455();
   class455[] field1099;
   class455[] field1109;
   float[][] field1097;
   float[][] field1105;
   float[][] field1107;
   float[][] field1108;
   final class455[] field1098;
   public class115 field1096;
   public final int field1101;

   public class115(int var1, class519 var2, boolean var3) {
      this.field1101 = var2.method9001();
      this.field1098 = new class455[var1];
      this.field1099 = new class455[this.field1098.length];
      this.field1109 = new class455[this.field1098.length];
      this.field1097 = new float[this.field1098.length][3];

      for(int var4 = 0; var4 < this.field1098.length; ++var4) {
         this.field1098[var4] = new class455(var2, var3);
         this.field1097[var4][0] = var2.method8756();
         this.field1097[var4][1] = var2.method8756();
         this.field1097[var4][2] = var2.method8756();
      }

      this.method2233();
   }

   void method2233() {
      this.field1105 = new float[this.field1098.length][3];
      this.field1107 = new float[this.field1098.length][3];
      this.field1108 = new float[this.field1098.length][3];
      class455 var2 = class455.method2516();

      for(int var3 = 0; var3 < this.field1098.length; ++var3) {
         class455 var4 = this.method2255(var3);
         var2.method7988(var4);
         var2.method7958();
         this.field1105[var3] = var2.method7956();
         this.field1107[var3][0] = var4.field4749[12];
         this.field1107[var3][1] = var4.field4749[13];
         this.field1107[var3][2] = var4.field4749[14];
         this.field1108[var3] = var4.method7952();
      }

      var2.method7978();
   }

   class455 method2255(int var1) {
      return this.field1098[var1];
   }

   class455 method2235(int var1) {
      if (this.field1099[var1] == null) {
         this.field1099[var1] = new class455(this.method2255(var1));
         if (null != this.field1096) {
            this.field1099[var1].method7984(this.field1096.method2235(var1));
         } else {
            this.field1099[var1].method7984(class455.field4745);
         }
      }

      return this.field1099[var1];
   }

   class455 method2232(int var1) {
      if (this.field1109[var1] == null) {
         this.field1109[var1] = new class455(this.method2235(var1));
         this.field1109[var1].method7958();
      }

      return this.field1109[var1];
   }

   void method2264(class455 var1) {
      this.field1104.method7988(var1);
      this.field1102 = true;
      this.field1100 = true;
   }

   class455 method2238() {
      return this.field1104;
   }

   class455 method2239() {
      if (this.field1102) {
         this.field1103.method7988(this.method2238());
         if (this.field1096 != null) {
            this.field1103.method7984(this.field1096.method2239());
         }

         this.field1102 = false;
      }

      return this.field1103;
   }

   public class455 method2253(int var1) {
      if (this.field1100) {
         this.field1106.method7988(this.method2232(var1));
         this.field1106.method7984(this.method2239());
         this.field1100 = false;
      }

      return this.field1106;
   }

   float[] method2241(int var1) {
      return this.field1105[var1];
   }

   float[] method2242(int var1) {
      return this.field1107[var1];
   }

   float[] method2243(int var1) {
      return this.field1108[var1];
   }
}
