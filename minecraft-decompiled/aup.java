import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class aup implements aul {
   private final aun a;
   private final Long2ObjectOpenHashMap<egz> b = new Long2ObjectOpenHashMap();
   private dlz c = new dlz(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private aup(aun $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static aup b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static aup c(int $$0) {
      aun $$1 = aun.c($$0);
      int $$2 = aul.a($$0);
      int $$3 = $$0 + ate.a;
      int $$4 = aul.a($$3);
      return new aup($$1, $$2, $$3, $$4);
   }

   public static aup c() {
      return new aup(aun.c(), 0, 0, 0);
   }

   @Override
   public void a(dlz $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(dlz $$0, @Nullable egz $$1) {
      if (this.g) {
         this.a.a($$0, $$1);
         if ($$1 == null) {
            this.b.remove($$0.a());
         } else {
            this.b.put($$0.a(), $$1);
         }
      }
   }

   @Override
   public void a() {
      this.g = true;
      this.b.clear();
      this.a.a();
   }

   @Override
   public void b() {
      this.g = false;
      this.a.b();
   }

   public int d() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public int f() {
      return this.a.d();
   }

   @Nullable
   public egz a(int $$0, int $$1) {
      return (egz)this.b.get(dlz.c($$0 + this.c.h - this.e, $$1 + this.c.i - this.e));
   }
}
