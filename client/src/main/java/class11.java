import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class11 implements class162, MouseWheelListener {
   int field58 = 0;

   class11() {
   }

   void method211(Component var1) {
      var1.addMouseWheelListener(this);
   }

   void method209(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.field58 += var1.getWheelRotation();
   }

   public synchronized int method3244() {
      int var2 = this.field58;
      this.field58 = 0;
      return var2;
   }
}
