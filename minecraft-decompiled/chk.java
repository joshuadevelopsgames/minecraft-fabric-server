import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class chk extends cif {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public chk(cau $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected fis h() {
      float $$0 = this.b.ai().A.i();
      if (this.b.ai().A.i() < 0.3F) {
         return this.k();
      } else {
         fis $$1;
         if ($$0 < 0.7F) {
            $$1 = this.l();
            if ($$1 == null) {
               $$1 = this.m();
            }
         } else {
            $$1 = this.m();
            if ($$1 == null) {
               $$1 = this.l();
            }
         }

         return $$1 == null ? this.k() : $$1;
      }
   }

   @Nullable
   private fis k() {
      return clj.a(this.b, 10, 7);
   }

   @Nullable
   private fis l() {
      aub $$0 = (aub)this.b.ai();
      List<cuf> $$1 = $$0.a(bzv.bF, this.b.cV().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cuf $$2 = $$1.get(this.b.ai().A.a($$1.size()));
         fis $$3 = $$2.dv();
         return clj.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private fis m() {
      ke $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         jb $$1 = this.a($$0);
         return $$1 == null ? null : clj.a(this.b, 10, 7, fis.c($$1));
      }
   }

   @Nullable
   private ke n() {
      aub $$0 = (aub)this.b.ai();
      List<ke> $$1 = ke.a(ke.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.A.a($$1.size()));
   }

   @Nullable
   private jb a(ke $$0) {
      aub $$1 = (aub)this.b.ai();
      clp $$2 = $$1.B();
      List<jb> $$3 = $$2.c($$0x -> true, $$0.k(), 8, clp.b.b).map(clq::g).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.A.a($$3.size()));
   }

   private boolean a(cuf $$0) {
      return $$0.a(this.b.ai().ae());
   }
}
