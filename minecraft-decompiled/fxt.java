import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fxt {
   private static final bbm a = bbm.codepoint(32, yl.a);

   private static String a(String $$0) {
      return fue.R().n.O().c() ? $$0 : o.a($$0);
   }

   public static List<bbm> a(xt $$0, int $$1, fwz $$2) {
      fts $$3 = new fts();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xt.a(a($$2x), $$1x));
         return Optional.empty();
      }, yl.a);
      List<bbm> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, yl.a, ($$1x, $$2x) -> {
         bbm $$3x = ud.a().a($$1x);
         $$4.add($$2x ? bbm.composite(a, $$3x) : $$3x);
      });
      return (List<bbm>)($$4.isEmpty() ? Lists.newArrayList(new bbm[]{bbm.a}) : $$4);
   }
}
