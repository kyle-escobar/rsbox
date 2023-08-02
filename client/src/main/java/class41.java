import java.awt.*;
import java.awt.event.*;

public class class41 implements MouseListener, MouseMotionListener, FocusListener {
    public static class41 field240 = new class41();
    public static int field248 = 0;
    public static int field249 = 0;
    public static int field250 = 0;
    public static int field256 = 0;
    public static int field257 = 0;
    public static int field258 = 0;
    public static long field251 = 0L;
    public static long field259 = 0L;
    public static volatile int field244 = 0;
    public static volatile int field246 = -1;
    public static volatile int field247 = 0;
    public static volatile int field252 = 0;
    public static volatile int field253 = 0;
    public static volatile int field254 = 0;
    public static volatile int field260 = -1;
    public static volatile long field241 = 0L;
    public static volatile long field242 = -1L;
    static String field239;

    class41() {
    }

    static void method6529(Component var0) {
        var0.addMouseListener(field240);
        var0.addMouseMotionListener(field240);
        var0.addFocusListener(field240);
    }

    public static void method1415(int var0) {
        field247 = var0;
    }

    final int method600(MouseEvent var1) {
        int var3 = var1.getButton();
        if (!var1.isAltDown() && var3 != 2) {
            return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
        } else {
            return 4;
        }
    }

    public final synchronized void mousePressed(MouseEvent var1) {
        if (null != field240) {
            field247 = 0;
            field253 = var1.getX();
            field254 = var1.getY();
            field241 = class302.method2194();
            field252 = this.method600(var1);
            if (0 != field252) {
                field244 = field252;
            }
        }

        if (var1.isPopupTrigger()) {
            var1.consume();
        }

    }

    public final synchronized void mouseReleased(MouseEvent var1) {
        if (null != field240) {
            field247 = 0;
            field244 = 0;
        }

        if (var1.isPopupTrigger()) {
            var1.consume();
        }

    }

    public final void mouseClicked(MouseEvent var1) {
        if (var1.isPopupTrigger()) {
            var1.consume();
        }

    }

    public final synchronized void mouseEntered(MouseEvent var1) {
        this.mouseMoved(var1);
    }

    public final synchronized void mouseExited(MouseEvent var1) {
        if (field240 != null) {
            field247 = 0;
            field260 = -1;
            field246 = -1;
            field242 = var1.getWhen();
        }

    }

    public final synchronized void mouseDragged(MouseEvent var1) {
        this.mouseMoved(var1);
    }

    public final synchronized void mouseMoved(MouseEvent var1) {
        if (field240 != null) {
            field247 = 0;
            field260 = var1.getX();
            field246 = var1.getY();
            field242 = var1.getWhen();
        }

    }

    public final void focusGained(FocusEvent var1) {
    }

    public final synchronized void focusLost(FocusEvent var1) {
        if (field240 != null) {
            field244 = 0;
        }

    }
}
