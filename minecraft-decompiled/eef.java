import java.util.function.Predicate;
import javax.annotation.Nullable;

public class eef {
   private final dmx a;
   private final jb b;
   private final boolean c;
   @Nullable
   private eeb d;
   @Nullable
   private eaz e;
   private boolean f;

   public eef(dmx $$0, jb $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public eeb a() {
      if (this.d == null && (this.c || this.a.D(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public eaz b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dmx c() {
      return this.a;
   }

   public jb d() {
      return this.b;
   }

   public static Predicate<eef> a(Predicate<eeb> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
