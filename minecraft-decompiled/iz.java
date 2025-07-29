import io.netty.buffer.ByteBuf;
import java.util.Iterator;

public record iz(jb b, jb c) implements Iterable<jb> {
   public static final zm<ByteBuf, iz> a = new zm<ByteBuf, iz>() {
      public iz a(ByteBuf $$0) {
         return new iz(wg.c($$0), wg.c($$0));
      }

      public void a(ByteBuf $$0, iz $$1) {
         wg.a($$0, $$1.f());
         wg.a($$0, $$1.g());
      }
   };

   public iz(final jb b, final jb c) {
      this.b = jb.a(b, c);
      this.c = jb.b(b, c);
   }

   public static iz a(jb $$0) {
      return new iz($$0, $$0);
   }

   public static iz a(jb $$0, jb $$1) {
      return new iz($$0, $$1);
   }

   public iz b(jb $$0) {
      return new iz(jb.a(this.b, $$0), jb.b(this.c, $$0));
   }

   public boolean a() {
      return this.b.equals(this.c);
   }

   public boolean c(jb $$0) {
      return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
   }

   public fin b() {
      return fin.a(this.b, this.c);
   }

   @Override
   public Iterator<jb> iterator() {
      return jb.c(this.b, this.c).iterator();
   }

   public int c() {
      return this.c.u() - this.b.u() + 1;
   }

   public int d() {
      return this.c.v() - this.b.v() + 1;
   }

   public int e() {
      return this.c.w() - this.b.w() + 1;
   }

   public iz a(jh $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         return $$0.f() == jh.b.a ? a(this.b, jb.b(this.b, this.c.a($$0, $$1))) : a(jb.a(this.b.a($$0, $$1), this.c), this.c);
      }
   }

   public iz b(jh $$0, int $$1) {
      return $$1 == 0 ? this : new iz(this.b.a($$0, $$1), this.c.a($$0, $$1));
   }

   public iz a(kg $$0) {
      return new iz(this.b.a($$0), this.c.a($$0));
   }

   public jb f() {
      return this.b;
   }

   public jb g() {
      return this.c;
   }
}
