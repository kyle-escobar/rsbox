import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

public final class class42 extends class528 {
    Component field264;
    Image field265;

    class42(int var1, int var2, Component var3, boolean var4) {
        super.field5169 = var1;
        super.field5171 = var2;
        super.field5172 = new int[1 + var1 * var2];
        if (var4) {
            super.field5170 = new float[1 + var1 * var2];
        }

        DataBufferInt var5 = new DataBufferInt(super.field5172, super.field5172.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(super.field5169, super.field5171), var5, null);
        this.field265 = new BufferedImage(var6, var7, false, new Hashtable());
        this.method639(var3);
        this.method9185();
    }

    void method639(Component var1) {
        this.field264 = var1;
    }

    public void method9186(int var1, int var2) {
        this.method649(this.field264.getGraphics(), var1, var2);
    }

    public void method9187(int var1, int var2, int var3, int var4) {
        this.method640(this.field264.getGraphics(), var1, var2, var3, var4);
    }

    void method649(Graphics var1, int var2, int var3) {
        try {
            var1.drawImage(this.field265, var2, var3, this.field264);
        } catch (Exception var6) {
            this.field264.repaint();
        }

    }

    void method640(Graphics var1, int var2, int var3, int var4, int var5) {
        try {
            Shape var7 = var1.getClip();
            var1.clipRect(var2, var3, var4, var5);
            var1.drawImage(this.field265, 0, 0, this.field264);
            var1.setClip(var7);
        } catch (Exception var8) {
            this.field264.repaint();
        }

    }
}
