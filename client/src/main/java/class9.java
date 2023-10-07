import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class class9 extends class37 {
   byte[] field55;
   int field54;
   AudioFormat field52;
   SourceDataLine field53;

   class9() {
   }

   public void method538() {
      this.field52 = new AudioFormat((float)class37.field198, 16, class373.field4355 ? 2 : 1, true, false);
      this.field55 = new byte[256 << (class373.field4355 ? 2 : 1)];
   }

   public void method535(int var1) throws LineUnavailableException {
      try {
         DataLine.Info var3 = new DataLine.Info(SourceDataLine.class, this.field52, var1 << (class373.field4355 ? 2 : 1));
         this.field53 = (SourceDataLine)AudioSystem.getLine(var3);
         this.field53.open();
         this.field53.start();
         this.field54 = var1;
      } catch (LineUnavailableException var4) {
         if (class311.method1770(var1) != 1) {
            this.method535(class311.method2196(var1));
         } else {
            this.field53 = null;
            throw var4;
         }
      }
   }

   protected int method540() {
      return this.field54 - (this.field53.available() >> (class373.field4355 ? 2 : 1));
   }

   protected void method585() {
      int var1 = 256;
      if (class373.field4355) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.field187[var2];
         if ((var3 + 0x800000 & 0xff000000) != 0) {
            var3 = 0x7fffff ^ var3 >> 31;
         }

         this.field55[var2 * 2] = (byte)(var3 >> 8);
         this.field55[1 + var2 * 2] = (byte)(var3 >> 16);
      }

      this.field53.write(this.field55, 0, var1 << 1);
   }

   protected void method542() {
      if (this.field53 != null) {
         this.field53.close();
         this.field53 = null;
      }

   }

   protected void method543() {
      this.field53.flush();
   }
}
