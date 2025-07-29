import java.util.Set;

public record fbl(aub d, fis e, fis f, float g, float h, boolean i, boolean j, Set<cba> k, fbl.a l) {
   public static final fbl.a a = $$0 -> {};
   public static final fbl.a b = fbl::a;
   public static final fbl.a c = fbl::b;

   public fbl(aub $$0, fis $$1, fis $$2, float $$3, float $$4, fbl.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public fbl(aub $$0, fis $$1, fis $$2, float $$3, float $$4, Set<cba> $$5, fbl.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public fbl(aub $$0, bzm $$1, fbl.a $$2) {
      this($$0, a($$0, $$1), fis.c, $$0.ac(), 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(bzm $$0) {
      if ($$0 instanceof auc $$1) {
         $$1.g.b(new aed(1032, jb.c, 0, false));
      }
   }

   private static void b(bzm $$0) {
      $$0.f(jb.a((jv)$$0.dv()));
   }

   public static fbl a(aub $$0, bzm $$1, fbl.a $$2) {
      return new fbl($$0, a($$0, $$1), fis.c, $$0.ac(), 0.0F, true, false, Set.of(), $$2);
   }

   private static fis a(aub $$0, bzm $$1) {
      return $$1.a($$0, $$0.ab()).c();
   }

   public fbl a(float $$0, float $$1) {
      return new fbl(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public fbl a(fis $$0) {
      return new fbl(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public fbl a() {
      return new fbl(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public aub b() {
      return this.d;
   }

   public fis c() {
      return this.e;
   }

   public fis d() {
      return this.f;
   }

   public float e() {
      return this.g;
   }

   public float f() {
      return this.h;
   }

   public boolean g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public Set<cba> i() {
      return this.k;
   }

   public fbl.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bzm var1);

      default fbl.a then(fbl.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
