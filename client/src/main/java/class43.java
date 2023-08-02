import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.Iterator;

public abstract class class43 extends Applet implements Runnable, FocusListener, WindowListener {
   protected static class178 field272;
   protected static int field274 = 0;
   static boolean field270 = false;
   static class12 field297 = new class12();
   static class43 field267 = null;
   static int field266 = 20;
   static int field268 = 0;
   static int field273 = 1;
   static int field285 = 500;
   static long field283 = 0L;
   static long field299 = -1L;
   static long field300 = -1L;
   static long[] field275 = new long[32];
   static long[] field276 = new long[32];
   static volatile boolean field293 = true;
   boolean field271 = false;
   boolean field290 = false;
   class11 field298;
   int field279 = 0;
   int field281;
   int field282;
   int field284;
   int field286;
   int field289 = 0;
   Canvas field287;
   Frame field278;
   Clipboard field294;
   final EventQueue field295;
   protected boolean field277 = false;
   protected int field269;
   protected int field292;
   volatile boolean field288 = true;
   volatile boolean field291 = false;
   volatile long field296 = 0L;

   protected class43() {
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
      }

      this.field295 = var1;
      class37.method3900(new class14());
   }

   protected static final int method359() {
      return field297.method219();
   }

   protected static final void method3439() {
      class192.field2097.method3588();

      int var1;
      for(var1 = 0; var1 < 32; ++var1) {
         field275[var1] = 0L;
      }

      for(var1 = 0; var1 < 32; ++var1) {
         field276[var1] = 0L;
      }

      class318.field3509 = 0;
   }

   protected static int method406() {
      int var1 = 0;
      if (null == class118.field1133 || !class118.field1133.isValid()) {
         try {
            Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var2.hasNext()) {
               GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
               if (var3.isValid()) {
                  class118.field1133 = var3;
                  field299 = -1L;
                  field300 = -1L;
               }
            }
         } catch (Throwable var10) {
         }
      }

      if (null != class118.field1133) {
         long var11 = class302.method2194();
         long var4 = class118.field1133.getCollectionTime();
         if (field300 != -1L) {
            long var6 = var4 - field300;
            long var8 = var11 - field299;
            if (var8 != 0L) {
               var1 = (int)(var6 * 100L / var8);
            }
         }

         field300 = var4;
         field299 = var11;
      }

      return var1;
   }

   protected abstract void method662();

   protected abstract void method681();

   protected abstract void method682();

   protected abstract void method744();

   protected abstract void method759();

   protected abstract void method683(boolean var1);

   public abstract void init();

   protected final void method651(int var1, int var2) {
      if (this.field286 != var1 || var2 != this.field284) {
         this.method672();
      }

      this.field286 = var1;
      this.field284 = var2;
   }

   final void method726(Object var1) {
      if (null != this.field295) {
         for(int var3 = 0; var3 < 50 && this.field295.peekEvent() != null; ++var3) {
            class292.method354(1L);
         }

         if (null != var1) {
            this.field295.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   protected class162 method717() {
      if (null == this.field298) {
         this.field298 = new class11();
         this.field298.method211(this.field287);
      }

      return this.field298;
   }

   protected void method654() {
      this.field294 = this.getToolkit().getSystemClipboard();
   }

   protected void method798(String var1) {
      this.field294.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   protected Clipboard method656() {
      return this.field294;
   }

   protected final void method657() {
      class40.method5732();
      field297.method220(this.field287);
   }

   protected final void method658() {
      field297.method222();
   }

   protected void method659(class27 var1, int var2) {
      field297.method217(var1, var2);
   }

   protected final void method663() {
      class41.method6529(this.field287);
   }

   final void method661() {
      Container var2 = this.method688();
      if (var2 != null) {
         class453 var3 = this.method741();
         this.field292 = Math.max(var3.field4742, this.field281);
         this.field269 = Math.max(var3.field4740, this.field282);
         if (this.field292 <= 0) {
            this.field292 = 1;
         }

         if (this.field269 <= 0) {
            this.field269 = 1;
         }

         class343.field3838 = Math.min(this.field292, this.field286);
         class488.field4948 = Math.min(this.field269, this.field284);
         this.field279 = (this.field292 - class343.field3838) / 2;
         this.field289 = 0;
         this.field287.setSize(class343.field3838, class488.field4948);
         class159.field1749 = new class42(class343.field3838, class488.field4948, this.field287, this.field277);
         if (this.field278 == var2) {
            Insets var4 = this.field278.getInsets();
            this.field287.setLocation(this.field279 + var4.left, var4.top + this.field289);
         } else {
            this.field287.setLocation(this.field279, this.field289);
         }

         this.field288 = true;
         this.method662();
      }
   }

   void method761() {
      int var2 = this.field279;
      int var3 = this.field289;
      int var4 = this.field292 - class343.field3838 - var2;
      int var5 = this.field269 - class488.field4948 - var3;
      if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
         try {
            Container var6 = this.method688();
            int var7 = 0;
            int var8 = 0;
            if (this.field278 == var6) {
               Insets var9 = this.field278.getInsets();
               var7 = var9.left;
               var8 = var9.top;
            }

            Graphics var11 = var6.getGraphics();
            var11.setColor(Color.black);
            if (var2 > 0) {
               var11.fillRect(var7, var8, var2, this.field269);
            }

            if (var3 > 0) {
               var11.fillRect(var7, var8, this.field292, var3);
            }

            if (var4 > 0) {
               var11.fillRect(var7 + this.field292 - var4, var8, var4, this.field269);
            }

            if (var5 > 0) {
               var11.fillRect(var7, var8 + this.field269 - var5, this.field292, var5);
            }
         } catch (Exception var10) {
         }
      }

   }

   final void method664() {
      field297.method221(this.field287);
      Canvas var2 = this.field287;
      var2.removeMouseListener(class41.field240);
      var2.removeMouseMotionListener(class41.field240);
      var2.removeFocusListener(class41.field240);
      class41.field244 = 0;
      if (null != this.field298) {
         this.field298.method209(this.field287);
      }

      this.method666();
      field297.method220(this.field287);
      class41.method6529(this.field287);
      if (this.field298 != null) {
         this.field298.method211(this.field287);
      }

      this.method672();
   }

   protected final void method665(int var1, int var2, int var3, int var4) {
      try {
         if (field267 != null) {
            ++field268;
            if (field268 >= 3) {
               this.method674("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         field267 = this;
         class343.field3838 = var1;
         class488.field4948 = var2;
         class524.field5154 = var3;
         class524.field5156 = var4;
         class524.field5159 = this;
         if (null == field272) {
            field272 = new class178();
         }

         field272.method3400(this, 1);
      } catch (Exception var7) {
         class524.method5856((String)null, var7);
         this.method674("crash");
      }

   }

   final synchronized void method666() {
      Container var2 = this.method688();
      if (null != this.field287) {
         this.field287.removeFocusListener(this);
         var2.remove(this.field287);
      }

      class343.field3838 = Math.max(var2.getWidth(), this.field281);
      class488.field4948 = Math.max(var2.getHeight(), this.field282);
      Insets var3;
      if (null != this.field278) {
         var3 = this.field278.getInsets();
         class343.field3838 -= var3.left + var3.right;
         class488.field4948 -= var3.bottom + var3.top;
      }

      this.field287 = new class6(this);
      var2.setBackground(Color.BLACK);
      var2.setLayout((LayoutManager)null);
      var2.add(this.field287);
      this.field287.setSize(class343.field3838, class488.field4948);
      this.field287.setVisible(true);
      this.field287.setBackground(Color.BLACK);
      if (this.field278 == var2) {
         var3 = this.field278.getInsets();
         this.field287.setLocation(this.field279 + var3.left, this.field289 + var3.top);
      } else {
         this.field287.setLocation(this.field279, this.field289);
      }

      this.field287.addFocusListener(this);
      this.field287.requestFocus();
      this.field288 = true;
      if (class159.field1749 != null && class343.field3838 == class159.field1749.field5169 && class488.field4948 == class159.field1749.field5171) {
         ((class42)class159.field1749).method639(this.field287);
         class159.field1749.method9186(0, 0);
      } else {
         class159.field1749 = new class42(class343.field3838, class488.field4948, this.field287, this.field277);
      }

      this.field291 = false;
      this.field296 = class302.method2194();
   }

   protected void method667(boolean var1) {
      if (this.field277 != var1) {
         this.field277 = var1;
         class159.field1749.method9189(var1);
         class159.field1749.method9185();
      }

   }

   protected final boolean method668() {
      String var2 = this.getDocumentBase().getHost().toLowerCase();
      if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
         if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
            if (var2.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                  var2 = var2.substring(0, var2.length() - 1);
               }

               if (var2.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.method674("invalidhost");
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public void run() {
      try {
         if (null != class178.field1871) {
            String var1 = class178.field1871.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = class178.field1868;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method674("wrongjava");
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class380.method3292(var2.charAt(var3)); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if (class380.method4205(var4) && class380.method5731(var4) < 10) {
                     this.method674("wrongjava");
                     return;
                  }
               }

               field273 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method666();
         this.method681();

         Object var7;
         try {
            var7 = new class181();
         } catch (Throwable var5) {
            var7 = new class170();
         }

         class192.field2097 = (class188)var7;

         while(field283 == 0L || class302.method2194() < field283) {
            class318.field3509 = class192.field2097.method3590(field266, field273);

            for(int var8 = 0; var8 < class318.field3509; ++var8) {
               this.method669();
            }

            this.method693();
            this.method726(this.field287);
         }
      } catch (Exception var6) {
         class524.method5856((String)null, var6);
         this.method674("crash");
      }

      this.method673();
   }

   void method669() {
      long var2 = class302.method2194();
      long var4 = field276[class25.field131];
      field276[class25.field131] = var2;
      class25.field131 = class25.field131 + 1 & 31;
      if (var4 != 0L && var2 > var4) {
      }

      synchronized(this) {
         class331.field3587 = field293;
      }

      this.method682();
   }

   void method693() {
      Container var2 = this.method688();
      long var3 = class302.method2194();
      long var5 = field275[class300.field3168];
      field275[class300.field3168] = var3;
      class300.field3168 = class300.field3168 + 1 & 31;
      if (var5 != 0L && var3 > var5) {
         int var7 = (int)(var3 - var5);
         field274 = ((var7 >> 1) + 32000) / var7;
      }

      if (++field285 - 1 > 50) {
         field285 -= 50;
         this.field288 = true;
         this.field287.setSize(class343.field3838, class488.field4948);
         this.field287.setVisible(true);
         if (this.field278 == var2) {
            Insets var8 = this.field278.getInsets();
            this.field287.setLocation(var8.left + this.field279, var8.top + this.field289);
         } else {
            this.field287.setLocation(this.field279, this.field289);
         }
      }

      if (this.field291) {
         this.method664();
      }

      this.method687();
      this.method683(this.field288);
      if (this.field288) {
         this.method761();
      }

      this.field288 = false;
   }

   final void method687() {
      class453 var2 = this.method741();
      if (var2.field4742 != this.field292 || this.field269 != var2.field4740 || this.field290) {
         this.method661();
         this.field290 = false;
      }

   }

   final void method672() {
      this.field290 = true;
   }

   final synchronized void method673() {
      if (!field270) {
         field270 = true;

         try {
            this.field287.removeFocusListener(this);
         } catch (Exception var6) {
         }

         try {
            this.method759();
         } catch (Exception var5) {
         }

         if (this.field278 != null) {
            try {
               System.exit(0);
            } catch (Throwable var4) {
            }
         }

         if (field272 != null) {
            try {
               field272.method3398();
            } catch (Exception var3) {
            }
         }

         this.method744();
      }
   }

   public final void start() {
      if (this == field267 && !field270) {
         field283 = 0L;
      }
   }

   public final void stop() {
      if (this == field267 && !field270) {
         field283 = class302.method2194() + 4000L;
      }
   }

   public final void destroy() {
      if (this == field267 && !field270) {
         field283 = class302.method2194();
         class292.method354(5000L);
         this.method673();
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final synchronized void paint(Graphics var1) {
      if (this == field267 && !field270) {
         this.field288 = true;
         if (class302.method2194() - this.field296 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (null == var2 || var2.width >= class343.field3838 && var2.height >= class488.field4948) {
               this.field291 = true;
            }
         }

      }
   }

   public final void focusGained(FocusEvent var1) {
      field293 = true;
      this.field288 = true;
   }

   public final void focusLost(FocusEvent var1) {
      field293 = false;
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   protected final void method684(int var1, String var2, boolean var3) {
      try {
         Graphics var5 = this.field287.getGraphics();
         if (null == class50.field364) {
            class50.field364 = new Font("Helvetica", 1, 13);
            class1.field9 = this.field287.getFontMetrics(class50.field364);
         }

         if (var3) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, class343.field3838, class488.field4948);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (class468.field4804 == null) {
               class468.field4804 = this.field287.createImage(304, 34);
            }

            Graphics var7 = class468.field4804.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, var1 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, 31);
            var7.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
            var7.setFont(class50.field364);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - class1.field9.stringWidth(var2)) / 2, 22);
            var5.drawImage(class468.field4804, class343.field3838 / 2 - 152, class488.field4948 / 2 - 18, (ImageObserver)null);
         } catch (Exception var10) {
            int var8 = class343.field3838 / 2 - 152;
            int var9 = class488.field4948 / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 303, 33);
            var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
            var5.setColor(Color.black);
            var5.drawRect(var8 + 1, var9 + 1, 301, 31);
            var5.fillRect(var8 + 2 + var1 * 3, var9 + 2, 300 - var1 * 3, 30);
            var5.setFont(class50.field364);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - class1.field9.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.field287.repaint();
      }

   }

   protected final void method812() {
      class468.field4804 = null;
      class50.field364 = null;
      class1.field9 = null;
   }

   protected void method674(String var1) {
      if (!this.field271) {
         this.field271 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var4) {
         }

      }
   }

   Container method688() {
      return (Container)(null != this.field278 ? this.field278 : this);
   }

   class453 method741() {
      Container var2 = this.method688();
      int var3 = Math.max(var2.getWidth(), this.field281);
      int var4 = Math.max(var2.getHeight(), this.field282);
      if (this.field278 != null) {
         Insets var5 = this.field278.getInsets();
         var3 -= var5.left + var5.right;
         var4 -= var5.top + var5.bottom;
      }

      return new class453(var3, var4);
   }

   protected final boolean method690() {
      return this.field278 != null;
   }
}
