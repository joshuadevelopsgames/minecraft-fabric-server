import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hsr implements AutoCloseable {
   private final Int2ObjectMap<hsr.a> a = new Int2ObjectOpenHashMap();
   final hru b;

   public hsr(hru $$0) {
      this.b = $$0;
   }

   public void a(fce $$0, fcg $$1) {
      this.c($$0, $$1).a();
   }

   public ame b(fce $$0, fcg $$1) {
      hsr.a $$2 = this.c($$0, $$1);
      $$2.b();
      return $$2.d;
   }

   public void a() {
      ObjectIterator var1 = this.a.values().iterator();

      while (var1.hasNext()) {
         hsr.a $$0 = (hsr.a)var1.next();
         $$0.close();
      }

      this.a.clear();
   }

   private hsr.a c(fce $$0, fcg $$1) {
      return (hsr.a)this.a.compute($$0.b(), ($$1x, $$2) -> {
         if ($$2 == null) {
            return new hsr.a($$1x, $$1);
         } else {
            $$2.a($$1);
            return $$2;
         }
      });
   }

   @Override
   public void close() {
      this.a();
   }

   class a implements AutoCloseable {
      private fcg a;
      private final hrf b;
      private boolean c = true;
      final ame d;

      a(final int $$0, final fcg $$1) {
         this.a = $$1;
         this.b = new hrf(() -> "Map " + $$0, 128, 128, true);
         this.d = ame.b("map/" + $$0);
         hsr.this.b.a(this.d, this.b);
      }

      void a(fcg $$0) {
         boolean $$1 = this.a != $$0;
         this.a = $$0;
         this.c |= $$1;
      }

      public void a() {
         this.c = true;
      }

      void b() {
         if (this.c) {
            fnf $$0 = this.b.d();
            if ($$0 != null) {
               for (int $$1 = 0; $$1 < 128; $$1++) {
                  for (int $$2 = 0; $$2 < 128; $$2++) {
                     int $$3 = $$2 + $$1 * 128;
                     $$0.b($$2, $$1, fap.b(this.a.h[$$3]));
                  }
               }
            }

            this.b.c();
            this.c = false;
         }
      }

      @Override
      public void close() {
         this.b.close();
      }
   }
}
