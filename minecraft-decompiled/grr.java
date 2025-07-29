import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class grr {
   private final awz a = axc.c();
   private final Map<awv, String> b;

   public grr() {
      this.a.a();
      Builder<awv, String> $$0 = ImmutableMap.builder();
      this.a.d().forEach($$1 -> {
         awa $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<awv> a(List<awv> $$0) {
      List<awv> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (awv $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.b($$2);
      return $$1;
   }

   public axe a() {
      List<awb> $$0 = this.a.h();
      return new axh(awd.b, $$0);
   }
}
