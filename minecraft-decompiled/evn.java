import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record evn(List<evc> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final ame c = ame.b("jigsaw");
   private static final Map<ame, ame> d = ImmutableMap.builder()
      .put(ame.b("nvi"), c)
      .put(ame.b("pcp"), c)
      .put(ame.b("bastionremnant"), c)
      .put(ame.b("runtime"), c)
      .build();

   public evn(final List<evc> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(jb $$0) {
      for (evc $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public vi a(evo $$0) {
      uo $$1 = new uo();

      for (evc $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static evn a(uo $$0, evo $$1) {
      List<evc> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ui $$4 = $$0.b($$3);
         String $$5 = $$4.b("id", "").toLowerCase(Locale.ROOT);
         ame $$6 = ame.a($$5);
         ame $$7 = d.getOrDefault($$6, $$6);
         evp $$8 = mm.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               evc $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new evn($$2);
   }

   public euq b() {
      return evc.a(this.a.stream());
   }

   public List<evc> c() {
      return this.a;
   }
}
