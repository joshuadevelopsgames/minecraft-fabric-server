import com.google.common.hash.HashCode;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public class huw {
   private final hut a;
   final huu b;
   private final huv c;
   private final Runnable d;
   private huw.c e;
   final List<huw.e> f = new ArrayList<>();

   public huw(hut $$0, huu $$1, huv $$2, Runnable $$3, huw.c $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   void f() {
      this.d.run();
   }

   private void b(UUID $$0) {
      for (huw.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(huw.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == huw.c.c) {
         this.b.a($$0, huu.a.a);
      } else {
         this.a($$0, new huw.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == huw.c.c) {
         this.b.a($$0, huu.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         huw.e $$5 = new huw.e($$0, $$2, null);
         $$5.f = huw.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, huw.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == huw.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(huw.e $$0) {
      this.b.a($$0.a, huu.b.a);
      $$0.h = true;
   }

   @Nullable
   private huw.e c(UUID $$0) {
      for (huw.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      huw.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(huw.d.e);
         this.f();
      }
   }

   public void a() {
      for (huw.e $$0 : this.f) {
         $$0.a(huw.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = huw.c.b;

      for (huw.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = huw.c.c;

      for (huw.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(huw.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = huw.c.a;
   }

   public void e() {
      boolean $$0 = this.h();
      if (!$$0) {
         this.i();
      }

      this.g();
   }

   private void g() {
      this.f.removeIf($$0 -> {
         if ($$0.g != huw.a.a) {
            return false;
         } else if ($$0.e != null) {
            huu.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<huw.e> $$0, avw.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (huw.e $$2 : this.f) {
            if ($$2.g != huw.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(huw.d.a);
               } else {
                  $$2.a(huw.d.d);
               }
            }
         }
      }

      for (huw.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = huw.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, huu.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<huw.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (huw.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != huw.b.c) {
               $$1 = true;
            }

            if ($$2.f == huw.b.a) {
               $$2.f = huw.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, avw.c> $$3 = new HashMap<>();

         for (huw.e $$4 : $$0) {
            $$3.put($$4.a, new avw.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<huw.e> $$1 = new ArrayList<>();
      final List<huw.e> $$2 = new ArrayList<>();

      for (huw.e $$3 : this.f) {
         if ($$3.g == huw.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == huw.b.c && !$$3.a();
         if ($$4 && $$3.g == huw.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == huw.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (huw.e $$5 : $$1) {
            if ($$5.g != huw.a.c) {
               $$5.g = huw.a.b;
            }
         }

         for (huw.e $$6 : $$2) {
            $$6.g = huw.a.b;
         }

         this.c.scheduleReload(new huv.a() {
            @Override
            public void a() {
               for (huw.e $$0x : $$1) {
                  $$0x.g = huw.a.c;
                  if ($$0x.e == null) {
                     huw.this.b.a($$0x.a, huu.a.b);
                  }
               }

               for (huw.e $$1x : $$2) {
                  $$1x.g = huw.a.a;
               }

               huw.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (huw.e $$1x : huw.this.f) {
                     switch ($$1x.g) {
                        case a:
                           $$1x.a(huw.d.d);
                           break;
                        case b:
                           $$1x.g = huw.a.a;
                           $$1x.a(huw.d.b);
                           break;
                        case c:
                           $$1.add($$1x);
                     }
                  }

                  huw.this.f();
               } else {
                  for (huw.e $$2x : huw.this.f) {
                     if ($$2x.g == huw.a.b) {
                        $$2x.g = huw.a.a;
                     }
                  }
               }
            }

            @Override
            public List<huv.b> b() {
               return $$1.stream().map($$0x -> new huv.b($$0x.a, $$0x.d)).toList();
            }
         });
      }
   }

   static enum a {
      a,
      b,
      c;
   }

   static enum b {
      a,
      b,
      c;
   }

   public static enum c {
      a,
      b,
      c;
   }

   static enum d {
      a(huu.a.d),
      b(huu.a.e),
      c(huu.a.a),
      d(huu.a.c),
      e(null),
      f(null);

      @Nullable
      final huu.a g;

      private d(@Nullable final huu.a $$0) {
         this.g = $$0;
      }
   }

   static class e {
      final UUID a;
      final URL b;
      @Nullable
      final HashCode c;
      @Nullable
      Path d;
      @Nullable
      huw.d e;
      huw.b f = huw.b.a;
      huw.a g = huw.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(huw.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
