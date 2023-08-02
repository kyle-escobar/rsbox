import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;

public class class466 implements class459 {
    final Map field4791;

    public class466(Map var1) {
        this.field4791 = var1;
    }

    public class461 method8032() {
        return null;
    }

    public byte[] method8031() throws UnsupportedEncodingException {
        return this.method8075().getBytes(StandardCharsets.UTF_8);
    }

    public String method8075() throws UnsupportedEncodingException {
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = this.field4791.entrySet().iterator();

        while (var3.hasNext()) {
            Map.Entry var4 = (Map.Entry) var3.next();
            String var5 = URLEncoder.encode((String) var4.getKey(), StandardCharsets.UTF_8);
            String var6 = URLEncoder.encode((String) var4.getValue(), StandardCharsets.UTF_8);
            var2.append(var5).append("=").append(var6).append("&");
        }

        if (var2.length() == 0) {
            return "";
        } else {
            var2.deleteCharAt(var2.length() - 1);
            var2.insert(0, "?");
            return var2.toString();
        }
    }
}
