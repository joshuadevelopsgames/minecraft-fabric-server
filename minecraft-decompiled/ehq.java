import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.InflaterInputStream;
import javax.annotation.Nullable;
import net.jpountz.lz4.LZ4BlockInputStream;
import net.jpountz.lz4.LZ4BlockOutputStream;
import org.slf4j.Logger;

public class ehq {
   private static final Logger g = LogUtils.getLogger();
   private static final Int2ObjectMap<ehq> h = new Int2ObjectOpenHashMap();
   private static final Object2ObjectMap<String, ehq> i = new Object2ObjectOpenHashMap();
   public static final ehq a = a(new ehq(1, null, $$0 -> new bbj(new GZIPInputStream($$0)), $$0 -> new BufferedOutputStream(new GZIPOutputStream($$0))));
   public static final ehq b = a(
      new ehq(2, "deflate", $$0 -> new bbj(new InflaterInputStream($$0)), $$0 -> new BufferedOutputStream(new DeflaterOutputStream($$0)))
   );
   public static final ehq c = a(new ehq(3, "none", bbj::new, BufferedOutputStream::new));
   public static final ehq d = a(
      new ehq(4, "lz4", $$0 -> new bbj(new LZ4BlockInputStream($$0)), $$0 -> new BufferedOutputStream(new LZ4BlockOutputStream($$0)))
   );
   public static final ehq e = a(new ehq(127, null, $$0 -> {
      throw new UnsupportedOperationException();
   }, $$0 -> {
      throw new UnsupportedOperationException();
   }));
   public static final ehq f = b;
   private static volatile ehq j = f;
   private final int k;
   @Nullable
   private final String l;
   private final ehq.a<InputStream> m;
   private final ehq.a<OutputStream> n;

   private ehq(int $$0, @Nullable String $$1, ehq.a<InputStream> $$2, ehq.a<OutputStream> $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   private static ehq a(ehq $$0) {
      h.put($$0.k, $$0);
      if ($$0.l != null) {
         i.put($$0.l, $$0);
      }

      return $$0;
   }

   @Nullable
   public static ehq a(int $$0) {
      return (ehq)h.get($$0);
   }

   public static void a(String $$0) {
      ehq $$1 = (ehq)i.get($$0);
      if ($$1 != null) {
         j = $$1;
      } else {
         g.error("Invalid `region-file-compression` value `{}` in server.properties. Please use one of: {}", $$0, String.join(", ", i.keySet()));
      }
   }

   public static ehq a() {
      return j;
   }

   public static boolean b(int $$0) {
      return h.containsKey($$0);
   }

   public int b() {
      return this.k;
   }

   public OutputStream a(OutputStream $$0) throws IOException {
      return this.n.wrap($$0);
   }

   public InputStream a(InputStream $$0) throws IOException {
      return this.m.wrap($$0);
   }

   @FunctionalInterface
   interface a<O> {
      O wrap(O var1) throws IOException;
   }
}
