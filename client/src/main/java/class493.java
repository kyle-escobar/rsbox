public class class493 extends class470 {
   boolean field4969;
   boolean field4975;
   int field4961;
   int field4970;
   int field4971;
   int field4972;
   int field4976;
   int field4977;
   int field4979;
   int field4982;
   int field4984;
   int field4985;
   int field4986;
   int field4987;
   int field4989;
   int field4991;
   int field4993;
   int[] field4990 = new int[3];
   String field4962;
   String field4973;
   String field4978;
   String field4980;
   String field4981;
   String field4983;
   String field4988;
   String field4992;

   class493(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
      this.field4993 = var1;
      this.field4969 = var2;
      this.field4970 = var3;
      this.field4971 = var4;
      this.field4972 = var5;
      this.field4982 = var6;
      this.field4961 = var7;
      this.field4975 = var8;
      this.field4976 = var9;
      this.field4977 = var10;
      this.field4989 = var11;
      this.field4979 = var12;
      this.field4973 = var13;
      this.field4981 = var14;
      this.field4980 = var15;
      this.field4983 = var16;
      this.field4984 = var17;
      this.field4985 = var18;
      this.field4986 = var19;
      this.field4987 = var20;
      this.field4988 = var21;
      this.field4962 = var22;
      this.field4990 = var23;
      this.field4991 = var24;
      this.field4992 = var25;
      this.field4978 = var26;
   }

   public void method8451(PacketBuffer var1) {
      var1.writeByte(9);
      var1.writeByte(this.field4993);
      var1.writeByte(this.field4969 ? 1 : 0);
      var1.writeShort(this.field4970);
      var1.writeByte(this.field4971);
      var1.writeByte(this.field4972);
      var1.writeByte(this.field4982);
      var1.writeByte(this.field4961);
      var1.writeByte(this.field4975 ? 1 : 0);
      var1.writeShort(this.field4976);
      var1.writeByte(this.field4977);
      var1.writeMedium(this.field4989);
      var1.writeShort(this.field4979);
      var1.writeJagString(this.field4973);
      var1.writeJagString(this.field4981);
      var1.writeJagString(this.field4980);
      var1.writeJagString(this.field4983);
      var1.writeByte(this.field4985);
      var1.writeShort(this.field4984);
      var1.writeJagString(this.field4988);
      var1.writeJagString(this.field4962);
      var1.writeByte(this.field4986);
      var1.writeByte(this.field4987);

      for(int var3 = 0; var3 < this.field4990.length; ++var3) {
         var1.writeInt(this.field4990[var3]);
      }

      var1.writeInt(this.field4991);
      var1.writeJagString(this.field4992);
      var1.writeJagString(this.field4978);
   }

   public int method8453() {
      int var2 = 39;
      var2 += PacketBuffer.method6819(this.field4973);
      var2 += PacketBuffer.method6819(this.field4981);
      var2 += PacketBuffer.method6819(this.field4980);
      var2 += PacketBuffer.method6819(this.field4983);
      var2 += PacketBuffer.method6819(this.field4988);
      var2 += PacketBuffer.method6819(this.field4962);
      var2 += PacketBuffer.method6819(this.field4992);
      var2 += PacketBuffer.method6819(this.field4978);
      return var2;
   }
}
