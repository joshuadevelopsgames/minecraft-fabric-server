import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class aze extends azc {
   public static final String b = "recipeBook";
   private static final Logger e = LogUtils.getLogger();
   private final aze.a f;
   @VisibleForTesting
   protected final Set<amd<dhm<?>>> c = Sets.newIdentityHashSet();
   @VisibleForTesting
   protected final Set<amd<dhm<?>>> d = Sets.newIdentityHashSet();

   public aze(aze.a $$0) {
      this.f = $$0;
   }

   public void a(amd<dhm<?>> $$0) {
      this.c.add($$0);
   }

   public boolean b(amd<dhm<?>> $$0) {
      return this.c.contains($$0);
   }

   public void c(amd<dhm<?>> $$0) {
      this.c.remove($$0);
      this.d.remove($$0);
   }

   public void d(amd<dhm<?>> $$0) {
      this.d.remove($$0);
   }

   private void e(amd<dhm<?>> $$0) {
      this.d.add($$0);
   }

   public int a(Collection<dhr<?>> $$0, auc $$1) {
      List<afc.a> $$2 = new ArrayList<>();

      for (dhr<?> $$3 : $$0) {
         amd<dhm<?>> $$4 = $$3.a();
         if (!this.c.contains($$4) && !$$3.b().ap_()) {
            this.a($$4);
            this.e($$4);
            this.f.displaysForRecipe($$4, $$2x -> $$2.add(new afc.a($$2x, $$3.b().i(), true)));
            aq.g.a($$1, $$3);
         }
      }

      if (!$$2.isEmpty()) {
         $$1.g.b(new afc($$2, false));
      }

      return $$2.size();
   }

   public int b(Collection<dhr<?>> $$0, auc $$1) {
      List<diu> $$2 = Lists.newArrayList();

      for (dhr<?> $$3 : $$0) {
         amd<dhm<?>> $$4 = $$3.a();
         if (this.c.contains($$4)) {
            this.c($$4);
            this.f.displaysForRecipe($$4, $$1x -> $$2.add($$1x.a()));
         }
      }

      if (!$$2.isEmpty()) {
         $$1.g.b(new afd($$2));
      }

      return $$2.size();
   }

   private void a(List<amd<dhm<?>>> $$0, Consumer<amd<dhm<?>>> $$1, Predicate<amd<dhm<?>>> $$2) {
      for (amd<dhm<?>> $$3 : $$0) {
         if (!$$2.test($$3)) {
            e.error("Tried to load unrecognized recipe: {} removed now.", $$3);
         } else {
            $$1.accept($$3);
         }
      }
   }

   public void a(auc $$0) {
      $$0.g.b(new afe(this.a().a()));
      List<afc.a> $$1 = new ArrayList<>(this.c.size());

      for (amd<dhm<?>> $$2 : this.c) {
         this.f.displaysForRecipe($$2, $$2x -> $$1.add(new afc.a($$2x, false, this.d.contains($$2))));
      }

      $$0.g.b(new afc($$1, true));
   }

   public void a(aze $$0) {
      this.a($$0.b());
   }

   public aze.b b() {
      return new aze.b(this.a.a(), List.copyOf(this.c), List.copyOf(this.d));
   }

   private void a(aze.b $$0) {
      this.c.clear();
      this.d.clear();
      this.a.a($$0.b);
      this.c.addAll($$0.c);
      this.d.addAll($$0.d);
   }

   public void a(aze.b $$0, Predicate<amd<dhm<?>>> $$1) {
      this.a.a($$0.b);
      this.a($$0.c, this.c::add, $$1);
      this.a($$0.d, this.d::add, $$1);
   }

   @FunctionalInterface
   public interface a {
      void displaysForRecipe(amd<dhm<?>> var1, Consumer<dit> var2);
   }

   public record b(azd b, List<amd<dhm<?>>> c, List<amd<dhm<?>>> d) {
      public static final Codec<aze.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               azd.b.forGetter(aze.b::a), dhm.b.listOf().fieldOf("recipes").forGetter(aze.b::b), dhm.b.listOf().fieldOf("toBeDisplayed").forGetter(aze.b::c)
            )
            .apply($$0, aze.b::new)
      );

      public azd a() {
         return this.b;
      }

      public List<amd<dhm<?>>> b() {
         return this.c;
      }

      public List<amd<dhm<?>>> c() {
         return this.d;
      }
   }
}
