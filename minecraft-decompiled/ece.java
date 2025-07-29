import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class ece extends eaz implements fke.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private dcv d = dcv.l;
   private final ddc e = new ddc(this::k, this.aA_());

   public ece(jb $$0, eeb $$1) {
      super(ebb.e, $$0, $$1);
   }

   public ddc j() {
      return this.e;
   }

   public void k() {
      this.n.a(this.aA_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.n != null && this.n.a_(this.aA_()) == this.m()) {
         this.n.a(this.aA_(), this.m().b(dui.b, $$0), 2);
         this.n.a(ejb.c, this.aA_(), ejb.a.a(this.m()));
      }
   }

   public void u() {
      if (this.n != null && !this.n.C) {
         jb $$0 = this.aA_();
         dcv $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            fis $$2 = fis.a($$0, 0.5, 1.01, 0.5).a(this.n.A, 0.7F);
            dcv $$3 = $$1.v();
            cqz $$4 = new cqz(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.i();
            this.n.b($$4);
         }
      }
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, ece $$3) {
      $$3.e.b($$0, $$2);
   }

   public int w() {
      return ddb.a(this.n.K_(), this.d).map(jl::a).map(ddb::e).orElse(0);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      dcv $$1 = $$0.<dcv>a("RecordItem", dcv.b).orElse(dcv.l);
      if (!this.d.f() && !dcv.c($$1, this.d)) {
         this.e.a(this.n, this.m());
      }

      this.d = $$1;
      $$0.f("ticks_since_song_started").ifPresent($$1x -> ddb.a($$0.a(), this.d).ifPresent($$1xx -> this.e.a($$1xx, $$1x)));
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      if (!this.f().f()) {
         $$0.a("RecordItem", dcv.b, this.f());
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public dcv f() {
      return this.d;
   }

   @Override
   public dcv c(int $$0) {
      dcv $$1 = this.d;
      this.b(dcv.l);
      return $$1;
   }

   @Override
   public void b(dcv $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jl<ddb>> $$2 = ddb.a(this.n.K_(), this.d);
      this.a($$1);
      if ($$1 && $$2.isPresent()) {
         this.e.a(this.n, $$2.get());
      } else {
         this.e.a(this.n, this.m());
      }
   }

   @Override
   public int an_() {
      return 1;
   }

   @Override
   public eaz v() {
      return this;
   }

   @Override
   public boolean b(int $$0, dcv $$1) {
      return $$1.c(kq.ae) && this.a($$0).f();
   }

   @Override
   public boolean a(bxc $$0, int $$1, dcv $$2) {
      return $$0.a_(dcv::f);
   }

   @Override
   public void a(jb $$0, eeb $$1) {
      this.u();
   }

   @VisibleForTesting
   public void c(dcv $$0) {
      this.d = $$0;
      ddb.a(this.n.K_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.n.a(this.aA_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void x() {
      ddb.a(this.n.K_(), this.f()).ifPresent($$0 -> this.e.a(this.n, (jl<ddb>)$$0));
   }
}
