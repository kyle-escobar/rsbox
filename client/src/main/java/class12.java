import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class class12 implements KeyListener, FocusListener {
   static class359 field65;
   boolean[] field61 = new boolean[112];
   class27[] field60 = new class27[3];
   Collection field62 = new ArrayList(100);
   Collection field63 = new ArrayList(100);
   volatile int field64 = 0;

   class12() {
   }

   void method217(class27 var1, int var2) {
      this.field60[var2] = var1;
   }

   int method219() {
      return this.field64;
   }

   void method220(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   synchronized void method221(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.field63.add(new class48(4, 0));
      }
   }

   void method222() {
      ++this.field64;
      this.method223();
      Iterator var2 = this.field62.iterator();

      while(var2.hasNext()) {
         class48 var3 = (class48)var2.next();

         for(int var4 = 0; var4 < this.field60.length && !var3.method1030(this.field60[var4]); ++var4) {
         }
      }

      this.field62.clear();
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      int var2;
      label23: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = class40.field224.length;
            if (var2 < var4) {
               var2 = class40.method6586(var2);
               boolean var5 = (var2 & 128) != 0;
               if (var5) {
                  var2 = -1;
               }
               break label23;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.field61[var2] = true;
         this.field63.add(new class48(1, var2));
         this.field64 = 0;
      }

      var1.consume();
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      int var2;
      label16: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = class40.field224.length;
            if (var2 < var4) {
               var2 = class40.method6586(var2) & -129;
               break label16;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.field61[var2] = false;
         this.field63.add(new class48(2, var2));
      }

      var1.consume();
   }

   public final synchronized void keyTyped(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (var2 != 0 && var2 != '\uffff') {
         boolean var3;
         if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
            label47: {
               if (var2 != 0) {
                  char[] var4 = class389.field4443;

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     char var6 = var4[var5];
                     if (var6 == var2) {
                        var3 = true;
                        break label47;
                     }
                  }
               }

               var3 = false;
            }
         } else {
            var3 = true;
         }

         if (var3) {
            this.field63.add(new class48(3, var2));
         }
      }

      var1.consume();
   }

   synchronized void method223() {
      Collection var2 = this.field62;
      this.field62 = this.field63;
      this.field63 = var2;
   }

   public final synchronized void focusGained(FocusEvent var1) {
      this.field63.add(new class48(4, 1));
   }

   public final synchronized void focusLost(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.field61[var2]) {
            this.field61[var2] = false;
            this.field63.add(new class48(2, var2));
         }
      }

      this.field63.add(new class48(4, 0));
   }
}
