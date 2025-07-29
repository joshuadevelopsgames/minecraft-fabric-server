import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class efw implements AutoCloseable {
   private final dmv a;
   private final Long2ObjectMap<egj> b = new Long2ObjectOpenHashMap();
   @Nullable
   private egj c;
   private long d;

   public efw(dmv $$0) {
      this.a = $$0;
   }

   @Nullable
   public egj a(jb $$0) {
      int $$1 = this.a.f($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ap()) {
         long $$2 = ke.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (egj)this.b.computeIfAbsent($$2, $$2x -> {
               efy $$3 = this.a.a(ke.a($$0.u()), ke.a($$0.w()));
               egj $$4 = $$3.b($$1);
               $$4.a();
               return $$4;
            });
            this.d = $$2;
         }

         return this.c;
      } else {
         return null;
      }
   }

   public eeb b(jb $$0) {
      egj $$1 = this.a($$0);
      if ($$1 == null) {
         return dqb.a.m();
      } else {
         int $$2 = ke.b($$0.u());
         int $$3 = ke.b($$0.v());
         int $$4 = ke.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         egj $$0 = (egj)var1.next();
         $$0.b();
      }
   }
}
