public class class48 {
   public static short[] field350;
   static int field347;
   int field343;
   int field348;

   class48(int var1, int var2) {
      this.field343 = var1;
      this.field348 = var2;
   }

   boolean method1030(class27 var1) {
      if (null == var1) {
         return false;
      } else {
         switch (this.field343) {
            case 1:
               return var1.method389(this.field348);
            case 2:
               return var1.method380(this.field348);
            case 3:
               return var1.method381((char)this.field348);
            case 4:
               return var1.method382(this.field348 == 1);
            default:
               return false;
         }
      }
   }
}
