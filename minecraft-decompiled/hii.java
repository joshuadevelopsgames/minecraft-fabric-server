public class hii<S extends hlh, M extends gnx<S>, A extends gnx<S>> extends hit<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final hie e;

   public hii(hgc<S, M> $$0, A $$1, A $$2, hie $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public hii(hgc<S, M> $$0, A $$1, A $$2, A $$3, A $$4, hie $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public static boolean a(dcv $$0, bzw $$1) {
      dle $$2 = $$0.a(kq.D);
      return $$2 != null && a($$2, $$1);
   }

   private static boolean a(dle $$0, bzw $$1) {
      return $$0.d().isPresent() && $$0.b() == $$1;
   }

   public void a(fod $$0, gxn $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3.Z, bzw.e, $$2, this.a($$3, bzw.e));
      this.a($$0, $$1, $$3.aa, bzw.d, $$2, this.a($$3, bzw.d));
      this.a($$0, $$1, $$3.ab, bzw.c, $$2, this.a($$3, bzw.c));
      this.a($$0, $$1, $$3.Y, bzw.f, $$2, this.a($$3, bzw.f));
   }

   private void a(fod $$0, gxn $$1, dcv $$2, bzw $$3, int $$4, A $$5) {
      dle $$6 = $$2.a(kq.D);
      if ($$6 != null && a($$6, $$3)) {
         this.d().a($$5);
         this.a($$5, $$3);
         htz.d $$7 = this.a($$3) ? htz.d.b : htz.d.a;
         this.e.a($$7, $$6.d().orElseThrow(), $$5, $$2, $$0, $$1, $$4);
      }
   }

   protected void a(A $$0, bzw $$1) {
      $$0.c_(false);
      switch ($$1) {
         case f:
            $$0.o.k = true;
            $$0.p.k = true;
            break;
         case e:
            $$0.q.k = true;
            $$0.r.k = true;
            $$0.s.k = true;
            break;
         case d:
            $$0.q.k = true;
            $$0.t.k = true;
            $$0.u.k = true;
            break;
         case c:
            $$0.t.k = true;
            $$0.u.k = true;
      }
   }

   private A a(S $$0, bzw $$1) {
      if (this.a($$1)) {
         return $$0.am ? this.c : this.a;
      } else {
         return $$0.am ? this.d : this.b;
      }
   }

   private boolean a(bzw $$0) {
      return $$0 == bzw.d;
   }
}
