import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public final class dez implements dga {
   public static final dez a = new dez(List.of());
   public static final Codec<dez> b = dcv.b.listOf().xmap(dez::new, $$0 -> $$0.d);
   public static final zm<wx, dez> c = dcv.j.a(zk.a()).a(dez::new, $$0 -> $$0.d);
   private final List<dcv> d;

   private dez(List<dcv> $$0) {
      this.d = $$0;
   }

   public static dez a(dcv $$0) {
      return new dez(List.of($$0.v()));
   }

   public static dez a(List<dcv> $$0) {
      return new dez(List.copyOf(Lists.transform($$0, dcv::v)));
   }

   public boolean a(dcr $$0) {
      for (dcv $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<dcv> a() {
      return Lists.transform(this.d, dcv::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof dez $$1 && dcv.a(this.d, $$1.d);
   }

   @Override
   public int hashCode() {
      return dcv.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      dcv $$4 = null;
      int $$5 = 0;

      for (dcv $$6 : this.d) {
         if ($$4 == null) {
            $$4 = $$6;
            $$5 = 1;
         } else if (dcv.a($$4, $$6)) {
            $$5++;
         } else {
            a($$0, $$1, $$4, $$5);
            $$4 = $$6;
            $$5 = 1;
         }
      }

      if ($$4 != null) {
         a($$0, $$1, $$4, $$5);
      }
   }

   private static void a(dcr.b $$0, Consumer<xo> $$1, dcv $$2, int $$3) {
      if ($$3 == 1) {
         $$1.accept(xo.a("item.minecraft.crossbow.projectile.single", $$2.K()));
      } else {
         $$1.accept(xo.a("item.minecraft.crossbow.projectile.multiple", $$3, $$2.K()));
      }

      dfz $$4 = $$2.a(kq.q, dfz.c);
      $$2.a($$0, $$4, null, dek.a, $$1x -> $$1.accept(xo.b("  ").b($$1x).a(o.h)));
   }
}
