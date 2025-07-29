import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class hgg extends hfl<csb, hml, gpd> {
   private static final ame a = gyi.s.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final ame[] k = gyi.t.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(ame[]::new);

   public hgg(hee.a $$0) {
      super($$0, new gpd($$0.a(gqm.da)), 0.0F);
   }

   public fis a(hml $$0) {
      return $$0.a;
   }

   public boolean a(csb $$0, hbq $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         fis $$5 = $$0.K(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            bzv<?> $$6 = $$0.ap();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            fis $$9 = fis.c($$0.dx());
            return $$1.a(new fin($$5.d, $$5.e + $$7, $$5.f, $$9.d, $$9.e + $$7, $$9.f).c($$8, $$7, $$8));
         }
      }
   }

   public ame b(hml $$0) {
      return a($$0.b);
   }

   public hml b() {
      return new hml();
   }

   public void a(csb $$0, hml $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.K($$2), fis.c);
      $$1.b = $$0.gH();
      $$1.c = $$0.J($$2);
      $$1.d = $$0.bt;
      $$1.e = $$0.br;
      $$1.f = $$0.n();
   }

   public static ame a(@Nullable dbt $$0) {
      return $$0 == null ? a : k[$$0.a()];
   }

   protected void a(hml $$0, fod $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
