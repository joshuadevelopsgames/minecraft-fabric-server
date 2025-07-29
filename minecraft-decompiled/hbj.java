import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;

class hbj {
   private final Map<jb, eaz> a;
   @Nullable
   private final egq<eeb> b;
   private final boolean c;
   private final dmw d;

   hbj(egi $$0, int $$1) {
      this.d = $$0;
      this.c = $$0.I().ak();
      this.a = ImmutableMap.copyOf($$0.J());
      if ($$0 instanceof ege) {
         this.b = null;
      } else {
         egj[] $$2 = $$0.d();
         if ($$1 >= 0 && $$1 < $$2.length) {
            egj $$3 = $$2[$$1];
            this.b = $$3.c() ? null : $$3.h().d();
         } else {
            this.b = null;
         }
      }
   }

   @Nullable
   public eaz a(jb $$0) {
      return this.a.get($$0);
   }

   public eeb b(jb $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.c) {
         eeb $$4 = null;
         if ($$2 == 60) {
            $$4 = dqb.iy.m();
         }

         if ($$2 == 70) {
            $$4 = ejr.a($$1, $$3);
         }

         return $$4 == null ? dqb.a.m() : $$4;
      } else if (this.b == null) {
         return dqb.a.m();
      } else {
         try {
            return this.b.a($$1 & 15, $$2 & 15, $$3 & 15);
         } catch (Throwable var8) {
            p $$6 = p.a(var8, "Getting block state");
            q $$7 = $$6.a("Block being got");
            $$7.a("Location", () -> q.a(this.d, $$1, $$2, $$3));
            throw new aa($$6);
         }
      }
   }
}
