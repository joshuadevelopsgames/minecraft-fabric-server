import java.util.function.Predicate;

public class dmb {
   private final fis a;
   private final fis b;
   private final dmb.a c;
   private final dmb.b d;
   private final fix e;

   public dmb(fis $$0, fis $$1, dmb.a $$2, dmb.b $$3, bzm $$4) {
      this($$0, $$1, $$2, $$3, fix.a($$4));
   }

   public dmb(fis $$0, fis $$1, dmb.a $$2, dmb.b $$3, fix $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public fis a() {
      return this.b;
   }

   public fis b() {
      return this.a;
   }

   public fjm a(eeb $$0, dly $$1, jb $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fjm a(fal $$0, dly $$1, jb $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fjj.a();
   }

   public static enum a implements dmb.c {
      a(eea.a::b),
      b(eea.a::a),
      c(eea.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(azo.aW) ? fjj.b() : fjj.a());

      private final dmb.c e;

      private a(final dmb.c $$0) {
         this.e = $$0;
      }

      @Override
      public fjm get(eeb $$0, dly $$1, jb $$2, fix $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(fal::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(azu.a));

      private final Predicate<fal> e;

      private b(final Predicate<fal> $$0) {
         this.e = $$0;
      }

      public boolean a(fal $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fjm get(eeb var1, dly var2, jb var3, fix var4);
   }
}
