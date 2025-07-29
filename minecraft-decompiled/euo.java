import java.util.Map;
import java.util.Optional;

public class euo {
   public static final amd<eun> a = a("normal");
   public static final amd<eun> b = a("flat");
   public static final amd<eun> c = a("large_biomes");
   public static final amd<eun> d = a("amplified");
   public static final amd<eun> e = a("single_biome_surface");
   public static final amd<eun> f = a("debug_all_block_states");

   public static void a(qq<eun> $$0) {
      new euo.a($$0).a();
   }

   private static amd<eun> a(String $$0) {
      return amd.a(mn.bt, ame.b($$0));
   }

   public static Optional<amd<eun>> a(ekv $$0) {
      return $$0.a(ehz.b).flatMap($$0x -> {
         return switch ($$0x.b()) {
            case ejv $$3 -> Optional.of(b);
            case ejr $$4 -> Optional.of(f);
            case ekd $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static ekv a(jn.a $$0) {
      return $$0.e(mn.bt).b(a).a().a();
   }

   public static ehz b(jn.a $$0) {
      return $$0.e(mn.bt).b(a).a().b().orElseThrow();
   }

   public static ekv c(jn.a $$0) {
      return $$0.e(mn.bt).b(b).a().a();
   }

   static class a {
      private final qq<eun> a;
      private final jm<ekf> b;
      private final jm<dnx> c;
      private final jm<euc> d;
      private final jm<eve> e;
      private final jm<dol> f;
      private final jl<ehy> g;
      private final ehz h;
      private final ehz i;

      a(qq<eun> $$0) {
         this.a = $$0;
         jm<ehy> $$1 = $$0.a(mn.aU);
         this.b = $$0.a(mn.bc);
         this.c = $$0.a(mn.aK);
         this.d = $$0.a(mn.bg);
         this.e = $$0.a(mn.bi);
         this.f = $$0.a(mn.bb);
         this.g = $$1.b(ehw.a);
         jl<ehy> $$2 = $$1.b(ehw.b);
         jl<ekf> $$3 = this.b.b(ekf.f);
         jl.c<dol> $$4 = this.f.b(dom.a);
         this.h = new ehz($$2, new ekd(dok.a($$4), $$3));
         jl<ehy> $$5 = $$1.b(ehw.c);
         jl<ekf> $$6 = this.b.b(ekf.g);
         this.i = new ehz($$5, new ekd(doo.a(this.c), $$6));
      }

      private ehz a(efz $$0) {
         return new ehz(this.g, $$0);
      }

      private ehz a(dob $$0, jl<ekf> $$1) {
         return this.a(new ekd($$0, $$1));
      }

      private eun a(ehz $$0) {
         return new eun(Map.of(ehz.b, $$0, ehz.c, this.h, ehz.d, this.i));
      }

      private void a(amd<eun> $$0, ehz $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dob $$0) {
         jl<ekf> $$1 = this.b.b(ekf.c);
         this.a(euo.a, this.a($$0, $$1));
         jl<ekf> $$2 = this.b.b(ekf.d);
         this.a(euo.c, this.a($$0, $$2));
         jl<ekf> $$3 = this.b.b(ekf.e);
         this.a(euo.d, this.a($$0, $$3));
      }

      public void a() {
         jl.c<dol> $$0 = this.f.b(dom.b);
         this.a(dok.a($$0));
         jl<ekf> $$1 = this.b.b(ekf.c);
         jl.c<dnx> $$2 = this.c.b(doe.b);
         this.a(euo.e, this.a(new doi($$2), $$1));
         this.a(euo.b, this.a(new ejv(etb.a(this.c, this.e, this.d))));
         this.a(euo.f, this.a(new ejr($$2)));
      }
   }
}
