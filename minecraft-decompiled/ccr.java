import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ccr<E extends cam> implements cce<E> {
   private final Map<cjo<?>, cjp> a;
   private final Set<cjo<?>> b;
   private final ccr.a c;
   private final ccr.b d;
   private final cem<cce<? super E>> e = new cem<>();
   private ccd.a f = ccd.a.a;

   public ccr(Map<cjo<?>, cjp> $$0, Set<cjo<?>> $$1, ccr.a $$2, ccr.b $$3, List<Pair<? extends cce<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((cce)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public ccd.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cjo<?>, cjp> $$1 : this.a.entrySet()) {
         cjo<?> $$2 = $$1.getKey();
         cjp $$3 = $$1.getValue();
         if (!$$0.eh().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aub $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = ccd.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aub $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == ccd.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == ccd.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aub $$0, E $$1, long $$2) {
      this.f = ccd.a.a;
      this.e.b().filter($$0x -> $$0x.a() == ccd.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.eh()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends cce<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == ccd.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {}),
      b(cem::a);

      private final Consumer<cem<?>> c;

      private a(final Consumer<cem<?>> $$0) {
         this.c = $$0;
      }

      public void a(cem<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends cam> void a(Stream<cce<? super E>> $$0, aub $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == ccd.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends cam> void a(Stream<cce<? super E>> $$0, aub $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == ccd.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends cam> void a(Stream<cce<? super E>> var1, aub var2, E var3, long var4);
   }
}
