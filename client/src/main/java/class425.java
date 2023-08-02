public class class425 extends class417 {
   boolean field4608;
   boolean field4609;

   class425() {
   }

   int method7609(class425 var1) {
      if (Client.field1432 == super.field4575 && Client.field1432 != var1.field4575) {
         return -1;
      } else if (Client.field1432 == var1.field4575 && Client.field1432 != super.field4575) {
         return 1;
      } else if (0 != super.field4575 && 0 == var1.field4575) {
         return -1;
      } else if (var1.field4575 != 0 && 0 == super.field4575) {
         return 1;
      } else if (this.field4608 && !var1.field4608) {
         return -1;
      } else if (!this.field4608 && var1.field4608) {
         return 1;
      } else if (this.field4609 && !var1.field4609) {
         return -1;
      } else if (!this.field4609 && var1.field4609) {
         return 1;
      } else {
         return 0 != super.field4575 ? super.field4576 - var1.field4576 : var1.field4576 - super.field4576;
      }
   }

   public int method7546(class421 var1) {
      return this.method7609((class425)var1);
   }

   public int compareTo(Object var1) {
      return this.method7609((class425)var1);
   }
}
