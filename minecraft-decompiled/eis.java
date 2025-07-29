import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eis<T extends eig> {
   static final Logger a = LogUtils.getLogger();
   final eio<T> b;
   final eii<T> c;
   final eil<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final eip<T> f;

   public eis(Class<T> $$0, eio<T> $$1) {
      this.c = new eii<>();
      this.d = new eil<>($$0, $$0x -> this.e.contains($$0x) ? eiv.c : eiv.b);
      this.b = $$1;
      this.f = new eiq<>(this.c, this.d);
   }

   public void a(dlz $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         eiv $$1x = $$0x.a(eiv.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dY()).forEach(this.b::e);
         }
      });
   }

   public void b(dlz $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         eiv $$1x = $$0x.a(eiv.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dY()).forEach(this.b::d);
         }
      });
   }

   public eip<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = ke.c($$0.dx());
      eik<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new eis.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dY() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bdl
   public int b() {
      return this.c.b();
   }

   void a(long $$0, eik<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bdl
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements eih {
      private final T c;
      private long d;
      private eik<T> e;

      a(final T $$0, final long $$1, final eik<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         jb $$0 = this.c.dx();
         long $$1 = ke.c($$0);
         if ($$1 != this.d) {
            eiv $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               eis.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, ke.a(this.d), $$1});
            }

            eis.this.a(this.d, this.e);
            eik<T> $$3 = eis.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            eis.this.b.a(this.c);
            if (!this.c.dY()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  eis.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  eis.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bzm.e $$0) {
         if (!this.e.b(this.c)) {
            eis.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, ke.a(this.d), $$0});
         }

         eiv $$1 = this.e.c();
         if ($$1.a() || this.c.dY()) {
            eis.this.b.d(this.c);
         }

         eis.this.b.b(this.c);
         eis.this.b.f(this.c);
         eis.this.c.b(this.c);
         this.c.a(a);
         eis.this.a(this.d, this.e);
      }
   }
}
