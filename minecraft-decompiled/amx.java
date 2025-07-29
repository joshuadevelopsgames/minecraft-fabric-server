import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class amx extends fjx {
   public static final fby<fjy> a = new fby<>("scoreboard", $$0 -> $$0.a().g().h(), $$0 -> {
      amx $$1 = $$0.a().g();
      return fjy.a.a.xmap($$1::a, fjy::a);
   }, bdr.o);
   private final MinecraftServer c;
   private final Set<fjp> d = Sets.newHashSet();
   private final List<Runnable> e = Lists.newArrayList();

   public amx(MinecraftServer $$0) {
      this.c = $$0;
   }

   @Override
   protected void a(fjw $$0, fjp $$1, fju $$2) {
      super.a($$0, $$1, $$2);
      if (this.d.contains($$1)) {
         this.c.ag().a(new agk($$0.cM(), $$1.c(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(fjw $$0, fjp $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(fjw $$0) {
      super.a($$0);
      this.c.ag().a(new afh($$0.cM(), null));
      this.a();
   }

   @Override
   public void b(fjw $$0, fjp $$1) {
      super.b($$0, $$1);
      if (this.d.contains($$1)) {
         this.c.ag().a(new afh($$0.cM(), $$1.c()));
      }

      this.a();
   }

   @Override
   public void a(fjo $$0, @Nullable fjp $$1) {
      fjp $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.c.ag().a(new afy($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.d.contains($$1)) {
            this.c.ag().a(new afy($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, fjs $$1) {
      if (super.a($$0, $$1)) {
         this.c.ag().a(agj.a($$1, $$0, agj.a.a));
         this.f($$0);
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, fjs $$1) {
      super.b($$0, $$1);
      this.c.ag().a(agj.a($$1, $$0, agj.a.b));
      this.f($$0);
      this.a();
   }

   @Override
   public void a(fjp $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(fjp $$0) {
      super.b($$0);
      if (this.d.contains($$0)) {
         this.c.ag().a(new agg($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(fjp $$0) {
      super.c($$0);
      if (this.d.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(fjs $$0) {
      super.a($$0);
      this.c.ag().a(agj.a($$0, true));
      this.a();
   }

   @Override
   public void b(fjs $$0) {
      super.b($$0);
      this.c.ag().a(agj.a($$0, false));
      this.e($$0);
      this.a();
   }

   @Override
   public void c(fjs $$0) {
      super.c($$0);
      this.c.ag().a(agj.a($$0));
      this.e($$0);
      this.a();
   }

   public void a(Runnable $$0) {
      this.e.add($$0);
   }

   protected void a() {
      for (Runnable $$0 : this.e) {
         $$0.run();
      }
   }

   public List<zw<?>> d(fjp $$0) {
      List<zw<?>> $$1 = Lists.newArrayList();
      $$1.add(new agg($$0, 0));

      for (fjo $$2 : fjo.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afy($$2, $$0));
         }
      }

      for (fjq $$3 : this.i($$0)) {
         $$1.add(new agk($$3.c(), $$0.c(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(fjp $$0) {
      List<zw<?>> $$1 = this.d($$0);

      for (auc $$2 : this.c.ag().t()) {
         for (zw<?> $$3 : $$1) {
            $$2.g.b($$3);
         }
      }

      this.d.add($$0);
   }

   public List<zw<?>> f(fjp $$0) {
      List<zw<?>> $$1 = Lists.newArrayList();
      $$1.add(new agg($$0, 1));

      for (fjo $$2 : fjo.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afy($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(fjp $$0) {
      List<zw<?>> $$1 = this.f($$0);

      for (auc $$2 : this.c.ag().t()) {
         for (zw<?> $$3 : $$1) {
            $$2.g.b($$3);
         }
      }

      this.d.remove($$0);
   }

   public int h(fjp $$0) {
      int $$1 = 0;

      for (fjo $$2 : fjo.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   private fjy h() {
      fjy $$0 = new fjy(this);
      this.a($$0::e);
      return $$0;
   }

   private fjy a(fjy.a $$0) {
      fjy $$1 = this.h();
      $$1.a($$0);
      return $$1;
   }

   private void f(String $$0) {
      auc $$1 = this.c.ag().a($$0);
      if ($$1 != null) {
         aub var4 = $$1.y();
         if (var4 instanceof aub) {
            var4.h().d($$1);
         }
      }
   }

   private void e(fjs $$0) {
      for (aub $$1 : this.c.L()) {
         $$0.h().stream().map($$0x -> this.c.ag().a($$0x)).filter(Objects::nonNull).forEach($$1x -> $$1.h().d($$1x));
      }
   }
}
