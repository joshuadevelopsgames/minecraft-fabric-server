import java.util.List;
import javax.annotation.Nullable;

public class ebr extends eaz implements bxq, fke.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public ebr.a h;
   private ech k;
   private dcv l;
   @Nullable
   protected amd<fdo> i;
   protected long j;

   public ebr(jb $$0, eeb $$1) {
      super(ebb.P, $$0, $$1);
      this.l = dcv.l;
      this.k = ech.a;
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      if (!this.k.equals(ech.a)) {
         $$0.a("sherds", ech.b, this.k);
      }

      if (!this.d_($$0) && !this.l.f()) {
         $$0.a("item", dcv.b, this.l);
      }
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.k = $$0.<ech>a("sherds", ech.b).orElse(ech.a);
      if (!this.c_($$0)) {
         this.l = $$0.<dcv>a("item", dcv.b).orElse(dcv.l);
      } else {
         this.l = dcv.l;
      }
   }

   public acw j() {
      return acw.a(this);
   }

   @Override
   public ui a(jn.a $$0) {
      return this.d($$0);
   }

   public jh k() {
      return this.m().c(eer.T);
   }

   public ech u() {
      return this.k;
   }

   public static dcv a(ech $$0) {
      dcv $$1 = dcz.eV.m();
      $$1.b(kq.ao, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public amd<fdo> aw_() {
      return this.i;
   }

   @Override
   public void a(@Nullable amd<fdo> $$0) {
      this.i = $$0;
   }

   @Override
   public long az_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kq.ao, this.k);
      $$0.a(kq.ap, dfn.a(List.of(this.l)));
   }

   @Override
   protected void a(kl $$0) {
      super.a($$0);
      this.k = $$0.a(kq.ao, ech.a);
      this.l = $$0.a(kq.ap, dfn.a).a();
   }

   @Override
   public void b(fdc $$0) {
      super.b($$0);
      $$0.c("sherds");
      $$0.c("item");
   }

   @Override
   public dcv f() {
      this.f_(null);
      return this.l;
   }

   @Override
   public dcv c(int $$0) {
      this.f_(null);
      dcv $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = dcv.l;
      }

      return $$1;
   }

   @Override
   public void b(dcv $$0) {
      this.f_(null);
      this.l = $$0;
   }

   @Override
   public eaz v() {
      return this;
   }

   public void a(ebr.a $$0) {
      if (this.n != null && !this.n.B_()) {
         this.n.a(this.aA_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < ebr.a.values().length) {
         this.g = this.n.ae();
         this.h = ebr.a.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static enum a {
      a(7),
      b(10);

      public final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }
}
