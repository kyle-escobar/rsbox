import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

public class class3 {
    static String field21;
    final int field19;
    final String field15;
    final Map field13;

    class3(HttpURLConnection var1) throws IOException {
        this.field19 = var1.getResponseCode();
        var1.getResponseMessage();
        this.field13 = var1.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field19 >= 300 ? var1.getErrorStream() : var1.getInputStream();
        if (null != var3) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);

            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }

            var3.close();
        }

        this.field15 = var2.toString();
    }

    class3(String var1) {
        this.field19 = 400;
        this.field13 = null;
        this.field15 = "";
    }

    public int method56() {
        return this.field19;
    }

    public Map method57() {
        return this.field13;
    }

    public String method58() {
        return this.field15;
    }
}
