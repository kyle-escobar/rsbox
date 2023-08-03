public class class183 extends class476 {
   public static class290 field1889 = new class290(64);
   public static class342 field1888;
   public static class342 field1891;
   static class290 field1900 = new class290(64);
   int field1890 = -1;
   int field1899 = -1;
   public int field1887 = 1;
   public int field1893 = 255;
   public int field1894 = 255;
   public int field1895 = 70;
   public int field1896;
   public int field1897 = 30;
   public int field1898 = -1;
   public int field1901 = 0;

   public static void method8606() {
      field1889.method5637();
      field1900.method5637();
   }

   public void method3433(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method3444(var1, var3);
      }
   }

   void method3444(Buffer var1, int var2) {
      if (var2 == 1) {
         var1.readUnsignedShort();
      } else if (var2 == 2) {
         this.field1893 = var1.readUnsignedByte();
      } else if (var2 == 3) {
         this.field1894 = var1.readUnsignedByte();
      } else if (var2 == 4) {
         this.field1898 = 0;
      } else if (var2 == 5) {
         this.field1895 = var1.readUnsignedShort();
      } else if (var2 == 6) {
         var1.readUnsignedByte();
      } else if (var2 == 7) {
         this.field1890 = var1.method8814();
      } else if (var2 == 8) {
         this.field1899 = var1.method8814();
      } else if (var2 == 11) {
         this.field1898 = var1.readUnsignedShort();
      } else if (var2 == 14) {
         this.field1897 = var1.readUnsignedByte();
      } else if (var2 == 15) {
         this.field1901 = var1.readUnsignedByte();
      }

   }

   public class523 method3446() {
      if (this.field1890 < 0) {
         return null;
      } else {
         class523 var2 = (class523)field1900.method5643((long)this.field1890);
         if (null != var2) {
            return var2;
         } else {
            var2 = class485.method8408(field1888, this.field1890, 0);
            if (null != var2) {
               field1900.method5640(var2, (long)this.field1890);
            }

            return var2;
         }
      }
   }

   public class523 method3441() {
      if (this.field1899 < 0) {
         return null;
      } else {
         class523 var2 = (class523)field1900.method5643((long)this.field1899);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class485.method8408(field1888, this.field1899, 0);
            if (var2 != null) {
               field1900.method5640(var2, (long)this.field1899);
            }

            return var2;
         }
      }
   }
}
