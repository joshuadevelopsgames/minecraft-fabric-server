import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oq implements ok {
   private final ol b;
   private final dgy c;
   private final dcr d;
   private final dhi e;
   private final float f;
   private final int g;
   private final Map<String, ar<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final dgs.a<?> j;

   private oq(ol $$0, dgy $$1, dmt $$2, dhi $$3, float $$4, int $$5, dgs.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.h();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends dgs> oq a(dhi $$0, ol $$1, dmt $$2, float $$3, int $$4, dhw<T> $$5, dgs.a<T> $$6) {
      return new oq($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static oq a(dhi $$0, ol $$1, dmt $$2, float $$3, int $$4) {
      return new oq($$1, dgy.a, $$2, $$0, $$3, $$4, dgx::new);
   }

   public static oq b(dhi $$0, ol $$1, dmt $$2, float $$3, int $$4) {
      return new oq($$1, c($$2), $$2, $$0, $$3, $$4, dgv::new);
   }

   public static oq c(dhi $$0, ol $$1, dmt $$2, float $$3, int $$4) {
      return new oq($$1, b($$2), $$2, $$0, $$3, $$4, dig::new);
   }

   public static oq d(dhi $$0, ol $$1, dmt $$2, float $$3, int $$4) {
      return new oq($$1, dgy.a, $$2, $$0, $$3, $$4, dil::new);
   }

   public oq b(String $$0, ar<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public oq b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public dcr a() {
      return this.d;
   }

   @Override
   public void a(om $$0, amd<dhm<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.h.forEach($$2::a);
      dgs $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new dcv(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static dgy b(dmt $$0) {
      if ($$0.h().f().c(kq.v)) {
         return dgy.a;
      } else {
         return $$0.h() instanceof dbd ? dgy.b : dgy.c;
      }
   }

   private static dgy c(dmt $$0) {
      return $$0.h() instanceof dbd ? dgy.b : dgy.c;
   }

   private static dgy a(dhw<? extends dgs> $$0, dmt $$1) {
      if ($$0 == dhw.o) {
         return b($$1);
      } else if ($$0 == dhw.p) {
         return c($$1);
      } else if ($$0 != dhw.q && $$0 != dhw.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return dgy.a;
      }
   }

   private void a(amd<dhm<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
