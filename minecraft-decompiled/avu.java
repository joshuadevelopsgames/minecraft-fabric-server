import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class avu implements awb {
   private final awb c;
   private final List<awb> d;

   public avu(awb $$0, List<awb> $$1) {
      this.c = $$0;
      List<awb> $$2 = new ArrayList<>($$1.size() + 1);
      $$2.addAll(Lists.reverse($$1));
      $$2.add($$0);
      this.d = List.copyOf($$2);
   }

   @Nullable
   @Override
   public axg<InputStream> a(String... $$0) {
      return this.c.a($$0);
   }

   @Nullable
   @Override
   public axg<InputStream> a(awd $$0, ame $$1) {
      for (awb $$2 : this.d) {
         axg<InputStream> $$3 = $$2.a($$0, $$1);
         if ($$3 != null) {
            return $$3;
         }
      }

      return null;
   }

   @Override
   public void a(awd $$0, String $$1, String $$2, awb.a $$3) {
      Map<ame, axg<InputStream>> $$4 = new HashMap<>();

      for (awb $$5 : this.d) {
         $$5.a($$0, $$1, $$2, $$4::putIfAbsent);
      }

      $$4.forEach($$3);
   }

   @Override
   public Set<String> a(awd $$0) {
      Set<String> $$1 = new HashSet<>();

      for (awb $$2 : this.d) {
         $$1.addAll($$2.a($$0));
      }

      return $$1;
   }

   @Nullable
   @Override
   public <T> T a(awo<T> $$0) throws IOException {
      return this.c.a($$0);
   }

   @Override
   public awa a() {
      return this.c.a();
   }

   @Override
   public void close() {
      this.d.forEach(awb::close);
   }
}
