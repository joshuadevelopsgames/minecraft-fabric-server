import com.google.common.collect.Lists;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class gro implements ep, eq {
   private final grl a;
   private final fue b;
   private int d = -1;
   @Nullable
   private CompletableFuture<Suggestions> e;
   private final Set<String> f = new HashSet<>();
   private final boolean g;

   public gro(grl $$0, fue $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.g = $$2;
   }

   @Override
   public Collection<String> q() {
      List<String> $$0 = Lists.newArrayList();

      for (grw $$1 : this.a.o()) {
         $$0.add($$1.a().getName());
      }

      return $$0;
   }

   @Override
   public Collection<String> y() {
      if (this.f.isEmpty()) {
         return this.q();
      } else {
         Set<String> $$0 = new HashSet<>(this.q());
         $$0.addAll(this.f);
         return $$0;
      }
   }

   @Override
   public Collection<String> z() {
      return (Collection<String>)(this.b.w != null && this.b.w.d() == fiq.a.c ? Collections.singleton(((fip)this.b.w).a().cL()) : Collections.emptyList());
   }

   @Override
   public Collection<String> r() {
      return this.a.B().e();
   }

   @Override
   public Stream<ame> s() {
      return this.b.al().c().stream();
   }

   @Override
   public boolean c(int $$0) {
      return this.g || $$0 == 0;
   }

   @Override
   public boolean c_() {
      return this.g;
   }

   @Override
   public CompletableFuture<Suggestions> a(amd<? extends jy<?>> $$0, eq.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.u().a($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(() -> this.a($$3));
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      if (this.e != null) {
         this.e.cancel(false);
      }

      this.e = new CompletableFuture<>();
      int $$1 = ++this.d;
      this.a.b(new aia($$1, $$0.getInput()));
      return this.e;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.2f", $$0);
   }

   private static String a(int $$0) {
      return Integer.toString($$0);
   }

   @Override
   public Collection<eq.b> A() {
      fiq $$0 = this.b.w;
      if ($$0 != null && $$0.d() == fiq.a.b) {
         jb $$1 = ((fio)$$0).b();
         return Collections.singleton(new eq.b(a($$1.u()), a($$1.v()), a($$1.w())));
      } else {
         return eq.super.A();
      }
   }

   @Override
   public Collection<eq.b> B() {
      fiq $$0 = this.b.w;
      if ($$0 != null && $$0.d() == fiq.a.b) {
         fis $$1 = $$0.g();
         return Collections.singleton(new eq.b(a($$1.d), a($$1.e), a($$1.f)));
      } else {
         return eq.super.B();
      }
   }

   @Override
   public Set<amd<dmu>> t() {
      return this.a.w();
   }

   @Override
   public jz u() {
      return this.a.x();
   }

   @Override
   public cyd v() {
      return this.a.A();
   }

   public void a(int $$0, Suggestions $$1) {
      if ($$0 == this.d) {
         this.e.complete($$1);
         this.e = null;
         this.d = -1;
      }
   }

   public void a(ado.a $$0, List<String> $$1) {
      switch ($$0) {
         case a:
            this.f.addAll($$1);
            break;
         case b:
            $$1.forEach(this.f::remove);
            break;
         case c:
            this.f.clear();
            this.f.addAll($$1);
      }
   }

   public boolean a() {
      return this.g;
   }
}
