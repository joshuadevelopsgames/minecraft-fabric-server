import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class np implements nr {
   protected final jn.a a;
   private final cyd b;
   private final cyd c;
   private final Map<bzv<?>, Map<amd<fdo>, fdo.a>> d = Maps.newHashMap();

   protected final fgg.a a() {
      jn.b<dji> $$0 = this.a.e(mn.aW);
      return fgg.a(
         fgv.a(fdj.b.a, bz.a.a().a(bx.a.a().b(true))),
         fgv.a(fdj.b.c, bz.a.a().a(bw.a.a().f(cn.a.a().a(bo.a.a().a(la.b, lb.a(List.of(new bu($$0.b(azr.p), cx.d.c)))).b()))))
      );
   }

   protected np(cyd $$0, jn.a $$1) {
      this($$0, $$0, $$1);
   }

   protected np(cyd $$0, cyd $$1, jn.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.a = $$2;
   }

   public static fdn.a a(Map<dbt, amd<fdo>> $$0) {
      fdq.a $$1 = fdq.a();

      for (Entry<dbt, amd<fdo>> $$2 : $$0.entrySet()) {
         $$1 = $$1.a(fec.a($$2.getValue()).a(fgv.a(fdj.b.a, bz.a.a().a(bo.a.a().a(kk.a(kq.aR, $$2.getKey())).b()).a(dj.b()))));
      }

      return fdn.a().a($$1);
   }

   public abstract void b();

   @Override
   public void generate(BiConsumer<amd<fdo>, fdo.a> $$0) {
      this.b();
      Set<amd<fdo>> $$1 = new HashSet<>();
      mm.f
         .c()
         .forEach(
            $$2 -> {
               bzv<?> $$3 = $$2.a();
               if ($$3.a(this.b)) {
                  Optional<amd<fdo>> $$4 = $$3.j();
                  if ($$4.isPresent()) {
                     Map<amd<fdo>, fdo.a> $$5 = this.d.remove($$3);
                     if ($$3.a(this.c) && ($$5 == null || !$$5.containsKey($$4.get()))) {
                        throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$4.get(), $$2.h().a()));
                     }

                     if ($$5 != null) {
                        $$5.forEach(($$3x, $$4x) -> {
                           if (!$$1.add($$3x)) {
                              throw new IllegalStateException(String.format(Locale.ROOT, "Duplicate loottable '%s' for '%s'", $$3x, $$2.h().a()));
                           } else {
                              $$0.accept($$3x, $$4x);
                           }
                        });
                     }
                  } else {
                     Map<amd<fdo>, fdo.a> $$6 = this.d.remove($$3);
                     if ($$6 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              $$6.keySet().stream().map($$0xx -> $$0xx.a().toString()).collect(Collectors.joining(",")),
                              $$2.h().a()
                           )
                        );
                     }
                  }
               }
            }
         );
      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created loot tables for entities not supported by datapack: " + this.d.keySet());
      }
   }

   protected fgs.a a(jm<bzv<?>> $$0) {
      return fgl.a(bn.a.a().b(bz.a.a().a($$0, bzv.ac)));
   }

   protected fgs.a a(jm<bzv<?>> $$0, jm<coe> $$1, amd<coe> $$2) {
      return fgl.a(bn.a.a().b(bz.a.a().a($$0, bzv.ac).a(bo.a.a().a(kk.a(kq.aK, $$1.b($$2))).b())));
   }

   protected void a(bzv<?> $$0, fdo.a $$1) {
      this.a($$0, $$0.j().orElseThrow(() -> new IllegalStateException("Entity " + $$0 + " has no loot table")), $$1);
   }

   protected void a(bzv<?> $$0, amd<fdo> $$1, fdo.a $$2) {
      this.d.computeIfAbsent($$0, $$0x -> new HashMap<>()).put($$1, $$2);
   }
}
