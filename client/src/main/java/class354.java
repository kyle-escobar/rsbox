import java.nio.ByteBuffer;

public class class354 extends class317 {
    static class537 field3917;
    static int field3921;
    ByteBuffer field3918;

    byte[] method5849() {
        byte[] var2 = new byte[this.field3918.capacity()];
        this.field3918.position(0);
        this.field3918.get(var2);
        return var2;
    }

    public void method5839(byte[] var1) {
        this.field3918 = ByteBuffer.allocateDirect(var1.length);
        this.field3918.position(0);
        this.field3918.put(var1);
    }
}
