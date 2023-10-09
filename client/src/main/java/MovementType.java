public class MovementType implements class383 {
   public static final MovementType field2450 = new MovementType((byte)2);
   public static final MovementType field2451 = new MovementType((byte)0);
   public static final MovementType NONE = new MovementType((byte)-1);
   public static final MovementType field2457 = new MovementType((byte)1);
   static class537[] field2455;
   public byte id;

   MovementType(byte var1) {
      this.id = var1;
   }

   public int serialId() {
      return this.id;
   }
}
