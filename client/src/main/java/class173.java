import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class173 {
   static int[] field1840;
   class113 field1827;
   float[] field1834 = new float[4];
   int field1830 = -1;
   String field1833 = null;
   String field1839;
   ArrayList field1826 = new ArrayList();
   ArrayList field1835 = new ArrayList();
   ArrayList field1837 = new ArrayList();
   Map field1836 = new HashMap();
   Map field1838 = new HashMap();

   static float[] method2158(JSONObject var0, String var1) throws JSONException {
      float[] var3 = new float[4];

      try {
         JSONArray var4 = var0.getJSONArray(var1);
         var3[0] = (float)var4.optDouble(0, 0.0);
         var3[1] = (float)var4.optDouble(1, 0.0);
         var3[2] = (float)var4.optDouble(2, 1.0);
         var3[3] = (float)var4.optDouble(3, 1.0);
      } catch (JSONException var5) {
         var3[0] = 0.0F;
         var3[1] = 0.0F;
         var3[2] = 1.0F;
         var3[3] = 1.0F;
      }

      return var3;
   }

   static int method426(String var0) {
      if (var0.equals("centre")) {
         return 1;
      } else {
         return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
      }
   }

   public boolean method3311(String var1, class114 var2) {
      if (null != var1 && !var1.isEmpty()) {
         if (null == var2) {
            return false;
         } else {
            this.method3321();

            try {
               this.field1839 = var1;
               this.field1827 = var2.method2221(new URL(this.field1839));
               this.field1830 = 0;
               return true;
            } catch (MalformedURLException var5) {
               this.method3321();
               this.field1830 = 100;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public void method3352(class114 var1) {
      switch (this.field1830) {
         case 0:
            this.method3322(var1);
            break;
         case 1:
            this.method3326();
            break;
         default:
            return;
      }

   }

   public int method3318() {
      return this.field1830;
   }

   public int method3314(String var1) {
      return this.field1838.containsKey(var1) ? (Integer)this.field1838.get(var1) : -1;
   }

   public String method3315(String var1) {
      return (String)((String)(this.field1836.containsKey(var1) ? this.field1836.get(var1) : null));
   }

   public ArrayList method3316() {
      return this.field1826;
   }

   public ArrayList method3317() {
      return this.field1837;
   }

   public String method3359() {
      return this.field1833;
   }

   public float[] method3319() {
      return this.field1834;
   }

   public ArrayList method3367() {
      return this.field1835;
   }

   void method3321() {
      this.field1827 = null;
      this.field1833 = null;
      this.field1834[0] = 0.0F;
      this.field1834[1] = 0.0F;
      this.field1834[2] = 1.0F;
      this.field1834[3] = 1.0F;
      this.field1835.clear();
      this.field1826.clear();
      this.field1837.clear();
      this.field1838.clear();
      this.field1836.clear();
   }

   void method3322(class114 var1) {
      if (this.field1827 != null && this.field1827.method2200()) {
         byte[] var3 = this.field1827.method2199();
         if (null == var3) {
            this.method3321();
            this.field1830 = 100;
         } else {
            try {
               this.method3328(new class447(var3), var1);
            } catch (UnsupportedEncodingException var5) {
               this.method3321();
               this.field1830 = 102;
               return;
            }

            this.field1830 = this.field1826.size() > 0 ? 1 : 2;
            this.field1827 = null;
         }
      }
   }

   void method3326() {
      Iterator var2 = this.field1826.iterator();

      class182 var3;
      do {
         if (!var2.hasNext()) {
            var2 = this.field1826.iterator();

            while(var2.hasNext()) {
               var3 = (class182)var2.next();
               if (var3.field1886 != null) {
                  byte[] var4 = var3.field1886.method2199();
                  if (var4 != null && var4.length > 0) {
                     this.field1830 = 2;
                     return;
                  }
               }
            }

            this.method3321();
            this.field1830 = 101;
            return;
         }

         var3 = (class182)var2.next();
      } while(var3.field1886 == null || var3.field1886.method2200());

   }

   void method3337(JSONArray var1, class114 var2) throws JSONException {
      if (var1 != null) {
         for(int var4 = 0; var4 < var1.length(); ++var4) {
            try {
               JSONObject var5 = var1.getJSONObject(var4);
               class182 var6 = new class182(this);
               var6.field1886 = var2.method2221(new URL(var5.getString("src")));
               var6.field1882 = method2158(var5, "placement");
               this.field1826.add(var6);
            } catch (MalformedURLException var7) {
            }
         }

      }
   }

   void method3370(JSONArray var1) throws JSONException {
      if (null != var1) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            JSONObject var4 = var1.getJSONObject(var3);
            class165 var5 = new class165(this);
            var5.field1786 = var4.getString("text");
            var5.field1784 = method426(var4.getString("align_x"));
            var5.field1785 = method426(var4.getString("align_y"));
            var5.field1780 = var4.getInt("font");
            var5.field1783 = method2158(var4, "placement");
            this.field1837.add(var5);
         }

      }
   }

   void method3320(JSONObject var1) throws JSONException {
      if (null != var1) {
         this.field1834 = method2158(var1, "clickbounds");
         this.field1833 = var1.getString("endpoint");
         String[] var3 = JSONObject.getNames(var1);

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
               try {
                  int var5 = var1.getInt(var3[var4]);
                  this.field1835.add(new class158(this, var3[var4], var5));
               } catch (Exception var8) {
                  try {
                     String var6 = var1.getString(var3[var4]);
                     if (var6.equals("true")) {
                        this.field1835.add(new class158(this, var3[var4], 1));
                     } else if (var6.equals("false")) {
                        this.field1835.add(new class158(this, var3[var4], 0));
                     } else {
                        this.field1835.add(new class176(this, var3[var4], var6));
                     }
                  } catch (Exception var7) {
                  }
               }
            }
         }

      }
   }

   void method3327(JSONObject var1) throws JSONException {
      String[] var3 = JSONObject.getNames(var1);

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         try {
            int var5 = var1.getInt(var3[var4]);
            this.field1838.put(var3[var4], var5);
         } catch (Exception var8) {
            try {
               String var6 = var1.getString(var3[var4]);
               if (var6.equals("true")) {
                  this.field1838.put(var3[var4], 1);
               } else if (var6.equals("false")) {
                  this.field1838.put(var3[var4], 0);
               } else {
                  this.field1836.put(var3[var4], var6);
               }
            } catch (Exception var7) {
            }
         }
      }

   }

   void method3328(class447 var1, class114 var2) {
      JSONObject var4;
      try {
         var4 = var1.method7848();
         var4 = var4.getJSONObject("message");
      } catch (Exception var10) {
         this.method3321();
         this.field1830 = 102;
         return;
      }

      try {
         this.method3337(var4.getJSONArray("images"), var2);
      } catch (Exception var9) {
         this.field1826.clear();
      }

      try {
         this.method3370(var4.getJSONArray("labels"));
      } catch (Exception var8) {
         this.field1837.clear();
      }

      try {
         this.method3320(var4.getJSONObject("behaviour"));
      } catch (Exception var7) {
         this.field1833 = null;
         this.field1834[0] = 0.0F;
         this.field1834[1] = 0.0F;
         this.field1834[2] = 1.0F;
         this.field1834[3] = 1.0F;
         this.field1835.clear();
      }

      try {
         this.method3327(var4.getJSONObject("meta"));
      } catch (Exception var6) {
         this.field1838.clear();
         this.field1836.clear();
      }

   }

   public boolean method3329(String var1, class114 var2) {
      try {
         this.method3328(new class447(var1.getBytes()), var2);
         this.field1830 = this.field1826.size() > 0 ? 1 : 2;
      } catch (UnsupportedEncodingException var5) {
         this.field1830 = 102;
      }

      return this.field1830 < 100;
   }
}
