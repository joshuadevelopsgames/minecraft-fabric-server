import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record gkv(eky a, jy<ehz> b, ekv c, js<amn> d, amp e, dns f, gkq g) {
   public gkv(ekw $$0, js<amn> $$1, amp $$2, dns $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new gkq(gkx.a.a, Set.of(), null));
   }

   public gkv(eky $$0, ekv $$1, js<amn> $$2, amp $$3, dns $$4, gkq $$5) {
      this($$0, $$2.a(amn.c).f(mn.bv), $$1, $$2.a(amn.c), $$3, $$4, $$5);
   }

   public gkv a(eky $$0, ekv $$1) {
      return new gkv($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public gkv a(gkv.b $$0) {
      return new gkv($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public gkv a(gkv.a $$0) {
      return new gkv(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public jz.b a() {
      return this.d.a();
   }

   public void b() {
      for (ehz $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public eky c() {
      return this.a;
   }

   public jy<ehz> d() {
      return this.b;
   }

   public ekv e() {
      return this.c;
   }

   public js<amn> f() {
      return this.d;
   }

   public amp g() {
      return this.e;
   }

   public dns h() {
      return this.f;
   }

   public gkq i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jz.b, ekv, ekv> {
   }

   public interface b extends UnaryOperator<eky> {
   }
}
